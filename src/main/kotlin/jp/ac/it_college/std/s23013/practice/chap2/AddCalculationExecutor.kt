package jp.ac.it_college_std.s23013.jp.ac.it_college.std.s23013.practice.chap2

class AddCalculationExecutor (private val calculationExecutor:  CalculationExecutor) : CalculationExecutor {

    override val message: String
        get() = calculationExecutor.message

    override fun calc(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    override fun printStartMessage() {
        calculationExecutor.printStartMessage()
    }
}