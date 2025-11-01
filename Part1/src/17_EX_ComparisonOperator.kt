fun main (args: Array<String>): Unit
{
    var isRight: Boolean = (10 + 70) > (3 * 25)
    println(isRight)    // true

    isRight = false
    println(isRight)    // false

    isRight = 30 == (10 + 20)
    println(isRight)    // true

    isRight = 0.00001f == 0.005f * 0.002f
    println(isRight)    // false

    isRight = 3.0 * 5 + 2.7 <= 16
    println(isRight)    // false
}