package com.example.recyclerview_test
import androidx.recyclerview.widget.RecyclerView

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val rv: RecyclerView=findViewById(R.id.rv)

        val listofcontacts= mutableListOf<contactlist>()
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture1,
                first_heading ="This is Kalyan Kumar",
                sub_heading ="This is Message from Kalyan Kumar.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture2,
                first_heading ="This is satya",
                sub_heading ="This is Message from satya.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture3,
                first_heading ="This is Ramya",
                sub_heading ="This is Message from Ramya.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture1,
                first_heading ="This is Kalyan Kumar",
                sub_heading ="This is Message from Kalyan Kumar.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture2,
                first_heading ="This is satya",
                sub_heading ="This is Message from satya.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture3,
                first_heading ="This is Ramya",
                sub_heading ="This is Message from Ramya.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture1,
                first_heading ="This is Kalyan Kumar",
                sub_heading ="This is Message from Kalyan Kumar.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture2,
                first_heading ="This is satya",
                sub_heading ="This is Message from satya.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture3,
                first_heading ="This is Ramya",
                sub_heading ="This is Message from Ramya.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture1,
                first_heading ="This is Kalyan Kumar",
                sub_heading ="This is Message from Kalyan Kumar.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture2,
                first_heading ="This is satya",
                sub_heading ="This is Message from satya.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture3,
                first_heading ="This is Ramya",
                sub_heading ="This is Message from Ramya.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture1,
                first_heading ="This is Kalyan Kumar",
                sub_heading ="This is Message from Kalyan Kumar.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture2,
                first_heading ="This is satya",
                sub_heading ="This is Message from satya.."
            )
        )
        listofcontacts.add(
            contactlist(
                imageRes = R.drawable.picture3,
                first_heading ="This is Ramya",
                sub_heading ="This is Message from Ramya.."
            )
        )

        val adapter= contactlistadapter(listofcontacts)
        rv.layoutManager=LinearLayoutManager(this)
        rv.adapter=adapter


        }
    }