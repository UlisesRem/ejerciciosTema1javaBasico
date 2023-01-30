package com.tipodato;

public class Main {
    public static void main(String[] args) {
        Datos enteros = new Datos();
        System.out.println(enteros.number);
        System.out.println(enteros.nunber3);
        System.out.println(enteros.number3);
        System.out.println(enteros.nunmber4);

        Datos flotantes = new Datos();
        System.out.println(flotantes.decimal1);
        System.out.println(flotantes.decimal2);

        Datos caracter = new Datos();
        System.out.println(caracter.caracter);

        Datos bool = new Datos();
        System.out.println(bool.verdadero);
        System.out.println(bool.falso);

        Datos cadenaTexto = new Datos();
        System.out.println(cadenaTexto.nombre);
        System.out.println(cadenaTexto.apellido);

        Datos envoltorio = new Datos();
        System.out.println(envoltorio.numero1);
        System.out.println(envoltorio.numero2);
    }

    public static class Datos{
        //Enteros
        byte number = 1;    //1 byte
        short nunber3 = 2;  //2 bytes
        int number3;        //4 bytes
        long nunmber4;      //8 bytes

        //Punto flotante
        float decimal1 = 1.2f;
        double decimal2 = 2.99d;

        //Caracter
        char caracter = 'a';

        //Booleanos
        boolean verdadero = true;
        boolean falso = false;

        //Cadena de texto
        String nombre = "Ulises";
        String apellido = "Ramirez";

        //Tipo envoltorio
        Integer numero1 = null;
        Long numero2 = null;

    }
}