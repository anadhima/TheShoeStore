package com.example.android.theshoestore.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.android.theshoestore.R
import com.example.android.theshoestore.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding  : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        navController= findNavController(R.id.fragment)
        drawerLayout = findViewById(R.id.drawerLayout)
        appBarConfiguration = AppBarConfiguration(navController.graph,drawerLayout)
        navigationView.setupWithNavController(navController)
        setupActionBarWithNavController(navController,appBarConfiguration)

    }

   /* override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController = Navigation.findNavController(this, R.id.fragment)
        return NavigationUI.onNavDestinationSelected(item!!, navController)|| super.onOptionsItemSelected(item)
    }
*/
  override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.fragment)
        return NavigationUI.navigateUp(navController, appBarConfiguration)

}
}