package com.DavidPDMDCasa.lib.Tema02

/**
 * Ejercicio 5: Sueldos con when
 *
 * Crea un programa que lea el sueldo de 5 trabajadores (puedes usar un for o un while) y
 * muestre por pantalla si el sueldo es alto, medio o bajo según las siguientes condiciones.
 * De nuevo, utiliza programación defensiva para asegurarte de que el sueldo introducido es un número
 * entero positivo. Si no lo es, muestra un mensaje de error y no hagas nada más:
 *
 *     "sueldo alto" si es > 5000
 *     "sueldo medio" si es <= 5000 y > 2000
 *     "sueldo bajo" si es <= 2000
 *
 * Importante: No utilices la sentencia if; debes usar la sentencia when.
 * Imprime un mensaje inicial con tu nombre, por ejemplo: "Ejercicio 5: [Tu Nombre Completo]".
 *
 * Para las validaciones de NotNull puedes utilizar varias estrategias, como por ejemplo:
 *
 *     If clásico
 *     Operador Elvis ?:. -> sueldo ?: return println("Entrada incorrecta")
 *     Excepción en la declaración de la variable -> requireNotNull(readln().toIntOrNull()) { "Error: Debe introducir un número entero válido." }
 */
fun ejercicio5() {
    println("Ejercicio 5: David Adrian Ciocanel Milea")

    // Lista incluida por ir practicando con ellas
    var sueldosEmpleados = mutableListOf<Int>()

    // For hecho por probar
    for (i in 1..3) { // 3 num para probar cada caso
        print("Introduce un num: ")
        val num = readln().toIntOrNull() ?: return println("Entrada Incorrecta")

        sueldosEmpleados.add(num) // Nota: Funciona tambien +=
    }

    for (i in sueldosEmpleados) {
        when {
            i > 5000 -> println("Sueldo Alto: $i")
            i <= 5000 && i > 2000 -> println("Sueldo Medio: $i")
            i < 2000 -> println("Sueldo Bajo: $i")
        }
    }
}