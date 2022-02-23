package AulasClasses.Testes

import AulasClasses.Gerente


fun main() {
    val Maria = Gerente("Maria", "1214324355", (5000.0), "senha123")

    ImprimeRelatorioFuncionario.imprime(Maria)

    TesteAutenticacao().autentica(Maria)
}

