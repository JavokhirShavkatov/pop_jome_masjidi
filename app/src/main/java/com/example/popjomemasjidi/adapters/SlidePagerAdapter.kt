package com.example.popjomemasjidi.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SlidePagerAdapter(supportFragmentManager: FragmentManager) :
    FragmentPagerAdapter(supportFragmentManager) {

    private var fragmentList1: ArrayList<Fragment> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return fragmentList1.get(position)
    }

    override fun getCount(): Int {
        return fragmentList1.size
    }

    fun addFragment(fragment: Fragment) {
        fragmentList1.add(fragment)
    }

}