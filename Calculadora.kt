fun main() {
    val valor1 = 13.4F
    val valor2 = 14.3F
    println("Calculando")
    println("O resultado da conta é" + subtrai(valor1, valor2))
}

fun soma(valor1: Float, valor2: Float): Float {
  var resultado: Float? = null
    if(valor1 == null || valor2 == null){
        println("Erro")
    }else{
        resultado = valor1 + valor2
    }
    return  resultado!!
}

fun multiplica(valor1: Float, valor2: Float): Float {
    var resultado: Float? = null
    if(valor1 == null || valor2 == null){
        println("Erro")
    }else{
        resultado = valor1 * valor2
    }
    return  resultado!!
}

fun divide(valor1: Float, valor2: Float): Float {
    var resultado: Float? = null
    if(valor1 == null || valor2 == null){
        println("Erro")
    }else{
        resultado = valor1 / valor2
    }
    return  resultado!!
}

fun subtrai(valor1: Float, valor2: Float): Float {
    var resultado: Float? = null
    if(valor1 == null || valor2 == null){
        println("Erro")
    }else{
        resultado = valor1 - valor2
    }
    return  resultado!!
}
