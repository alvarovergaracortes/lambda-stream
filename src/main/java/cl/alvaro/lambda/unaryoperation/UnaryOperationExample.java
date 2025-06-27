package cl.alvaro.lambda.unaryoperation;

import java.util.function.UnaryOperator;

import cl.alvaro.lambda.LambdaExpresion;

public class UnaryOperationExample implements LambdaExpresion{

	@Override
	public void lambdaCompleta() {
		UnaryOperator<Integer> unaryOperator = (number) -> {
			return number * 10;
		};
		
        int result = unaryOperator.apply(3);
        System.out.println(result);
	}
	
	@Override
	public void lambdaFactorizada() {
		UnaryOperator<Integer> unaryOperator = (number) -> number * 10;
        int result = unaryOperator.apply(3);
        System.out.println(result);
	}

	@Override
	public String getName() {
		StringBuffer name = new StringBuffer();
		name.append("UnaryOperation \n");
		name.append("------------------------- \n");
		name.append(" Recibe un valor, lo procesa y devuelve un resultado del mismo tipo. \n");
		name.append("Ejecucion:s");
		return name.toString();
	}

}
