package com.calculator.module

class Calculator(val number1: Double, val number2: Double ){

    fun addition(): Double{
        return number1 + number2;
    }

    fun subtraction(): Double{
        return number1 - number2;
    }

    fun multiplication(): Double{
        return number1 * number2;
    }

    fun division(): Double{
        return number1 / number2;
    }
}