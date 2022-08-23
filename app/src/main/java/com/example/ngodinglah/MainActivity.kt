package com.example.ngodinglah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var menu: Menu? = null
    private lateinit var rvBahasaPemrograman: RecyclerView
    private var list: ArrayList<BahasaPemrograman> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBahasaPemrograman = findViewById(R.id.rv_bahasa_pemrograman)
        rvBahasaPemrograman.setHasFixedSize(true)

        list.addAll(BahasaPemrogramanData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvBahasaPemrograman.layoutManager = LinearLayoutManager(this)
        val listBahasaPemrogramanAdapter = ListBahasaPemrogramanAdapter(list)
        rvBahasaPemrograman.adapter = listBahasaPemrogramanAdapter

        listBahasaPemrogramanAdapter.setOnItemClickCallback(object :
            ListBahasaPemrogramanAdapter.OnItemClickCallback {
            override fun onItemClicked(data: BahasaPemrograman) {
                showDetailBahasaPemrograman(data)
            }
        })
    }

    private fun showDetailBahasaPemrograman(data: BahasaPemrograman) {
        Toast.makeText(this, "Kamu memilih detail " + data.nama, Toast.LENGTH_SHORT).show()
        val detail = Intent(this@MainActivity, DetailActivity::class.java)
        detail.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
        detail.putExtra("nama", data.nama)
        detail.putExtra("deskripsi", data.deskripsi)
        detail.putExtra("tahun", data.tahun)
        detail.putExtra("logo", data.logo)
        startActivity(detail)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        this.menu = menu
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.profile -> {
                val profile = Intent(this@MainActivity, ProfileActivity::class.java)
                profile.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
                startActivity(profile)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}