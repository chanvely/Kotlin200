fun main(args: Array<String>): Unit
{
    val a: Byte = 125

    val b: Int = (100 + 200) * 100    // 300 * 100 = 30000
    // 예제에는 Short = (100 + 200) * 100 로 되어있음

    var c: Int = 12_4354_6538

    c = 0xFF_88_88
    c = 0b01010010_01100011_01110101_01000101

    var d: Long = -543_7847_3984_7238_4723

    c = a + b       // 125 + 30000 = 30125
    d = c + 10L     // 30125 + 10L = 30135L

    var e: Float = 67.6f
    val f: Double = 658.456

    e = (e + f).toFloat()   // e = (67.6 + 658.456) = 726.056.toFloat()
    println(e)              // e = 726.0
}