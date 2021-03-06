package com.example.laboratorio5apps.ui.allQuestions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio5apps.MainViewModel
import com.example.laboratorio5apps.R
import com.example.laboratorio5apps.databinding.FragmentAllQuestionsBinding

class AllQuestionsFragment : Fragment() {

    private lateinit var allQuestionsModel: AllQuestionsModel

    lateinit var datos: ArrayList<String>
    lateinit var recycler: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        allQuestionsModel =
            ViewModelProviders.of(this).get(AllQuestionsModel::class.java)
        val root = inflater.inflate(R.layout.fragment_all_questions, container, false)
        val binding = DataBindingUtil.inflate<FragmentAllQuestionsBinding>(
            inflater, R.layout.fragment_all_questions, container, false)


        Toast.makeText(context, MainViewModel.getQuizSize().toString(), Toast.LENGTH_SHORT).show()
        recycler = binding.recycler
        recycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        datos = arrayListOf("ddsfsf","gg","fsdfsdf","sdsda","kkjljkkm")

        var adapter = AdapterData(datos)
        recycler.adapter = adapter

        return root
        //return binding.root
    }

}