package co.ghostnotes.sample.drawableanim

import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import co.ghostnotes.sample.drawableanim.databinding.ActivityMainBinding
import co.ghostnotes.sample.drawableanim.databinding.ActivityMainBindingImpl
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.image.visibility = View.INVISIBLE

        binding.button.setOnClickListener {
            Timber.d("### button onClick()")

            Timber.d("### ${binding.image.drawable::class.java.simpleName}")
            (binding.image.drawable as? AnimatedVectorDrawable)?.start()
            binding.image.visibility = View.VISIBLE
        }
    }
}