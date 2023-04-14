package com.example.midcalcindentwed

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class IntentActivity : AppCompatActivity() {
    lateinit var button_sms: Button
    lateinit var button_dail: Button
    lateinit var button_share: Button
    lateinit var button_camera: Button
    lateinit var button_call: Button
    lateinit var button_stk: Button
    lateinit var button_email: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        button_sms= findViewById(R.id.btn_sms)
        button_call=findViewById(R.id.btn_call)
        button_camera=findViewById(R.id.btn_camera)
        button_dail=findViewById(R.id.btn_dail)
        button_share=findViewById(R.id.btn_share)
        button_stk=findViewById(R.id.btn_stk)
        button_email=findViewById(R.id.btn_email)

        button_sms.setOnClickListener {
            val uri = Uri.parse("smsto:0795385074")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "How is todays weather")

            startActivity(intent)
        }
        button_stk.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        button_camera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)
        }
        button_dail.setOnClickListener {
            val phone = "+25495385074"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)
        }
        button_share.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            startActivity(shareIntent)
        }
        button_call.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+25495385074"))

            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@IntentActivity,
                    arrayOf(android.Manifest .permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }
        }
        button_email.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "VO5605375@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
    }
}