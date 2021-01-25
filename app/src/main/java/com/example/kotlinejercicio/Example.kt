package com.example.kotlinejercicio

fun main(){
    println("Hola mundo")

    var number: Int= 10
    val numero2: Int= 23

    var myName="joaquin astorga"

    var template : String
    var texto = " un texto"

    template="el mensaje al interior es : $texto "
    println(template)

    val Variableinmutable: String ="Marck"

    var VariableMutable:Int=24

    println("La persona se llama $Variableinmutable y tiene $VariableMutable años de edad")

    var edad : Float= 23f

    var vocalNombre: Char='a'

    var a=10
    var b=33
    var c=66
    var resultado = a+b+c
    println("El resultado de las suma de los numero $a $b $c = $resultado")
    a=55
    resultado=a+b+c
    println("El resultado de las suma de los numero $a $b $c = $resultado")
    val promedio = resultado/3
    println("EL promedio es: $promedio")




}