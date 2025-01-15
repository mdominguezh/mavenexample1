package com.mdominguez.printInfo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintInfo {
    private String texto;

    public PrintInfo(String texto) {
        this.texto = texto;
    }

    public void print(String texto2){

        System.out.println(texto + " : " + getTime() +  " : " + texto2);
    }

    public void changeString(String nuevoTexto){
        this.texto = nuevoTexto;
    }

    private String getTime(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return myDateObj.format(myFormatObj);
    }
}