package th.ac.kku.nkc.cis.mobile.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PhotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener { view ->
            finish()
        }
    }
}