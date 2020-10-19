package com.mobileedu8.andelaschools.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.mobileedu8.andelaschools.Fragments.StaffsRegisterFragment;
import com.mobileedu8.andelaschools.Fragments.StudentsRegisterFragrament;

public class RegisterAdapter extends FragmentStatePagerAdapter {

    private String[] tabTitles = new String[]{"Staffs", "Students"};

    public RegisterAdapter(FragmentManager fm) {
        super(fm);
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position){
        switch(position){
            case 0:
                return StaffsRegisterFragment.newInstance();
            case 1:
                return StudentsRegisterFragrament.newInstance();
        }
        return null;
    }
    @Override
    public int getCount(){
        return tabTitles.length;
    }


}
