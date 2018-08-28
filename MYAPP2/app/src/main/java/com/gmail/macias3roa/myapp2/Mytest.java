package com.gmail.macias3roa.myapp2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.concurrent.ExecutionException;

public class Mytest extends AppCompatActivity {
     EditText Nombre;
     EditText Telefono;
     EditText Direccion;
     Button getButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mytest);

        Nombre = (EditText) findViewById(R.id.txtNombre);
        Telefono= (EditText) findViewById(R.id.txtTelefono);
        Direccion = (EditText) findViewById(R.id.txtDireccion);
        getButton = (Button) findViewById(R.id.button);

         getButton.setOnClickListener(new View.OnClickListener() {
         @Override
          public void onClick(View v) {
          ClassConnection connection = new ClassConnection();

                 try {
                    String response = connection.execute("http://api.myjson.com/bins/i15p8").get();

                  JSONArray jsonArray = new JSONArray(response);
                  JSONObject jsonObject = jsonArray.getJSONObject(0);

                     String firstName = jsonObject.getString("Nombre");
                     String Telephone = jsonObject.getString("Telefono");
                     String Direction = jsonObject.getString("Direccion");

                     Nombre.setText(firstName);
                     Telefono.setText(Telephone);
                     Direccion.setText(Direction);

                } catch (ExecutionException e) {
                   e.printStackTrace();
                } catch (InterruptedException e) {
                   e.printStackTrace();
                } catch (JSONException e) {
                     e.printStackTrace();
                 }
                }
                });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "NO HAY FALLAS", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mytest, menu);
        return true;
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
