package com.gmail.macias3roa.ejapp1;

import com.google.gson.annotations.SerializedName;

import java.util.jar.Attributes;

public class ClassEmpresa {
    @SerializedName("id")
    private String id;
    @SerializedName("Nombre")
    private String nombre;
    @SerializedName("Telefono")
    private String telefono;
    @SerializedName("Direccion")
    private String direccion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClassEmpresa{");
        sb.append("id='").append(id).append('\'');
        sb.append(", Nombre='").append(nombre).append('\'');
        sb.append(", Telefono='").append(telefono).append('\'');
        sb.append(", Direccion='").append(direccion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
