package com.example.transactapp.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.transactapp.R;
import com.example.transactapp.TransfFragment;
import com.example.transactapp.ui.home.HomeFragment;

public class UberIQRuhr extends Fragment {
    private FragmentActivity myContext;
    private HomeFragment fragment;
    private ThemenFragment transfragment;
    private IQRuhr_KarrFrag iq_karfragment;
    FragmentManager fragmentManager;
    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_uber_iq_ruhr, container, false);
        ImageView simpleImageView =(ImageView) root.findViewById(R.id.simpleiqimage);
        simpleImageView.setImageResource(R.drawable.iqfinal);
        TextView textArea = root.findViewById(R.id.address1);
        textArea.setMovementMethod(LinkMovementMethod.getInstance());
        Button b = (Button) root.findViewById(R.id.button);
        Button b1 = (Button) root.findViewById(R.id.button2);
        Button b2 = (Button) root.findViewById(R.id.button3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iq_karfragment = new IQRuhr_KarrFrag();

                fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                fragmentTransaction.commit();            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfragment = new ThemenFragment();

                fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, transfragment);
                fragmentTransaction.commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new HomeFragment();
                fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, fragment);
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

