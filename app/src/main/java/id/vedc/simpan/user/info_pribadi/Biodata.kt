package id.vedc.simpan.user.info_pribadi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.vedc.simpan.R
import id.vedc.simpan.adapter.BiodataAdapter
import id.vedc.simpan.dataPegawai1
import id.vedc.simpan.model.info_pribadi.Biodata.BioView
import id.vedc.simpan.model.dataPegawai
import id.vedc.simpan.presenter.BiodataPresenter
import kotlinx.android.synthetic.main.biodata.*
import org.jetbrains.anko.startActivity

class Biodata : AppCompatActivity(),
    BioView {

    private lateinit var recycleViewtask: RecyclerView
    private lateinit var mLayoutManager: RecyclerView.LayoutManager

    private lateinit var presenter: BiodataPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.biodata)
        presenter = BiodataPresenter(this)
        presenter.getData()

        btn_back2.setOnClickListener {
            startActivity<InfoPribadi>()
            finish()
        }

        /*btnTambah.setOnClickListener {
            startActivity<UpdateAddActivity>()
            finish()
        }*/
    }

    override fun onSuccessGet(data: List<dataPegawai1?>?) {

        recycleViewtask = findViewById(R.id.mRecyclerView)
        recycleViewtask.adapter = BiodataAdapter(data as List<dataPegawai1>?)
        recycleViewtask.setHasFixedSize(true)
        mLayoutManager = LinearLayoutManager(this)
        recycleViewtask.setLayoutManager(mLayoutManager)




        /*override fun delete(item: DataItem?) {
                presenter.hapusData(item?.staffId)
                startActivity<MainActivity>()
                finish()
            }*/

    }

    override fun onFailedGet(msg: String) {
    }
}




/*val menuKembali: Button = findViewById(R.id.btn_back2)
        menuKembali.setOnClickListener() {
            startActivity(Intent(this, InfoPribadi::class.java))
        }*/