package com.example.laboratorio5apps

import androidx.lifecycle.ViewModel
import com.example.laboratorio5apps.models.Question

object MainViewModel {

    private var quiz: ArrayList<Question> = arrayListOf()

    fun addDefaultQuestions() {
        val q1: Question = Question("¿Como le parecio nuestra encuesta?","")
        quiz.add(q1)
        val q2: Question = Question("¿Como cree que podriamos mejorar?","")
        quiz.add(q2)
    }

    fun getQuestionbyIndex(index: Int): String {
        return quiz.get(index).question
    }

    fun getQuizSize(): Int {
        return quiz.size
    }

    fun addNewQuestion(question: String) {
        var q1: Question = Question(question,"")
        quiz.add(q1)
    }

}