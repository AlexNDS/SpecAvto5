package com.example.specavto

import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class SpecHolder (itemView: View): RecyclerView.ViewHolder(itemView){
    fun bind(spec: ListSpec){
    val specImageView: ImageView = itemView.findViewById(R.id.spec_image)
    val specName: TextView = itemView.findViewById(R.id.spec_name)
    val specNumber: TextView = itemView.findViewById(R.id.spec_number)
    val button: Button = itemView.findViewById(R.id.button_spec)

    specImageView.setImageDrawable(itemView.context.getDrawable(spec.Image))
    specName.text = spec.Name
    specNumber.text = spec.Number
    button.setOnClickListener(){
        val numberSpec:String = specNumber.text.toString()

        makePhoneCall(numberSpec)
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