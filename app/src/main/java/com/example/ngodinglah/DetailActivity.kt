package com.example.ngodinglah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    private lateinit var ivLogo: ImageView
    private lateinit var tvNama: TextView
    private lateinit var tvDeskripsi: TextView
    private lateinit var tvTahun: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        ivLogo = findViewById(R.id.iv_logo_detail)
        tvNama = findViewById(R.id.tv_username_bahasa)
        tvDeskripsi = findViewById(R.id.tv_deskripsi_bahasa)
        tvTahun = findViewById(R.id.tv_tahun_rilis)


        val getNama = intent.getStringExtra("nama")
        val getDeskripsi = intent.getStringExtra("deskripsi")
        val getTahun = intent.getStringExtra("tahun")
        val getLogo = intent.getIntExtra("logo", 0)

        tvNama.text = getNama
        tvDeskripsi.text = getDeskripsi
        tvTahun.text = getTahun

        Glide.with(this@DetailActivity)
            .load(getLogo)
            .into(ivLogo)
    }
}