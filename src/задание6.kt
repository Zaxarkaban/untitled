import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Задача 6")
    print("Введите первую цифру: ")
    val digit1 = scanner.nextInt()
    print("Введите вторую цифру: ")
    val digit2 = scanner.nextInt()

    val num1 = digit1 * 10 + digit2
    val num2 = digit2 * 10 + digit1

    if (num1 % 2 != 0) {
        println("Созданное нечетное число: $num1")
    } else if (num2 % 2 != 0) {
        println("Созданное нечетное число: $num2")
    } else {
        println("Создать нечетное число невозможно")
    }
}