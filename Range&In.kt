const val MIN_AGE = 16
const val MAXAGE = 68
fun main() {
    var age = (10..100).random()
    println(age)
    println(age in MIN_AGE..MAXAGE)
    println(age >= MIN_AGE && age <= MAXAGE)
}
