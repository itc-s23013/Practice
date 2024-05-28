package jp.ac.it_college_std.s23013.jp.ac.it_college.std.s23013.practice.chap2
typealias Calc = (Int, Int) -> Int

fun main() {
    val user = User3()
    user.name = "リいぬ"
    println(user.name)

    println("----2.2.8--2.2.9----")
    val user4 = User4()
    user4.name = ""
    println("isValidName: ${user4.isValidName}")
    user4.name = "高島"
    println("isValidName: ${user4.isValidName}")

    println("----2.5.10--2.5.11----")
    prntCalcResult(3,4) {x, y -> x + y}
}


val User4.isValidName: Boolean
    get() = name !=""

fun prntCalcResult(num1: Int, num2: Int, calc: Calc) {
    val result = calc(num1, num2)
    println("計算結果: $result")
}