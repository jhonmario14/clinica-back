/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Configuracion.conexion;
import InterfaceCRUD.CRUD;
import ModeloDTO.ClienteDTO;
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
public class ClienteDAO implements CRUD<ClienteDTO>{

    
    private static final String SQL_INSERT= "INSERT INTO public.\"Clientes\"(tipo_identificacion, num_identificacion, nombre, correo, ciudad, celular, tipo_cliente) VALUES (?, ?, ?, ?, ?, ?, ?);";
    private static final String SQL_DELETE= "DELETE FROM public.\"Clientes\" WHERE num_identificacion = ?";
    private static final String SQL_UPDATE= "UPDATE public.\"Clientes\" SET tipo_identificacion=?, nombre=?, correo=?, ciudad=?, celular=?, tipo_cliente=? WHERE  num_identificacion=?;";
    private static final String SQL_READ= "SELECT * FROM public.\"Clientes\" WHERE num_identificacion = ?;";
    private static final String SQL_READ_ALL= "SELECT * FROM public.\"Clientes\";";
    
    private static final conexion cnn = conexion.saberEstado();
    
    @Override
    public boolean insert(ClienteDTO obj) {
        PreparedStatement ps;       
        try {
            ps = cnn.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, obj.getTipo_identificacion());
            ps.setString(2, obj.getNum_identificacion());
            ps.setString(3, obj.getNombre());
            ps.setString(4, obj.getCorreo());
            ps.setString(5, obj.getCiudad());
            ps.setString(6, obj.getCelular());
            ps.setString(7, obj.getTipo_cliente());
            
            if(ps.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean update(ClienteDTO obj) {
        PreparedStatement ps;
        try {
            ps = cnn.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1, obj.getTipo_identificacion());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getCorreo());
            ps.setString(4, obj.getCiudad());
            ps.setString(5, obj.getCelular());
            ps.setString(6, obj.getTipo_cliente());
            ps.setString(7, obj.getNum_identificacion());
            if(ps.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return false;
    }

    @Override
    public ClienteDTO read(Object key) {
        ClienteDTO obj = null;
        PreparedStatement ps;
        ResultSet res;    
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READ);
            ps.setString(1, key.toString());
            res = ps.executeQuery();
            while (res.next()){
                obj = new ClienteDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7));
            }
            return obj;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }            
        return obj;
    }

    @Override
    public List<ClienteDTO> readAll() {
        PreparedStatement ps;
        ResultSet res;
        ArrayList<ClienteDTO> clientes = new ArrayList();    
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READ_ALL);
            res = ps.executeQuery();
            while(res.next()){
                clientes.add(new ClienteDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return clientes;
    }
}
