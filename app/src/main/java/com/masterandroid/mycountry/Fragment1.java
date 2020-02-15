package com.masterandroid.mycountry;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Fragment1 extends Fragment implements View.OnClickListener {

    private CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);


        cardView1 = view.findViewById(R.id.cardViewId1);
        cardView2 = view.findViewById(R.id.cardViewId2);
        cardView3 = view.findViewById(R.id.cardViewId3);
        cardView4 = view.findViewById(R.id.cardViewId4);
        cardView5 = view.findViewById(R.id.cardViewId5);
        cardView6 = view.findViewById(R.id.cardViewId6);
        cardView7 = view.findViewById(R.id.cardViewId7);
        cardView8 = view.findViewById(R.id.cardViewId8);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);
        cardView6.setOnClickListener(this);
        cardView7.setOnClickListener(this);
        cardView8.setOnClickListener(this);

        return view;

    }


    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.cardViewId1){
            Intent intent = new Intent(getActivity(), DistrictDetailsActivity.class);
            startActivity(intent);
        }if (view.getId()==R.id.cardViewId2){
            Intent intent = new Intent(getActivity(),DistrictDetailsActivity.class);
            startActivity(intent);
        }

    }
}
