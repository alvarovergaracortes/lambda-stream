package cl.alvaro.lambda.bifunction;

import cl.alvaro.lambda.LambdaExpresion;
import java.util.function.BiFunction;

/**
 * 
 *  Recibe dos valores y retorna un resultado.
 */
public class BiFunctionExample implements LambdaExpresion{

	@Override
	public void lambdaCompleta() {
		BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        int result = biFunction.apply(10, 20);
        System.out.println(result);
	}

	@Override
	public void lambdaFactorizada() {
		BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        int result = biFunction.apply(10, 20);
        System.out.println(result);		
	}
	
	@Override
	public String getName() {
		StringBuffer name = new StringBuffer();
		name.append("BiFunctionExample \n");
		name.append("------------------------- \n");
		name.append(" Recibe dos valores y retorna un resultado. \n");
		name.append("Ejecucion: ");
		return name.toString();
	}

}
