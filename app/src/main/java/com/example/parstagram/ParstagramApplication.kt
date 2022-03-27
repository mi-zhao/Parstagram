package com.example.parstagram
import android.app.Application
import com.parse.Parse
import com.parse.ParseObject

// When our Android app is created for the first time, this class will initialize Parse

class ParstagramApplication {

    class ParsetagramApplication : Application() {
        override fun onCreate() {
            super.onCreate()

            // Register your parse models
            ParseObject.registerSubclass(Post::class.java)

            // Initialization
            Parse.initialize(
                Parse.Configuration.Builder(this)
                    .applicationId(getString(R.string.back4app_app_id))
                    .clientKey(getString(R.string.back4app_client_key))
                    .server(getString(R.string.back4app_server_url))
                    .build());
        }
    }

}