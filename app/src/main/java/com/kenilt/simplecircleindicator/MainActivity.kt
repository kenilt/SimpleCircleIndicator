package com.kenilt.simplecircleindicator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.kenilt.circleindicator.CirclePageIndicator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vpPager = findViewById<ViewPager>(R.id.vpPager)
        val indicator = findViewById<CirclePageIndicator>(R.id.indicator)

        vpPager.adapter = TextPagerAdapter(this, DataGenerator.generateList())
        indicator.setViewPager(vpPager)
    }
}
