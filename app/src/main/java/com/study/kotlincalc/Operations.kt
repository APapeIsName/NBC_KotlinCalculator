package com.study.kotlincalc

// lv.??
abstract class AbstractOperation {
    abstract fun printRes(): String
}

class AddOperation(private val num1:Int, private val num2:Int): AbstractOperation() {
    override fun printRes(): String = (num1 + num2).toString()
}

class SubOperation(private val num1:Int, private val num2:Int): AbstractOperation() {
    override fun printRes(): String = (num1 - num2).toString()
}

class MulOperation(private val num1:Int, private val num2:Int): AbstractOperation() {
    override fun printRes(): String = (num1 * num2).toString()
}

class DvdOperation(private val num1:Int, private val num2:Int): AbstractOperation() {
    override fun printRes(): String = (num1 / num2).toString()
}

class RemOperation(private val num1:Int, private val num2:Int): AbstractOperation() {
    override fun printRes(): String = (num1 % num2).toString()
}

class WrongOperation(private val menu: Int): AbstractOperation() {
    override fun printRes(): String = "잘못된 숫자를 입력하셨습니다. 입력받은 숫자: $menu"
}

// lv.4

/*
abstract class AbstractOperation {
    abstract fun printRes()
}

class AddOperation(private val num1:Int, private val num2:Int): AbstractOperation() {
    override fun printRes() {
        println("값: ${num1 + num2}")
    }
}

class SubOperation(private val num1:Int, private val num2:Int): AbstractOperation() {
    override fun printRes() {
        println("값: ${num1 - num2}")
    }
}

class MulOperation(private val num1:Int, private val num2:Int): AbstractOperation() {
    override fun printRes() {
        println("값: ${num1 * num2}")
    }
}

class DvdOperation(private val num1:Int, private val num2:Int): AbstractOperation() {
    override fun printRes() {
        println("값: ${num1 / num2}")
    }
}

class RemOperation(private val num1:Int, private val num2:Int): AbstractOperation() {
    override fun printRes() {
        println("값: ${num1 % num2}")
    }
}

class WrongOperation(private val menu: Int): AbstractOperation() {
    override fun printRes() {
        println("잘못된 숫자를 입력하셨습니다. 입력받은 숫자: $menu")
    }
}
 */

// lv.3
/*
class AddOperation(private val num1:Int, private val num2:Int): Calculator(num1 = num1, num2 = num2) {
    override fun printRes() {
        println("값: ${num1 + num2}")
    }
}

class SubOperation(private val num1:Int, private val num2:Int): Calculator(num1 = num1, num2 = num2) {
    override fun printRes() {
        println("값: ${num1 - num2}")
    }
}

class MulOperation(private val num1:Int, private val num2:Int): Calculator(num1 = num1, num2 = num2) {
    override fun printRes() {
        println("값: ${num1 * num2}")
    }
}

class DvdOperation(private val num1:Int, private val num2:Int): Calculator(num1 = num1, num2 = num2) {
    override fun printRes() {
        println("값: ${num1 / num2}")
    }
}
 */