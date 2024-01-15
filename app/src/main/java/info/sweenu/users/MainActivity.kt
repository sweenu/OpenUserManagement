package info.sweenu.users

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent("android.settings.USER_SETTINGS")
        startActivity(intent)
        finish()
    }
}