package jp.ac.it_college_std.s23013.jp.ac.it_college.std.s23013.practice.chap2

fun main() {
    val executor = AddCalculationExecutor(CommonCalculationExecutor())
    executor.printStartMessage()
    println(executor.calc(8,11))

    val executorDelegate = AddCalculationExecutorDelegate(executor)
    executorDelegate.printStartMessage()
    println(executorDelegate.calc(8,11))

    val person = Person()
    person.name = "takehata"
    person.address = "Tokyo"
    println(person.name)
    println(person.address)
}