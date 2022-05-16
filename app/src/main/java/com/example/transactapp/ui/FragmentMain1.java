package com.example.transactapp.ui;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.transactapp.MainActivity;
import com.example.transactapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FragmentMain1 extends Fragment implements View.OnClickListener {

    Bundle bundle;
    View rootView;
    int gewichtgesamt;
    FragmentManager fragmentManager;
    DemoView demoview;
    FloatingActionButton btnTag1, btnTag;
    TextView mValue, ts;
    RelativeLayout relativeLayout;
    String antwortwahr, h, youdData14, youdData13, youdData11, youdData12, youdData15, youdData16,
            youdData17, youdData18, youdData19, youdData20, youdData21, youdData22, youdData23, youdData24,
            youdData111, youdData25, youdData26, youdData112, youdData113, youdData114, youdData115, youdData116,
            youdData117, youdData118, youdData119, youdData200, youdData211, youdData222, youdData233,
            youdData244, youdData255, youdData266, youdData27, youdData277, youdData28, youdData288,
            youdData299, youdData30, youdData29, youdData300, youdData31, youdData311, youdData32,
            youdData322, youdData33, youdData333, youdData34, youdData344, youdData35,
            youdData355, youdData36, youdData366, youdData37, youdData377, youdData38, youdData388, youdData39,
            youdData399, youdData40, youdData400, youdData41, youdData411, youdData42, youdData422;

    int gewichtung, gew, gewichtung1, gewichtung2, gewichtung3, gewichtung4, gewichtung5,
            gewichtung6, gewichtung7, gewichtung8, gewichtung9, gewichtung10, gewichtung11, gewichtung12, gewichtung13,
            gewichtung14, gewichtung15, gewichtung16, gewichtung17,
            gewichtung18, gewichtung19, gewichtung20, gewichtung21, gewichtung22,
            gewichtung23, gewichtung24, gewichtung25, gewichtung26, gewichtung27, gewichtung28, gewichtung29;
    // defines paint and canvas
    private FragmentActivity myContext;

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main1, container, false);

        bundle = getArguments();
        youdData111 = bundle.getString("your_key111");
        youdData11 = bundle.getString("your_key11");
        youdData12 = bundle.getString("your_key12");
        youdData112 = bundle.getString("your_key112");
        youdData13 = bundle.getString("your_key13");
        youdData113 = bundle.getString("your_key113");
        youdData14 = bundle.getString("your_key14");
        youdData114 = bundle.getString("your_key114");
        youdData15 = bundle.getString("your_key15");
        youdData115 = bundle.getString("your_key115");
        youdData16 = bundle.getString("your_key16");
        youdData116 = bundle.getString("your_key116");
        youdData17 = bundle.getString("your_key17");
        youdData117 = bundle.getString("your_key117");
        youdData18 = bundle.getString("your_key18");
        youdData118 = bundle.getString("your_key118");
        youdData19 = bundle.getString("your_key19");
        youdData119 = bundle.getString("your_key119");
        youdData20 = bundle.getString("your_key20");
        youdData200 = bundle.getString("your_key200");
        youdData21 = bundle.getString("your_key21");
        youdData211 = bundle.getString("your_key211");
        youdData22 = bundle.getString("your_key22");
        youdData222 = bundle.getString("your_key222");
        youdData23 = bundle.getString("your_key23");
        youdData233 = bundle.getString("your_key233");
        youdData24 = bundle.getString("your_key24");
        youdData244 = bundle.getString("your_key244");
        youdData25 = bundle.getString("your_key25");
        youdData255 = bundle.getString("your_key255");
        youdData26 = bundle.getString("your_key26");
        youdData266 = bundle.getString("your_key266");
        youdData27 = bundle.getString("your_key27");
        youdData277 = bundle.getString("your_key277");
        youdData28 = bundle.getString("your_key28");
        youdData288 = bundle.getString("your_key288");
        youdData29 = bundle.getString("your_key29");
        youdData299 = bundle.getString("your_key299");
        youdData30 = bundle.getString("your_key30");
        youdData300 = bundle.getString("your_key300");
        youdData31 = bundle.getString("your_key31");
        youdData311 = bundle.getString("your_key311");
        youdData32 = bundle.getString("your_key32");
        youdData322 = bundle.getString("your_key322");
        youdData33 = bundle.getString("your_key33");
        youdData333 = bundle.getString("your_key333");
        youdData34 = bundle.getString("your_key34");
        youdData344 = bundle.getString("your_key344");
        youdData35 = bundle.getString("your_key35");
        youdData355 = bundle.getString("your_key355");
        youdData36 = bundle.getString("your_key36");
        youdData366 = bundle.getString("your_key366");
        youdData37 = bundle.getString("your_key37");
        youdData377 = bundle.getString("your_key377");
        youdData38 = bundle.getString("your_key38");
        youdData388 = bundle.getString("your_key388");
        youdData39 = bundle.getString("your_key39");
        youdData399 = bundle.getString("your_key399");
        youdData40 = bundle.getString("your_key40");
        youdData400 = bundle.getString("your_key400");
        youdData41 = bundle.getString("your_key41");
        youdData411 = bundle.getString("your_key411");

        gew = bundle.getInt("Gewicht1");
        gewichtung = bundle.getInt("Gewicht2");
        gewichtung1 = bundle.getInt("Gewicht3");
        gewichtung2 = bundle.getInt("Gewicht4");
        gewichtung3 = bundle.getInt("Gewicht5");
        gewichtung4 = bundle.getInt("Gewicht6");
        gewichtung5 = bundle.getInt("Gewicht7");
        gewichtung6 = bundle.getInt("Gewicht8");
        gewichtung7 = bundle.getInt("Gewicht9");
        gewichtung8 = bundle.getInt("Gewicht10");
        gewichtung9 = bundle.getInt("Gewicht11");
        gewichtung10 = bundle.getInt("Gewicht12");
        gewichtung11 = bundle.getInt("Gewicht13");
        gewichtung12 = bundle.getInt("Gewicht14");
        gewichtung13 = bundle.getInt("Gewicht15");
        gewichtung14 = bundle.getInt("Gewicht16");
        gewichtung15 = bundle.getInt("Gewicht17");
        gewichtung16 = bundle.getInt("Gewicht18");
        gewichtung17 = bundle.getInt("Gewicht19");
        gewichtung18 = bundle.getInt("Gewicht20");
        gewichtung19 = bundle.getInt("Gewicht21");
        gewichtung20 = bundle.getInt("Gewicht22");
        gewichtung21 = bundle.getInt("Gewicht23");
        gewichtung22 = bundle.getInt("Gewicht24");
        gewichtung23 = bundle.getInt("Gewicht25");
        gewichtung24 = bundle.getInt("Gewicht26");
        gewichtung25 = bundle.getInt("Gewicht27");
        gewichtung26 = bundle.getInt("Gewicht28");
        gewichtung27 = bundle.getInt("Gewicht29");
        gewichtung28 = bundle.getInt("Gewicht30");
        gewichtung29 = bundle.getInt("Gewicht31");
        gewichtgesamt = bundle.getInt("keyG");

        final ImageView imageView = (ImageView) rootView.findViewById(R.id.simpleiqimage);
        imageView.setImageResource(R.drawable.iqfinal);

        relativeLayout = (RelativeLayout) rootView.findViewById(R.id.layKunde);
        btnTag = (FloatingActionButton) rootView.findViewById(R.id.fab);
        btnTag1 = (FloatingActionButton) rootView.findViewById(R.id.fabas);
        mValue = (TextView) rootView.findViewById(R.id.lieferfragtextv);
        ts = (TextView) rootView.findViewById(R.id.lieferfragtextv21);

        relativeLayout.removeAllViews();
        relativeLayout.addView(btnTag);
        relativeLayout.addView(btnTag1);
        relativeLayout.addView(new DemoView(getActivity()));
        relativeLayout.addView(imageView);
        relativeLayout.addView(ts);
        relativeLayout.addView(mValue);
       /* childLayout = new RelativeLayout(myContext);
        @SuppressLint("DrawAllocation") RelativeLayout.LayoutParams linearParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        childLayout.setLayoutParams(linearParams);
        mValue = new TextView(myContext);
        mValue.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT));

        mValue.setTypeface(null, Typeface.BOLD);
        mValue.setTextSize(25);
        mValue.setGravity(Gravity.CENTER);
        mValue.setText(R.string.ihre_digitalisierungsampel_steht_auf);
        childLayout.addView(mValue);
        childLayout.addView(imageView);
        myContext.addContentView(childLayout, linearParams);

        childLayout1 = new RelativeLayout(myContext);
        @SuppressLint("DrawAllocation") RelativeLayout.LayoutParams linearParams1 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        childLayout1.setLayoutParams(linearParams1);
        ts = new TextView(myContext);
        ts.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT));
        ts.setTypeface(null, Typeface.BOLD);
        ts.setTextSize(13);
        ts.setGravity(Gravity.BOTTOM);
        ts.setText(R.string.gerne_beraten_wir_sie_in_ihren_projekten_nwir_freuen_uns_auf_ihre_e_mail_oder_auf_ihren_anruf_nconsulting_iqruhr_de_n02324_918_0);
        childLayout1.addView(ts);
        myContext.addContentView(childLayout1, linearParams1);

        childLayout2 = new RelativeLayout(myContext);
        RelativeLayout.LayoutParams linearParams2 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        linearParams2.topMargin = 300;
        linearParams2.leftMargin = 30;
        childLayout2.setLayoutParams(linearParams2);
        btnTag.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT));
        btnTag.setImageResource(android.R.drawable.checkbox_on_background);
        btnTag.setSize(FloatingActionButton.SIZE_NORMAL);
        childLayout2.addView(btnTag);
        myContext.addContentView(childLayout2, linearParams2);*/
        btnTag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }

        });

        btnTag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout.removeAllViews();
                newInstance();

            }

        });

        Log.d("Button 3", "vorherige Auswahlen : " + youdData11 + ":" + youdData111 + "\t" + youdData12 + ":" + youdData112 + "\t" + youdData13 + ":" + youdData113 + "\t" + youdData14 + ":" + youdData114 +
                "\t" + youdData15 + ":" + youdData115 + "\t" + youdData16 + ":" + youdData116 + "\t" +
                youdData17 + ":" + youdData117 + youdData18 + ":" + youdData118 + youdData19 + ":" + youdData119 +
                youdData20 + ":" + youdData200 + youdData21 + ":" + youdData211 + youdData22 + ":" + youdData222 +
                youdData23 + ":" + youdData233 + youdData24 + ":" + youdData244 + youdData25 + ":" + youdData255 +
                youdData26 + ":" + youdData266 + youdData27 + ":" + youdData277 + youdData28 + ":" + youdData288 +
                youdData29 + ":" + youdData299 + youdData30 + ":" + youdData300 + youdData31 + ":" + youdData311 +
                youdData32 + ":" + youdData322 + youdData33 + ":" + youdData333 + youdData34 + ":" + youdData344 +
                youdData35 + ":" + youdData355 + youdData36 + ":" + youdData366 + youdData37 + ":" + youdData377 +
                youdData38 + ":" + youdData388 + youdData39 + ":" + youdData399 + youdData40 + ":" + youdData400 +
                youdData41 + ":" + youdData411 + gew + gewichtung + gewichtung1 + gewichtung2 + gewichtung3 + gewichtung4 + gewichtung5 + gewichtung6 +
                gewichtung7 + gewichtung8 + gewichtung9 + gewichtung10 + gewichtung11 +
                gewichtung12 + gewichtung13 + gewichtung14 + gewichtung15 + gewichtung16 + gewichtung17 + gewichtung18 +
                gewichtung19 + gewichtung20 + gewichtung21 + gewichtung22 + gewichtung23 + gewichtung24 +
                gewichtung25 + gewichtung26 + gewichtung27 + gewichtung28 + gewichtung29 + "\t" + "aktuelle Auswahl: ");


        return rootView;
    }

    private void newInstance() {
        FragmentMain f = new FragmentMain();
        bundle = new Bundle();

        bundle.putString("your_key111", youdData111);
        bundle.putString("your_key11", youdData11);
        bundle.putString("your_key12", youdData12);
        bundle.putString("your_key112", youdData112);
        bundle.putString("your_key13", youdData13);
        bundle.putString("your_key113", youdData113);
        bundle.putString("your_key14", youdData14);
        bundle.putString("your_key114", youdData114);
        bundle.putString("your_key15", youdData15);
        bundle.putString("your_key115", youdData115);
        bundle.putString("your_key16", youdData16);
        bundle.putString("your_key116", youdData116);
        bundle.putString("your_key17", youdData17);
        bundle.putString("your_key117", youdData117);
        bundle.putString("your_key18", youdData18);
        bundle.putString("your_key118", youdData118);
        bundle.putString("your_key19", youdData19);
        bundle.putString("your_key119", youdData119);
        bundle.putString("your_key20", youdData20);
        bundle.putString("your_key200", youdData200);
        bundle.putString("your_key21", youdData21);
        bundle.putString("your_key211", youdData211);
        bundle.putString("your_key22", youdData22);
        bundle.putString("your_key222", youdData222);
        bundle.putString("your_key23",youdData23);
        bundle.putString("your_key233", youdData233);
        bundle.putString("your_key24", youdData24);
        bundle.putString("your_key244", youdData244);
        bundle.putString("your_key25", youdData25);
        bundle.putString("your_key255", youdData255);
        bundle.putString("your_key26", youdData26);
        bundle.putString("your_key266", youdData266);
        bundle.putString("your_key27", youdData27);
        bundle.putString("your_key277", youdData277);
        bundle.putString("your_key28", youdData28);
        bundle.putString("your_key288", youdData288);
        bundle.putString("your_key29", youdData29);
        bundle.putString("your_key299", youdData299);
        bundle.putString("your_key30", youdData30);
        bundle.putString("your_key300", youdData300);
        bundle.putString("your_key31", youdData31);
        bundle.putString("your_key311", youdData311);
        bundle.putString("your_key32", youdData32);
        bundle.putString("your_key322", youdData322);
        bundle.putString("your_key33", youdData33);
        bundle.putString("your_key333", youdData333);
        bundle.putString("your_key34", youdData34);
        bundle.putString("your_key344", youdData344);
        bundle.putString("your_key35", youdData35);
        bundle.putString("your_key355", youdData355);
        bundle.putString("your_key36", youdData36);
        bundle.putString("your_key366", youdData366);
        bundle.putString("your_key37", youdData37);
        bundle.putString("your_key377", youdData377);
        bundle.putString("your_key38", youdData38);
        bundle.putString("your_key388", youdData388);
        bundle.putString("your_key39", youdData39);
        bundle.putString("your_key399", youdData399);
        bundle.putString("your_key40", youdData40);
        bundle.putString("your_key400", youdData400);
        bundle.putString("your_key41", h);
        bundle.putString("your_key411", antwortwahr);

        bundle.putInt("Gewicht1", gew);
        bundle.putInt("Gewicht2", gewichtung);
        bundle.putInt("Gewicht3", gewichtung1);
        bundle.putInt("Gewicht4", gewichtung2);
        bundle.putInt("Gewicht5", gewichtung3);
        bundle.putInt("Gewicht6", gewichtung4);
        bundle.putInt("Gewicht7", gewichtung5);
        bundle.putInt("Gewicht8", gewichtung6);
        bundle.putInt("Gewicht9", gewichtung7);
        bundle.putInt("Gewicht10", gewichtung8);
        bundle.putInt("Gewicht11", gewichtung9);
        bundle.putInt("Gewicht12", gewichtung10);
        bundle.putInt("Gewicht13", gewichtung11);
        bundle.putInt("Gewicht14", gewichtung12);
        bundle.putInt("Gewicht15", gewichtung13);
        bundle.putInt("Gewicht16", gewichtung14);
        bundle.putInt("Gewicht17", gewichtung15);
        bundle.putInt("Gewicht18", gewichtung16);
        bundle.putInt("Gewicht19", gewichtung17);
        bundle.putInt("Gewicht20", gewichtung18);
        bundle.putInt("Gewicht21", gewichtung19);
        bundle.putInt("Gewicht22", gewichtung20);
        bundle.putInt("Gewicht23", gewichtung21);
        bundle.putInt("Gewicht24", gewichtung22);
        bundle.putInt("Gewicht25", gewichtung23);
        bundle.putInt("Gewicht26", gewichtung24);
        bundle.putInt("Gewicht27", gewichtung25);
        bundle.putInt("Gewicht28", gewichtung26);
        bundle.putInt("Gewicht29", gewichtung27);
        bundle.putInt("Gewicht30", gewichtung28);
        bundle.putInt("Gewicht31", gewichtung29);
        bundle.putInt("keyG", gewichtgesamt);
        f.setArguments(bundle);
        fragmentManager = myContext.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.nav_host_fragment, f);
        fragmentTransaction.commit();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public FragmentActivity getMyContext() {
        return myContext;
    }

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }

    public class DemoView extends View {
        // custom drawing code here
        Paint paint;

        public DemoView(Context context) {
            super(context);

            // Hier wird ein neuer Paint mit den gewünschten Attributen gesetzt
            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            // make the entire canvas white
            paint.setColor(Color.WHITE);
            paint.setStrokeWidth(4f);
            paint.setStyle(Paint.Style.FILL);

        }

        @SuppressLint("DrawAllocation")
        @Override
        protected void onDraw(Canvas canvas) {

            super.onDraw(canvas);
            canvas.drawPaint(paint);
            // draw red circle with anti aliasing turned off
            if (gewichtgesamt <= 24) {
                paint.setColor(Color.RED);
                canvas.drawCircle(350, 600, 50, paint);
                Toast.makeText(myContext, "Es besteht dringende Handlungsbedarf",
                        Toast.LENGTH_SHORT).show();

            } else if (gewichtgesamt >= 24 && gewichtgesamt <= 30) {
                // draw yellow circle with anti aliasing turned off
                paint.setColor(Color.YELLOW);
                canvas.drawCircle(350, 700, 50, paint);
                Toast.makeText(myContext, "Sie sind auf guten Weg aber es gibt noch grosse " +
                                "Potentiale die wir gemeinsam heben können",
                        Toast.LENGTH_SHORT).show();

            }
            // draw green circle with anti aliasing turned off
            else if (gewichtgesamt > 30 && gewichtgesamt <= 35) {
                paint.setColor(Color.GREEN);
                canvas.drawCircle(350, 800, 50, paint);
                Toast.makeText(myContext, "Bleiben Sie wo Sie sind." +
                                "Mit uns kommen Sie trotzdem weiter !",
                        Toast.LENGTH_SHORT).show();
            }

        }
    }
}