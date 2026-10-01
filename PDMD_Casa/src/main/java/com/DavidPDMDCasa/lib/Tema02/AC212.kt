package com.DavidPDMDCasa.lib.Tema02

/**
 * Ejercicio 12: Filtrando Listas II
 *
 * Escribe una función que reciba una lista de palabras y devuelva
 * la primera que empiece por las dos primeras letras de tu nombre.
 * Si no hay ninguna, deberá devolver null.
 */
fun ejercicio12(lista: List<String>): String? {
    return lista.firstOrNull { palabra ->
        palabra.startsWith("Da")
    }
}
