package com.example.ngodinglah

object BahasaPemrogramanData {
    private val namaBahasa = arrayOf("HTML",
        "CSS",
        "Java Script",
        "Java",
        "Phyton",
        "React",
        "Kotlin ",
        "Swift",
        "Dart",
        "PHP")

    private val deskripsiBahasa = arrayOf("Hypertext Markup Languange adalah bahasa yang digunakan untuk membuat struktur web",
        "Cascading Style Sheets adalah bahasa yang digunakan untuk mempercantik tampilan web",
        "JavaScript (ES6) adalah bahasa yang digunakan untuk membuat web lebih interaktif",
        "Java adalah bahasa yang digunakan untuk pengembangan perangkat lunak, aplikasi seluler, dan lainnya",
        "Python adalah bahasa Pemrograman populer yang di gunakan untuk data science, machine learning, dan lain-lain",
        "React adalah library JavaScript front-end yang banyak digunakan oleh programer global",
        "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java",
        "Swift adalah bahasa pemrograman yang kuat dan intuitif untuk macOS, iOS, watchOS, tvOS",
        "Dart adalah bahasa pemrograman yang dirancang untuk pengembangan klien, seperti untuk web dan aplikasi seluler",
        "PHP adalah Bahasa server-side yang cocok digunakan untuk pengembangan web")

    private val tahunRilis = arrayOf("1991",
        "1996",
        "1995",
        "1991",
        "1991",
        "2015",
        "2011",
        "2014",
        "2007",
        "1995")

    private val logoBahasa = intArrayOf(R.drawable.html,
        R.drawable.css,
        R.drawable.javascript,
        R.drawable.java,
        R.drawable.phython,
        R.drawable.react,
        R.drawable.kotlin,
        R.drawable.swift,
        R.drawable.dart,
        R.drawable.php)

    val listData: ArrayList<BahasaPemrograman>
        get() {
            val list = arrayListOf<BahasaPemrograman>()
            for (position in namaBahasa.indices) {
                val bahasaPemrograman = BahasaPemrograman()
                bahasaPemrograman.nama = namaBahasa[position]
                bahasaPemrograman.deskripsi = deskripsiBahasa[position]
                bahasaPemrograman.tahun = tahunRilis[position]
                bahasaPemrograman.logo = logoBahasa[position]
                list.add(bahasaPemrograman)
            }
            return list
        }
}