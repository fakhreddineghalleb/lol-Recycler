package tn.esprit.leagueoflegendrecyclerview.data

import androidx.annotation.DrawableRes

const val PICTURE = "PICTURE"
const val NAME = "NAME"
const val ROLE = "ROLE"

data class Champion(

    @DrawableRes
    val champPic: Int,

    val champName: String,

    val champRole: String
)