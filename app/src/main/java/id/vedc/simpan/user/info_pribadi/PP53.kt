package id.vedc.simpan.user.info_pribadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.vedc.simpan.R

class PP53 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pp53)

        val menuKembali: Button = findViewById(R.id.btn_back7)
        menuKembali.setOnClickListener() {
            startActivity(Intent(this, InfoPribadi::class.java))
        }
    }
}
