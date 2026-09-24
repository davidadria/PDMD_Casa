package com.DavidPDMDCasa.lib.Tema02

/**
 * Crea un programa en Kotlin que pida dos números al usuario y muestre por pantalla
 * la suma, la resta y la multiplicación. Procura que el número se escriba en la misma línea que el mensaje,
 * como en la imagen. Por el momento no validamos la entrada (mira la nota de abajo).
 * Imprime primero un mensaje en el que aparezca tu nombre, por ejemplo "Ejercicio 2: Sergio Contreras".
 */

fun ejercicio2() {
    println("Ejercicio 2 - David Adrian Ciocanel Milea")

    print("Inserta un numero: ")
    var n1 = readln().toInt();

    print("Inserta otro numero: ")
    var n2 = readln().toInt();

    println("Suma: ${n1 + n2}")
    println("Resta: ${n1 - n2}")
    println("Multiplicacion: ${n1 * n2}")
}