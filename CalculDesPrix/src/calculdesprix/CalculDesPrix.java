/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculdesprix;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class CalculDesPrix {
        Scanner sc=new Scanner(System.in);

  
    public static void main(String[] args) {
        
        Article a = new Article(3,"test",170,19);
        Article b= new Article(4,"test2",12,43);
        System.out.println(a.afficheArticle());
        System.out.println(b.afficheArticle());
        
        System.out.println(a.calculerPrixTTC());
        
    }
    
}
