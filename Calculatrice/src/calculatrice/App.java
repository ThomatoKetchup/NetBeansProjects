/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import calculatrice.Exceptions.ExceptionOperationExistante;
import calculatrice.Exceptions.ExceptionDivisionParZero;
import calculatrice.Exceptions.ExceptionOperationInconnu;

/**
 *
 * @author nguye
 */
public class App {

    private Calculatrice c;

    public App() {
        c = new Calculatrice();
        try {
            c.addOperation("+", new Addition());
            c.addOperation("-", new Soustraction());
            c.addOperation("/", new Division()); //Il faut necessairement que Division implément opération, sinon il ne peut pas $etre de type operation
            c.addOperation("*", new Multiplication());

        } catch (ExceptionOperationExistante e) {
            System.out.println("Cette opération existe déjà.");
        }
    }

    public void calculer() {
        GestionnaireCalculatrice g = new GestionnaireCalculatrice();
        float v1 = g.readFloat();
        float v2 = g.readFloat();
        String op = g.readString();
        c.init(v1, v2, op);
        try {
            System.out.println(c.calculer());
        } catch (ExceptionDivisionParZero e) {
            System.out.println("Attention : division par zéro.");
        } catch (ExceptionOperationInconnu e) {
            System.out.println("Attention : opération inconnu.");
        }
    }

    public static void main(String[] args) {
        App a = new App();
        a.calculer();
    }
}
