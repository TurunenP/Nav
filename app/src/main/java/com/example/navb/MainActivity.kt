package com.example.navb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home_nav -> setCurrentFragment(firstFragment)
                R.id.account_nav -> setCurrentFragment(secondFragment)
                R.id.map_nav -> setCurrentFragment(thirdFragment)

            }
            true
        }


      //val navController = findNavController(R.id.fragment)
       // val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
      //  NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }

      private fun setCurrentFragment(fragment: Fragment) =
          supportFragmentManager.beginTransaction().apply {
              replace(R.id.flfragment, fragment)
              commit()
          }
}

       // val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
       // val navController = findNavController(R.id.fragment)

       //  bottomNavigationView.setupWithNavController(navController)

    //   val appBarConfiguration = AppBarConfiguration(setOf(R.id.dashboardFragment, R.id.profileFragment, R.id.settingsFragment))

      //   setupActionBarWithNavController(navController, appBarConfiguration)
