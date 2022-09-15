package com.example.fintech1832_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fintech1832_fragment.home.HomeFragment
import com.example.fintech1832_fragment.profile.ProfileFragment
import com.example.fintech1832_fragment.setting.SettingFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnHome: Button
    private lateinit var btnProfile: Button
    private lateinit var btnSetting: Button

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        btnHome     = findViewById( R.id.btn_home )
        btnProfile  = findViewById( R.id.btn_profile )
        btnSetting  = findViewById( R.id.btn_setting )

//      btnHome.setOnClickListener {
//          val intent = Intent( this, HomeActivity::class.java )
//          intent.putExtra( "username", "hasyim" )
//          startActivity( intent )
//      }

        btnHome.setOnClickListener {
            loadFragment( HomeFragment() )
        }
        btnProfile.setOnClickListener {
            loadFragment( ProfileFragment() )
        }
        btnSetting.setOnClickListener {
            loadFragment( SettingFragment() )
        }
    }

    private fun loadFragment( fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace( R.id.container, fragment )
            .commitNow()
    }
}