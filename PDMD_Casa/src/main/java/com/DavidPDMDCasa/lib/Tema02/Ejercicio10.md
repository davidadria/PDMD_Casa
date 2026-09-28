# Ejercicio 10: Definiendo y Asignando Lambdas

## Crea un nuevo fichero ejercicio10.md y contesta a las siguientes preguntas, añadiendo el código Kotlin correspondiente:

## Crea una variable llamada miFuncion1 que pueda almacenar una función que reciba dos parámetros de tipo String y devuelva un Int.
````kotlin
// A
val arg1 = "Hola"
val arg2 = "Caracola"

    // Nota: Ambas opciones son válidas
    // nomnbre: (argumentos) -> Retorno = {expresion lambda}
    val miFuncion1: (String, String) -> Int = {arg1, arg2 -> arg1.length + arg2.length}
    // nombre: {parametro: Tipo -> operación lambda}
    val miFuncion11= {arg1: String, arg2: String -> arg1.length + arg2.length}
    println("Funcion1: ${miFuncion1(arg1, arg2)}")
    println("Funcion1: ${miFuncion1(arg1, arg2)}")
````

## Asigna una función válida (una lambda) a la siguiente variable de tipo función: var miFuncion2: (Int, Int) -> Boolean
````kotlin
// B
    var miFuncion2: (Int, Int) -> Boolean = {num1, num2 -> num1 > num2}
    println("Num1 (10) es mayor que num2 (5): ${miFuncion2(10, 5)}")
    println("Num1 (10) es mayor que num2 (50): ${miFuncion2(10, 50)}")
````

## Asigna una función válida a la siguiente variable de tipo función: val miFuncion3: ((String, String) -> Int)
````kotlin
// C
    val miFuncion3: ((String, String) -> Int) = {arg1, arg2 -> arg1.length + arg2.length}
    println("Funcion3: ${miFuncion3("Soy", "David")}")
````

## Dada la siguiente lambda, realiza una llamada a la misma para que sume 5 y 10. val suma = { a: Int, b: Int -> a + b }
````kotlin
// D
    val suma = { a: Int, b: Int -> a + b }
    println("Funcion4: ${suma(10, 5)}")
````

## ¿Qué es el tipo de retorno implícito en una lambda y cómo se determina?
Es cuando no defines el tipo de dato que va a devolver una funcion y el propio Kotlin lo determina
