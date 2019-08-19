/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Configuracion.conexion;
import InterfaceCRUD.CRUD;
import ModeloDTO.AnimalDTO;
import Configuracion.conexion;
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
public class AnimalDAO implements CRUD<AnimalDTO>{

    private static final String SQL_INSERT= "INSERT INTO public.\"Animales\"(num_historia, nombre, tamanio, especie, tipo_paciente, sexo, \"FK_num_ident_cliente\") VALUES (?, ?, ?, ?, ?, ?, ?);";
    private static final String SQL_DELETE= "DELETE FROM Animales WHERE num_historia = ?";
    private static final String SQL_UPDATE= "UPDATE public.\"Animales\" SET nombre=?, tamanio=?, especie=?, tipo_paciente=?, sexo=?, \"FK_num_ident_cliente\"=? WHERE num_historia =?;";
    private static final String SQL_READ= "SELECT * FROM public.\"Animales\" WHERE num_historia = ?;";
    private static final String SQL_READ_ALL= "SELECT * FROM public.\"Animales\";";
    
    private static final conexion cnn = conexion.saberEstado();
    
    @Override
    public boolean insert(AnimalDTO obj) {
        PreparedStatement ps = null;
        
        try {
            ps = cnn.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, obj.getNum_historia());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getTamanio());
            ps.setString(4, obj.getEspecie());
            ps.setString(5, obj.getTipo_paciente());
            ps.setString(6, obj.getSexo());
            ps.setString(7, obj.getFK_num_ident_cliente());
            
            if(ps.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();//singleton
        }
        return false;
    }

    @Override
    public boolean delete(Object key) {
        PreparedStatement ps = null;
        try {
            ps =  cnn.getCnn().prepareStatement(SQL_DELETE);
            ps.setString(1, key.toString());
            
            if(ps.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();//singleton
        }
        return false;
    }

    @Override
    public boolean update(AnimalDTO obj) {
        PreparedStatement ps = null;
        try {
            
            ps = cnn.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getTamanio());
            ps.setString(3, obj.getEspecie());
            ps.setString(4, obj.getTipo_paciente());
            ps.setString(5, obj.getSexo());
            ps.setString(6, obj.getFK_num_ident_cliente());
            ps.setString(7, obj.getNum_historia());
            
            
            if(ps.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return false;
    }

    @Override
    public AnimalDTO read(Object key) {
        AnimalDTO obj = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READ);
            ps.setString(1, key.toString());
            
            res = ps.executeQuery();
            while (res.next()) {
                obj = new AnimalDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7));
            }
            return obj;
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return obj;
    }

    @Override
    public List<AnimalDTO> readAll() {
        PreparedStatement ps = null;
        ResultSet res = null;
        ArrayList<AnimalDTO> animales = new ArrayList();
        
        try {            
            ps = cnn.getCnn().prepareStatement(SQL_READ_ALL);           
            res = ps.executeQuery();           
            while(res.next()){
                animales.add(new AnimalDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return animales;
    }
    
}
