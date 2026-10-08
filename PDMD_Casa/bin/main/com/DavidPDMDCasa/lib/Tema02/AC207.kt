package com.DavidPDMDCasa.lib.Tema02

/**
 * Desarrolla una función (ejercicio7) que a su vez llame a dos funciones auxiliares que tendrás que definir.
 *
 *     La primera recibirá un entero y devolverá el cuadrado de dicho valor.
 *     La segunda recibirá dos enteros y devolverá el producto de los mismos.
 *
 * Desde ejercicio7(), solicita al usuario los valores necesarios y llama a ambas funciones para mostrar los resultados:
 * el cuadrado del primero, el cuadrado del segundo y el producto de ambos.
 * Asegúrate de manejar entradas inválidas (no enteros) mostrando un mensaje de error y sin realizar cálculos.
 */

fun ejercicio7() {
    print("Ingresa un Numero para duplicar: ")
    val num = readln().toIntOrNull() ?: return print("No has ingresado un entero")

    println("Cuadrado: ${cuadrado(num)}")

    print("Ingresa Num1")
    val num1 = readln().toIntOrNull() ?: return print("No has ingresado un entero")

    print("Ingresa Num2")
    val num2 = readln().toIntOrNull() ?: return print("No has ingresado un entero")

    println("Producto: ${producto(num1, num2)}")
}

fun cuadrado(num: Int): Int {
    return num * num
}

fun producto(num1: Int, num2: Int): Int {
    return num1 * num2
}