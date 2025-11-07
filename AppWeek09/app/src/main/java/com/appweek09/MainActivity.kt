package com.appweek09

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.appweek09.data.Student
import com.appweek09.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var studentList: ArrayList<Student>
    private lateinit var studentAdapter: StudentAdapter

    companion object{
        private const val TAG = "KotlinWeek09App"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "onCreate: AppWeek09 RecyclerView started")

//        setUpViews()
//        setUpRecyclerView()
//        setUpListeners()
//        editInitialData()


        }
    }
