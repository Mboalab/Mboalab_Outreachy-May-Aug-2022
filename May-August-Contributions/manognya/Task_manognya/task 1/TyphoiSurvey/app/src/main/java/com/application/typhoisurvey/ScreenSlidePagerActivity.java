package com.application.typhoisurvey;

import android.os.Bundle;
import android.widget.Switch;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.application.typhoisurvey.fragments.Fragment1;
import com.application.typhoisurvey.fragments.Fragment2;

public class ScreenSlidePagerActivity extends FragmentActivity {

    private static final int NUM_PAGES = 3;

    private ViewPager mPager;

    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_main);

        // Instantiate a ViewPager and a PagerAdapter.
//        mPager = (ViewPager) findViewById(R.id.pager);
//        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
//        mPager.setAdapter(pagerAdapter);
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0: return Fragment1.newInstance();
                case 1: return Fragment2.newInstance();
                default: return Fragment1.newInstance();
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
