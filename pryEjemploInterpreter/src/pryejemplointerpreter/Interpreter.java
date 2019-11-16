/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryejemplointerpreter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Taty Escobar
 */
public class Interpreter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Creamos el arbol de expresiones y el contexto
        ArrayList <Expression> tree = new ArrayList();
        ArrayList <String> texto = new ArrayList();
        texto.add("siete");
        texto.add("mas");
        texto.add("tres");;
        texto.add("mas");
        texto.add("uno");

        System.out.println(texto);
        Context context = new Context();
        // Añadimos los tokens pasados como argumentos
        for (String token : texto) {

            if (context.getInteger(token) >= 0) {
                tree.add(new NumericExpression(token));
            } else {
                tree.add(new OperationExpression(token));
            }

        }

        // Interpretamos cada expresión
        for (Expression e : tree) {
            e.interpret(context);
        }

        // Mostramos el resultado
        System.out.println("El resultado de la interpretación es " + context.getResult());

    }

}
