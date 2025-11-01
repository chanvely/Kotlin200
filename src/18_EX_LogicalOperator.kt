fun main (args: Array<String>): Unit
{
    val a = 15
    val b = 17

    var bool: Boolean = (a - b < a + b) && (a == 15)
    // (15 - 17 < 15 + 17) && (15 == 15)
    // (-2 < 32) && (True)
    // (True) && (True)

    println(bool)       // True

    bool = !((a + b) > (a * 3) || (b - a) > 0)
    // !((15 + 17) > (15 * 3) || (17 - 15) > 0)
    // !(32 > 45 || 2 > 0)
    // !(False || True)
    // !(True)

    println(bool)       // False
}