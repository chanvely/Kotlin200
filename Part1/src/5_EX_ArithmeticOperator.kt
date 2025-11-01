fun main(args: Array<String>): Unit
{
    // previously, val num: Int = 15 - 4 * 3
    val num: Double = 15.0 - 4 * 3

    val num2: Int = 65 % 7
    val num3: Double = 7.5 / 5 + 22.25

    // previously, val num4: Double = num / num2 + 0.7
    val num4: Double = num.toDouble() / num2 + 0.7

    println(num)
    println(num2)
    println(num3)
    println(num4)       // previously, 1.5 (with Int num)

}