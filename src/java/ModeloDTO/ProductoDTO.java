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
public class ProductoDTO {
    private int id;
    private int  num_factura_remision;
    private String nom_comercial;
    private String nom_generico;
    private int  cantidad_producto;
    private int  cantidad_presentacion;
    private int precio_unidad;
    private String descripcion;
    private String lote;
    private String laboratorio;
    private String forma_farmaceutica;
    private String concentracion;
    private String num_registro_ICA_INVIMA;
    private String fecha_vencimiento;
    private String FK_nit_Proveedor;

    public ProductoDTO() {
    }

    public ProductoDTO(int num_factura_remision, String nom_comercial, String nom_generico, int cantidad_producto, int cantidad_presentacion, int precio_unidad, String descripcion, String lote, String laboratorio, String forma_farmaceutica, String concentracion, String num_registro_ICA_INVIMA, String fecha_vencimiento, String FK_nit_Proveedor) {
        this.num_factura_remision = num_factura_remision;
        this.nom_comercial = nom_comercial;
        this.nom_generico = nom_generico;
        this.cantidad_producto = cantidad_producto;
        this.cantidad_presentacion = cantidad_presentacion;
        this.precio_unidad = precio_unidad;
        this.descripcion = descripcion;
        this.lote = lote;
        this.laboratorio = laboratorio;
        this.forma_farmaceutica = forma_farmaceutica;
        this.concentracion = concentracion;
        this.num_registro_ICA_INVIMA = num_registro_ICA_INVIMA;
        this.fecha_vencimiento = fecha_vencimiento;
        this.FK_nit_Proveedor = FK_nit_Proveedor;
    }
    
    public ProductoDTO(int id, int num_factura_remision, String nom_comercial, String nom_generico, int cantidad_producto, int cantidad_presentacion, int precio_unidad, String descripcion, String lote, String laboratorio, String forma_farmaceutica, String concentracion, String num_registro_ICA_INVIMA, String fecha_vencimiento, String FK_nit_Proveedor) {
        this.id = id;
        this.num_factura_remision = num_factura_remision;
        this.nom_comercial = nom_comercial;
        this.nom_generico = nom_generico;
        this.cantidad_producto = cantidad_producto;
        this.cantidad_presentacion = cantidad_presentacion;
        this.precio_unidad = precio_unidad;
        this.descripcion = descripcion;
        this.lote = lote;
        this.laboratorio = laboratorio;
        this.forma_farmaceutica = forma_farmaceutica;
        this.concentracion = concentracion;
        this.num_registro_ICA_INVIMA = num_registro_ICA_INVIMA;
        this.fecha_vencimiento = fecha_vencimiento;
        this.FK_nit_Proveedor = FK_nit_Proveedor;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNum_factura_remision(int num_factura_remision) {
        this.num_factura_remision = num_factura_remision;
    }

    public void setNom_comercial(String nom_comercial) {
        this.nom_comercial = nom_comercial;
    }

    public void setNom_generico(String nom_generico) {
        this.nom_generico = nom_generico;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public void setCantidad_presentacion(int cantidad_presentacion) {
        this.cantidad_presentacion = cantidad_presentacion;
    }

    public void setPrecio_unidad(int precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void setForma_farmaceutica(String forma_farmaceutica) {
        this.forma_farmaceutica = forma_farmaceutica;
    }

    public void setConcentracion(String concentracion) {
        this.concentracion = concentracion;
    }

    public void setNum_registro_ICA_INVIMA(String num_registro_ICA_INVIMA) {
        this.num_registro_ICA_INVIMA = num_registro_ICA_INVIMA;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public void setFK_nit_Proveedor(String FK_nit_Proveedor) {
        this.FK_nit_Proveedor = FK_nit_Proveedor;
    }

    public int getId() {
        return id;
    }
    
    public int getNum_factura_remision() {
        return num_factura_remision;
    }

    public String getNom_comercial() {
        return nom_comercial;
    }

    public String getNom_generico() {
        return nom_generico;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public int getCantidad_presentacion() {
        return cantidad_presentacion;
    }

    public int getPrecio_unidad() {
        return precio_unidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLote() {
        return lote;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public String getForma_farmaceutica() {
        return forma_farmaceutica;
    }

    public String getConcentracion() {
        return concentracion;
    }

    public String getNum_registro_ICA_INVIMA() {
        return num_registro_ICA_INVIMA;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public String getFK_nit_Proveedor() {
        return FK_nit_Proveedor;
    }     
}
