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
public class FacturaDTO {
    private int FK_id_venta;
    private int FK_id_producto;

    public FacturaDTO() {
    }

    public FacturaDTO(int FK_id_venta, int FK_id_producto) {
        this.FK_id_venta = FK_id_venta;
        this.FK_id_producto = FK_id_producto;
    }

    public void setFK_id_venta(int FK_id_venta) {
        this.FK_id_venta = FK_id_venta;
    }

    public void setFK_id_producto(int FK_id_producto) {
        this.FK_id_producto = FK_id_producto;
    }

    public int getFK_id_venta() {
        return FK_id_venta;
    }

    public int getFK_id_producto() {
        return FK_id_producto;
    }
}
