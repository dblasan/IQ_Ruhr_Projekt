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

public class Fragmentnexttwo extends Fragment {

    private FragmentActivity myContext;
    FloatingActionButton fab;
    Fragmentnextthree iq_karfragment;
    FragmentManager fragmentManager;
    public final String Fragennummer = "350";
    public String Themenbereich;
    public String InhaltderFrage;
    public String antwortbutton;
    public String antwortwahr;
    public String antwortnichtwahr;
    private RadioButton radioSexButton;
    DatabaseHelper myDb;
    RadioGroup rgroup;
    RadioButton simpleRadioButton1;
    RadioButton simpleRadioButton3;
    View root;
    Bundle bundle;
    boolean result1, result;
    String h, youdData11, youdData111, youdData12, youdData112;
    int gewichtung, gew, gewichtung1;
    public final String antwortneinFertigung = "Eine bessere Einbindung von Produktionsanlagen kann Rüstzeiten und Fehlerpotenziale senken und die Übersicht erhöhen. Ausserdem können Sie - je nach Herstellersoftware - Produktionsdaten in Echtzeit einsehen oder diese automatisch in die PPS einpflegen. Durch die automatische Bereitstellung von Daten " +
            "erhöht sich die Wahrscheinlichkeit, dass Sie durch den Einsatz künstlicher Intelligenz noch effizienter Arbeiten können.";

    public final String antwortjaFertigung = ".";

    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_fragmtestradio2, container, false);
        rgroup = (RadioGroup) root.findViewById(R.id.set_radiogroup2);
        simpleRadioButton1 = (RadioButton) root.findViewById(R.id.two_sets2);
        simpleRadioButton3 = (RadioButton) root.findViewById(R.id.two_set2);
        bundle = getArguments();

        fab = (FloatingActionButton) root.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get selected radio button from radioGroup
                int selectedId = rgroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                youdData11 = bundle.getString("your_key11");
                youdData111 = bundle.getString("your_key111");
                youdData12 = bundle.getString("your_key12");
                youdData112 = bundle.getString("your_key112");
                gew = bundle.getInt("Gewicht1");
                gewichtung = bundle.getInt("Gewicht2");
                radioSexButton = (RadioButton) root.findViewById(selectedId);

                if (rgroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getMyContext(), "Please select one Button", Toast.LENGTH_SHORT).show();
                } else {
                h = radioSexButton.getText().toString();
                if (h.equals("ja") || (h.equals("Nein"))) {
                    Log.d("Button 3", "vorherige Auswahlen : " + youdData11 + ":" + youdData111 + "\t" +
                            youdData12 + ":" + youdData112 + gew + gewichtung + "\t" + "aktuelle Auswahl: " + h);
                    radioSexButton.setChecked(true);
                    antwortbutton = h;
                }
                if (h.equals("ja")) {
                    antwortwahr = antwortjaFertigung;
                    gewichtung1 = 1;
                    result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully 1", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                if (h.equals("Nein")) {
                    antwortwahr = antwortneinFertigung;
                    gewichtung1 = 0;
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

                TextView tv = (TextView) root.findViewById(R.id.avg_testtv2);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                iq_karfragment = new Fragmentnextthree();
                bundle = new Bundle();
                bundle.putString("your_key11", youdData11);
                bundle.putString("your_key111", youdData111);
                bundle.putString("your_key12", youdData12);
                bundle.putString("your_key112", youdData112);
                bundle.putString("your_key13", h);
                bundle.putString("your_key113", antwortwahr);
                bundle.putInt("Gewicht1", gew);
                bundle.putInt("Gewicht2", gewichtung);
                bundle.putInt("Gewicht3", gewichtung1);

                iq_karfragment.setArguments(bundle);
                fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                fragmentTransaction.commit();

            }}
        });
        TextView linkTextView2 = root.findViewById(R.id.header2);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView2.setTypeface(null, Typeface.BOLD);
        return root;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDb = new DatabaseHelper(myContext.getApplicationContext());
        Themenbereich = InhaltderFrage = antwortbutton = antwortwahr = antwortnichtwahr = "";
    }

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;

        super.onAttach(activity);
    }
}
