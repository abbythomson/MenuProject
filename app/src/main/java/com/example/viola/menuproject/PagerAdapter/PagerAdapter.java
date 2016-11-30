package com.example.viola.menuproject.PagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.viola.menuproject.AppetizerFragment;
import com.example.viola.menuproject.EntreeFragment;
import com.example.viola.menuproject.DessertFragment;
import com.example.viola.menuproject.SnackFragment;

public class PagerAdapter extends FragmentStatePagerAdapter{
    int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                AppetizerFragment aTab = new AppetizerFragment();
                return aTab;
            case 1:
                EntreeFragment eTab= new EntreeFragment();
                return eTab;
            case 2:
                DessertFragment dTab = new DessertFragment();
                return dTab;
            default:
                return null;
        }
    }

    public int getCount(){
        return numOfTabs;
    }
}
