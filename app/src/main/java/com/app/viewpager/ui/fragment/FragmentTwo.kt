package com.app.viewpager.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.app.viewpager.databinding.TwoFragmentBinding

class FragmentTwo: Fragment() {
    lateinit var binding: TwoFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = TwoFragmentBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

}