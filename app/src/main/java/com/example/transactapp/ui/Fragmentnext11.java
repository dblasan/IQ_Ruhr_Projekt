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
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Fragmentnext11 extends Fragment {

    private FragmentActivity myContext;
    FloatingActionButton fab;
    Fragmentnext12 iq_karfragment;
    FragmentManager fragmentManager;
    RadioGroup rgroup;
    View root;
    RadioButton simpleRadioButton1;
    RadioButton simpleRadioButton2;
    RadioButton simpleRadioButton3;
    RadioButton simpleRadioButton4;
    public final String Fragennummer = "560";
    public String Themenbereich;
    public String InhaltderFrage;
    public String antwortbutton;
    public String antwortwahr;
    public String antwortnichtwahr;
    private RadioButton radioSexButton;
    DatabaseHelper myDb;
    String h, youdData111, youdData14, youdData13, youdData11, youdData12, youdData15, youdData16, youdData17, youdData18, youdData19,
            youdData20, youdData21, youdData112, youdData113, youdData114, youdData115, youdData116, youdData117, youdData118,
            youdData119, youdData200, youdData201, youdData211, youdData22, youdData222;
    Bundle bundle;

    int gewichtung, gew, gewichtung1, gewichtung2, gewichtung3, gewichtung4, gewichtung5,
            gewichtung6, gewichtung7, gewichtung8, gewichtung9;

    public final String antworthomeofficeNein = "Die Möglichkeit, Homeoffice durchführen zu können, steigert die Atraktivität von Unternehmen. " +
            "Das kann ein Vorteil bei der Recrutierung von qualifiziertem Personal sein.";
    public final String antworthomeofficekaum = "Bei steigendem Anteil von Homeoffice sollten Sie Beschäftigte und" +
            " Führungskräfte auf damit verbundene veränderte Arbeitsweisen vorbereiten und qualifizieren. ";

    public final String antworthomeofficekleinerteil = "Bei steigendem Anteil von Homeoffice sollten Sie Beschäftigte und Führungskräfte auf " +
            "damit verbundene veränderte Arbeitsweisen vorbereiten und qualifizieren. ";

    public final String antworthomeofficegrosserteil = "Bei einem großen Anteil von Homeoffice lohnt sich die genaue Betrachtung der " +
            "Arbeitsweisen, um diese bestmöglich zu optimieren.";
    boolean result1, result;
    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_fragmtestradio11, container, false);
        rgroup = (RadioGroup) root.findViewById(R.id.set_radiogroup10);
        simpleRadioButton1 = (RadioButton) root.findViewById(R.id.two_sets111);
        simpleRadioButton2 = (RadioButton) root.findViewById(R.id.two_set11);
        simpleRadioButton3 = (RadioButton) root.findViewById(R.id.two_set110);
        simpleRadioButton4 = (RadioButton) root.findViewById(R.id.two_set1101);
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

        fab = (FloatingActionButton) root.findViewById(R.id.fab);
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
                if (h.equals("kaum") || (h.equals("kleiner Teil"))
                        || (radioSexButton.getText().toString()).equals("großer Teil")
                        || (radioSexButton.getText().toString()).equals("Nein")) {
                    Log.d("Button 3", "vorherige Auswahlen : " + youdData11 + ":" + youdData111 + "\t" + youdData12 + ":" + youdData112 + "\t" + youdData13 + ":" + youdData113 + "\t" + youdData14 + ":" + youdData114 +
                            "\t" + youdData15 + ":" + youdData115 + "\t" + youdData16 + ":" + youdData116 + "\t" +
                            youdData17 + ":" + youdData117 + youdData18 + ":" + youdData118 + youdData19 + ":" + youdData119+
                            youdData20 + ":" + youdData200 +
                            gew + gewichtung + gewichtung1 + gewichtung2 + gewichtung3 +
                            gewichtung4 + gewichtung5 + gewichtung6 + gewichtung7 + gewichtung8 + "\t" + ":" + "\t" + "aktuelle Auswahl: " + h);
                    radioSexButton.setChecked(true);
                    antwortbutton = h;
                }
                if (h.equals("Nein")) {
                    antwortwahr = antworthomeofficeNein;
                    gewichtung9 = 0;
                    result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully 1", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                if (h.equals("kaum")) {
                    antwortwahr = antworthomeofficekaum;
                    gewichtung9 = 0;
                    result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully 1", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                if (h.equals("kleiner Teil")) {
                    antwortwahr = antworthomeofficekleinerteil;
                    gewichtung9 = 1;
                    result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully 1", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                if (h.equals("großer Teil")) {
                    antwortwahr = antworthomeofficegrosserteil;
                    gewichtung9 = 2;
                    result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully 1", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                result = myDb.update(h, Fragennummer);
                if (result) {
                    Log.d("Successfully Posted!", "Posted");
                } else {
                    Log.d("Failed to Post!", "Failed");
                }

                TextView tv = (TextView) root.findViewById(R.id.avg_testtv11);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                iq_karfragment = new Fragmentnext12();
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
                bundle.putString("your_key117", youdData117);
                bundle.putString("your_key17", youdData17);
                bundle.putString("your_key18", youdData18);
                bundle.putString("your_key118", youdData118);
                bundle.putString("your_key19", youdData19);
                bundle.putString("your_key119", youdData119);
                bundle.putString("your_key20", youdData20);
                bundle.putString("your_key200", youdData200);
                bundle.putString("your_key21", h);
                bundle.putString("your_key211", antwortwahr);

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

                iq_karfragment.setArguments(bundle);
                fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                fragmentTransaction.commit();
            }}
        });
        TextView linkTextView2 = root.findViewById(R.id.header11);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView2.setTypeface(null, Typeface.BOLD);
        return root;
    }

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDb = new DatabaseHelper(myContext.getApplicationContext());
        Themenbereich = InhaltderFrage = antwortbutton = antwortwahr = antwortnichtwahr = "";
    }
}
