package com.binaria;

public class Main {
    private int[] cal = {15,  10, 8, 6, 3, 2};

    public boolean Busqueda (int numero){
        boolean respuesta =false;

        int sup= 0;
        int inf = cal.length -1;

        while (!respuesta){
            int medio =(sup + inf)/2;
            if (cal[medio]==numero){
                respuesta = true;
            }else {
                if (sup==medio && medio==inf){
                    break;

                }
                if (numero<cal[medio]){
                    sup =medio+1;

                } else{
                    inf = medio-1;
                }
            }


        }
        return respuesta;
    }
    public static void main(String[] args) {

    Main b = new Main();

    System.out.println(b.Busqueda(15));
    }
}
