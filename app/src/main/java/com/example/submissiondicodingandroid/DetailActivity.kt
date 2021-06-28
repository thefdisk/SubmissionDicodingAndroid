package com.example.submissiondicodingandroid

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_SPEC = "extra_spec"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val actionBar = supportActionBar
        actionBar!!.title = "Detail Product"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo_received)
        val tvSetName: TextView = findViewById(R.id.tv_item_name)
        val tvSetPrice: TextView = findViewById(R.id.tv_item_price)
        val tvSetSpec: TextView = findViewById(R.id.tv_set_spec)

        val tImg = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tName = intent.getStringExtra(EXTRA_NAME)
        val tPrice = intent.getStringExtra(EXTRA_PRICE)
        val tSpec = intent.getStringExtra(EXTRA_SPEC)

        tvSetName.text = tName
        Glide.with(this).load(tImg).apply(RequestOptions().override(350, 550)).into(imgSetPhoto)
        tvSetPrice.text = tPrice
        tvSetSpec.text = tSpec

        val btnBuy: Button = findViewById(R.id.btn_set_buy)
        val btnShare: Button = findViewById(R.id.btn_set_share)

        btnBuy.setOnClickListener {
            Toast.makeText(
                this@DetailActivity,
                "Thank you for buying $tName", Toast.LENGTH_SHORT
            ).show()
        }


        btnShare.setOnClickListener {
            try {
                val sendIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "$tName $tPrice")
                    // putExtra("jid", "$081233456789@s.whatsapp.net")
                    type = "text/plain"
                    setPackage("com.whatsapp")
                }
                startActivity(sendIntent)
            } catch (e: Exception) {
                e.printStackTrace()
                val appPackageName = "com.whatsapp"
                try {
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("market://details?id=$appPackageName")
                        )
                    )
                } catch (e: android.content.ActivityNotFoundException) {
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=$appPackageName")
                        )
                    )
                }
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}