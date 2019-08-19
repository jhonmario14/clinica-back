/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDTO;

/**
 *
 * @author Acer
 */
public class ProveedorDTO {
    private String nombre;
    private String correo;
    private String ciudad;
    private String nit;
    private String celular;

    public ProveedorDTO() {
    }

    public ProveedorDTO(String nit, String nombre, String celular, String correo, String ciudad) {
        this.nombre = nombre;
        this.correo = correo;
        this.ciudad = ciudad;
        this.nit = nit;
        this.celular = celular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getNit() {
        return nit;
    }

    public String getCelular() {
        return celular;
    }
}
