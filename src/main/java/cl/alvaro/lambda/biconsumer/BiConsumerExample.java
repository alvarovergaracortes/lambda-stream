package cl.alvaro.lambda.biconsumer;

import cl.alvaro.lambda.LambdaExpresion;
import java.util.function.BiConsumer;


public class BiConsumerExample implements LambdaExpresion{
	
	
	@Override
	public void lambdaCompleta() {
		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println(a + " " + b);
		};
		
        biConsumer.accept("Hola", "Mundo");
	}
	
	@Override
	public void lambdaFactorizada() {
		BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);
        biConsumer.accept("Hola", "Mundo");
	}

	@Override
	public String getName() {
		StringBuffer name = new StringBuffer();
		name.append("BiConsumer \n");
		name.append("------------------------- \n");
		name.append("Recibe dos valores y NO retorna nada (void). \n");
		name.append("Ejecucion:");
		return name.toString();
	}
}
