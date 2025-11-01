fun main (args: Array<String>): Unit
{
    var a = 15
    val b = 11

    if (a > b)      // if (15 > 11)
    {
        println("if 안으로 들어옴")
        a -= b      // a = a - b = 15 - 11 = 4
    }

    println(a)      // 4
}