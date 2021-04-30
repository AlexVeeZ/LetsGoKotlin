package com.example.letsgokotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/*
+ Создать новый проект в Android Studio без поддержки Kotlin.
+ Сконфигурировать Kotlin в новом проекте (лучше вручную).
+ Перевести MainActivity на Kotlin.
+ Добавить кнопку в разметку и повесить на неё clickListener в Activity.

создайте тестовое приложение:
+ создайте data class с двумя свойствами, выведите их на экран приложения;
+ создайте Object, в Object вызывайте copy и выводите значения скопированного класса на экран;
выводите значения из разных циклов в консоль.*/




class MainActivity : AppCompatActivity() {


    var button: Button? = null
    var button_two: Button? = null
    var textView: TextView? = null
    var textView_two: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        addClickListener()
        generateCycleConsistently()
        generateCycleWithStepTwo()

    }

    fun initView(){
        button = findViewById<Button>(R.id.button)
        button_two = findViewById<Button>(R.id.button_two)
        textView = findViewById<TextView>(R.id.textDataClass)
        textView_two = findViewById<TextView>(R.id.textCopyObject)
    }



    fun addClickListener(){
        button?.setOnClickListener {
            generateDataClass()
        }
        button_two?.setOnClickListener {
            generateCopyObject()

        }

    }

    fun generateDataClass(){
        val data = Cat("Пушок", 3)
        textView?.setText("My cat name: ${data.name}, age: ${data.age}")
    }

    fun generateCopyObject(){
        textView_two?.setText("My friend's cat name: ${ExampleObject.data_two.name}, age: ${ExampleObject.data_two.age}")
    }

    fun generateCycleConsistently(){
        for(i in 1..10) {
            print("Hello Kotlin!")
        }
    }

    fun generateCycleWithStepTwo(){
        for(i in 10 downTo 1 step 2) {
            print("Hello Kotlin!")
        }
    }


}