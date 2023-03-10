package Tema_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author KZR
 */
public class datos {
    public static void main (String[] args) {
        //TIPOS DE DATOS 
        //ENTEROS (byte, Short, int, long 
        
        byte variableByte=10;
        System.out.println("**********BYTE**********");
        System.out.println("Tamaño "+Byte.SIZE);
        System.out.println("Valor maximo de tipo byte "+Byte.MAX_VALUE);
        System.out.println("Valor minimo de tipo byte "+Byte.MIN_VALUE);
        
        
        short variableShort=1020;
        System.out.println("\n**********SHORT**********");
        System.out.println("Cantidad de bits de un tipo short "+Short.BYTES);
        System.out.println("Tamaño "+Short.SIZE);
        System.out.println("Valor maximo de tipo short "+Short.MAX_VALUE);
        System.out.println("Valor minimo de tipo short "+Short.MIN_VALUE);
        
        int variableInt = 2000;
        System.out.println("\n**********INT**********");
        System.out.println("Cantidad de bitd de un tipo int "+Integer.BYTES);
        System.out.println("Tamaño "+Integer.SIZE);
        System.out.println("Valor maximo de tipo int "+Integer.MAX_VALUE);
        System.out.println("Valor minimo de tipo int "+Integer.MIN_VALUE);
        
        long variableLong = 20000;
        System.out.println("\n**********LONG**********");
        System.out.println("Cantidad de bitd de un tipo long "+Long.BYTES);
        System.out.println("Tamaño "+Long.SIZE);
        System.out.println("Valor maximo de tipo long "+Long.MAX_VALUE);
        System.out.println("Valor minimo de tipo long "+Long.MIN_VALUE);
        
        System.out.println("");
        //UTILIZAR NUMEROS BINARIOS/OCTALES/HEXADECIMALS
        //Decimal
        int nDecimal=10;
        System.out.println("El valor del numero decimal es "+nDecimal);
        
        //Octal
        int nOctal=012;
        System.out.println("El valor del numero octal es "+nOctal);
        
        //Hexadecimal
        int nHexadecimal=0xA;
        System.out.println("El valor del numero Hexadecimal es "+nHexadecimal);
        
        //Binario
        int nBinario=0b1010;
        System.out.println("El valor del numero Binario es "+nBinario);
        
        //TIPOS PRIMITIVOS FLOTANTES (Float y Double)
        //Tipo Float
        float variableFloat=1000.10f;
        System.out.println("\n**********FLOAT**********");
        System.out.println("Variable Flotante "+variableFloat);
        System.out.println("Tamaño de float "+Float.SIZE);
        System.out.println("Valor minimo de un Float "+Float.MIN_VALUE);
        System.out.println("Valor maximo de un Float "+Float.MAX_VALUE);
        
        double variableDouble=1000.10;
        System.out.println("\n**********DOUBLE**********");
        System.out.println("Variable Double "+variableDouble);
        System.out.println("Tamaño de Double "+Double.SIZE);
        System.out.println("Valor minimo de un Double "+Double.MIN_VALUE);
        System.out.println("Valor maximo de un Double "+Double.MAX_VALUE);
        
        //TIPO PRIMITIVO CHART
        char vChar1='A';
        System.out.println("\n**********CHAR**********");
        System.out.println("Variable Char "+vChar1);
        System.out.println("Tamanño de Char "+Character.SIZE);
        System.out.println("Valor minimo de un Char "+Character.MIN_VALUE);
        System.out.println("Valor maximo de un Char "+Character.MAX_VALUE);
        
        //char utilizando valores unicode
        char vChar2='\u0040';
        System.out.println("\nValor de la Variable vChar2 "+vChar2);
        
        //char utilizando simbolo
        char vChar3='!';
        System.out.println("\nValor de la Variable vChar3 "+vChar3);
        
        //char utilizando numero decimal
        char vChar4=33;
        System.out.println("\nValor de la Variable vchar4 "+vChar4);
        
        //TIPO PRIMITIVO BOOLEANOO
        boolean vBoolean=true;
        System.out.println("\nEl valor de vBoolean es "+vBoolean);
        System.out.println("Valor de verdad tipo boolean: "+Boolean.TRUE);
        System.out.println("Valor falso tipo boolean: "+ Boolean.FALSE);
        
        //CONVERSIONES
        //Conversion de tipo String
        int edad=Integer.parseInt("67");
        
        String peso; //declaración de variable;
        peso ="34"; //inicializacion de una variable o asignar valor
        int convPeso=Integer.parseInt(peso);
        
        //Conversion de String a Double
        double estatura =Double.parseDouble("13.5");
        
        //Conversion de tipo primitivo a String
        String num=String.valueOf(45);
        
        //Conversion entre tipos primitivos
        short a=10;
        byte b=(byte)a;
    }
}
