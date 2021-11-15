package com.example.specavto

import android.graphics.Typeface
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.specavto.ListTaxi
import com.example.specavto.R
import com.example.specavto.R.layout.taxi_card
import com.google.android.material.switchmaterial.SwitchMaterial
import android.widget.Toast.makeText as makeText1

class TaxiHolder (itemView: View):RecyclerView.ViewHolder(itemView){
    fun bind(taxi: ListTaxi){
        val taxiName: TextView= itemView.findViewById(R.id.taxi_name)
        val taxiNumber:TextView = itemView.findViewById(R.id.taxi_number)

        taxiName.text = taxi.Name
        taxiNumber.text = taxi.Number

    }




}

