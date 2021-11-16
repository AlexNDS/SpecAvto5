package com.example.specavto

import android.content.Intent
import android.graphics.Typeface
import android.net.Uri
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.createDeviceProtectedStorageContext
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.specavto.ListTaxi
import com.example.specavto.R
import com.example.specavto.R.layout.taxi_card
import com.google.android.material.switchmaterial.SwitchMaterial
import android.widget.Toast.makeText as makeText1



class TaxiHolder (itemView: View):RecyclerView.ViewHolder(itemView){


    fun bind(taxi: ListTaxi){
        val taxiImageView: ImageView = itemView.findViewById(R.id.taxi_image)
        val taxiName: TextView= itemView.findViewById(R.id.taxi_name)
        val taxiNumber:TextView = itemView.findViewById(R.id.taxi_number)
        val button:Button = itemView.findViewById(R.id.button_taxi)

        taxiImageView.setImageDrawable(itemView.context.getDrawable(taxi.Image))
        taxiName.text = taxi.Name
        taxiNumber.text = taxi.Number
        button.setOnClickListener(){
        val numberTaxi:String = taxiNumber.text.toString()

            makePhoneCall(numberTaxi)
        }
    }

    private fun makePhoneCall(number: String) : Boolean {
        val text = "Звоним в ${number}"
        try {
            //  Toast.makeText(context, text, Toast.LENGTH_LONG).show()


                val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:$number"))

           itemView.context.startActivity(intent)
            return true
        } catch (e: Exception) {
            e.printStackTrace()
            return false
        }
    }





}

