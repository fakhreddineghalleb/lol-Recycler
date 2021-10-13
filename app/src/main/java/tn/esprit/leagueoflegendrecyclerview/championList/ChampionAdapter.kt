package tn.esprit.leagueoflegendrecyclerview.championList

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.leagueoflegendrecyclerview.DetailActivity
import tn.esprit.leagueoflegendrecyclerview.R
import tn.esprit.leagueoflegendrecyclerview.data.Champion
import tn.esprit.leagueoflegendrecyclerview.data.*

class ChampionAdapter(val championsList: MutableList<Champion>) : RecyclerView.Adapter<ChampionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChampionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.champion_single_item, parent, false)

        return ChampionViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChampionViewHolder, position: Int) {

        val name = championsList[position].champName
        val role = championsList[position].champRole

        holder.championPic.setImageResource(championsList[position].champPic)
        holder.championName.text = name
        holder.championRole.text = role

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.apply {
                putExtra(PICTURE, championsList[position].champPic)
                putExtra(NAME, name)
                putExtra(ROLE, role)
            }
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount() = championsList.size

}