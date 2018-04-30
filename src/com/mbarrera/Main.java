package com.mbarrera;

import com.mbarrera.Models.Caseta;

import java.util.List;

import static com.mbarrera.FileHelper.getCasetas;

public class Main {

    public static void main(String[] args) {

        Caseta[] casetaList = FileHelper.getCasetas();

        //TODO insertar en BD las casetas
    }
}
