package AulasClasses.Testes

import AulasClasses.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.toString()}")
    }
//Duas maneiras de fazer
    ClienteTipo.values().forEach {
        println("${it.name} - $it")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.toString()}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.toString()}")
}