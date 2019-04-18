package com.elcordova.holamundo;

/**
 * Nombres de Clases y Archivos son Upper Camel Case
 */
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("HOla MunDo");

        /**
         * Tipos Primitivos
         */

        //enteros
        byte edad = 127;
        short year = 32478;
        int user_id = 455455454;
        long user_id_twitter = 5465456465465L;


        //Punto Flotante
        float diametro = 34.25F;
        double precio = 2323232323232323232.5454545454654654654654;

        //texto
        char genero = 'M';

        // logicos
        boolean isVisible = true;

        /**
         * NOMENCLATURA VARIABLE
         */

        // puede comnzar con letra _ o $
        int variable = 1;
        int _variable = 2;
        int $variable = 3;

        // no puede comenzar con numeros
        //int 1variable = 1;

        //Constantes con Mayusculas y separadas con _
        int VALOR_MAXIMO = 4;

        // nombres de Variables y metodos son LOWEW CAMEL CASE

        //Lower Camel Case
        int minVal = 4;


        //casting
        byte b = 6;
        short s = b;
        b = (byte) s;

        int i = 1;
        double d = 2.8;
        i = (int) d;
        System.out.println(i);


        int cod = 97;
        char codASCII = (char) cod;
        System.out.println(codASCII);


        short numero = 259;
        byte numeroByte = (byte) numero;
        System.out.println(numeroByte);


        /**
         * Arrays Declaration
         */

        int[] codigos = new int[2];
        int[][] arreglos = new int[2][3];
        int[][][] array3D = new int[2][4][3];

        char[][] days = {{'M','T','W'},{'M', 'T', 'S'}};









    }
}
