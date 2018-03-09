/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import calculatrice.Exceptions.ExceptionDivisionParZero;

/**
 *
 * @author nguye
 */
public class Division implements Operation {
        public float execute(float v1,float v2) throws ExceptionDivisionParZero {
            if(v2 ==0){
                throw new ExceptionDivisionParZero();
            }
            return v1/v2;
    }
}
