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
public class VentaDTO {
    private int id;
    private String fecha;
    private String hora;
    private int valor_total;
    private int cantidad;
    private String FK_num_identi_cliente;

    public VentaDTO() {
    }
    
    public VentaDTO(int id, String fecha, String hora, int valor_total, int cantidad, String FK_num_identi_cliente) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.valor_total = valor_total;
        this.cantidad = cantidad;
        this.FK_num_identi_cliente = FK_num_identi_cliente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFK_num_identi_cliente(String FK_num_identi_cliente) {
        this.FK_num_identi_cliente = FK_num_identi_cliente;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getValor_total() {
        return valor_total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFK_num_identi_cliente() {
        return FK_num_identi_cliente;
    }
    
    
}
