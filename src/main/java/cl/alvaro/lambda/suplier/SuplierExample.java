package cl.alvaro.lambda.suplier;

import java.util.function.Supplier;

import cl.alvaro.lambda.LambdaExpresion;

public class SuplierExample implements LambdaExpresion{

	@Override
	public void lambdaCompleta() {
		Supplier<String> supplier = () -> {
			return "Hola, soy un Supplier";
		};
        System.out.println(supplier.get());
	}

	@Override
	public void lambdaFactorizada() {
		Supplier<String> supplier = () -> "Hola, soy un Supplier";
        System.out.println(supplier.get());
	}
	
	@Override
	public String getName() {
		StringBuffer name = new StringBuffer();
		name.append("Suppler \n");
		name.append("------------------------- \n");
		name.append("No recibe ningún valor, pero retorna un resultado. \n");
		name.append("Ejecucion:");
		return name.toString();
	}

}
