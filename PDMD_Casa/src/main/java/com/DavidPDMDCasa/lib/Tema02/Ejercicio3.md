# Ejercicio 3: Preguntas Anulabilidad
Crea un nuevo fichero llamado ejercicio3.md dentro del módulo 
ejercicios (botón derecho sobre el módulo > New > File; es un fichero de texto, como un readme), 
en el que copiarás y contestarás las siguientes preguntas:

## A. ¿Qué sucede cuando intentas asignar un valor nulo a una variable no anulable (non-nullable)? ¿Cómo cambiarías su definición?

val nombre: String = null

Esta declarado como tipo no nulable
## B. Declara una variable de tipo entero que permita nulo e inicialízala a null

val num: Int? = null

## C. ¿Qué tipo tendrá la variable tam y qué valor? ¿Compila? Si compila, ¿qué ocurre al ejecutarlo?

val nombre: String?=null
val tam=nombre?.length

Tipo String, valor Null. Compila pero solo apareceria null al hacer un print(tam) porque nunca modificamos nombre

## D. ¿Qué tipo tendrá la variable tam y qué valor? ¿Compila? Si compila, ¿qué ocurre al ejecutarlo?

val nombre: String?=null
val tam=nombre!!.length

Tipo int, !! permite que el compilador siga pero luego lanza una excepcion

## E. ¿Qué tipo tendrá la variable tam y qué valor? ¿Compila? Si compila, ¿qué ocurre al ejecutarlo?

val nombre: String?="Pepe"
val tam=nombre!!.length

Tipo int, todo funciona y tam seria = 4 

## F. ¿Qué valor tiene longitud?

val nombre: String?="Pepe"    
val longitud = nombre?.length ?: 0

longitud = 4

## G. ¿Qué valor tiene longitud?

val nombre: String?=null    
val longitud = nombre?.length ?: 0

longitud = 0

## H. Investiga para qué sirve la función checkNotNull()

Asegura que un valor no sea nulo o lanza una excepcion si se cumple