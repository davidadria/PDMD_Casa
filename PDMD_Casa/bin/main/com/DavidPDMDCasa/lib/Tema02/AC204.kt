package com.DavidPDMDCasa.lib.Tema02

/**
 * Crea un programa que lea un número del usuario y recorra mediante un for y rangos del 1 al número.
 * Muestra por pantalla solo los múltiplos de 3. Recuerda que el operador módulo % te da el resto de la división.
 * Si el resto de la división por 3 es 0, el número es múltiplo de 3.
 * Imprime un mensaje inicial con tu nombre, por ejemplo: "Ejercicio 4: [Tu Nombre Completo]".
 * Utiliza programación defensiva para asegurarte de que el número introducido es mayor que 1 y que efectivamente es un número entero.
 * Si no lo es, muestra un mensaje de error y no hagas nada más.
 */
fun ejercicio4() {
    println("Ejercicio 4: David Adrian Ciocanel Milea")

    print("Introduce un num: ")
    val num = readln().toIntOrNull() ?: 0

    if (num <= 1) {
        println("Error: El numero debe ser mayor que 1 y un numero entero")
        return
    } else {
        println("Multiplos de 3: ")
        for (i in 1..num) {
            if (i % 3 == 0) {
                println(i)
            }
        }
    }
}