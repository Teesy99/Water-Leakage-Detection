package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore

class Show_data:AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)

        val database = FirebaseFirestore.getInstance()
        var strUser: String = intent.getStringExtra("Username")

        val tbox: TextView = findViewById(R.id.textView)
        //val button: Button = findViewById(R.id.button1)
        val listview: ListView = findViewById(R.id.listview1)
        // val grid_time : ListView = findViewById(R.id.time1)

        tbox.text = "Data of " + strUser
        database.collection(strUser)
            .addSnapshotListener { value, e ->
                if (e != null) {
                    Log.w("TAG", "Listen failed.", e)
                    return@addSnapshotListener
                }

                val cities = ArrayList<String>()

                for (doc in value!!) {
                    doc.getString("da")?.let {
                        cities.add(it)
                    }
                }

                val time1 = ArrayList<String>()
                for (doc in value!!) {
                    doc.getString("ti")?.let {
                        time1.add(it)
                    }
                }

                val pres = ArrayList<String>()
                for (doc in value!!) {
                    doc.getString("press")?.let {
                        pres.add(it)
                    }
                }


                val test = ArrayList<String>()
                for (i in 0..(cities.size - 1)) {
                    test.add(
                        cities.get(i) + "         " + time1.get(i) + "                   " + pres.get(
                            i
                        )
                    )

                }


                var adapt = ArrayAdapter(this, android.R.layout.simple_list_item_1, test)
                listview.adapter = adapt
                //gridview.adapter(time1)
            }

        fun show() {
            val db: FirebaseFirestore = FirebaseFirestore.getInstance()
            val ref = db.collection("S3")

        }
    }


    }