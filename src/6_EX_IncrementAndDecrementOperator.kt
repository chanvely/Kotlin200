fun main(args: Array<String>): Unit
{
    var a = 10
    var b = 5

    println(a++ + b) // 10 + 5 = 15
    println(a) // a++ = a + 1 = 16 --> 후위 증가 연산
    println(--b) // --b = b - 1 = 5 --> 전위 감소 연산
}