package id.vedc.simpan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import java.lang.Exception

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val lanjut = Intent(this, MainActivity::class.java)
            startActivity(lanjut)
            finish()
        }, 3000)

//        val background = object : Thread() {
//            override fun run() {
//                try {
//                    Thread.sleep(3000)
//                    val intent = Intent(baseContext, MainActivity::class.java)
////                    startActivity(intent)
//                } catch (e: Exception){
//                    e.printStackTrace()
//                }
//            }
//        }
//        background.start()
    }
}
