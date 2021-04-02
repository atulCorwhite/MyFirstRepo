package com.example.demoproject.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.demoproject.R
import com.example.demoproject.view.baseview.BaseFragment
import com.example.demoproject.view.utils.displayLongToast

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : BaseFragment() {
    override fun getLayout(): Int {
        return R.layout.fragment_first
    }

    override fun initFragment(view: View) {

              view.findViewById<Button>(R.id.button_first).setOnClickListener {
                  context?.displayLongToast("is clicked")
               openNavFragment(R.id.action_navigation_secondFragment)
      }
    }


}