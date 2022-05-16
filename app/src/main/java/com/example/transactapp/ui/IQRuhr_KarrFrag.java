package com.example.transactapp.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.transactapp.KarriereFragment;
import com.example.transactapp.R;
import com.example.transactapp.TransfFragment;
import com.example.transactapp.ui.home.HomeFragment;

public class IQRuhr_KarrFrag extends Fragment {
    public FragmentActivity getMyContext() {
        return myContext;
    }

    private FragmentActivity myContext;
    private UberIQRuhr ueberfragment;
    private KarriereFragment karfragment;
    private HomeFragment fragment;
    private ThemenFragment transfragment;
    private IQRuhr_KarrFrag iq_karfragment;
    FragmentManager fragmentManager;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_iqruhr_kar, container, false);
        Button b1 = (Button) root.findViewById(R.id.button4);
        Button b2 = (Button) root.findViewById(R.id.button5);
        Button b3 = (Button) root.findViewById(R.id.button);
        Button b4 = (Button) root.findViewById(R.id.button2);
        Button b5 = (Button) root.findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ueberfragment = new UberIQRuhr();

                 FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                 FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                 fragmentTransaction.replace(R.id.nav_host_fragment, ueberfragment);
                 fragmentTransaction.commit();
             }
         });

         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 karfragment = new KarriereFragment();

                 FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                 FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                 fragmentTransaction.replace(R.id.nav_host_fragment, karfragment);
                 fragmentTransaction.commit();
             }
         });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iq_karfragment = new IQRuhr_KarrFrag();

                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                fragmentTransaction.commit();            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfragment = new ThemenFragment();

                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, transfragment);
                fragmentTransaction.commit();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, new HomeFragment());
                fragmentTransaction.commit();
            }
        });

        return root;

    }

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }
}
