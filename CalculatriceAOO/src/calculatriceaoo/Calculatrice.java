/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatriceaoo;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Nguye
 */
public class Calculatrice {
    private Map<String,Operation> operations;
    private int v1;
    private int v2;
    private String op;
    
    public Calculatrice(){
        operations = new HashMap<String,Operation>();
    }
    
    public void init(int v1, int v2, String op){
        this.v1 = v1;
        this.v2=v2;
        this.op=op;
    }
    
    public void addOperation(String sym, Operation op)/* throws ExceptionOperationExistante*/{
        if(operations.containsKey(sym) == true){
            
        
    }
        this.operations.put(sym, op);
    }
    
    public int calculer() throws ExceptionOperationInconnu,ExceptionDivisionParZero{
        //int r =0;
        Operation o = this.operations.get(this.op);
        if(o==null){
            throw new ExceptionOperationInconnu();
        }
        //try{
            return o.execute(v1,v2);
        //}catch(ExceptionDivisionParZero e){
          //  System.out.println("Attention zero");
        //}
        //return r;
    }
    
}