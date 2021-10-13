package tn.esprit.leagueoflegendrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.leagueoflegendrecyclerview.championList.ChampionAdapter
import tn.esprit.leagueoflegendrecyclerview.data.Champion

class MainActivity : AppCompatActivity() {

    lateinit var recylcerChampion: RecyclerView
    lateinit var recylcerChampionAdapter: ChampionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recylcerChampion = findViewById(R.id.recyclerChampion)

        var champList : MutableList<Champion> = ArrayList()

        champList.add(Champion(champPic = R.drawable.ic_leesin, champName = "Lee Sin", champRole = "COMBATTANT: Jungler" ))
        champList.add(Champion(champPic = R.drawable.ic_missfortune, champName = "Miss Fortune", champRole = "TIREUR: ADC" ))
        champList.add(Champion(champPic = R.drawable.ic_thresh, champName = "Thresh", champRole = "SUPPORT" ))
        champList.add(Champion(champPic = R.drawable.ic_nasus, champName = "Nasus", champRole = "COMBATTANT: Top" ))
        champList.add(Champion(champPic = R.drawable.ic_ahri, champName = "Ahri", champRole = "MAGE: MID" ))
        champList.add(Champion(champPic = R.drawable.ic_annie, champName = "Annie", champRole = "MAGE: MID" ))
        champList.add(Champion(champPic = R.drawable.ic_ashe, champName = "Ashe", champRole = "TIREUR: ADC" ))
        champList.add(Champion(champPic = R.drawable.ic_blitzcrank, champName = "Blitzcrank", champRole = "TANK: Support" ))
        champList.add(Champion(champPic = R.drawable.ic_ekko, champName = "Ekko", champRole = "ASSASSIN: MID/Jungle" ))
        champList.add(Champion(champPic = R.drawable.ic_quinn, champName = "Quinn", champRole = "TIREUR: TOP" ))
        champList.add(Champion(champPic = R.drawable.ic_velkoz, champName = "Velkoz", champRole = "MAGE: MID/Support" ))

        recylcerChampionAdapter = ChampionAdapter(champList)

        recylcerChampion.adapter = recylcerChampionAdapter

        recylcerChampion.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL ,false)

    }

}