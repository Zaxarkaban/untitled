import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Задача 2")
    print("Введите строку: ")
    val input = scanner.nextLine()

    val charCount = mutableMapOf<Char, Int>()
    for (char in input) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }
    for (char in charCount.keys.sorted()) {
        println("$char - ${charCount[char]}")
    }
}
//2334234