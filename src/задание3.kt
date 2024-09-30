import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Задача 3")
    print("Введите натуральное число: ")
    val num = scanner.nextInt()

    var n = num
    if (n == 0) {
        println("Двоичное представление: 0")
        return
    }
    val binary = StringBuilder()
    while (n > 0) {
        binary.append(n % 2)
        n /= 2
    }
    println("Двоичное представление: ${binary.reverse()}")
}