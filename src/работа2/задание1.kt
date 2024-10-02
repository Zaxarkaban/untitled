package работа2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите количество строк:")
    val rows = scanner.nextInt()

    println("Введите количество столбцов:")
    val cols = scanner.nextInt()

    val array = Array(rows) { IntArray(cols) }
    val digitSet = mutableSetOf<Char>()

    println("Введите $rows x $cols трехзначных чисел:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            array[i][j] = scanner.nextInt()
            array[i][j].toString().forEach { digitSet.add(it) }
        }
    }

    println("Введенный массив:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("${array[i][j]} \t")
        }
        println()
    }

    println("В массиве использовано ${digitSet.size} различных цифр")
}