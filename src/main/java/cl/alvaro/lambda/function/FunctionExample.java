package cl.alvaro.lambda.function;

import java.util.function.Function;

import cl.alvaro.lambda.LambdaExpresion;

public class FunctionExample implements LambdaExpresion{

	@Override
	public void lambdaCompleta() {
		Function<Integer, String> function = (num) -> {
			return "El número es: " + num;
		};

        String result = function.apply(5);
        System.out.println(result);
	}

	@Override
	public void lambdaFactorizada() {
		Function<Integer, String> function = num -> "El número es: " + num;

        String result = function.apply(5);
        System.out.println(result);
	}
	
	@Override
	public String getName() {
		StringBuffer name = new StringBuffer();
		name.append("Function \n");
		name.append("------------------------- \n");
		name.append("Recibe un valor y retorna un resultado. \n");
		name.append("Ejecucion:");
		return name.toString();
	}
}
