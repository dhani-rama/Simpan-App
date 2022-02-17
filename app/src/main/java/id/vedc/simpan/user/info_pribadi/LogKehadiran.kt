package id.vedc.simpan.user.info_pribadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.vedc.simpan.R

class LogKehadiran : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_kehadiran)

        val menuKembali: Button = findViewById(R.id.btn_back6)
        menuKembali.setOnClickListener() {
            startActivity(Intent(this, InfoPribadi::class.java))
        }
    }
}
