package co.ghostnotes.sample.drawableanim

import android.app.Application
import timber.log.Timber

class DrawableAnimApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}