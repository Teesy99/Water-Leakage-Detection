package com.example.myapplication.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.R
import com.example.myapplication.Show_data
import kotlinx.android.synthetic.main.fragment_home.view.*
import java.util.zip.Inflater

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
      val root=inflater.inflate(R.layout.fragment_home,container,false)
        val image:ImageView=root.findViewById(R.id.imageView)
        image.setImageResource(R.drawable.water_channel)
        val b1 : Button =root.findViewById(R.id.B1)
        val b2:Button=root.findViewById(R.id.B2)
        val b3:Button=root.findViewById(R.id.B3)
        val b4:Button=root.findViewById(R.id.B4)
        val b5:Button=root.findViewById(R.id.B5)
        val b6:Button=root.findViewById(R.id.B6)
        val intent=Intent(this@HomeFragment.context,Show_data::class.java)

        b1.setOnClickListener {
            intent.putExtra("Username", "S1")
            startActivity(intent)
        }

        b2.setOnClickListener {
            intent.putExtra("Username", "S2")
            startActivity(intent)
        }
        b3.setOnClickListener {
            intent.putExtra("Username", "S3")
            startActivity(intent)
        }
        b4.setOnClickListener {
            intent.putExtra("Username", "S4")
            startActivity(intent)
        }
        b5.setOnClickListener {
            intent.putExtra("Username", "S6")
            startActivity(intent)
        }
        b6.setOnClickListener {
            intent.putExtra("Username", "S5")
            startActivity(intent)
        }
        return root;
    }
}
