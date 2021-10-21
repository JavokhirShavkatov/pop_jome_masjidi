package com.example.popjomemasjidi.utils

import com.example.popjomemasjidi.activitys.models.MorningZikrsModel
import com.example.popjomemasjidi.models.FeaturesModel


interface OnItemClickListener {
    fun onItemClick(tests: FeaturesModel?)
    fun onItemImageClickListener(zikrs: MorningZikrsModel?)
}