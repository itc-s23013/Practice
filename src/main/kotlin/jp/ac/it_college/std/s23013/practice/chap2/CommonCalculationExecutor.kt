package jp.ac.it_college_std.s23013.jp.ac.it_college.std.s23013.practice.chap2

class CommonCalculationExecutor(override val message: String = "calc") : CalculationExecutor {
    override fun calc(num1: Int, num2: Int): Int {
        throw IllegalArgumentException("nat implemants calc")
    }

    override fun printStartMessage() {
        println("start $message")
    }
}