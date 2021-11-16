package com.example.specavto

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import android.widget.TableLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "Item"

class MainActivity : AppCompatActivity() {


    private lateinit var bottomMenu: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomMenu = findViewById(R.id.bottom_menu)

        bottomMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.spec -> {
                    val specFragment = SpecFragment()

                    replaceFragment(specFragment)
                }


                R.id.taxi -> {


                    val taxiFragment = TaxiFragment()
                    replaceFragment(taxiFragment)

                }
            }
            true
        }
        bottomMenu.selectedItemId =
            if (savedInstanceState == null) R.id.spec else savedInstanceState.getInt(
                LAST_SELECTED_ITEM
            )

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

}