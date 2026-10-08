package com.DavidPDMDCasa.lib.Tema02

/**
 * Ejercicio 8: Refactorizando a una línea
 *
 * Transforma las siguientes funciones a su expresión más reducida (una sola línea).
 * Crea una función ejercicio8 donde demuestres su funcionamiento.
 * Modifica la firma de ambas para que los parámetros v2 y v3 sean opcionales, con valor por defecto 1.
 * Para demostrar que funciona correctamente, una de las llamadas a mediaDeTres hazla pasándole sólo v1 y v3 (así prácticas los parámetros con nombre).
 */
fun ejercicio8() {
    println("Media: ${mediaDeTres(3,6,9)}")
    println("Media: ${mediaDeTres(v1 = 2, v3 = 18)}")

    println("Que palabra es mas larga (Palabra/Larga)? -> ${palabraMasLarga("Palabra", "Larga")}")
}

// Función 1
fun mediaDeTres(v1: Int, v2: Int = 1, v3: Int = 1) = (v1 + v2 + v3) / 3

// Función 2
fun palabraMasLarga(w1: String, w2: String) = if (w1.length > w2.length) w1 else w2
