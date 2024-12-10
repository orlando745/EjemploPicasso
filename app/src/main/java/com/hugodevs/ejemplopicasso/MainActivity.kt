package com.hugodevs.ejemplopicasso

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hugodevs.ejemplopicasso.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Cargar la imagen de internet
        val url= "https://www.autoplusdigital.com.ar/wp-content/uploads/2023/04/autos-2.jpg"
        Picasso.get().load(url).into(binding.exampleImage)
    }
}