fun main(args: Array<String>): Unit
{
    val a = 10
    val b = 20

    println("a의 값: $a")
    println("b의 값: $b")

    println("a + b = ${a + b}")

    // 예외 - $ 문자 자체 출력
    println("a의 값: \$a")
}