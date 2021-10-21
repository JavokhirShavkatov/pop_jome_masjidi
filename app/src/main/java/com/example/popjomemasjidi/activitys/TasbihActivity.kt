package com.example.popjomemasjidi.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import com.example.popjomemasjidi.databinding.ActivityTasbihBinding
import java.util.*


class TasbihActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTasbihBinding

    var vibrator: Vibrator? = null
    var count:Int = 0
    var count_number:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTasbihBinding.inflate(layoutInflater)
        setContentView(binding.root)

        vibrator = this.getSystemService(VIBRATOR_SERVICE) as Vibrator


        binding.addBtn.setOnClickListener {
            if (count==34){
                vibrator!!.vibrate(500)
                count = 0
                count_number++
                binding.countNum.text = count_number.toString()

                val string = arrayOf("Alhamdulillah", "SubhanAlloh", "Allohu Akbar", "Astag'firullaxu va atubu ilayx","La Ilaxa Illallax","Subhanalloxi va bihamdixi","SubhanAlloxil aziym")

                val random: Random = Random()
                val index: Int =random.nextInt(string.size - 1) + 0
                binding.zikrTxtm.text = string[index]
            }
            binding.countingNum.text = count++.toString()
        }

        binding.resetBtn.setOnClickListener {
            vibrator!!.vibrate(500)
            count = 0
            binding.countingNum.text = count.toString()
            count_number = 0
            binding.countNum.text = count_number.toString()
        }



    }
}