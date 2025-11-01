fun main (args: Array<String>): Unit
{
    val score = 88

    if (score >= 90)        // 88 >= 90 --> False
    {
        println('A')
    }
    else                    // 실행
    {
        if (score >= 80)    // 88 >= 80 --> true
        {
            println('B')    // 출력
        }
        else
        {
            if (score >= 70)
            {
                println('C')
            }
            else
            {
                println('F')
            }
        }
    }
}