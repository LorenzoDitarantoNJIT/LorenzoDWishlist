package com.example.lorenzodwishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton = findViewById<Button>(R.id.button)
        val priceVal = findViewById<TextView>(R.id.price)
        val itemName = findViewById<TextView>(R.id.itemname)
        val itemURL = findViewById<TextView>(R.id.url)
        val emailsRv = findViewById<RecyclerView>(R.id.emailsRv)

        var itemsList : MutableList<Item> = ArrayList()

        showButton.setOnClickListener {

            val currentItem = Item(itemName.getText().toString(), priceVal.getText().toString(), itemURL.getText().toString())
            itemsList.add(currentItem)
            val adapter = ItemAdapter(itemsList)
            emailsRv.adapter = adapter

            emailsRv.layoutManager = LinearLayoutManager(this)
        }


    }
}