package com.DavidPDMDCasa.lib.Tema02

/**
 * Ejercicio 11: Filtrando Listas I
 *
 * Escribe una función que reciba dos parámetros, n y m. La función debe:
 *
 *     Leer n números introducidos por el usuario y guardarlos en una lista.
 *     Mostrar la lista entera por pantalla.
 *     Mostrar por pantalla solo los números de la lista que sean menores que m.
 *
 * Requisito: Debes utilizar los métodos de las colecciones (filter, forEach, etc.) y lambdas para resolverlo.
 */

fun ejercicio11(n: Int, m: Int) {
    // Crear lista vacia
    var lista: MutableList<Int> = mutableListOf();

    // Guardar numeros en la lista
    for (i in 1..n) {
        print("Inserta un numero: ")
        var num = readln().toIntOrNull() ?: 0

        lista.add(num)
    }

    println("Lista Inicial:")
    lista.forEach { println(it) }

    println("Filtrando los que sean menores que ${m}...")
    lista.filter { it < m }.forEach { println(it) }

}