package com.example.demoproject.view.activity

import android.util.Log
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import com.example.demoproject.R
import com.example.demoproject.view.baseview.BaseActivity


class MainActivity : BaseActivity() {
    override fun initActivity() {
       val navController = findNavController(this, R.id.nav_host_fragment)
       setupActionBarWithNavController(this, navController)


    }


    override fun getContectView(): Int {
        return R.layout.activity_main
    }

    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp()
        onBackPressed()
    }
}