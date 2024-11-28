package lesson_1

fun main() {
    val fullTimeInSeconds: Int = 6480
    val minutes: Int = fullTimeInSeconds / 60 % 60
    val seconds: Int = fullTimeInSeconds % 60
    println("0${fullTimeInSeconds / 3600}:$minutes:0$seconds")
}