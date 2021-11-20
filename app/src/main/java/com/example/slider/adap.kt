package com.example.slider

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.item.view.*

class adap(var context: Context,var list: ArrayList<post_data>):PagerAdapter(){
    override fun getCount(): Int {
        return list.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {


        var view=LayoutInflater.from(context).inflate(R.layout.item,container,false)


            var model=list[position]

            view.body.text="asdjka"
            view.ids.text=model.id.toString()
            view.title.text=model.title.toString()
            view.userid.text=model.userId.toString()

            container.addView(view)

        return view
    }
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}

