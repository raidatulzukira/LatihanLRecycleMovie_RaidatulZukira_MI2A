package com.zukira.myapplication.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zukira.myapplication.DetailMovieActivity
import com.zukira.myapplication.R
import com.zukira.myapplication.RecycleMovieActivity
import com.zukira.myapplication.model.ModelMovie

class MovieAdapter(
    val itemList: ArrayList<ModelMovie>,
    val getActivity: RecycleMovieActivity
) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgMovie : ImageView
        var txtMovie : TextView
        var txtTrailer : TextView

        init {
            imgMovie = itemView.findViewById(R.id.imgMovie) as ImageView
            txtMovie = itemView.findViewById(R.id.txtMovie) as TextView
            txtTrailer = itemView.findViewById(R.id.txtTrailer) as TextView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_recyclemovie, parent, false)

        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.imgMovie.setImageResource(itemList[position].gambar)
        holder.txtMovie.setText(itemList[position].judul)
        holder.txtTrailer.setText(itemList[position].trailer)

        holder.itemView.setOnClickListener() {
            val intent = Intent(getActivity, DetailMovieActivity::class.java)
            intent.putExtra("imgMovie", itemList[position].gambar)
            intent.putExtra("txtMovie", itemList[position].judul)
            intent.putExtra("txtTrailer", itemList[position].trailer)
            getActivity.startActivity(intent)
        }

    }

}