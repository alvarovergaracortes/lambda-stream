package cl.alvaro.lambda.runnable;

import cl.alvaro.lambda.LambdaExpresion;

public class RunnableExample implements LambdaExpresion{

	@Override
	public void lambdaCompleta() {
		Runnable runnable = () -> {
			System.out.println("Ejecutando tarea...");
		};
	    runnable.run();
	}

	@Override
	public void lambdaFactorizada() {
		 Runnable runnable = () -> System.out.println("Ejecutando tarea...");
	     runnable.run();
	}
	
	@Override
	public String getName() {
		StringBuffer name = new StringBuffer();
		name.append("Runnable \n");
		name.append("------------------------- \n");
		name.append("No recibe valores y no retorna nada, solo ejecuta una tarea. \n");
		name.append("Ejecucion:");
		return name.toString();
	}

}
