package com.example.transactapp.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.transactapp.R;
import com.example.transactapp.db.DatabaseHelper;
import com.example.transactapp.db.KatalogData;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Fragment34next extends Fragment {

    Fragment35next iq_karfragment;
    private FragmentActivity myContext;
    FragmentManager fragmentManager;
    FloatingActionButton fab;
    DatabaseHelper myDb;
    RadioGroup rgroup;
    RadioButton simpleRadioButton1;
    RadioButton simpleRadioButton2;
    RadioButton simpleRadioButton3;
    TextView linkTextView2;
    View root;
    public String Fragennummer = "1010";
    public String Themenbereich;
    public String Fragetext;
    public String InhaltderFrage;
    public String antwortbutton;
    public String antwortwahr;
    public String antwortnichtwahr;
    private RadioButton radioSexButton;
    KatalogData katalogdata;
    String h, youdData14, youdData13, youdData11, youdData12, youdData15, youdData16,
            youdData17, youdData18, youdData19, youdData20, youdData21, youdData22, youdData23, youdData24,
            youdData111, youdData25, youdData26, youdData112, youdData113, youdData114, youdData115, youdData116,
            youdData117, youdData118, youdData119, youdData200, youdData211, youdData222, youdData233,
            youdData244, youdData255, youdData266, youdData27, youdData277, youdData28, youdData288,
            youdData299, youdData30, youdData29, youdData300, youdData31, youdData311, youdData32,
            youdData322, youdData33, youdData333, youdData34, youdData344, youdData35,
            youdData355, youdData36, youdData366, youdData37, youdData377, youdData38, youdData388, youdData39,
            youdData399, youdData40, youdData400, youdData41, youdData411;

    int gewichtung, gew, gewichtung1, gewichtung2, gewichtung3, gewichtung4, gewichtung5,
            gewichtung6, gewichtung7, gewichtung8, gewichtung9, gewichtung10, gewichtung11, gewichtung12, gewichtung13,
            gewichtung14, gewichtung15, gewichtung16, gewichtung17,
            gewichtung18, gewichtung19, gewichtung20, gewichtung21, gewichtung22,
            gewichtung23, gewichtung24, gewichtung25, gewichtung26, gewichtung27, gewichtung28;
    Bundle bundle;
    public final String antworteigenePotenzialJa = ".";
    public final String antworteigenePotenzialNein = "Zusätzlich ist es bedeutend, dass Sie Ihre eigenen Potenziale für neue " +
            "Märkte identifizieren und erkennen.";

    public static DatabaseHelper dataHelper;
    boolean result1, result;

    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_fragmtestradio34, container, false);
        rgroup = (RadioGroup) root.findViewById(R.id.set_radiogroup34);
        simpleRadioButton1 = (RadioButton) root.findViewById(R.id.two_sets34);
        simpleRadioButton2 = (RadioButton) root.findViewById(R.id.two_set34);

        fab = (FloatingActionButton) root.findViewById(R.id.fab);
        dataHelper = DatabaseHelper.getInstance(myContext.getApplicationContext());
        katalogdata = new KatalogData();
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

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get selected radio button from radioGroup
                int selectedId = rgroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioSexButton = (RadioButton) root.findViewById(selectedId);
                if (rgroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getMyContext(), "Please select one Button", Toast.LENGTH_SHORT).show();
                } else {
                h = radioSexButton.getText().toString();
                if (h.equals("ja") || (h.equals("Nein"))) {
                    Log.d("Button 3", "vorherige Auswahlen : " + youdData11 + ":" + youdData111 + "\t" + youdData12 + ":" + youdData112 + "\t" + youdData13 + ":" + youdData113 + "\t" + youdData14 + ":" + youdData114 +
                            "\t" + youdData15 + ":" + youdData115 + "\t" + youdData16 + ":" + youdData116 + "\t" +
                            youdData17 + ":" + youdData117 + youdData18 + ":" + youdData118 + youdData19 + ":" + youdData119+
                            youdData20 + ":" + youdData200 + youdData21 + ":" + youdData211 + youdData22 + ":" + youdData222 +
                            youdData23 + ":" + youdData233 + youdData24 + ":" + youdData244+ youdData25 + ":" + youdData255 +
                            youdData26 + ":" + youdData266 + youdData27 + ":" + youdData277 +youdData28 + ":" + youdData288+
                            youdData29 + ":" + youdData299 +youdData30 + ":" + youdData300 + youdData31 + ":" + youdData311 +
                            youdData32 + ":" + youdData322 +  youdData33 + ":" + youdData333 +youdData34 + ":" + youdData344 +
                            youdData35 + ":" + youdData355 + youdData36 + ":" + youdData366 +youdData37 + ":" + youdData377 +
                            youdData38 + ":" + youdData388 + youdData39 + ":" + youdData399 + gew + gewichtung + gewichtung1 + gewichtung2 + gewichtung3 + gewichtung4 + gewichtung5 + gewichtung6 +
                            gewichtung7 + gewichtung8 + gewichtung9 +gewichtung10 + gewichtung11 +
                            gewichtung12 + gewichtung13 + gewichtung14 + gewichtung15 + gewichtung16 + gewichtung17 + gewichtung18+
                            gewichtung19 + gewichtung20 + gewichtung21+ gewichtung22+ gewichtung23+ gewichtung24 +
                            gewichtung25 + gewichtung26+ gewichtung27 + "\t" + "aktuelle Auswahl: " + h);

                    radioSexButton.setChecked(true);
                    antwortbutton = h;
                }
                result = myDb.update(h, Fragennummer);
                if (result) {
                    Log.d("Successfully Posted!", "Posted");
                } else {
                    Log.d("Failed to Post!", "Failed");
                }

                if (h.equals("ja")) {
                    antwortwahr = antworteigenePotenzialJa;
                    gewichtung28 =1 ;
                    result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully 1", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                if (h.equals("Nein")) {
                    antwortwahr = antworteigenePotenzialNein;
                    gewichtung28 = 0;
                    result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully 1", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                TextView tv = (TextView) root.findViewById(R.id.avg_testtv34);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                iq_karfragment = new Fragment35next();
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
                bundle.putString("your_key40", h);
                bundle.putString("your_key400", antwortwahr);

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

                iq_karfragment.setArguments(bundle);
                fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                fragmentTransaction.commit();

            }}
        });

        linkTextView2 = root.findViewById(R.id.header34);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView2.setTypeface(null, Typeface.BOLD);
        return root;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDb = new DatabaseHelper(myContext.getApplicationContext());
        Fragetext = Themenbereich = InhaltderFrage = antwortbutton = antwortwahr = antwortnichtwahr = "";
        gewichtung = 0;
    }

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }
}
