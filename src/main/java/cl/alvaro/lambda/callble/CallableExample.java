package cl.alvaro.lambda.callble;

import java.util.concurrent.Callable;
import java.util.function.BiConsumer;

import cl.alvaro.lambda.LambdaExpresion;

public class CallableExample implements LambdaExpresion{
	
	@Override
	public void lambdaCompleta() {
		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println(a + " " + b);
		};
		
        biConsumer.accept("Hola", "Mundo");
	}
	
	@Override
	public void lambdaFactorizada() {
		Callable<String> callable = () -> "Resultado de la tarea";
		try {
            String resultado = callable.call();
            System.out.println(resultado);
        } catch (Exception e) {
            System.err.println("Error al ejecuta la funcion callable");
        }
	}

	@Override
	public String getName() {
		StringBuffer name = new StringBuffer();
		name.append("Callable \n");
		name.append("------------------------- \n");
		name.append("NO recibe valores, pero retorna un resultado y puede lanzar una excepción. \n");
		name.append("Ejecucion:");
		return name.toString();
	}

}
