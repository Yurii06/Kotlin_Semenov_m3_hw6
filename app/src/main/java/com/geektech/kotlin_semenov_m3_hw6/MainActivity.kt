package com.geektech.kotlin_semenov_m3_hw6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val result = calculate(1.0, 5.0, '+')
        val resultOne = calculate(10.0, 2.0, '-')
        val resultTwo = calculate(12.0, 3.0, '*')
        val resultTree = calculate(14.0, 2.0, '/')
        println("Результат: $result")
        println("Результат: $resultOne")
        println("Результат: $resultTwo")
        println("Результат: $resultTree")

    }

    fun calculate(num1: Double, num2: Double, operator: Char): Double {
        return when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> num1 / num2
            else -> throw IllegalArgumentException("Такого знака нет: $operator")
        }
    }
}