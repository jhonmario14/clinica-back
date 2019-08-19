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
public class AnimalDTO {
    private String num_historia; 
    private String nombre;
    private String tamanio;
    private String especie;
    private String tipo_paciente;
    private String sexo;
    private String FK_num_ident_cliente;

    public AnimalDTO() {
    }

    public AnimalDTO(String num_historia, String nombre, String tamanio, String especie, String tipo_paciente, String sexo, String FK_num_ident_cliente) {
        this.num_historia = num_historia;
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.especie = especie;
        this.tipo_paciente = tipo_paciente;
        this.sexo = sexo;
        this.FK_num_ident_cliente = FK_num_ident_cliente;
    }

    public void setNum_historia(String num_historia) {
        this.num_historia = num_historia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setTipo_paciente(String tipo_paciente) {
        this.tipo_paciente = tipo_paciente;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFK_num_ident_cliente(String FK_num_ident_cliente) {
        this.FK_num_ident_cliente = FK_num_ident_cliente;
    }

    public String getNum_historia() {
        return num_historia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getEspecie() {
        return especie;
    }

    public String getTipo_paciente() {
        return tipo_paciente;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFK_num_ident_cliente() {
        return FK_num_ident_cliente;
    }
    
    
}
