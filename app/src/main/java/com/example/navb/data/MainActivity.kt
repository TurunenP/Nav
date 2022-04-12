package com.example.navb.data

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.navb.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val home = HomeFragment()
        val account = AccountFragment()
        val map = MapFragment()
        val offers = OffersFragment()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home_nav -> setCurrentFragment(home)
                R.id.account_nav -> setCurrentFragment(account)
                R.id.map_nav -> setCurrentFragment(map)
                R.id.offers_nav -> setCurrentFragment(offers)

            }
            true
        }
    }

      private fun setCurrentFragment(fragment: Fragment) =
          supportFragmentManager.beginTransaction().apply {
              replace(R.id.fragment_container, fragment)
              commit()
          }
}

