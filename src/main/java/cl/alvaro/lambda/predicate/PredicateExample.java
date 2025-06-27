package cl.alvaro.lambda.predicate;

import java.util.function.Predicate;

import cl.alvaro.lambda.LambdaExpresion;

public class PredicateExample implements LambdaExpresion{
	
	@Override
	public void lambdaCompleta() {
		Predicate<String> predicate = (str) -> {
			return str.length()>5;
		};
        System.out.println(predicate.test("Prueba con true"));
        System.out.println(predicate.test("false"));
	}
	
	@Override
	public void lambdaFactorizada() {
		Predicate<String> predicate = (str) -> str.length()>5;
		
		System.out.println(predicate.test("Prueba con true"));
        System.out.println(predicate.test("false"));
	}

	@Override
	public String getName() {
		StringBuffer name = new StringBuffer();
		name.append("BiPredicate \n");
		name.append("------------------------- \n");
		name.append(" Recibe dos valores y devuelve un booleano (true o false). \n");
		name.append("Ejecucion:");
		return name.toString();
	}

}
