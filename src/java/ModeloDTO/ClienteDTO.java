/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDTO;

/**
 *
 * @author Javox
 */
public class ClienteDTO {
    private String tipo_identificacion;
    private String nombre;
    private String correo;
    private String ciudad;
    private String tipo_cliente;
    private String num_identificacion;
    private String celular;

    public ClienteDTO() {
    }

    public ClienteDTO(String tipo_identificacion, String num_identificacion, String nombre, String correo, String ciudad, String celular, String tipo_cliente) {
        this.tipo_identificacion = tipo_identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.ciudad = ciudad;
        this.tipo_cliente = tipo_cliente;
        this.num_identificacion = num_identificacion;
        this.celular = celular;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
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

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public void setNum_identificacion(String num_identificacion) {
        this.num_identificacion = num_identificacion;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
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

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public String getNum_identificacion() {
        return num_identificacion;
    }

    public String getCelular() {
        return celular;
    }
}
