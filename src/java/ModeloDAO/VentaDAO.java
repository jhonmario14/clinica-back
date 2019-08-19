/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Configuracion.conexion;
import InterfaceCRUD.CRUD;
import ModeloDTO.VentaDTO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class VentaDAO implements CRUD<VentaDTO>{
    
    private static final String SQL_INSERT= "INSERT INTO public.\"Ventas\"(id, fecha, hora, valor_total, cantidad, \"FK_num_identi_cliente\") VALUES (?, ?, ?, ?, ?, ?);";
    private static final String SQL_DELETE= "DELETE FROM public.\"Ventas\" WHERE id = ?;";
    private static final String SQL_UPDATE= "UPDATE public.\"Ventas\" SET fecha=?, hora=?, valor_total=?, cantidad=?, \"FK_num_identi_cliente\"=? WHERE  id=?;";
    private static final String SQL_READ= "SELECT * FROM public.\"Ventas\" WHERE id=?;";
    private static final String SQL_READ_ALL= "SELECT * FROM public.\"Ventas\";";
    
    private static final conexion cnn = conexion.saberEstado();
    
    @Override
    public boolean insert(VentaDTO obj) {
        PreparedStatement ps;
        Date fecha = Date.valueOf(obj.getFecha());
        Time hora = Time.valueOf(obj.getHora());
        try {
            ps = cnn.getCnn().prepareStatement(SQL_INSERT);
            ps.setInt(1, obj.getId());
            ps.setDate(2, fecha);
            ps.setTime(3, hora);
            ps.setInt(4, obj.getValor_total());
            ps.setInt(5, obj.getCantidad());
            ps.setString(6, obj.getFK_num_identi_cliente());
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean delete(Object key) {
        PreparedStatement ps;
        try {
            ps = cnn.getCnn().prepareStatement(SQL_DELETE);
            ps.setInt(1, key.hashCode());
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean update(VentaDTO obj) {
        PreparedStatement ps;
        Date fecha = Date.valueOf(obj.getFecha());
        Time hora = Time.valueOf(obj.getHora());
        try {
            ps = cnn.getCnn().prepareStatement(SQL_UPDATE);
            ps.setDate(1, fecha);
            ps.setTime(2, hora);
            ps.setInt(3, obj.getValor_total());
            ps.setInt(4, obj.getCantidad());
            ps.setString(5, obj.getFK_num_identi_cliente());
            ps.setInt(6, obj.getId());
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return false;
    }

    @Override
    public VentaDTO read(Object key) {
        VentaDTO obj = null;
        PreparedStatement ps;
        ResultSet res;
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READ);
            ps.setInt(1, key.hashCode());
            res = ps.executeQuery();
            while (res.next()){
                obj = new VentaDTO(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4), res.getInt(5), res.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return obj;
    }

    @Override
    public List<VentaDTO> readAll() {
        ArrayList<VentaDTO> ventas = new ArrayList();
        PreparedStatement ps;
        ResultSet res;
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READ_ALL);
            res = ps.executeQuery();
            while (res.next()){
                ventas.add( new VentaDTO(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4), res.getInt(5), res.getString(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return ventas;
    }
    
}
