package id.vedc.simpan.user.ajuan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.vedc.simpan.R

class IzinDalamKerja : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.izin_dalam_kerja)

        val menuKembali: Button = findViewById(R.id.btn_back10)
        menuKembali.setOnClickListener() {
            startActivity(Intent(this, Ajuan::class.java))
        }
    }
}
