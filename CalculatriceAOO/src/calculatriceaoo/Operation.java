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
public interface Operation  {
    int execute(int a, int b) throws ExceptionDivisionParZero;
}
