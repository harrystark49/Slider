package com.example.slider

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smarteist.autoimageslider.SliderViewAdapter
import kotlinx.android.synthetic.main.img_item.view.*

class img_adap(var context: Context,var imglist:List<Int>):SliderViewAdapter<img_adap.img_view>(){
    class img_view(view:View):SliderViewAdapter.ViewHolder(view){
        fun data(position: Int, imglist: List<Int>) {
            itemView.img.setImageResource(imglist[position])
        }


    }

    override fun getCount(): Int {
        return imglist.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?): img_view {
        var view=LayoutInflater.from(context).inflate(R.layout.img_item,parent,false)
        return img_view(view)
    }

    override fun onBindViewHolder(viewHolder: img_view?, position: Int) {
        viewHolder?.data(position,imglist)

    }
}