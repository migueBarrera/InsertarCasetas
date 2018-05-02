package com.mbarrera;

import com.mbarrera.Models.Caseta;

import java.util.List;

import static com.mbarrera.FileHelper.getCasetas;

public class Main {

    public static void main(String[] args) {
        ManejadoraDataBase manejadoraDataBase = new ManejadoraDataBase();
        Caseta[] casetaList = FileHelper.getCasetas();

        System.out.println("INICIO DEL PROGRAMA");

        for (Caseta c:
             casetaList) {
            manejadoraDataBase.insertarCaseta(c);
        }



        System.out.println("FIN DEL PROGRAMA");
        manejadoraDataBase.closeConection();


    }
}
