package com.example.fragments.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.*
import com.example.fragments.databinding.ActivityMainBinding
import com.example.fragments.R
import com.example.fragments.ui.fragments.NovenoFragmentDirections
import com.example.fragments.ui.fragments.fragmentsRoot.PrimerFragmentDirections
import com.example.fragments.ui.fragments.fragmentsRoot.SeptimoFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_appbar, menu)
        return true
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
//
            setSupportActionBar(topAppBar)
            val navHostFragment =
                supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
            navController = navHostFragment.findNavController()
            appBarConfiguration = AppBarConfiguration(
                setOf(
                    R.id.primerFragment, R.id.tercerFragment
                ), drawerLayout
            )
            setupActionBarWithNavController(navController, appBarConfiguration)
            navView.setupWithNavController(navController)











        }
    }
    override fun onOptionsItemSelected(menuItem: MenuItem): Boolean {
        return when (menuItem.itemId) {

            R.id.septimoFragment -> {
                // Handle search icon press
                val action = PrimerFragmentDirections.actionPrimerFragmentoToSeptimoFragment()
                navController.navigate(action)
                true
            }
           R.id.primerFragment -> {
               val action = SeptimoFragmentDirections.actionSeptimoFragmentoToPrimeroFragment()
               navController.navigate(action)
                true
            }
          R.id.cuartoFragment->{
              val action = PrimerFragmentDirections.actionPrimerFragmentToCuartoFragment()
              navController.navigate(action)
              true
          }
            else -> false
        }
    }


}