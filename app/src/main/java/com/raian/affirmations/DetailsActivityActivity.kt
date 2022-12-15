package com.raian.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.raian.affirmations.model.Affirmation

class DetailsActivityActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var imageView : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_activity)
        textView = findViewById(R.id.textView)
        imageView = findViewById(R.id.imageView)
//        val bundle: Bundle? = intent.extras
        val player = intent.getSerializableExtra("player") as Affirmation

//        val title: String? = bundle?.getString("string_value")
//        val image: String? = bundle?.getString("image_value")
        textView.text = getString(player.stringResourceId).toString()
        imageView.setImageResource(player.imageResourceId)
//        image?.toInt()?.let { imageView.setImageResource(it) }
    }
}