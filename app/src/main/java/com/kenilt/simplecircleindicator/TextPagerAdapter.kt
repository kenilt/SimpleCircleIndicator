package com.kenilt.simplecircleindicator

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.PagerAdapter
import com.kenilt.loopingviewpager.example.PageModel


/**
 * Created by thangnguyen on 3/11/20.
 */
class TextPagerAdapter(private var mContext: Context, private var dataList: List<PageModel>): PagerAdapter() {

    override fun instantiateItem(collection: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(mContext)
        val layout = inflater.inflate(R.layout.item_page, collection, false) as ViewGroup
        val tvText = layout.findViewById<TextView>(R.id.item_txtText)
        tvText.text = dataList[position].text
        tvText.setBackgroundColor(ContextCompat.getColor(mContext, dataList[position].color))
        collection.addView(layout)
        return layout
    }

    override fun destroyItem(collection: ViewGroup, position: Int, view: Any) {
        collection.removeView(view as View?)
    }

    override fun getCount(): Int {
        return dataList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
}
