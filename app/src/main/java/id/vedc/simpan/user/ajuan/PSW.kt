package id.vedc.simpan.user.ajuan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.vedc.simpan.R

class PSW : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.psw)

        val menuKembali: Button = findViewById(R.id.btn_back14)
        menuKembali.setOnClickListener() {
            startActivity(Intent(this, Ajuan::class.java))
        }
    }
}
