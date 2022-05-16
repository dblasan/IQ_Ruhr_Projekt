package com.example.transactapp.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.transactapp.KarriereFragment;
import com.example.transactapp.R;
import com.example.transactapp.TransfFragment;
import com.example.transactapp.ui.home.HomeFragment;

public class ThemenFragment extends Fragment {

    public FragmentActivity getMyContext() {
        return myContext;
    }

    private FragmentActivity myContext;
    private UberIQRuhr ueberfragment;
    private KarriereFragment karfragment;
    private HomeFragment fragment;
    private ThemenFragment transfragment;
    private IQRuhr_KarrFrag iq_karfragment;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_themen, container, false);
        ImageView simpleImageView1 = (ImageView) root.findViewById(R.id.simpleiqimage);
        simpleImageView1.setImageResource(R.drawable.iqfinal);
        Button b = (Button) root.findViewById(R.id.button);
        Button b1 = (Button) root.findViewById(R.id.button2);
        Button b2 = (Button) root.findViewById(R.id.button3);
        Button b3 = (Button) root.findViewById(R.id.button6);
        Button b4 = (Button) root.findViewById(R.id.button7);
        Button b5 = (Button) root.findViewById(R.id.button8);
        Button b6 = (Button) root.findViewById(R.id.button9);
        Button b7 = (Button) root.findViewById(R.id.button10);
        Button b8 = (Button) root.findViewById(R.id.button11);
        Button b9 = (Button) root.findViewById(R.id.button12);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iq_karfragment = new IQRuhr_KarrFrag();
                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                fragmentTransaction.commit();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfragment = new ThemenFragment();

                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, transfragment);
                fragmentTransaction.commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, new HomeFragment());
                fragmentTransaction.commit();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, new TransformFragment());
                fragmentTransaction.commit();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, new QualifFragment());
                fragmentTransaction.commit();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
               fragmentTransaction.replace(R.id.nav_host_fragment, new QualifmanagFragment());
                fragmentTransaction.commit();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
               fragmentTransaction.replace(R.id.nav_host_fragment, new Wissenstransfragment());
                fragmentTransaction.commit();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, new SeminarEntwfragment());
                fragmentTransaction.commit();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, new Vernetzungfragment());
                fragmentTransaction.commit();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, new Fördermittelfragment());
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
