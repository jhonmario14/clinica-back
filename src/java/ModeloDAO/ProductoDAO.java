/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Configuracion.conexion;
import InterfaceCRUD.CRUD;
import ModeloDTO.ProductoDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;
/**
 *
 * @author Acer
 */
public class ProductoDAO implements CRUD<ProductoDTO>{

   private static final String SQL_INSERT= "INSERT INTO public.\"Productos\"(id, num_factura_remision, nom_comercial, nom_generico, "
           + "cantidad_producto, cantidad_presentacion, precio_unidad, descripcion, lote, laboratorio, forma_farmaceutica, concentracion, "
           + "\"num_registro_ICA_INVIMA\", fecha_vencimiento, \"FK_nit_Proveedor\") VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SQL_DELETE= "DELETE FROM public.\"Productos\" WHERE id = ?;";
    private static final String SQL_UPDATE= "UPDATE public.\"Productos\" SET num_factura_remision=?, nom_comercial=?, nom_generico=?, cantidad_producto=?,"
            + " cantidad_presentacion=?, precio_unidad=?, descripcion=?, lote=?, laboratorio=?, forma_farmaceutica=?, concentracion=?,"
            + " \"num_registro_ICA_INVIMA\"=?, fecha_vencimiento=?, \"FK_nit_Proveedor\"=? WHERE  id=?;";
    private static final String SQL_READ= "SELECT * FROM public.\"Productos\" WHERE id=?;";
    private static final String SQL_READ_ALL= "SELECT * FROM public.\"Productos\";";
    
    private static final conexion cnn = conexion.saberEstado();
    
    @Override
    public boolean insert(ProductoDTO obj) {
        PreparedStatement ps=null;
        Date fecha=Date.valueOf(obj.getFecha_vencimiento());
        try {
            ps = cnn.getCnn().prepareStatement(SQL_INSERT);
            ps.setInt(1, obj.getNum_factura_remision());
            ps.setString(2, obj.getNom_comercial() );
            ps.setString(3, obj.getNom_generico());
            ps.setInt(4, obj.getCantidad_producto());
            ps.setInt(5, obj.getCantidad_presentacion());
            ps.setInt(6, obj.getPrecio_unidad());
            ps.setString(7, obj.getDescripcion());
            ps.setString(8, obj.getLote());
            ps.setString(9, obj.getLaboratorio()); 
            ps.setString(10, obj.getForma_farmaceutica());
            ps.setString(11, obj.getConcentracion());
            ps.setString(12, obj.getNum_registro_ICA_INVIMA());
            ps.setDate(13, fecha);
            ps.setString(14, obj.getFK_nit_Proveedor());
            if(ps.executeUpdate() > 0){
                return true;
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();//singleton
        }
        return false;
    }

    @Override
    public boolean delete(Object key) {
        PreparedStatement ps;
        try {
            ps = cnn.getCnn().prepareStatement(SQL_DELETE);
            ps.setString(1, key.toString());
            if(ps.executeUpdate() > 0){
                return true;
            }   
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean update(ProductoDTO obj) {
        PreparedStatement ps;
        Date fecha=Date.valueOf(obj.getFecha_vencimiento());
        try {
            ps = cnn.getCnn().prepareStatement(SQL_UPDATE);
             ps.setInt(1, obj.getNum_factura_remision());
            ps.setString(2, obj.getNom_comercial() );
            ps.setString(3, obj.getNom_generico());
            ps.setInt(4, obj.getCantidad_producto());
            ps.setInt(5, obj.getCantidad_presentacion());
            ps.setInt(6, obj.getPrecio_unidad());
            ps.setString(7, obj.getDescripcion());
            ps.setString(8, obj.getLote());
            ps.setString(9, obj.getLaboratorio()); 
            ps.setString(10, obj.getForma_farmaceutica());
            ps.setString(11, obj.getConcentracion());
            ps.setString(12, obj.getNum_registro_ICA_INVIMA());
            ps.setDate(13, fecha);
            ps.setString(14, obj.getFK_nit_Proveedor());
            ps.setInt(15, obj.getId());
           
            if(ps.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return false;
    }

    @Override
    public ProductoDTO read(Object key) {
        ProductoDTO obj = null;
        PreparedStatement ps;
        ResultSet res;    
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READ);
            ps.setInt(1, key.hashCode());
            res = ps.executeQuery();
            while (res.next()){
                obj = new ProductoDTO(res.getInt(1),
                        res.getInt(2), res.getString(3),
                        res.getString(4), res.getInt(5),
                        res.getInt(6), res.getInt(7),
                        res.getString(8), res.getString(9),
                        res.getString(10), res.getString(11),
                        res.getString(12), res.getString(13),
                        res.getString(14), res.getString(15));
            }
            return obj;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }            
        return obj;
    }

    @Override
    public List<ProductoDTO> readAll() {
        PreparedStatement ps;
        ResultSet res;
        ArrayList<ProductoDTO> productos = new ArrayList();    
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READ_ALL);
            res = ps.executeQuery();
            while(res.next()){
                productos.add(new ProductoDTO(res.getInt(1),
                        res.getInt(2), res.getString(3),
                        res.getString(4), res.getInt(5),
                        res.getInt(6), res.getInt(7),
                        res.getString(8), res.getString(9),
                        res.getString(10), res.getString(11),
                        res.getString(12), res.getString(13),
                        res.getString(14), res.getString(15)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return productos;
    }
    
}
