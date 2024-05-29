package jp.ac.it_college_std.s23013.jp.ac.it_college.std.s23013.practice.chap2

data class User (val name: String)
    fun createUser(name: String?): User? {
        return name?.let { n -> User(n) }
    }