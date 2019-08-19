/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Configuracion.conexion;
import InterfaceCRUD.CRUD;
import ModeloDTO.ProveedorDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Acer
 */
public class ProveedorDAO implements CRUD<ProveedorDTO> {
    
    
    private static final String SQL_INSERT= "INSERT INTO public.\"Proveedores\"(nit, nombre, celular, correo, ciudad) VALUES (?, ?, ?, ?, ?);";
    private static final String SQL_DELETE= "DELETE FROM public.\"Proveedores\" WHERE nit = ?;";
    private static final String SQL_UPDATE= "UPDATE public.\"Proveedores\" SET nombre=?, celular=?, correo=?, ciudad=? WHERE nit=?;";
    private static final String SQL_READ= "SELECT * FROM public.\"Proveedores\" WHERE nit =?;";
    private static final String SQL_READ_ALL= "SELECT * FROM public.\"Proveedores\";";
    
    private static final conexion cnn = conexion.saberEstado();
    
    @Override
    public boolean insert(ProveedorDTO obj) {
        PreparedStatement ps;       
        try {
            ps = cnn.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, obj.getNit());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getCelular());
            ps.setString(4, obj.getCorreo());
            ps.setString(5, obj.getCiudad());           
            if(ps.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean update(ProveedorDTO obj) {
        PreparedStatement ps;
        try {
            ps = cnn.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getCelular());
            ps.setString(3, obj.getCorreo());
            ps.setString(4, obj.getCiudad());
            ps.setString(5, obj.getNit());
            if(ps.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return false;
    }

    @Override
    public ProveedorDTO read(Object key) {
        ProveedorDTO obj = null;
        PreparedStatement ps;
        ResultSet res;    
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READ);
            ps.setString(1, key.toString());
            res = ps.executeQuery();
            while (res.next()){
                obj = new ProveedorDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
            }
            return obj;
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }            
        return obj;
    }

    @Override
    public List<ProveedorDTO> readAll() {
        PreparedStatement ps;
        ResultSet res;
        ArrayList<ProveedorDTO> proveedores = new ArrayList();    
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READ_ALL);
            res = ps.executeQuery();
            while(res.next()){
                proveedores.add(new ProveedorDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return proveedores;
    }
}
