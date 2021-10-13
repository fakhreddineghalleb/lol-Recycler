package tn.esprit.leagueoflegendrecyclerview.championList

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.leagueoflegendrecyclerview.R

class ChampionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val championPic : ImageView
    val championName : TextView
    val championRole : TextView = itemView.findViewById<TextView>(R.id.champRole)

    init {
        championPic = itemView.findViewById<ImageView>(R.id.champPic)
        championName = itemView.findViewById<TextView>(R.id.champName)
    }

}