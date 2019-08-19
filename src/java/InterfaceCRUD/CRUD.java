/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceCRUD;

import java.util.List;

/**
 *
 * @author Acer
 */

//Uso generic para esta interface
public interface CRUD <cualquierObjeto>{
    public boolean insert(cualquierObjeto obj);
    public boolean delete(Object key);
    public boolean update(cualquierObjeto obj);
    
    public cualquierObjeto read(Object key);
    public List<cualquierObjeto> readAll();
}
