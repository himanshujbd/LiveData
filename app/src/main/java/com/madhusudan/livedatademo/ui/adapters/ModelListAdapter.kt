package com.madhusudan.livedatademo.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.madhusudan.livedatademo.R
import com.madhusudan.livedatademo.network.data.GlobalData

class ModelListAdapter(val list: List<GlobalData>?) : RecyclerView.Adapter<ModelListAdapter.MyViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {

       return list!!.size
    }

    override fun onBindViewHolder(holder:MyViewHolder, position: Int) {

        holder.country.text = list!!.get(position).Country
        holder.totalConfirmed.text = list!!.get(position).TotalConfirmed.toString()
        holder.totalRecovered.text = list!!.get(position).TotalRecovered.toString()
        holder.totalDeaths.text = list!!.get(position).TotalDeaths.toString()

    }

    class MyViewHolder(item: View) : RecyclerView.ViewHolder(item)
    {
        val country: TextView = item.findViewById(R.id.txtCountryName)
        val totalConfirmed: TextView = item.findViewById(R.id.txtConfirmCases)
        val totalRecovered: TextView = item.findViewById(R.id.txtRecovered)
        val totalDeaths: TextView = item.findViewById(R.id.txtTotalDeaths)
    }
}