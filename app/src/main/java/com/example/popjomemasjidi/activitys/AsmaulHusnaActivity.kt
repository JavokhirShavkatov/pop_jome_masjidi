package com.example.popjomemasjidi.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.activitys.adapters.AsmaulHusnaAdapter
import com.example.popjomemasjidi.activitys.models.AsmaulHusnaModel
import com.example.popjomemasjidi.databinding.ActivityAsmaulHusnaBinding
import com.example.popjomemasjidi.fragments.FirstFragment

class AsmaulHusnaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAsmaulHusnaBinding

    var items3 = arrayOf(
        AsmaulHusnaModel(1, R.drawable.tasbeeh,"Calendar event","U nematlarni beruvchi."),
        AsmaulHusnaModel(2, R.drawable.tasbeeh,"Calendar event","U nematlarni beruvchi."),
        AsmaulHusnaModel(3, R.drawable.tasbeeh,"Calendar event","U nematlarni beruvchi."),
        AsmaulHusnaModel(4, R.drawable.tasbeeh,"Calendar event","U nematlarni beruvchi."),
        AsmaulHusnaModel(5, R.drawable.tasbeeh,"Calendar event","U nematlarni beruvchi."),
        AsmaulHusnaModel(6, R.drawable.tasbeeh,"Calendar event","U nematlarni beruvchi."),
        AsmaulHusnaModel(7, R.drawable.tasbeeh,"Calendar event","U nematlarni beruvchi."),
        AsmaulHusnaModel(8, R.drawable.tasbeeh,"Calendar event","U nematlarni beruvchi."),
        AsmaulHusnaModel(9, R.drawable.tasbeeh,"Calendar event","U nematlarni beruvchi."),
        AsmaulHusnaModel(10, R.drawable.tasbeeh,"Calendar event","U nematlarni beruvchi."),
        AsmaulHusnaModel(11, R.drawable.tasbeeh,"Calendar event","U nematlarni beruvchi."),
        AsmaulHusnaModel(12, R.drawable.tasbeeh,"Calendar event","U nematlarni beruvchi."),
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAsmaulHusnaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv6.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rv6.adapter = AsmaulHusnaAdapter(items3)

        binding.backIcon.setOnClickListener {
            val intent: Intent = Intent(
                this,
                FirstFragment::class.java
            )
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            finish ()
        }

    }
}