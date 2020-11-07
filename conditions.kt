import java.util.Scanner

fun main()
{

    println("Insert two numbers: ")

    // reader variable to get user input from stdin
    val reader = Scanner(System.`in`)

    var num1 = reader.nextInt()
    var num2 = reader.nextInt()

    // validation which inserted number is higher
    if (num1 > num2)
    {
        println("num1 bigger than num2")
    } else if (num2 > num1) {
        println("num2 bigger than num1")
    } else
    {
        println("num1 equals to num2")
    }
}