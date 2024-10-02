package работа1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Задача 4")
    print("Введите числа и операцию (ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ): ")
    val num1 = scanner.nextDouble()
    val num2 = scanner.nextDouble()
    val operation = scanner.next()[0]

    val result = when (operation) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2
        else -> {
            println("Недопустимая операция")
            return
        }
    }
    println("Результат: $result")
}