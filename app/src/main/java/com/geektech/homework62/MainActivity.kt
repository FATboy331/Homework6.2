package com.geektech.homework62

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.core.widget.doAfterTextChanged
import com.geektech.homework62.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var list = arrayListOf<TextModel>()
    private lateinit var adapter: TextAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        invis()
        initAdapter()
        saveText()


    }

    private fun saveText() {


        binding.btnMain.setOnClickListener {
            if (binding.etMain.text.contains("#")) {
                list.add(TextModel(binding.etMain.text.toString()))
                binding.etMain.text.clear()
            }
        }
    }

    private fun initAdapter() {
        adapter = TextAdapter(list)
        binding.recMaim.adapter = adapter

    }

    private fun hashtag() {
        binding.etMain.doAfterTextChanged {
        }
    }

    private fun invis() {
        binding.etMain.setOnClickListener {
            if (list.isNotEmpty()) {
                binding.recMaim.isVisible = true
            }
        }
    }

}



























