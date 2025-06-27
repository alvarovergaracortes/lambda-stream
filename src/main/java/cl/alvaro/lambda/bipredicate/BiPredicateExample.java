package cl.alvaro.lambda.bipredicate;

import java.util.function.BiPredicate;

import cl.alvaro.lambda.LambdaExpresion;

public class BiPredicateExample implements LambdaExpresion{
	
	@Override
	public void lambdaCompleta() {
		BiPredicate<Integer, Integer> biPredicate = (a, b) -> {
			return a > b;
		};
        System.out.println(biPredicate.test(10, 5));
	}
	
	@Override
	public void lambdaFactorizada() {
		BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        boolean result = biPredicate.test(10, 5);
        System.out.println(result);
	}

	@Override
	public String getName() {
		StringBuffer name = new StringBuffer();
		name.append("BiPredicate \n");
		name.append("------------------------- \n");
		name.append("Recibe dos valores y devuelve un booleano (true o false). \n");
		name.append("Ejecucion:");
		return name.toString();
	}
}
