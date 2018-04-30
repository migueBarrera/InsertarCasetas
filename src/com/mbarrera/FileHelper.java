package com.mbarrera;

import com.mbarrera.Models.Caseta;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileHelper {

    public static Caseta[] getCasetas()  {
        List<Caseta> listCasetas = new ArrayList<>();


        try {
            FileReader fileReader = new FileReader("src/com/mbarrera/File/casetas.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;

            bufferedReader.readLine();
            bufferedReader.readLine();
            linea=bufferedReader.readLine();
            while(linea!=null){
                String[] lineaObject = linea.split("\\|");

                Caseta caseta = new Caseta();
                caseta.setTitulo(lineaObject[0]);
                caseta.setCalle(lineaObject[1]);
                caseta.setNumero(lineaObject[2]);
                caseta.setModulos(lineaObject[3]);
                caseta.setClase(lineaObject[4]);
                caseta.setEntidad(lineaObject[5]);
                caseta.setId(lineaObject[6]);
                caseta.setId_Calle(lineaObject[7]);

                listCasetas.add(caseta);


                //Update Linea
                //System.out.println(caseta.toString());
                linea=bufferedReader.readLine();
            }



        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

        Caseta[] casetas = listCasetas.toArray(new Caseta[0]);

        Arrays.sort(casetas);

        return casetas;
    };
}
