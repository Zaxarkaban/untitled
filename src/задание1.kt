//Пасларь Артём Игоревич 52-02
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Задача 1")
    print("Введите строку: ")
    val input = scanner.nextLine()

    if (input.isEmpty()) {
        println("ну напиши что нибудь")
        return
    }

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
    println(result.toString())
}