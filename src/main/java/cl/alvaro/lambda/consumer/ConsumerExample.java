package cl.alvaro.lambda.consumer;

import java.util.function.Consumer;

import cl.alvaro.lambda.LambdaExpresion;

public class ConsumerExample implements LambdaExpresion{
	
	@Override
	public void lambdaCompleta() {
		Consumer<String> consumer = (s)->{
			System.out.println(s);
		};
		
		consumer.accept("Prueba");
	}
	
	@Override
	public void lambdaFactorizada() {
		Consumer<String> consumer = System.out::println;
        consumer.accept("Prueba");
	}

	@Override
	public String getName() {
		StringBuffer name = new StringBuffer();
		name.append("Consumer \n");
		name.append("------------------------- \n");
		name.append("Recibe un valor y no retorna nada. \n");
		name.append("Ejecucion:");
		return name.toString();
	}

}
