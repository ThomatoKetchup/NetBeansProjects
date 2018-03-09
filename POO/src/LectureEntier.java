/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */

import java.io.*;
public class LectureEntier {
    public static void main(String[] args){
        BufferedReader lecteurClavier=new BufferedReader(new InputStreamReader(System.in));
        int valeur=0;
        String chainelue;
        try{
            System.out.print("Entrer un entier");
            chainelue= lecteurClavier.readLine();
            valeur= Integer.parseInt(chainelue);
        }
        catch(Exception e){
            System.out.println("Errer d'E/S"+e.getMessage());
        }
        System.out.println("La valeur est :"+valeur);
    }
}
