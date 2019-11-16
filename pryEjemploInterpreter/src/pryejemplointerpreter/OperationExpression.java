/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryejemplointerpreter;

/**
 *
 * @author Taty Escobar
 */
public class OperationExpression implements Expression {

    private String operation;

    public OperationExpression(String token) {

        this.operation = token;

    }

    public void interpret(Context context) {

        context.setOperation(this.operation);

        context.calculate();

    }

}
