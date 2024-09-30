package com.zukira.myapplication.model

import com.zukira.myapplication.R

data class ModelMovie(
    val gambar : Int,
    val judul : String,
    val trailer : String
)

object MovieList {
    fun getModel() : List<ModelMovie> {
        val itemModel1 = ModelMovie(
            R.drawable.spider_man,
            "Spider-Man",
            "Spider-Man: No Way Home adalah film pahlawan super Amerika Serikat berdasarkan karakter Marvel Comics, Spider-Man, yang diproduksi bersama oleh Marvel Studios, Columbia Pictures dan Pascal Pictures, dan didistribusikan oleh Sony Pictures Releasing. Film ini disutradarai oleh Jon Watts, ditulis oleh Chris McKenna dan Erik Sommers, dan dibintangi oleh Tom Holland, Tobey Maguire, dan Andrew Garfield sebagai Peter Parker / Spider-Man, bersama Zendaya, Jacob Batalon, Marisa Tomei, Jamie Foxx, Benedict Cumberbatch dan Alfred Molina."
        )

        val itemModel2 = ModelMovie(
            R.drawable.hulk,
            "Hulk",
            "Film karya sutradara Ang Lee yang dirilis pada 20 Juni 2003 ini diadaptasi dari tokoh pahlawan super fiksi di Marvel Comics. Dibintangi oleh Eric Bana, Jennifer Connelly, dan Sam Elliot, Hulk mengisahkan awal mula terciptanya sang monster hijau. Ia terlahir dari seorang ayah yang juga ilmuwan bernama David Banner (Paul Karsey)."
        )

        val itemModel3 = ModelMovie(
            R.drawable.avatar,
            "Avatar",
            "Film Avatar mengisahkan kehidupan manusia di masa depan yang mengalami krisis energi. Manusia harus mencari sumber energi baru dan berniat untuk mencari di planet lain bernama Pandora. Pandora memiliki sumber energi besar bernama unobtanium. Namun sayangnya udara di Pandora beracun bagi manusia. Planet Pandora memiliki penduduk asli yang disebut suku Na'vi."
        )

        val itemModel4 = ModelMovie(
            R.drawable.end_game,
            "End_game",
            "Avengers: Endgame adalah film pahlawan super Amerika tahun 2019 yang berdasarkan kisah tim pahlawan super Avengers dari Marvel Comics. Pada film ini, anggota Avengers yang masih hidup dan para sekutunya berusaha untuk membalikkan kerusakan yang disebabkan oleh Thanos dalam Infinity War."
        )

        val itemModel5 = ModelMovie(
            R.drawable.jumanji,
            "Jumanji",
            "Jumanji: The Next Level adalah sebuah film asal Amerika bergenre petualangan-fantasi. Film ini merupakan sekuel dari seri sebelumnya yang berjudul Jumanji: Welcome to The Jungle. Dengan durasi 2 jam 3 menit, film ini menawarkan cerita menegangkan yang dibalut komedi. Penonton akan dibawa merasakan petualangan mendebarkan dengan alur yang penuh kejutan."
        )

        val itemModel6 = ModelMovie(
            R.drawable.inception,
            "Inception",
            "Inception merupakan film karya Christopher Nolan yang menggabungkan elemen fiksi ilmiah dan aksi menegangkan. Dalam film ini, dikisahkan seorang pencuri ulung bernama Dom Cobb (Leonardo DiCaprio). Berbeda dari pencuri pada umumnya, Cobb ternyata mencuri rahasia penting yang terletak di alam bahwa sadar korbannya."
        )

        val itemModel7 = ModelMovie(
            R.drawable.jurassic_world,
            "Jurassic World",
            "Film Jurassic World berkisah tentang resor mewah yang terletak di lepas pantai Kosta Rika bernama Jurassic World yang menyediakan habitat dari dinosaurus hasil rekayasa genetika. Film berdurasi 2 jam 4 menit ini diproduksi dengan kolaborasi antara Amblin Entertainment, Universal Pictures, dan Legendary Pictures. Setelah itu didistribusikan pertama kali di teater pada 10 Juni 2015 yang langsung tayang di total 66 negara."
        )

        val itemModel8 = ModelMovie(
            R.drawable.lucy,
            "Lucy",
            "Lucy berkisah tentang seorang gadis Amerika Serikat bernama Lucy yang tengah mengemban pendidikan di Taipei, Taiwan. Baru kenal satu minggu, Lucy langsung menjalin hubungan asmara oleh Richard, yang rupanya merupakan bandar narkoba."
        )

        val itemModel9 = ModelMovie(
            R.drawable.batman,
            "Batman",
            "The Batman menampilkan perjalanan Bruce Wayne yang sudah berada di tahun keduanya sebagai sang Caped Crusader. Ia menjadi pemburu kriminal yang kemunculannya ditakuti para penjahat di Gotham. Pada suatu malam perayaan Halloween, Walikota Gotham Don Mitchell Jr. ditemukan tewas di tangan seorang pembunuh berantai misterius."
        )

        val itemModel10 = ModelMovie(
            R.drawable.venom,
            "Venom",
            "Bermula ketika Eddie menyelidiki perusahaan bio-engineering dan menemukan sebuah komet yang ditutupi makhluk hidup simbiosis. Singkat cerita, saat melakukan penyelidikan, Eddie diserang makhluk simbiosis yang bernama Venom. Eddie pun mempunyai kekuatan super setelah menjadi Venom. Namun, di sisi lain makhluk simbiosis tersebut membuat emosi Eddie jadi terganggu dan sulit dikendalikan. Bahkan, makhluk itu sangat tergantung padanya."
        )

        val itemList: ArrayList<ModelMovie> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)
        itemList.add(itemModel9)
        itemList.add(itemModel10)

        return itemList
    }
}
