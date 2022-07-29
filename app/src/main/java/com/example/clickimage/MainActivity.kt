package com.example.clickimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.util.toRange
import com.example.clickimage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val x=  binding.imageView.setImageResource(R.drawable.eb6a9b5b79af23b03dc7eb1c443a2759)
        binding.imageView.setOnClickListener {click() }




    }fun click0 ()
{
    binding.imageView.setImageResource(R.drawable.eb6a9b5b79af23b03dc7eb1c443a2759)
    binding.imageView.setOnClickListener{ click () }
}


    /////image 1

    fun click ()
    {

        binding.imageView.setImageResource(R.drawable.export_compliance_expert_1200)
        binding.imageView.setOnClickListener{ click2 () }


    }


    //image two
    fun click2 ()
    {

        binding.imageView.setImageResource(R.drawable.photo_1544256718_3bcf237f3974)
        binding.imageView.setOnClickListener{ click3 () }

    }
//////image three

    fun click3 ()
    {

        binding.imageView.setImageResource(R.drawable.e0de6882_c5d1_43f3_99e0_17e386489dca_9c3bda2df48f)
        binding.imageView.setOnClickListener{ click4() }

    }


    ///////image four
    fun click4 ()
    {

        binding.imageView.setImageResource(R.drawable.photo_1623479322729_28b25c16b011)
        binding.imageView.setOnClickListener{ click5 () }


    }
    ///////image five


    fun click5 ()
    {

        binding.imageView.setImageResource(R.drawable.coding_headphones_android_studio_star_wars_quiz)
        binding.imageView.setOnClickListener{ click0() }

    } }




