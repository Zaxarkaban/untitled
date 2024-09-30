//Пасларь Артём Игоревич 52-02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Задача 1
    println("Задача 1")
    print("Введите строку: ")
    val input1 = scanner.nextLine()
    println(compressString(input1))

    // Задача 2
    println("\nЗадача 2")
    print("Введите строку: ")
    val input2 = scanner.nextLine()
    countDistinctCharacters(input2)

    // Задача 3
    println("\nЗадача 3")
    print("Введите натуральное число: ")
    val input3 = scanner.nextInt()
    println("Двоичное представление: ${toBinaryString(input3)}")

    // Задача 4
    println("\nЗадача 4")
    print("Введите числа и операцию (ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ): ")
    val num1 = scanner.nextDouble()
    val num2 = scanner.nextDouble()
    val operation = scanner.next()[0]
    println("Результат: ${performOperation(num1, num2, operation)}")

    // Задача 5
    println("\nЗадача 5")
    print("Введите число n: ")
    val n = scanner.nextInt()
    print("Введите основание степени x: ")
    val x = scanner.nextInt()
    findExponent(n, x)

    // Задача 6
    println("\nЗадача 6")
    print("Введите первую цифру: ")
    val digit1 = scanner.nextInt()
    print("Введите вторую цифру: ")
    val digit2 = scanner.nextInt()
    createOddNumber(digit1, digit2)
}

fun compressString(input: String): String {
    if (input.isEmpty()) return ""
    val result = StringBuilder()
    var count = 1
    for (i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            result.append(input[i - 1])
            if (count > 1) result.append(count)
            count = 1
        }
    }
    result.append(input.last())
    if (count > 1) result.append(count)
    return result.toString()
}

fun countDistinctCharacters(input: String) {
    val charCount = mutableMapOf<Char, Int>()
    for (char in input) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }
    for (char in charCount.keys.sorted()) {
        println("$char - ${charCount[char]}")
    }
}

fun toBinaryString(num: Int): String {
    var n = num
    if (n == 0) return "0"
    val binary = StringBuilder()
    while (n > 0) {
        binary.append(n % 2)
        n /= 2
    }
    return binary.reverse().toString()
}

fun performOperation(num1: Double, num2: Double, operation: Char): Double {
    return when (operation) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2
        else -> throw IllegalArgumentException("Недопустимая операция")
    }
}

fun findExponent(n: Int, x: Int) {
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

fun createOddNumber(digit1: Int, digit2: Int) {
    val oddNumbers = mutableListOf<Int>()
    val num1 = digit1 * 10 + digit2
    val num2 = digit2 * 10 + digit1
    if (num1 % 2 != 0) oddNumbers.add(num1)
    if (num2 % 2 != 0) oddNumbers.add(num2)

    if (oddNumbers.isNotEmpty()) {
        println("Созданное нечетное число: ${oddNumbers.first()}")
    } else {
        println("Создать нечетное число невозможно")
    }
}