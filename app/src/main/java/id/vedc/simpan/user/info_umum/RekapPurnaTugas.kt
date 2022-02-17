package id.vedc.simpan.user.info_umum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.vedc.simpan.R

class RekapPurnaTugas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rekap_purna_tugas)

        val menuKembali: Button = findViewById(R.id.btn_back17)
        menuKembali.setOnClickListener() {
            startActivity(Intent(this, InfoUmum::class.java))
        }
    }
}
