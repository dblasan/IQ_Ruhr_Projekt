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

public class Fragmentnextseven extends Fragment {

    private FragmentActivity myContext;
    FloatingActionButton fab;
    Fragmentnexteight iq_karfragment;
    FragmentManager fragmentManager;
    View root;
    public final String Fragennummer = "460";
    public String Themenbereich;
    public String InhaltderFrage;
    public String antwortbutton;
    public String antwortwahr;
    public String antwortnichtwahr;
    private RadioButton radioSexButton;
    RadioGroup rgroup;
    DatabaseHelper myDb;
    RadioButton simpleRadioButton1;
    RadioButton simpleRadioButton2;
    RadioButton simpleRadioButton3;
    RadioButton simpleRadioButton4;
    RadioButton simpleRadioButton5;
    Bundle bundle;
    int gewichtung, gew, gewichtung1, gewichtung2, gewichtung3, gewichtung4, gewichtung5;

    String h, youdData14, youdData111, youdData13, youdData11, youdData12, youdData15, youdData16, youdData17, youdData112,
            youdData113, youdData114, youdData115, youdData116, youdData18, youdData118;
    boolean result1, result;
    public final String antwort50Internetanbindung = "Ihre Internetverbindung beträgt weniger als 50 Mbit im Download. Der Upload ist bei diesen Verbindungsgeschwindigkeiten oft um ein vielfaches geringer. Wir empfehlen Ihnen eine Verbindung von mindestens 100 Mbit im Download. " +
            "Nur so ist gewährleistet, dass Datenpakete auch in Zukunft sicher ausgetauscht werden können.    ";
    public final String antwortgros50Intanbindung = "Ihre Internetverbindung beträgt mehr als 50 Mbit, aber weniger als 100 Mbit im Download. Der Upload kann bei diesen Geschwindigkeiten oftmals geringer sein. Wir empfehlen Ihnen eine Verbindung von mindestens 100 Mbit im Download. " +
            "Nur so ist gewährleistet, dass Datenpakete auch in Zukunft sicher ausgetauscht werden können. ";

    public final String antwortgros100Intanbindung = "Ihre Internetverbindung beträgt mehr als 100 Mbit, aber weniger als 200 Mbit im Download." +
            " Der Upload ist gut, kann bei größeren Datenmengen allerdings geringer sein. ";

    public final String antwortgros200Intanbindung = "Ihre Internetverbindung beträgt mehr als 200 Mbit im Download. Sie sind sehr gut ausgestattet.";

    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_fragmtestradio7, container, false);
        rgroup = (RadioGroup) root.findViewById(R.id.set_radiogroup7);
        simpleRadioButton1 = (RadioButton) root.findViewById(R.id.two_sets7);
        simpleRadioButton2 = (RadioButton) root.findViewById(R.id.two_set77);
        simpleRadioButton3 = (RadioButton) root.findViewById(R.id.two_set777);
        simpleRadioButton4 = (RadioButton) root.findViewById(R.id.two_set7777);
        simpleRadioButton5 = (RadioButton) root.findViewById(R.id.two_set77777);
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
        gew = bundle.getInt("Gewicht1");
        gewichtung = bundle.getInt("Gewicht2");
        gewichtung1 = bundle.getInt("Gewicht3");
        gewichtung2 = bundle.getInt("Gewicht4");
        gewichtung3 = bundle.getInt("Gewicht5");
        gewichtung4 = bundle.getInt("Gewicht6");

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
                if (h.equals("< 50 Mbit") || h.equals("> 50 Mbit")
                        || h.equals("> 100 Mbit") || (h.equals("> 200 Mbit"))) {
                    Log.d("Button 3", "vorherige Auswahlen : " + youdData11 + ":" + youdData111 + "\t" + youdData12 + ":" +
                            youdData112 + "\t" + youdData13 + ":" + youdData113 + "\t" + youdData14 + ":" + youdData114 +
                            "\t" + youdData15 + ":" + youdData115 + youdData16 + ":" + youdData116 +
                            gew + gewichtung + gewichtung1 + gewichtung2 + gewichtung3 + gewichtung4 + "\t" + "aktuelle Auswahl: " + h);
                    radioSexButton.setChecked(true);
                    antwortbutton = h;
                }

                if (h.equals("< 50 Mbit")) {
                    antwortwahr = antwort50Internetanbindung;
                    gewichtung5 = 0;
                    result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully 1", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                if (h.equals("> 50 Mbit")) {
                    antwortwahr = antwortgros50Intanbindung;
                    gewichtung5 = 1;
                    result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully 1", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                if (h.equals("> 100 Mbit")) {
                    antwortwahr = antwortgros100Intanbindung;
                    gewichtung5 = 2;
                            result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully 1", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                if (h.equals("> 200 Mbit")) {
                    antwortwahr = antwortgros200Intanbindung;
                    gewichtung5 = 3;
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

                TextView tv = (TextView) root.findViewById(R.id.avg_testtv7);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                iq_karfragment = new Fragmentnexteight();
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
                bundle.putString("your_key17", h);
                bundle.putString("your_key117", antwortwahr);
                bundle.putInt("Gewicht1", gew);
                bundle.putInt("Gewicht2", gewichtung);
                bundle.putInt("Gewicht3", gewichtung1);
                bundle.putInt("Gewicht4", gewichtung2);
                bundle.putInt("Gewicht5", gewichtung3);
                bundle.putInt("Gewicht6", gewichtung4);
                bundle.putInt("Gewicht7", gewichtung5);

                iq_karfragment.setArguments(bundle);
                fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                fragmentTransaction.commit();
            }}
        });
        TextView linkTextView2 = root.findViewById(R.id.header7);
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
