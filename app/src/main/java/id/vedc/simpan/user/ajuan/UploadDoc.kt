package id.vedc.simpan.user.ajuan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.vedc.simpan.R


class UploadDoc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.upload_doc)

        val menu_kembali: Button = findViewById(R.id.back21)
        menu_kembali.setOnClickListener {
            startActivity(Intent(this, Ajuan::class.java))
        }
    }
}
