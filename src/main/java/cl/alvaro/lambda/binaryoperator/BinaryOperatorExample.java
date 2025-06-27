package cl.alvaro.lambda.binaryoperator;

import java.util.function.BinaryOperator;

import cl.alvaro.lambda.LambdaExpresion;

public class BinaryOperatorExample implements LambdaExpresion{

	@Override
	public void lambdaCompleta() {
		BinaryOperator<Integer> binaryOperator = (a, b) -> {
			return a + b;
		};
        
		int result = binaryOperator.apply(10, 9);
        System.out.println(result);
	}
	
	@Override
	public void lambdaFactorizada() {
		BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        int result = binaryOperator.apply(10, 9);
        System.out.println(result);
	}

	@Override
	public String getName() {
		StringBuffer name = new StringBuffer();
		name.append("BinaryOperator \n");
		name.append("------------------------- \n");
		name.append(" Recibe dos valores del mismo tipo y retorna un valor del mismo tipo \n");
		name.append("Ejecucion");
		return name.toString();
	}

}
