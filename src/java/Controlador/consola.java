/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.AnimalDAO;
import ModeloDAO.ClienteDAO;
import ModeloDAO.ProductoDAO;
import ModeloDAO.ProveedorDAO;
import ModeloDAO.VentaDAO;
import ModeloDTO.AnimalDTO;
import ModeloDTO.ClienteDTO;
import ModeloDTO.ProductoDTO;
import ModeloDTO.ProveedorDTO;
import ModeloDTO.VentaDTO;
import java.sql.Date;
/**
 *
 * @author Acer
 */
public class consola {
    public static void main(String []args){
        AnimalDAO obj1 = new AnimalDAO();
        AnimalDTO obj2 = new AnimalDTO();
        
        ClienteDAO obj3 = new ClienteDAO();
        ClienteDTO obj4 = new ClienteDTO();
        
        ProveedorDAO obj5 = new ProveedorDAO();
        ProveedorDTO obj6 = new ProveedorDTO();
        
        ProductoDAO obj7 = new ProductoDAO();
        ProductoDTO obj8 = new ProductoDTO();
        
        VentaDAO obj9 = new VentaDAO();
        VentaDTO obj10 = new VentaDTO();
        
        //Crear un animal con un id propietario existente
//        obj1.insert(new AnimalDTO("A26", "Gato", "pequeño", "carnivoro", "E", "H", 23432));
        //Buscar o leer los datos de un Animal por su llave primaria
//        obj2 = obj1.read("A26");
//        System.out.println("Numero Historia Clinica: "+obj2.getNum_historia()
//                +"\nNombre: "+obj2.getNombre()
//                +"\nTamaño: "924426+obj2.getTamanio()
//                +"\nTipo Paciente: "+obj2.getTipo_paciente()
//                +"\nsexo: "+obj2.getSexo()
//                +"\nIdentificacion Propietario: "+obj2.getFK_num_ident_cliente());
        //Actualizar datos por llave primaria
//    obj2 = new AnimalDTO("A24", "Moon", "Pequenio", "Felino", "E", "H", 1121345567);
//    obj1.update(obj2);
        //Leer todo
//        obj1.readAll();

        

        //Crea un cliente
//        obj3.insert(new ClienteDTO("TI", "Carlos Linares", "Carlinares@gmail.com", "Guiania", "E", "924426", "3114347553"));
        //Busca o lee los datos de un cliente por su primary key
//        obj4 = obj3.read("924426");
//        System.out.println("Tipo de Identificacion: "+obj4.getTipo_identificacion()
//                +"\nNumero de Identificacion: "+obj4.getNum_identificacion()
//                +"\nNombre: "+obj4.getNombre()
//                +"\nCorreo: "+obj4.getCorreo()
//                +"\nCiudad: "+obj4.getCiudad()
//                +"\nCelular: "+obj4.getCelular()
//                +"\nTipo Cliente: "+obj4.getTipo_cliente());
        //Actualizar datos por llave primaria
//    obj4 = new ClienteDTO("CC", "924426", "Alfredo Rodriguez", "Alrodrig@yahoo.es", "Bucaramanga", "21342343", "E");
//    obj3.update(obj4);
        //Leer todo
//        obj3.readAll();

        //Crear un proveedor
//        obj5.insert(new ProveedorDTO("342675", "Ecollanos", "3123422804", "ecollanos@gmail.com", "Villavicencio"));
        //Busca o lee los datos de un proveedor por su primary key
//        obj6 = obj5.read("342675");
//        System.out.println("Nit: "+obj6.getNit()
//                +"\nNombre: "+obj6.getNombre()
//                +"\nCelular: "+obj6.getCelular()
//                +"\nCorreo: "+obj6.getCorreo()
//                +"\nCiudad: "+obj6.getCiudad());
        //Actualizar datos por llave primaria
//    obj6 = new ProveedorDTO("423423", "Mkg", "3112456781", "mkg@mkg.com", "Bilbao");
//    obj5.update(obj6);
        //Leer todo
//        obj5.readAll();

        //Crear un producto con su id
//        obj7.insert(new ProductoDTO(1001, "Paracetamoln", "Acetaminofe", 4, 2, 2000, "Uso para el dolor", "E-32", "mkg", "tabletas", "500ml", "34342mvz", "2030-08-12", "342675"));
        //Busca o lee los datos de un producto por su primary key
//        obj8 = obj7.read(1);
//        System.out.println("Id: "+obj8.getId()
//                +"\nNumumero Factura Remision: "+obj8.getNum_factura_remision()
//                +"\nNombre Generico: "+obj8.getNom_comercial()
//                +"\nNombre Comercial: "+obj8.getNom_generico()
//                +"\nCantidad Producto: "+obj8.getCantidad_producto()
//                +"\nCantidad Presentacion: "+obj8.getCantidad_presentacion()
//                +"\nPrecio Unidad: "+obj8.getPrecio_unidad()
//                +"\nDescripcion: "+obj8.getDescripcion()
//                +"\nLote: "+obj8.getLote()
//                +"\nLaboratorio:"+obj8.getLaboratorio()
//                +"\nForma Farmaceutica: "+obj8.getForma_farmaceutica()
//                +"\nConcentacion: "+obj8.getConcentracion()
//                +"\nNumero Registro ICA INVIMA: "+obj8.getNum_registro_ICA_INVIMA()
//                +"\nFecha Vencimiento: "+obj8.getFecha_vencimiento()
//                +"\nNit Proveedor: "+obj8.getFK_nit_Proveedor());
        //Actualizar datos por llave primaria
//    obj8 = new ProductoDTO(2, 232, "Ibuprofeno", "advil", 19, 2, 4000, "Espasmos y dolores cronicos", "31M", "Psiloqmk", "capsula", "400ml", "3424MVZ", "2022-02-01", "423423");
//    obj7.update(obj8);
        //Leer todo
//        obj7.readAll();

       //Crear una Venta con su id
//        obj9.insert(new VentaDTO(01, "2019-06-23", "11:32:02", 38000, 6, "1121924426"));
        //Busca o lee los datos de una venta por su primary key
//        obj10 = obj9.read(1);
//        System.out.println("Id: "+obj10.getId()
//                +"\nFecha: "+obj10.getFecha()
//                +"\nHora: "+obj10.getHora()
//                +"\nValor total: "+obj10.getCantidad()
//                +"\nCantidad: "+obj10.getCantidad()
//                +"\nIdentificacion de comprador: "
//                +obj10.getFK_num_identi_cliente());
        //Actualizar datos por llave primaria
//    obj10 = new VentaDTO(1, "2020-01-01", "10:22:54", 200000, 8, "1121924426");
//    obj9.update(obj10);
        //Leer todo
//        obj9.readAll();
    }
}
