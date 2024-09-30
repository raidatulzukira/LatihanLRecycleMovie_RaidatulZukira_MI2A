package com.zukira.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMovieActivity : AppCompatActivity() {
    private lateinit var txtDetailMovie : TextView
    private lateinit var imgDetailMovie : ImageView
    private lateinit var txtDetailTrailer : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_movie)

        txtDetailMovie = findViewById(R.id.txtDetailMovie)
        imgDetailMovie = findViewById(R.id.imgDetailMovie)
        txtDetailTrailer = findViewById(R.id.txtDetailTrailer)

        val teksDetail = intent.getStringExtra("txtMovie")
        val imgDetail = intent.getIntExtra("imgMovie", 0)
        val trailerDetail = intent.getStringExtra("txtTrailer")

        txtDetailMovie.setText(teksDetail)
        imgDetailMovie.setImageResource(imgDetail)
        txtDetailTrailer.setText(trailerDetail)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}