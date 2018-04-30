package com.mbarrera;

import com.mbarrera.Models.Caseta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManejadoraDataBase {
   public Connection con;
   private String url_DataBase = "//localhost/develop";
    private String user_DataBase = "migue";
    private String pass_DataBase = "//localhost/develop";

     public ManejadoraDataBase() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(
                    "jdbc:mysql:"+url_DataBase+"?"
                            + "user="+user_DataBase+"&password="+pass_DataBase);
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
         //TODO implementar
    }
}
