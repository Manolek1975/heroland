package com.delek.heroland.ui.options

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.delek.heroland.R
import com.delek.heroland.domain.model.VictoryPoints

class VictoryPointsAdapter(
    private var vpList: List<VictoryPoints> = emptyList(),
    private val onItemSelected: (Int) -> Unit
) : RecyclerView.Adapter<VictoryPointsViewHolder>() {

    companion object {
        var vpValues = mutableListOf(0,0,0,0,0)
        var total = 0
        var pos = 0
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateVictoryPoints(vp: List<VictoryPoints>) {
        vpValues = mutableListOf(0,0,0,0,0)
        total = 0
        vpList = vp
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VictoryPointsViewHolder {
        return VictoryPointsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_vp_button, parent, false)
        )
    }

    override fun getItemCount(): Int = vpList.size

    override fun onBindViewHolder(holder: VictoryPointsViewHolder, position: Int) {
        holder.render(vpList[position], onItemSelected)
    }
}