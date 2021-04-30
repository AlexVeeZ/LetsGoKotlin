package com.example.letsgokotlin

object ExampleObject {

    val data = Cat("Пушок", 3)
    val data_two = data.copy("Мурзик", 2)

    fun getCat() = data_two
}