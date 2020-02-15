package com.masterandroid.mycountry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class DistrictDetailsActivity extends AppCompatActivity {

    private GridView gridView;
    private String[] districtOptions;
    private int[] icons = {R.drawable.test_images,R.drawable.test_images,R.drawable.test_images,R.drawable.test_images,R.drawable.test_images,R.drawable.test_images,R.drawable.test_images,R.drawable.test_images};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district_details);

        districtOptions = getResources().getStringArray(R.array.DistrictOption);

        gridView = findViewById(R.id.GridViewId);

        GridCustomAdapter adapter = new GridCustomAdapter(this,icons,districtOptions);
        gridView.setAdapter(adapter);
    }
}
