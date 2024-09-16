package com.naeem.repositorypatternlearning

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.naeem.repositorypatternlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding
    private val binding get() = _binding!!
    private val viewModel: MainActivityViewModel by viewModels()
    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        _binding = ActivityMainBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        initObserver()
    }

    private fun initObserver() {

    }

    private fun initViews() {
        binding.btnSave.setOnClickListener {
            viewModel.handleEvent(MainActivityEvent.SaveButtonClicked)
        }
        binding.btnLoad.setOnClickListener {
            viewModel.handleEvent(MainActivityEvent.LoadButtonClicked)
        }
    }
}