package com.tanvi.shopnow

import android.accounts.Account
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.EditText
import android.widget.TextView
import java.lang.reflect.Member
import java.net.Inet4Address
import java.net.PasswordAuthentication

class RegisterActivity : AppCompatActivity() {
    lateinit var etFirstNumber: EditText
    lateinit var etLastName: EditText
    lateinit var etEmail: EditText
    lateinit var etMobileNumber: EditText
    lateinit var etAddress: EditText
    lateinit var etCity:EditText
    lateinit var etZipCode:EditText
    lateinit var etPassword:EditText
    lateinit var etReenterPassword:EditText
    lateinit var tvCreateAccount: TextView
    lateinit var tvAlreadyMember: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        etFirstNumber=findViewById(R.id.etFirstNumber)
        etLastName=findViewById(R.id.etLastName)
        etEmail=findViewById(R.id.etEmail)
        etMobileNumber=findViewById(R.id.etMobileNumber)
        etAddress=findViewById(R.id.etAddress)
        etCity=findViewById(R.id.etCity)
        etZipCode=findViewById(R.id.etZipCode)
        etPassword=findViewById(R.id.etPassword)
        etReenterPassword=findViewById(R.id.etReenterPassword)
        tvCreateAccount=findViewById(R.id.tvCreateAccount)
        tvAlreadyMember=findViewById(R.id.tvAlreadyMember)
        tvAlreadyMember.setOnClickListener {
            val intent = Intent( this@RegisterActivity,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}