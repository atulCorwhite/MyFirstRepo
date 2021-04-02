package com.example.demoproject.view.baseview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.demoproject.R


abstract class BaseFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(getLayout(), container, false)
        initFragment(view)
        return view
    }

    abstract fun getLayout(): Int
    abstract fun initFragment(view: View)

    fun openNavFragment(actionNavigationFragment:Int){
       val navConst=view?.let {  Navigation.findNavController(it)}
        navConst?.navigate(actionNavigationFragment)
    }
}