package jp.ac.it_college_std.s23013.jp.ac.it_college.std.s23013.practice.chap2

fun main() {
    println("----2.10.2----")
        val list = listOf(1, 2, 3, 4)
        list.forEach { num -> println(num) }

    println("----2.10.3----")
        list.forEach { println(it) }

    println("----2.10.4----")

        val idList = list.map { it * 10}
        idList.forEach { println(it) }

    println("----2.10.5----")
    run {
        val users = listOf(
            User2(1,100,"takenhata"),
            User2(2,100,"kotlin"),
        )
        val idList = users.map { user -> user.id }
        idList.forEach { println(it) }
    }

    println("----2.10.6----")
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

    println("----2.10.9----")
    run {
        val users = listOf(
            User2(1,100,"takenhata"),
            User2(2,200,"kotlin"),
            User2(3,100,"java"),
            User2(4,200,"Groovy"),
        )
        println(users.firstOrNull { it.teamId == 200 })
        println(users.lastOrNull { it.teamId == 100 })
        println(users.firstOrNull { it.teamId == 1800 })
        println(users.lastOrNull{ it.teamId == 1900 })
    }

    println("----2.10.10----")
    run {
        val list = listOf(1,2,3,4,5)
        val distinctList = list.distinct()
        distinctList.forEach(::println)
    }

    println("----2.10.11----")
    run {
        val users = listOf(
            User2(1,100,"takenhata"),
            User2(2,200,"kotlin"),
            User2(3,100,"java"),
        )
        val userMap = users.associateBy(User2::id)
        println(userMap)
    }

    println("----2.10.11+1----")
    run {
        val students = listOf(
            Student("j1","a"),
            Student("2","i"),
            Student("3","u"),
            Student("4","e"),
            Student("5","o"),
        )
        students.forEach(::println)

        val studentMap = students.associateBy(Student::id)
        studentMap.forEach(::println)
    }

    println("----2.10.12----")
    run {

        val list = listOf("takehala","kotlin","java")
        val map = list.associateBy {String::length}
        println(map)
        map.forEach(::println)
    }

    println("----2.10.13--")
    run {
        val list = listOf(
            User2(1,100,"takenhata"),
            User2(2,200,"kotlin"),
            User2(3,100,"java"),
            User2(4,200,"Groovy"),
        )
        val map = list.groupBy(User2::teamId)
        println(map)
        println(map[100])
        println(map[200])
    }

    println("----2.10.14--")
    run {
        val list = listOf(1,2,3,4,5)
        val oddNumberCount = list.count { it % 2 == 1 }
        println(oddNumberCount)
    }

    println("----2.10.15--")
    run {
        val list = listOf(
            "Takehata",
            "Kotlin",
            "Java",
            "Groovy",
            "Scala",
        )
        val chunkedList = list.chunked(2)
        println(chunkedList)
        chunkedList.forEach(::println)
        }

    println("----2.10.16--")
    run {
        val list = listOf(1,2,3,4,5)
        val result = list.reduce { sum, value ->
            println("$sum + $value")
            sum + value
        }
        println(result)
        }

    println("----2.10.17--")
    run {
        val list = listOf(1,2,3,4,5)
        val result = list.reduce{ sum, value -> sum * value }
        println(result)
    }
}