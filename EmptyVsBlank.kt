fun main() {
    val empty = ""
    println(empty.length)

    val blank = "             "
    println(blank.length)

    println(empty.isEmpty() && empty.isBlank())
    //println(blank.isEmpty() || blank.isBlank())
    //  println(blank.isEmpty() && blank.isBlank())
}