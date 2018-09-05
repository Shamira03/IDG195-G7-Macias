package com.gmail.macias3roa.ejapp1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
     private Gson gson;
     EditText Matricula;
     EditText Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Matricula = (EditText) findViewById(R.id.txtmatricula);
        Password = (EditText) findViewById(R.id.txtpassword);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("M/d/yy hh:mm a");
        gson = gsonBuilder.create();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //volleyRequest();
                volleyRequest2();

                Snackbar.make(view, "Hi, hi", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
    public void volleyRequest(){
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="http://138.68.231.116:5000/empresa";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        List<ClassEmpresa> miEmpresa =
                             Arrays.asList(gson.fromJson(response, ClassEmpresa[].class));
                        Toast.makeText(getApplicationContext(),
                                miEmpresa.toString(),
                                Toast.LENGTH_LONG).show();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
               Toast.makeText(
                       getApplicationContext(),
                       error.getMessage(),
                       Toast.LENGTH_SHORT
               ).show();

            }
        });
// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
    public void volleyRequest2(){
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="http://138.68.231.116:5000/perfil";

// Request a string response from the provided URL.
        final String matricula = Matricula.getText().toString();
        final String password = Password.getText().toString();
        final StringRequest stringRequest = new StringRequest (Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        List<ClassPerfil> perfiles = Arrays.asList(gson.fromJson(response, ClassPerfil[].class));

                        ClassPerfil misPerfiles = findPerfil(perfiles,matricula,password)

                            if (misPerfiles != null){
                                Toast.makeText(getApplicationContext(),
                                        misPerfiles.toString(),
                                        Toast.LENGTH_LONG).show();
                            }

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(
                                    getApplicationContext(),
                                    error.getMessage(),
                                    Toast.LENGTH_SHORT
                            ).show();
                        }

    });

// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }

    private ClassPerfil findPerfil (List<ClassPerfil> perfiles, String matricula, String password){
        for(ClassPerfil perfil: perfiles){
           if(perfil.getUsername().equals(matricula)&& perfil.getPassword().equals(password)){
               return perfil;
           }
        }
        return null;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
