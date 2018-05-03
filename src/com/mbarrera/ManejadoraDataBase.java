package com.mbarrera;

import com.mbarrera.Models.Caseta;

import java.sql.*;

public class ManejadoraDataBase {
   public Connection con;
   private String url_DataBase = "//localhost/feriaabrilsevilla";
    private String user_DataBase = "root";
    private String pass_DataBase = "";

    private final String URL_CONECTION = "jdbc:mysql:"+url_DataBase+"?"+ "user="+user_DataBase+"&password="+pass_DataBase;
    private final String CLASS_NAME = "com.mysql.jdbc.Driver";

     public ManejadoraDataBase() {
        try {
            Class.forName(CLASS_NAME).newInstance();
            con = DriverManager.getConnection(URL_CONECTION);
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void closeConection() {
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public void insertarCaseta(Caseta caseta){
        String cadenaInsert = "INSERT INTO `Caseta` (`ID`,`CasetaInfoID`, `CalleID`, `Titulo`,`Calle`, `Numero`, `Modulos`,`Clase`,`Entidad`) VALUES (NULL,'1', '"+caseta.getId_Calle()+"', ? , '"+caseta.getCalle()+"', '"+caseta.getNumero()+"', '"+caseta.getModulos()+"', '"+caseta.getClase()+"', '"+caseta.getEntidad()+"');";
        PreparedStatement cmd;
        try {
            //Class.forName(CLASS_NAME).newInstance();
            //con = DriverManager.getConnection(URL_CONECTION);

            cmd = con.prepareStatement(cadenaInsert);
            cmd.setString(1,caseta.getTitulo());
            cmd.execute();

            cmd.close();
        }  catch (SQLException e) {
            System.out.print("Problema SQLExeption al insertar la caseta "+caseta.getId()+" con error :"+e);
        }
    }
}
