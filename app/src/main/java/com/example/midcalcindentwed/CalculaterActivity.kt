package com.example.midcalcindentwed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CalculaterActivity : AppCompatActivity() {
    lateinit var tv_asnwer: TextView
    lateinit var edt_fnum: TextView
    lateinit var edt_secnum: TextView
    lateinit var btn_add: Button
    lateinit var btn_minus: Button
    lateinit var btn_mult: Button
    lateinit var btn_div: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculater)
        tv_asnwer= findViewById(R.id.txt_answer)
        edt_fnum=findViewById(R.id.edt_fnum)
        edt_secnum=findViewById(R.id.edt_secnum)
        btn_add=findViewById(R.id.btn_add)
        btn_minus=findViewById(R.id.btn_minus)
        btn_mult=findViewById(R.id.btn_mult)
        btn_div=findViewById(R.id.btn_div)

        btn_add.setOnClickListener {
            var myfirstnumber = edt_fnum.text.toString()
            var mysecondnumber = edt_secnum.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                tv_asnwer.text = "please input all the fields"
            } else {
                var answer = myfirstnumber.toDouble() + mysecondnumber.toDouble()
                tv_asnwer.text = answer.toString()
            }
        }
        btn_minus.setOnClickListener {
            var myfirstnumber = edt_fnum.text.toString()
            var mysecondnumber = edt_secnum.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                tv_asnwer.text = "please input all the fields"
            } else {
                var answer = myfirstnumber.toDouble() - mysecondnumber.toDouble()
                tv_asnwer.text = answer.toString()
            }
        }
        btn_mult.setOnClickListener {
            var myfirstnumber = edt_fnum.text.toString()
            var mysecondnumber = edt_secnum.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                tv_asnwer.text = "please input all the fields"
            } else {
                var answer = myfirstnumber.toDouble() * mysecondnumber.toDouble()
                tv_asnwer.text = answer.toString()
            }
        }
        btn_div.setOnClickListener {
            var myfirstnumber = edt_fnum.text.toString()
            var mysecondnumber = edt_secnum.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                tv_asnwer.text = "please input all the fields"
            } else {
                var answer = myfirstnumber.toDouble() / mysecondnumber.toDouble()
                tv_asnwer.text = answer.toString()
            }

    } }

}
