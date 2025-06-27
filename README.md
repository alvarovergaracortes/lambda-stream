# 🧩 Expresiones Lambda y Stream en Java

Proyecto de ejemplo con lambdas y ademas los principales métodos intermedios y terminales de streams en Java

Cuadro resumen: 

```plaintext
List<Integer> numeros = Arrays.asList(3, 7, 2, 7, 5, 10);

|Método      |Código de ejemplo                                                 | Resultado                                     | Descripción
|------------|------------------------------------------------------------------|-----------------------------------------------|--------------------------
|.filter()   |numeros.stream().filter(n -> n > 5).collect(Collectors.toList())  | [7, 7, 10]                                    | Filtra los mayores a 5
|.map()      |numeros.stream().map(n -> n * 2).collect(Collectors.toList())     | [6, 14, 4, 14, 10, 20]                        | Duplica cada número
|.sorted()   |numeros.stream().sorted().collect(Collectors.toList())            | [2, 3, 5, 7, 7, 10]                           | Orden natural ascendente
|.distinct() |numeros.stream().distinct().collect(Collectors.toList())          | [3, 7, 2, 5, 10]                              | Elimina duplicados
|.limit()    |numeros.stream().limit(3).collect(Collectors.toList())            | [3, 7, 2]                                     | Primeros 3 elementos
|.skip()     |numeros.stream().skip(2).collect(Collectors.toList())             | [2, 7, 5, 10]                                 | Omite los primeros 2
|.forEach()  |numeros.stream().forEach(System.out::println)                     | (Imprime en consola: 3 7 2 7 5 10)            | Acción por cada elemento
|.reduce()   |numeros.stream().reduce(0, Integer::sum)                          | 34                                            | Suma total
|.collect()  |numeros.stream().collect(Collectors.toSet())                      | [2, 3, 5, 7, 10] (sin orden y sin duplicados) | Recolecta en un Set
|.anyMatch() |numeros.stream().anyMatch(n -> n > 8)                             | true                                          | Al menos uno mayor a 8
|.allMatch() |numeros.stream().allMatch(n -> n < 20)                            | true                                          | Todos son menores a 20


```

## 📚 Flashcards – Métodos de Stream en Java

- ✅ **.filter()**

  Filtra elementos del stream según un `Predicate<T>`.  
  Ejemplo: `stream().filter(n -> n > 5)`.

- ✅ **.map()**

  Transforma cada elemento con una función (`Function<T, R>`).  
  Ejemplo: `stream().map(n -> n * 2)`.

- ✅ **.sorted()**

  Ordena usando el orden natural o un `Comparator`.  
  Ejemplo: `stream().sorted()`.

- ✅ **.distinct()**

  Elimina elementos duplicados del stream.  
  Ejemplo: `stream().distinct()`.

- ✅ **.limit(n)**

  Retorna un stream con solo los primeros `n` elementos.  
  Ejemplo: `stream().limit(3)`.

- ✅ **.skip(n)**

  Omite los primeros `n` elementos del stream.  
  Ejemplo: `stream().skip(2)`.

- ✅ **.forEach()**

  Ejecuta una acción sobre cada elemento (`Consumer<T>`).  
  Ejemplo: `stream().forEach(System.out::println)`.

- ✅ **.reduce()**

  Reduce todos los elementos a uno solo usando una operación acumulativa.  
  Ejemplo: `stream().reduce(0, Integer::sum)`.

- ✅ **.collect()**

  Recolecta los elementos del stream en una estructura como `List`, `Set`, etc.  
  Ejemplo: `stream().collect(Collectors.toList())`.

- ✅ **.anyMatch()**

  Devuelve `true` si **algún** elemento cumple la condición (`Predicate<T>`).  
  Ejemplo: `stream().anyMatch(n -> n > 10)`.

- ✅ **.allMatch()**

  Devuelve `true` si **todos** los elementos cumplen la condición (`Predicate<T>`).  
  Ejemplo: `stream().allMatch(n -> n < 20)`.



## 🛠️ Tecnologías

- Java 21



## 👤 Autor
  Álvaro Vergara Cortés  
  alvaro.vergara.cl@gmail.com



