package com.example.transactapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Typeface;
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

import com.example.transactapp.ui.IQRuhr_KarrFrag;
import com.example.transactapp.ui.ThemenFragment;
import com.example.transactapp.ui.UberIQRuhr;
import com.example.transactapp.ui.home.HomeFragment;

public class TransfFragment extends Fragment {
    private FragmentActivity myContext;
    private HomeFragment fragment;
    private TransfFragment transfragment;
    private IQRuhr_KarrFrag iq_karfragment;
    FragmentManager fragmentManager;
    ThemenFragment themnfrag;

    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_transformation, container, false);
       ImageView simpleImageView =(ImageView) root.findViewById(R.id.simpleiqimage);
        simpleImageView.setImageResource(R.drawable.iqfinal);
        ImageView simpleImageView2 =(ImageView) root.findViewById(R.id.transimage);
        simpleImageView2.setImageResource(R.drawable.transformation_1);
        TextView textArea1 = root.findViewById(R.id.transf);
        textArea1.setMovementMethod(LinkMovementMethod.getInstance());
        textArea1.setTypeface(null, Typeface.BOLD);
        TextView textArea = root.findViewById(R.id.transtext);
        textArea.setMovementMethod(LinkMovementMethod.getInstance());
        textArea.setText(textArea.getText().toString() + "\n"); // add new line so each person is on their own line
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
                themnfrag = new ThemenFragment();
                fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, themnfrag);
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
