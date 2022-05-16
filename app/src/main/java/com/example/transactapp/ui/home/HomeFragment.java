package com.example.transactapp.ui.home;

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

import com.example.transactapp.R;
import com.example.transactapp.TransfFragment;
import com.example.transactapp.ui.IQRuhr_KarrFrag;
import com.example.transactapp.ui.ThemenFragment;

public class HomeFragment extends Fragment {

    private FragmentActivity myContext;
    private HomeFragment fragment;
    private TransfFragment transfragment;
    private IQRuhr_KarrFrag iq_karfragment;
    private ThemenFragment themenfrg;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ImageView simpleImageView = (ImageView) root.findViewById(R.id.simpleiqimage);
        simpleImageView.setImageResource(R.drawable.iqfinal);

        ImageView simpleImageView1 = (ImageView) root.findViewById(R.id.simpleImageView);
        simpleImageView1.setImageResource(R.drawable.iqbild);

        Button b1 = (Button) root.findViewById(R.id.button2);
        Button b2 = (Button) root.findViewById(R.id.button3);
        Button b = (Button) root.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               iq_karfragment = new IQRuhr_KarrFrag();

                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                fragmentTransaction.commit();            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                themenfrg = new ThemenFragment();
                FragmentManager fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, themenfrg);
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
        return root;
    }

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;

        super.onAttach(activity);
    }
}