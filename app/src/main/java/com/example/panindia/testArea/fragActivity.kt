package com.example.panindia.testArea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.panindia.R
import androidx.fragment.app.FragmentPagerAdapter



private const val NUM_PAGES = 5
 class fragActivity : AppCompatActivity() {
     private lateinit var mPager: ViewPager
     var adapterViewPager: FragmentPagerAdapter? = null

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_frag)

         mPager = findViewById(R.id.vp)
//         adapterViewPager = MyPagerAdapter(getSupportFragmentManager());
         mPager.setAdapter(adapterViewPager);
         //extra properties
//        mPager.setPageTransformer(true, ZoomOutPageTransformer())
//        // The pager adapter, which provides the pages to the view pager widget.
//        val pagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager)
//        mPager.adapter = pagerAdapter
//    }
//     private inner class ScreenSlidePagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
//         override fun getCount(): Int = NUM_PAGES
//         override fun getItem(position: Int): Fragment = ScreenSlidePageFragment()
//     }
//
//     override fun onBackPressed() {
//         if (mPager.currentItem == 0) {
//             super.onBackPressed()
//         } else {
//             // Otherwise, select the previous step.
//             mPager.currentItem = mPager.currentItem - 1
//         }
//     }
     }
 }