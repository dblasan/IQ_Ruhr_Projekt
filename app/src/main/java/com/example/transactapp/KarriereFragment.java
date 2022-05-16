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
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.transactapp.ui.IQRuhr_KarrFrag;
import com.example.transactapp.ui.ThemenFragment;
import com.example.transactapp.ui.home.HomeFragment;

public class KarriereFragment extends Fragment {
    private FragmentActivity myContext;
    private HomeFragment fragment;
    private TransfFragment transfragment;
    private IQRuhr_KarrFrag iq_karfragment;
    FragmentManager fragmentManager;
    ThemenFragment themnfrag;
    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_karriere, container, false);
//        ImageView simpleImageView=(ImageView) root.findViewById(R.id.simpleImageView);
//        simpleImageView.setImageResource(R.drawable.iqfinal);
        TextView linkTextView2 = root.findViewById(R.id.karriere);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView linkTextView3 = root.findViewById(R.id.k);
        linkTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView3.setTypeface(null, Typeface.BOLD);
        TextView linkTextView4 = root.findViewById(R.id.ki);
        linkTextView4.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView4.setTypeface(null, Typeface.BOLD);
        TextView linkTextView5 = root.findViewById(R.id.ki2);
        linkTextView5.setMovementMethod(LinkMovementMethod.getInstance());
        TextView linkTextView6 = root.findViewById(R.id.uberiqruhr);
        linkTextView6.setMovementMethod(LinkMovementMethod.getInstance());
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
