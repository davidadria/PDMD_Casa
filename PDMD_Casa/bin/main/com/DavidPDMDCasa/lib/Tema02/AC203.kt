package com.DavidPDMDCasa.lib.Tema02

fun ejercicio3() {
    // A error
//    val nombre: String = null

    // B
    val num: Int? = null

    // C
    val nombre: String?=null
    val tam=nombre?.length
    println(tam)

    // D
    val nombre2: String?=null
    val tam2=nombre2!!.length
    println(nombre2)

    // E

    val nombre3: String?="Pepe"
    val tam3=nombre3!!.length

    // F
    val nombre4: String?="Pepe"
    val longitud = nombre4?.length ?: 0

    // G
    val nombre5: String?=null
    val longitud2 = nombre5?.length ?: 0
}