package cl.alvaro.stream;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String...args) {
		
		List<Persona> listPersonas = Stream.of(new Persona(1234599, "1", "Alvaro Vergara", new Date()),
				new Persona(1254750, "2", "Ana", new Date()),
				new Persona(6179089, "3", "Carmela", new Date()),
				new Persona(6789056, "4", "Isabella", new Date()),
				new Persona(3667890, "5", "Alba", new Date())
				).collect(Collectors.toList());

        // filter(): Filtra los elementos que cumplen una condición.
		listPersonas.stream()
                .filter(persona -> persona.getNom().length()>4)
                .forEach(System.out::println);
		
		// Multiples Filtros
		listPersonas.stream()
                .filter(persona -> persona.getNom().length()>3)
                .filter(persona -> persona.getNom().startsWith("A"))
                .forEach(System.out::println);

        // map(): Transforma los elementos aplicando una función.
		listPersonas.stream()
                .map(p -> p.getNom().toUpperCase())
                .forEach(System.out::println);

        // sorted(): Ordena los elementos del stream.
        listPersonas.stream()
                .sorted()
                .forEach(System.out::println);

        // forEach(): Aplica una acción a cada elemento.
        listPersonas.stream()
                .forEach(name -> System.out.println("Nombre: " + name));

        // reduce(): Combina todos los elementos en un solo valor.
        String concatenatedNames = listPersonas.stream()
        	    .map(Persona::getNom)
        	    .reduce("", (a, b) -> a + " " + b);

        	System.out.println("Nombres concatenados: " + concatenatedNames.trim());

        // collect(): Recoge los elementos en una colección.
        List<Persona> namesStartingWithA = listPersonas.stream()
                .filter(p -> p.getNom().startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Nombres que empiezan con A: " + namesStartingWithA);

        // distinct(): Elimina los elementos duplicados.
        List<String> duplicates = Arrays.asList("Ana", "Luis", "Luis", "Maria", "Juana", "Luisa");
        duplicates.stream()
                .distinct()
                .forEach(System.out::println);

        // limit(): Limita el número de elementos procesados.
        listPersonas.stream()
                .limit(3)
                .forEach(System.out::println);

        // skip(): Omite un número específico de elementos.
        listPersonas.stream()
                .skip(2)
                .forEach(System.out::println);

        // anyMatch(): Verifica si algún elemento cumple una condición.
        boolean anyStartsWithP = listPersonas.stream()
                .anyMatch(p -> p.getNom().startsWith("P"));
        System.out.println("¿Hay algún nombre que empiece con P?: " + anyStartsWithP);

        // allMatch(): Verifica si todos los elementos cumplen una condición.
        boolean allElementMoreThan3Letters = listPersonas.stream()
                .allMatch(p -> p.getNom().length() > 3);
        System.out.println("¿Todos los nombres tienen más de 3 letras?: " + allElementMoreThan3Letters);

        // noneMatch(): Verifica que ningún elemento cumpla la condición.
        boolean notIsStartsWithZ = listPersonas.stream()
                .noneMatch(p -> p.getNom().startsWith("Z"));
        System.out.println("¿Ningún nombre empieza con Z?: " + notIsStartsWithZ);
	}
}
