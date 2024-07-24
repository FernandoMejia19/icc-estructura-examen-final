package main.controllers;

import java.util.HashSet;

public class Ejercicios {
    public void frecuenciaDePalabras(String text){

    }
    public static boolean verificarCaracteresUnicos(String input){
        HashSet<Character> palabras=new HashSet<>();
        
        for(int i=0;i<input.length();i++){
            palabras.add(input.charAt(i));
        }
        if(input.length()==palabras.size()){
            return true;
        }else{
            return false;
        }
    }
}
