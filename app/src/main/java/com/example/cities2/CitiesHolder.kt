package com.example.cities2

import android.view.View
import android.widget.TextView
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView

class CitiesHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(cities: Cities) {


        val nameTextView: TextView = itemView.findViewById(R.id.name_of_city)
        //  val populationTextView: TextView = itemView.findViewById(R.id.population_of_city)
        val stateTextView: TextView = itemView.findViewById(R.id.state_of_the_city)


        nameTextView.text = "город ${cities.nameOfTheCity}"

        //    populationTextView.text = "Численность населения"
        stateTextView.text = cities.state


        val text = "${cities.nameOfTheCity} - ${cities.population} чел."


        itemView.setOnClickListener {

            val toast = Toast.makeText(itemView.context, text, Toast.LENGTH_LONG)
            toast.show()


        }


    }
}



