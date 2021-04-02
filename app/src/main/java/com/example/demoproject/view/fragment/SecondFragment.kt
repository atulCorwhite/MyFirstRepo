package com.example.demoproject.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.demoproject.R
import com.example.demoproject.view.baseview.BaseFragment

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : BaseFragment() {

    override fun getLayout(): Int {
       return R.layout.fragment_second
    }

    override fun initFragment(view: View) {

    }



}