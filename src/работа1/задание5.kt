package работа1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Задача 5")
    print("Введите число n: ")
    val n = scanner.nextInt()
    print("Введите основание степени x: ")
    val x = scanner.nextInt()

    var result = 1
    var y = 0
    while (result < n) {
        result *= x
        y++
    }
    if (result == n) {
        println("Целочисленный показатель степени y: $y")
    } else {
        println("Целочисленный показатель не существует")
    }
}