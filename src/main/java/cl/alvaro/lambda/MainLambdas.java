package cl.alvaro.lambda;

import cl.alvaro.lambda.biconsumer.BiConsumerExample;
import cl.alvaro.lambda.bifunction.BiFunctionExample;
import cl.alvaro.lambda.binaryoperator.BinaryOperatorExample;
import cl.alvaro.lambda.bipredicate.BiPredicateExample;
import cl.alvaro.lambda.callble.CallableExample;
import cl.alvaro.lambda.consumer.ConsumerExample;
import cl.alvaro.lambda.function.FunctionExample;
import cl.alvaro.lambda.predicate.PredicateExample;
import cl.alvaro.lambda.runnable.RunnableExample;
import cl.alvaro.lambda.suplier.SuplierExample;
import cl.alvaro.lambda.unaryoperation.UnaryOperationExample;

public class MainLambdas {

	public static void main(String[] args) {
		LambdaExpresion consumer = new ConsumerExample();
		System.out.println(consumer.getName());
		consumer.lambdaCompleta();
		consumer.lambdaFactorizada();
		
		System.out.println("");
		
		LambdaExpresion biconsumer = new BiConsumerExample();
		System.out.println(biconsumer.getName());
		biconsumer.lambdaCompleta();
		biconsumer.lambdaFactorizada();
		
		System.out.println("");
		
		LambdaExpresion biFunctionExpresion = new BiFunctionExample();
		System.out.println(biFunctionExpresion.getName());
		biFunctionExpresion.lambdaCompleta();
		biFunctionExpresion.lambdaFactorizada();
		
		System.out.println("");
		
		LambdaExpresion binaryOperator = new BinaryOperatorExample();
		System.out.println(binaryOperator.getName());
		binaryOperator.lambdaCompleta();
		binaryOperator.lambdaFactorizada();
		
		System.out.println("");
		
		LambdaExpresion biPredicate = new BiPredicateExample();
		System.out.println(biPredicate.getName());
		biPredicate.lambdaCompleta();
		biPredicate.lambdaFactorizada();

		System.out.println("");
		
		LambdaExpresion callable = new CallableExample();
		System.out.println(callable.getName());
		callable.lambdaCompleta();
		callable.lambdaFactorizada();
		
		System.out.println("");
		
		LambdaExpresion predicate = new PredicateExample();
		System.out.println(predicate.getName());
		predicate.lambdaCompleta();
		predicate.lambdaFactorizada();
		

		System.out.println("");
		
		LambdaExpresion unaryOperator = new UnaryOperationExample();
		System.out.println(unaryOperator.getName());
		unaryOperator.lambdaCompleta();
		unaryOperator.lambdaFactorizada();
		
		System.out.println("");
		
		LambdaExpresion function = new FunctionExample();
		System.out.println(function.getName());
		function.lambdaCompleta();
		function.lambdaFactorizada();
		
		System.out.println("");
		
		LambdaExpresion runnable = new RunnableExample();
		System.out.println(runnable.getName());
		runnable.lambdaCompleta();
		runnable.lambdaFactorizada();
		
		System.out.println("");
		
		LambdaExpresion suplier = new SuplierExample();
		System.out.println(suplier.getName());
		suplier.lambdaCompleta();
		suplier.lambdaFactorizada();
    }

}
