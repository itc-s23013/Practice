package jp.ac.it_college_std.s23013.jp.ac.it_college.std.s23013.practice.chap2

fun main() {
    println("----2.10.2----")
    val list = listOf(1,2,3,4)
    list.forEach { num -> println(num) }
    println("----2.10.3----")
    list.forEach { println(it) }

    println("----2.10.4----")
    run {
        val idList = list.map { it * 10}
        idList.forEach { println(it) }
    }
    println("----2.10.5----")
    run {
        val users = listOf(
            User2(1,100,"takenhata"),
            User2(2,100,"kotlin"),
        )
        val idList = users.map { user -> user.id }
        idList.forEach { println(it) }
    }
    println("----2.12.5----")
    run {
        val users = listOf(
            User2(1,100,"takenhata"),
            User2(2,200,"kotlin"),
            User2(3,100,"java"),
        )
        val filteredList = users.filter { it.teamId == 100 }
        filteredList.forEach {
            println(it)
        }
    }
    println("----2.10.7----")
    run {
        val users = listOf(
            User2(1,100,"takenhata"),
            User2(2,200,"kotlin"),
            User2(3,100,"java"),
            User2(4,200,"Groovy"),
        )
        println(users.first())
        println(users.last())
    }

    println("----2.10.8----")
    run {
        val users = listOf(
            User2(1,100,"takenhata"),
            User2(2,200,"kotlin"),
            User2(3,100,"java"),
            User2(4,200,"Groovy"),
        )
        println(users.first { it.teamId == 200 })
        println(users.first { it.teamId == 100 })
    }
}