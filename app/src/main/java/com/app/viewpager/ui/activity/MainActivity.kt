package com.app.viewpager.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.viewpager.databinding.ActivityMainBinding
import com.app.viewpager.ux.MyViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myAdapter = MyViewPagerAdapter(this)
        binding.viewpagerMain.adapter = myAdapter
        binding.viewpagerMain.offscreenPageLimit = 3
//        binding.viewpagerMain.orientation = ViewPager2.ORIENTATION_VERTICAL

        val mediator = TabLayoutMediator(
            binding.tabLayoutMain,
            binding.viewpagerMain,
            object: TabLayoutMediator.TabConfigurationStrategy {

                override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {

                    when(position) {
                        0 -> { tab.text = "Fragment1" }
                        1 -> { tab.text = "Fragment2" }
                        2 -> { tab.text = "Fragment3" }
                    }

                }

            } )
        mediator.attach()
    }
}