package jp.ac.it_college_std.s23013.jp.ac.it_college.std.s23013.practice.chap2

import kotlin.properties.Delegates

class DelegatePerson {
    var name: String by DelegeteWithMessage()
    var address: String by Delegates.notNull()
}