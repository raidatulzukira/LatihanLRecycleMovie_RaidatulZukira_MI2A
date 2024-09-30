package com.zukira.myapplication.model

import android.content.Context
import com.zukira.myapplication.R


data class ModelBuah(
    val image : Int,
    val nama : String,
    val lokasi : String,
    val deskripsi: String
)

// kita mock data untuk array
object Mocklist {
    fun getModel(context: Context) : List<ModelBuah> {

         val itemModel1 = ModelBuah(
            R.drawable.apple,
            "Apple",
            "Indonesia",
            context.getString(R.string.st_apel)
        )

        val itemModel2 = ModelBuah(
            R.drawable.grapes,
            "Anggur",
            "Malaysia",
            context.getString(R.string.st_anggur)
        )

        val itemModel3 = ModelBuah(
            R.drawable.orange,
            "Jeruk",
            "Australia",
            context.getString(R.string.st_jeruk)
        )

        val itemModel4 = ModelBuah(
            R.drawable.pear,
            "Pear",
            "Bali",
            context.getString(R.string.st_pear)
        )

        val itemModel5 = ModelBuah(
            R.drawable.strawberry,
            "Strowbery",
            "Thailand",
            context.getString(R.string.st_strawberry)
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList

    }
}