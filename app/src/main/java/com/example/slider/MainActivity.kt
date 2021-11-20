package com.example.slider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    lateinit var ab:ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ab=this.supportActionBar!!

        var list=ArrayList<post_data>()

        viewpager.addOnPageChangeListener(object :ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {
            }

        })

        list.add(post_data("sfs",4,"sfsf",5))
        list.add(post_data("sfs",4,"sfsf",5))
        list.add(post_data("sfs",4,"sfsf",5))
        list.add(post_data("sfs",4,"sfsf",5))
        list.add(post_data("sfs",4,"sfsf",5))
        list.add(post_data("sfs",4,"sfsf",5))
        list.add(post_data("sfs",4,"sfsf",5))

        var adap=adap(this,list)
        viewpager.adapter=adap

        viewpager.setPadding(0,0,100,0)

    var imageslist= listOf<Int>(

        R.drawable.img2,
        R.drawable.arrow,
        R.drawable.img1
    )
    var adapter=img_adap(this,imageslist)
    imgslider.setSliderAdapter(adapter)
    imgslider.startAutoCycle()

    }

}