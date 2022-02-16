fun main() {
    val bingo = listOf(8,6,34,2,13)
    val number = (1..34).random()

    println(number)
    println(number in bingo)
}

