package com.study.kotlincalc

// lv.??
// 추가해야 할 거: 직접 식 받아서 계산(3개 이상의 수 계산, 우선 순위, 괄호 구분)
open class Calculator(private val num1: Int, private val num2: Int) {

    private var menu: Int = -1
    private lateinit var operation: AbstractOperation
    private val signList: List<Char> = listOf('+','-','*','/','%','(',')',)
    private val str: String = ""

    fun exe() {
        var firstExe = true
        var firstNum = num1
        var secondNum = num2
        while(true) {
            if(!firstExe) {
                println("추가 값을 입력해주세요.")
                secondNum = if(readln() != "") readln().toInt() else 0
            }
            println("다음과 같은 숫자를 입력하여, 조작할 수 있습니다.")
            println("현재 값 설정은 ${firstNum}, ${secondNum}입니다.")
            println("입력: 1 = 더하기, 2 = 빼기, 3 = 곱하기, 4 = 나누기, 5 = 나머지 값 구하기, -1 = 종료")
            menu = if(readln() != "") readln().toInt() else 0
            when(menu) {
                1 -> operation = AddOperation(firstNum, secondNum)
                2 -> operation = SubOperation(firstNum, secondNum)
                3 -> operation = MulOperation(firstNum, secondNum)
                4 -> operation = DvdOperation(firstNum, secondNum)
                5 -> operation = RemOperation(firstNum, secondNum)
                -1 -> break
                else -> operation = WrongOperation(menu)
            }
            println("값 : ${operation.printRes()}")
            if(menu in 1..5) {
                firstNum = operation.printRes().toInt()
                firstExe = false
            }
        }
        print("종료됐습니다.")
    }
}

// lv.4
/*
open class Calculator(private val num1: Int, private val num2: Int) {

    private var menu: Int = -1
    private lateinit var operation: AbstractOperation

    fun exe() {
        while(true) {
            println("다음과 같은 숫자를 입력하여, 조작할 수 있습니다.")
            println("현재 값 설정은 ${num1}, ${num2}입니다.")
            println("입력: 1 = 더하기, 2 = 빼기, 3 = 곱하기, 4 = 나누기, 5 = 나머지 값 구하기, -1 = 종료")
            menu = readln().toInt()
            when(menu) {
                1 -> operation = AddOperation(num1, num2)
                2 -> operation = SubOperation(num1, num2)
                3 -> operation = MulOperation(num1, num2)
                4 -> operation = DvdOperation(num1, num2)
                5 -> operation = RemOperation(num1, num2)
                -1 -> break
                else -> operation = WrongOperation(menu)
            }
            operation.printRes()
        }
        print("종료됐습니다.")
    }
}
 */

// lv.3
/*
open class Calculator(private val num1: Int, private val num2: Int) {

    private var menu: Int = -1
    private lateinit var operation: Calculator

    fun exe() {
        while(true) {
            println("다음과 같은 숫자를 입력하여, 조작할 수 있습니다.")
            println("현재 값 설정은 ${num1}, ${num2}입니다.")
            println("입력: 1 = 더하기, 2 = 빼기, 3 = 곱하기, 4 = 나누기, 5 = 나머지 값 구하기, -1 = 종료")
            menu = readln().toInt()
            when(menu) {
                1 -> operation = AddOperation(num1, num2)
                2 -> operation = SubOperation(num1, num2)
                3 -> operation = MulOperation(num1, num2)
                4 -> operation = DvdOperation(num1, num2)
                5 -> {
                    operation = this
                    rem()
                }
                -1 -> break
                else -> {
                    operation = this
                    println("잘못된 숫자를 입력하셨습니다. 입력받은 숫자: $menu")
                }
            }
            operation.printRes()
        }
        print("종료됐습니다.")
    }

    open fun printRes() {

    }

    fun rem() {
        println("값: ${num1 % num2}")
    }

}
 */

// lv.2
/*
class Calculator(val num1: Int, val num2: Int) {

    var menu: Int = -1

    fun exe() {
        while(true) {
            println("다음과 같은 숫자를 입력하여, 조작할 수 있습니다.")
            println("현재 값 설정은 ${num1}, ${num2}입니다.")
            println("입력: 1 = 더하기, 2 = 빼기, 3 = 곱하기, 4 = 나누기, 5 = 나머지 값 구하기, -1 = 종료")
            menu = readln().toInt()
            when(menu) {
                1 -> add()
                2 -> sub()
                3 -> mul()
                4 -> dvd()
                5 -> rem()
                -1 -> break
                else -> println("잘못된 숫자를 입력하셨습니다. 입력받은 숫자: $menu")
            }
        }
        print("종료됐습니다.")
    }

    fun add() {
        println("값: ${num1 + num2}")
    }

    fun sub() {
        println("값: ${num1 - num2}")
    }

    fun mul() {
        println("값: ${num1 * num2}")
    }

    fun dvd() {
        println("값: ${num1 / num2}")
    }

    fun rem() {
        println("값: ${num1 % num2}")
    }

}
 */

// lv.1
/*
class Calculator(val num1: Int, val num2: Int) {

    fun add() {
        println(num1 + num2)
    }

    fun sub() {
        println(num1 - num2)
    }

    fun mul() {
        println(num1 * num2)
    }

    fun dvd() {
        println(num1 / num2)
    }

}
 */