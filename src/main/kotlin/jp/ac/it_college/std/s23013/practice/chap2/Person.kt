package jp.ac.it_college_std.s23013.jp.ac.it_college.std.s23013.practice.chap2

class Person {
    var name: String = ""
        get() {
            println("nameを取得します")
            return field
        }
    set(value) {
        println("nameを変更します")
        field = value
    }

    var address: String = ""
        get() {
            println("addressを取得します")
            return field
        }
        set(value) {
            println("addressを取得します")
            field = value
        }
}