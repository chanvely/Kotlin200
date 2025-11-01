package ex_null

// Upcasting 예제의 Person class 재활용
import ex_upcasting.Person

fun main(args: Array<String>)
{
    var person: Person? = Person("K", 30)
    person = null

    var num: Int? = null
    num = 10
}