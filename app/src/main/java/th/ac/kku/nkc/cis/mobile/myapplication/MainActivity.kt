package th.ac.kku.nkc.cis.mobile.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDetail = findViewById<Button>(R.id.btnDetail)
        btnDetail.setOnClickListener { view ->
            Toast.makeText(
                this, "button clicked",
                Toast.LENGTH_LONG
            ).show()

            val intent = Intent( this,
                PhotoActivity::class.java)
            startActivity(intent)

        }
    }
}
