package com.example.transactapp.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.transactapp.MainActivity;
import com.example.transactapp.R;
import com.example.transactapp.db.DatabaseHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LieferFragmentMain1 extends Fragment {
    public final String Fragennummer = "700";
    public String Themenbereich;
    public String InhaltderFrage;
    public String antwortbutton;
    public String antwortnichtwahr;
    // defines paint and canvas
    FragmentActivity myContext;
    String antwortwahr;
    String youdData1;
    String youdData11;
    String youdData2;
    String youdData22;
    String youdData3;
    String youdData33;
    String youdData4;
    String youdData44;
    String youdData5;
    String youdData55;
    String youdData6;
    String youdData66;
    String youdData7;
    String youdData77;
    String youdData8;
    String youdData88;
    String youdData9;
    String youdData99;
    String youdData10;
    String youdData100;
    String youdData111;
    String youdData1111;
    String youdData12;
    String youdData112;
    String youdData13;
    String youdData113;
    String youdData14;
    String youdData114;
    String youdData15;
    String youdData115;
    String youdData16;
    String youdData116;
    String youdData17;
    String youdData117;
    String youdData18;
    String youdData118;
    String youdData19;
    String youdData119;
    String youdData20;
    String youdData200;
    String youdData21;
    String youdData211;
    String h;
    int gewichtung, gewichtung2, gewichtung3, gewichtung4, gewichtung5, gewichtung6,
            gewichtung7, gewichtung8, gewichtung9, gewichtung10, gewichtung11,
            gewichtung12, gewichtung13, gewichtung14, gewichtung15, gewichtung16,
            gewichtung17, gewichtung18, gewichtung19, gewichtung20, gewichtung21;
    DatabaseHelper myDb;
    Bundle bundle;
    View rootView;
    int gewichtgesamt;
    View demoview;
    FloatingActionButton btnTag1, btnTag;
    TextView mValue, ts;
    RelativeLayout relativeLayout;


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @SuppressLint({"ClickableViewAccessibility", "WrongCall", "ResourceType", "WrongViewCast"})
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.lieferfragment_main1, container, false);
        bundle = getArguments();
        youdData1 = bundle.getString("lief_key1");
        youdData11 = bundle.getString("lief_key11");
        youdData2 = bundle.getString("lief_key2");
        youdData22 = bundle.getString("lief_key22");
        youdData3 = bundle.getString("lief_key3");
        youdData33 = bundle.getString("lief_key33");
        youdData4 = bundle.getString("lief_key4");
        youdData44 = bundle.getString("lief_key44");
        youdData5 = bundle.getString("lief_key5");
        youdData55 = bundle.getString("lief_key55");
        youdData6 = bundle.getString("lief_key6");
        youdData66 = bundle.getString("lief_key66");
        youdData7 = bundle.getString("lief_key7");
        youdData77 = bundle.getString("lief_key77");
        youdData8 = bundle.getString("lief_key8");
        youdData88 = bundle.getString("lief_key88");
        youdData9 = bundle.getString("lief_key9");
        youdData99 = bundle.getString("lief_key99");
        youdData10 = bundle.getString("lief_key10");
        youdData100 = bundle.getString("lief_key100");
        youdData111 = bundle.getString("lief_key111");
        youdData1111 = bundle.getString("lief_key1111");
        youdData12 = bundle.getString("lief_key12");
        youdData112 = bundle.getString("lief_key112");
        youdData13 = bundle.getString("lief_key13");
        youdData113 = bundle.getString("lief_key113");
        youdData14 = bundle.getString("lief_key14");
        youdData114 = bundle.getString("lief_key114");
        youdData15 = bundle.getString("lief_key15");
        youdData115 = bundle.getString("lief_key115");
        youdData16 = bundle.getString("lief_key16");
        youdData116 = bundle.getString("lief_key116");
        youdData17 = bundle.getString("lief_key17");
        youdData117 = bundle.getString("lief_key117");
        youdData18 = bundle.getString("lief_key18");
        youdData118 = bundle.getString("lief_key118");
        youdData19 = bundle.getString("lief_key19");
        youdData119 = bundle.getString("lief_key119");
        youdData20 = bundle.getString("lief_key20");
        youdData200 = bundle.getString("lief_key200");
        youdData21 = bundle.getString("lief_key21");
        youdData211 = bundle.getString("lief_key211");

        gewichtung = bundle.getInt("lieferGewicht1");
        gewichtung2 = bundle.getInt("lieferGewicht2");
        gewichtung3 = bundle.getInt("lieferGewicht3");
        gewichtung4 = bundle.getInt("lieferGewicht4");
        gewichtung5 = bundle.getInt("lieferGewicht5");
        gewichtung6 = bundle.getInt("lieferGewicht6");
        gewichtung7 = bundle.getInt("lieferGewicht7");
        gewichtung8 = bundle.getInt("lieferGewicht8");
        gewichtung9 = bundle.getInt("lieferGewicht9");
        gewichtung10 = bundle.getInt("lieferGewicht10");
        gewichtung11 = bundle.getInt("lieferGewicht11");
        gewichtung12 = bundle.getInt("lieferGewicht12");
        gewichtung13 = bundle.getInt("lieferGewicht13");
        gewichtung14 = bundle.getInt("lieferGewicht14");
        gewichtung15 = bundle.getInt("lieferGewicht15");
        gewichtung16 = bundle.getInt("lieferGewicht16");
        gewichtung17 = bundle.getInt("lieferGewicht17");
        gewichtung18 = bundle.getInt("lieferGewicht18");
        gewichtung19 = bundle.getInt("lieferGewicht19");
        gewichtung20 = bundle.getInt("lieferGewicht20");
        gewichtung21 = bundle.getInt("lieferGewicht21");
        gewichtgesamt = bundle.getInt("LiefekeyGes");

        final ImageView imageView = (ImageView) rootView.findViewById(R.id.simpleiqimage);
        imageView.setImageResource(R.drawable.iqfinal);
        Log.d("Button 2 ", "Vorherige RadioButton Auswahl: " + youdData1 + youdData11 + "\t" + youdData2 +
                youdData22 + youdData3 + youdData33 + youdData4 + youdData44 + youdData5 + youdData55 + youdData6 + youdData66 +
                youdData7 + youdData77 + youdData8 + youdData88 + youdData9 + youdData99 + youdData10 + youdData100 +
                youdData111 + youdData1111 + youdData12 + youdData112 + youdData13 + youdData113 + youdData14 + youdData114 +
                youdData15 + youdData115 + youdData16 + youdData116 + youdData17 + youdData117 + youdData18 + youdData118 + youdData19 + youdData119 +
                youdData20 + youdData200 + youdData21 + youdData211 + +gewichtung + gewichtung2 + gewichtung3 + gewichtung4 + gewichtung5 +
                gewichtung6 + gewichtung7 + gewichtung8 + gewichtung9 + gewichtung10 + gewichtung11 + gewichtung12 + gewichtung13 + gewichtung14 +
                gewichtung15 + gewichtung16 + gewichtung17 + gewichtung18 + gewichtung19 + gewichtung20 + +gewichtung21 + +gewichtgesamt +
                "aktuelle Auswahl: " + h);

        relativeLayout = (RelativeLayout) rootView.findViewById(R.id.lay);
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
        RelativeLayout.LayoutParams linearParams1 = new RelativeLayout.LayoutParams(
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
       /* btnTag1 = new FloatingActionButton(myContext);
        childLayout3 = new RelativeLayout(myContext);
        RelativeLayout.LayoutParams linearParams3 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        linearParams3.topMargin = 300;
        linearParams3.leftMargin = 550;
        childLayout3.setLayoutParams(linearParams3);
        btnTag1.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT));
        btnTag1.setImageResource(android.R.drawable.checkbox_on_background);
        btnTag1.setSize(FloatingActionButton.SIZE_NORMAL);
        childLayout3.addView(btnTag1);
        myContext.addContentView(childLayout3, linearParams3);*/

        return rootView;
    }

    public void newInstance() {

        HauptLieferfragment f = new HauptLieferfragment();

        // Supply index input as an argument.
        bundle = new Bundle();
        bundle.putString("lief_key1", youdData1);
        bundle.putString("lief_key11", youdData11);
        bundle.putString("lief_key2", youdData2);
        bundle.putString("lief_key22", youdData22);
        bundle.putString("lief_key3", youdData3);
        bundle.putString("lief_key33", youdData33);
        bundle.putString("lief_key4", youdData4);
        bundle.putString("lief_key44", youdData44);
        bundle.putString("lief_key5", youdData5);
        bundle.putString("lief_key55", youdData55);
        bundle.putString("lief_key6", youdData6);
        bundle.putString("lief_key66", youdData66);
        bundle.putString("lief_key7", youdData7);
        bundle.putString("lief_key77", youdData77);
        bundle.putString("lief_key8", youdData8);
        bundle.putString("lief_key88", youdData88);
        bundle.putString("lief_key9", youdData9);
        bundle.putString("lief_key99", youdData99);
        bundle.putString("lief_key10", youdData10);
        bundle.putString("lief_key100", youdData100);
        bundle.putString("lief_key111", youdData111);
        bundle.putString("lief_key1111", youdData1111);
        bundle.putString("lief_key12", youdData12);
        bundle.putString("lief_key112", youdData112);
        bundle.putString("lief_key13", youdData13);
        bundle.putString("lief_key113", youdData113);
        bundle.putString("lief_key14", youdData14);
        bundle.putString("lief_key114", youdData114);
        bundle.putString("lief_key15", youdData15);
        bundle.putString("lief_key115", youdData115);
        bundle.putString("lief_key16", youdData16);
        bundle.putString("lief_key116", youdData116);
        bundle.putString("lief_key17", youdData17);
        bundle.putString("lief_key117", youdData117);
        bundle.putString("lief_key18", youdData18);
        bundle.putString("lief_key118", youdData118);
        bundle.putString("lief_key19", youdData19);
        bundle.putString("lief_key119", youdData119);
        bundle.putString("lief_key20", youdData20);
        bundle.putString("lief_key200", youdData200);
        bundle.putString("lief_key21", h);
        bundle.putString("lief_key211", antwortwahr);

        bundle.putInt("lieferGewicht1", gewichtung);
        bundle.putInt("lieferGewicht2", gewichtung2);
        bundle.putInt("lieferGewicht3", gewichtung3);
        bundle.putInt("lieferGewicht4", gewichtung4);
        bundle.putInt("lieferGewicht5", gewichtung5);
        bundle.putInt("lieferGewicht6", gewichtung6);
        bundle.putInt("lieferGewicht7", gewichtung7);
        bundle.putInt("lieferGewicht8", gewichtung8);
        bundle.putInt("lieferGewicht9", gewichtung9);
        bundle.putInt("lieferGewicht10", gewichtung10);
        bundle.putInt("lieferGewicht11", gewichtung11);
        bundle.putInt("lieferGewicht12", gewichtung12);
        bundle.putInt("lieferGewicht13", gewichtung13);
        bundle.putInt("lieferGewicht14", gewichtung14);
        bundle.putInt("lieferGewicht15", gewichtung15);
        bundle.putInt("lieferGewicht16", gewichtung16);
        bundle.putInt("lieferGewicht17", gewichtung17);
        bundle.putInt("lieferGewicht18", gewichtung18);
        bundle.putInt("lieferGewicht19", gewichtung19);
        bundle.putInt("lieferGewicht20", gewichtung20);
        bundle.putInt("lieferGewicht21", gewichtung21);

        f.setArguments(bundle);
        FragmentManager fragmentManager = myContext.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.nav_host_fragment, f);
        fragmentTransaction.commit();

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @SuppressLint({"SetTextI18n", "WrongCall"})
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDb = new DatabaseHelper(myContext.getApplicationContext());
        Themenbereich = InhaltderFrage = antwortbutton = antwortwahr = antwortnichtwahr = "";

    }

    public FragmentActivity getMyContext() {
        return myContext;
    }

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
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
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawPaint(paint);

            // draw red circle with anti aliasing turned off
            if (gewichtgesamt <= 24) {
                paint.setColor(Color.RED);
                canvas.drawCircle(350, 600, 50, paint);
                Toast.makeText(myContext, "Kritische Umfrageforschritt",
                        Toast.LENGTH_SHORT).show();

            } else if (gewichtgesamt >= 24 && gewichtgesamt <= 30) {
                // draw yellow circle with anti aliasing turned off
                paint.setColor(Color.YELLOW);
                canvas.drawCircle(350, 700, 50, paint);
                Toast.makeText(myContext, "Teilweise Kritische Umfrageforschritt",
                        Toast.LENGTH_SHORT).show();

            }
            // draw green circle with anti aliasing turned off
            else if (gewichtgesamt > 30 && gewichtgesamt <= 35) {
                paint.setColor(Color.GREEN);
                canvas.drawCircle(350, 800, 50, paint);
                Toast.makeText(myContext, "Umfrageforschritt verlief planmäßig",
                        Toast.LENGTH_SHORT).show();

            }

        }
    }
}
