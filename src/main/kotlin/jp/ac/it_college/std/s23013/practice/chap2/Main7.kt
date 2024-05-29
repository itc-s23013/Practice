package jp.ac.it_college_std.s23013.jp.ac.it_college.std.s23013.practice.chap2

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    println("----2.7.1----")
    val list = mutableListOf<Int>()
    for (i in 1..10) {
        if (i % 2 == 1) {
            list.add(i)
        }
    }
    val oddNumbers = list.joinToString(" ")
    println(oddNumbers)

    println("----2.7.2--2.7.3----")
    val oddNumbers2 = with(mutableListOf<Int>()) {
        for (i in 1..10) {
            if (i % 2 == 1) {
                add(i)
            }
        }
        joinToString(" ")
    }
    println(oddNumbers2)

    println("----2.7.4----")
    val oddNumbers3 = mutableListOf<Int>().run {
        for (i in 1..10) {
            if (i % 2 == 1) {
                add(i)
            }
        }
        joinToString(" ")
    }
    println(oddNumbers3)

    println("----2.7.おまけ----")
    randomGenerateNumber()?.run {
        println("1回目: ${this}が生成されました")
    }
    randomGenerateNumber()?.run {
        println("2回目: ${this}が生成されました")
    }
    randomGenerateNumber()?.run {
        println("3回目: ${this}が生成されました")
    }
    randomGenerateNumber()?.run {
        println("4回目: ${this}が生成されました")
    }
    println("----2.7.6----")
    val oddNumbers4 = mutableListOf<Int>().let { list ->
        for (i in 1..10) {
            if (i % 2 == 1 ) {
                list.add(i)
            }
        }
        list.joinToString(separator = " ")
    }
    println(oddNumbers4)

    println("----2.7.7--2.7.8----")
    println(createUser("takehata"))
    println(createUser(null))

    println("----2.7.11----")
    val oddNumbers11 = mutableListOf<Int>().apply {
        for (i in 1..10) {
            if (i % 2 == 1) {
                add(i)
            }
        }
        joinToString(" ")
    }
    println(oddNumbers11)

    println("----2.7.12--2.7.13----")
    updateUser(100,"kotoln","nagoya")
}

    fun randomGenerateNumber (): Int? {
        return if (Random.nextBoolean()) Random.nextInt(1..10) else null
    }