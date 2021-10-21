package com.example.popjomemasjidi.activitys.models

import java.io.Serializable

data class MainMapsModel(
    val name_ofImam:String,
    val name_ofMasjid:String,
    val location_ofMasjid:String,
    val image_ofMasjid:Int,
    val id_ofMasjid:String
):Serializable
