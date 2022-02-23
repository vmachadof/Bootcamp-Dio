package AulasClasses.Testes

import AulasClasses.Analista
import AulasClasses.Funcionario

fun main() {
    val pedro = Analista("pedro", "1214324355", (2000.0))
    ImprimeRelatorioFuncionario.imprime(pedro)
}
