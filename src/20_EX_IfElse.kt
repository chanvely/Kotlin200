fun main (args: Array<String>): Unit
{
    val a = 10
    val b = 5

    if (a < b)          // (10 < 5) --> False
        println("if")
    else
        println("else")

    if (a > b)          // (10 > 5) --> True
        println("a가 크다")
    else
        println("b는 a 이상이다")
}