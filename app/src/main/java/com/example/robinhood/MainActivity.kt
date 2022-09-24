package com.example.robinhood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.robinhood.Models.EmployeeDataSource

class MainActivity : AppCompatActivity() {

    lateinit var employeeAdapter: EmployeeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeRecyclerView();
    }

    private fun initializeRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        employeeAdapter = EmployeeAdapter(this)
        recyclerView.adapter = employeeAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        employeeAdapter.setData(EmployeeDataSource.createEmployeeDate())
    }
}