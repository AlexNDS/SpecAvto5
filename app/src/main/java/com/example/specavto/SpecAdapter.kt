package com.example.specavto

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.specavto.R.layout.spec_card



class SpecAdapter (  private val specList: List<ListSpec>) : RecyclerView.Adapter<SpecHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpecHolder {

        val specView = LayoutInflater.from(parent.context)
            .inflate(R.layout.spec_card, parent, false)
        return SpecHolder(specView)
    }

    override fun onBindViewHolder(holder: SpecHolder, position: Int) {

        val spec = specList[position]
        holder.bind(spec)

    }


    override fun getItemCount(): Int {

        return specList.size

    }
}


