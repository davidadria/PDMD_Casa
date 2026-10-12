package com.DavidPDMDCasa.lib.Extra

fun main() {
    var problema = false
    var longitud = true
    var noMay = true
    var noMin = true
    var noNum = true
    var noSym = true
    val symbols = "@_-#$"

    print("Introduce tu contrasena: ")
    var contra = readlnOrNull() ?: ""

    if (contra.length < 8) longitud = false
    if (!contra.any { it.isUpperCase() }) noMay = false
    if (!contra.any { it.isLowerCase()}) noMin = false
    if (!contra.any{ it.isDigit()}) noNum = false
    if (!contra.any{ it in symbols}) noSym = false

    if (!longitud || !noMin || !noMay || !noNum || !noSym) problema = true

    val resultado = """
        ${if (problema) "Hubo un problema" else "Todo bien"}
        Resultaoos: 
        Longitud correcta $longitud
        Hay Mayusculas $noMay
        Hay Minusculas $noMin
        Hay Numeros $noNum
        Hay Simbolos $noSym
    """.trimIndent()

    println(resultado)
}