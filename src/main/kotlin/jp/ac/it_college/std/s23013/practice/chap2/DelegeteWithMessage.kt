package jp.ac.it_college_std.s23013.jp.ac.it_college.std.s23013.practice.chap2

import kotlin.reflect.KProperty

class DelegeteWithMessage<T> {
    private var value: T? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        println("${property.name} を取得します")
        return value!!
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        println("${property.name}を取得します")
        this.value = value
    }
}