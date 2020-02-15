package com.masterandroid.mycountry;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends FragmentActivity {

    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPagerId);
        FragmentManager fragmentManager = getSupportFragmentManager();
        CustomAdapter customAdapter = new CustomAdapter(fragmentManager);
        viewPager.setAdapter(customAdapter);
    }
}
    class CustomAdapter extends FragmentStatePagerAdapter{

    public CustomAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;
        if(position==0){
            fragment = new Fragment1();
        }else if(position==1){
            fragment = new Fragment2();
        }else if(position==2){
            fragment = new Fragment3();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            if(position==0){
                return "বিভাগ";
            }if(position==1){
                return "জেলা";
            }if(position==2){
                return "উপজেলা";
            }
            return null;
        }
    }