package com.DavidPDMDCasa.lib.Tema02

/**
 * Crea tres nuevas funciones en su forma más concisa (una sola línea donde sea posible). Llámalas desde una función ejercicio9().
 *
 *     Una función que reciba un entero y devuelva su cuadrado.
 *     Una función que reciba dos String y devuelva su concatenación.
 *     Una función juego() que reciba un String ("piedra", "papel" o "tijera")
 *     y devuelva a quién gana (ej. juego("papel") devuelve "piedra").
 *     Si recibe cualquier otro valor, debe devolver "empate". (Consejo: ¡Usa when como expresión!).
 *
 */

fun ejercicio9() {
    println("Cuadrado de 5: ${cuadradoOneLine(5)}")

    println("Contatenando 2 lineas -> ${concatOneLine("Esta linea esta concatenada", " con esta otra")}")

    juego() // Empate
    juego("piedra") // papel
    juego("papel") // tijera
    juego("tijera") // piedra
    juego("rempalago") // empate

}

fun cuadradoOneLine(number: Int) = number * number

fun concatOneLine(a: String, b: String) = a.plus(b)

// He añadido un valor default por probar
fun juego(tirada: String = "") = when(tirada) {"piedra" -> println("Papel") "papel" -> println("Tijera") "tijera" -> println("Piedra") else -> println("Empate")}