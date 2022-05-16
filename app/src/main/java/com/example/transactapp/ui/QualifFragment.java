package com.example.transactapp.ui;

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

import com.example.transactapp.R;
import com.example.transactapp.ui.home.HomeFragment;

public class QualifFragment extends Fragment {

    private FragmentActivity myContext;
    private IQRuhr_KarrFrag iq_karfragment;
    private ThemenFragment themenfrg;
    Button b1, b2, b;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_qualifizierung, container, false);
        ImageView simpleImageView1 = (ImageView) root.findViewById(R.id.simpleiqimage);
        simpleImageView1.setImageResource(R.drawable.iqfinal);

        b1 = (Button) root.findViewById(R.id.button2);
        b2 = (Button) root.findViewById(R.id.button3);
        b = (Button) root.findViewById(R.id.button);
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
        TextView linkTextView3 = root.findViewById(R.id.qualif);
        linkTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView3.setTypeface(null, Typeface.BOLD);
        TextView linkTextView4 = root.findViewById(R.id.qualiftext);
        linkTextView4.setMovementMethod(LinkMovementMethod.getInstance());

        return root;
    }
    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;

        super.onAttach(activity);
    }
}
