package jp.ac.it_college_std.s23013.jp.ac.it_college.std.s23013.practice.chap2

interface CalculationExecutor {
    val message: String
    fun calc(num1: Int, num2: Int): Int
    fun printStartMessage()
}