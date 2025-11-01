fun main (args: Array<String>): Unit
{
    val score = 64

    when (score / 10)
    {
        // previously,
        /*
        6 -> {println('D')}
        7 -> {println('C')}
        8 -> {println('B')}
        9, 10 -> {println('A')}
        else -> {println('F')}
        */

        // 안에 들어있는 문장이 하나일 때, 중과호를 생략할 수 있음
        6 -> println('D')
        7 -> println('C')
        8 -> println('B')
        9, 10 -> println('A')
        else -> println('F')
    }

    println("test")
}