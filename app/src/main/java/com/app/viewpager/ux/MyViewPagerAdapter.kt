package com.app.viewpager.ux

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.app.viewpager.ui.fragment.FragmentOne
import com.app.viewpager.ui.fragment.FragmentThree
import com.app.viewpager.ui.fragment.FragmentTwo

class MyViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                return FragmentOne()
            }
            1 -> {
                return FragmentTwo()
            }
            2 -> {
                return FragmentThree()
            }
            else -> {
                return Fragment()
            }

        }
    }


}