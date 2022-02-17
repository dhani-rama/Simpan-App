package id.vedc.simpan.user.info_pribadi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import id.vedc.simpan.R

class Tunkin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tunkin)

        val menuKembali: Button = findViewById(R.id.btn_back3)
        menuKembali.setOnClickListener() {
            startActivity(Intent(this, InfoPribadi::class.java))
        }
    }
}
