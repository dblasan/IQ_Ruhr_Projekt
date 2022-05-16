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

public class Lieferantseven extends Fragment {

    private FragmentActivity myContext;
    FloatingActionButton fab;
    Lieferantacht iq_karfragment;
    FragmentManager fragmentManager;
    public final String Fragennummer = "300";
    public String Themenbereich;
    public String InhaltderFrage;
    public String antwortbutton;
    public String antwortnichtwahr;
    private RadioButton radioSexButton;
    DatabaseHelper myDb;
    RadioGroup rgroup;
    RadioButton simpleRadioButton1;
    RadioButton simpleRadioButton2;
    RadioButton simpleRadioButton3;
    RadioButton simpleRadioButton4;
    RadioButton simpleRadioButton5;
    RadioButton simpleRadioButton6;

    View root;
    Bundle bundle;
    boolean result1, result;
    public final String antwortwahrklein50 = "Die Internetverbindung beträgt weniger als 50 Mbit im Download. " +
            "Der Upload kann bei diesen Geschwindigkeiten oft um ein vielfaches geringer sein. ";

    public final String antwortwahrgros50 = "Die Internetverbindung beträgt mehr als 50 Mbit, aber weniger als 100 Mbit im Download. Der Upload kann bei " +
            "diesen Geschwindigkeiten oftmals geringer sein. ";

    public final String antwortwahrgros100 = "Die Internetverbindung beträgt mehr als 100 Mbit, aber weniger als 200 Mbit. Der Upload ist gut, kann bei größeren Datenmengen allerdings geringer sein. ";

    public final String antwortwahrgros200 = "Die Internetverbindung beträgt mehr als 200 Mbit im Download. Ihr Lieferant ist sehr gut ausgestattet. ";
    public final String nichtbekannt = ".";

    String antwortwahr, youdData1, youdData11, youdData2, youdData22, youdData3,
            youdData4, youdData44, youdData5, youdData55, youdData6, youdData66, youdData33, h;
    int gewichtung, gewichtung2, gewichtung3, gewichtung4, gewichtung5, gewichtung6, gewichtung7;
    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragmenlieferantseven, container, false);
        rgroup = (RadioGroup) root.findViewById(R.id.liefer_radiogroup6);
        simpleRadioButton1 = (RadioButton) root.findViewById(R.id.lierant_sevenset1);
        simpleRadioButton2 = (RadioButton) root.findViewById(R.id.lierant_sevenset2);
        simpleRadioButton3 = (RadioButton) root.findViewById(R.id.lierant_sevenset3);
        simpleRadioButton4 = (RadioButton) root.findViewById(R.id.lierant_sevenset4);
        simpleRadioButton5 = (RadioButton) root.findViewById(R.id.lierant_sevenset5);

        bundle = getArguments();

        fab = (FloatingActionButton) root.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // get selected radio button from radioGroup
                int selectedId = rgroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioSexButton = (RadioButton) root.findViewById(selectedId);
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
                gewichtung = bundle.getInt("lieferGewicht1");
                gewichtung2 = bundle.getInt("lieferGewicht2");
                gewichtung3 = bundle.getInt("lieferGewicht3");
                gewichtung4 = bundle.getInt("lieferGewicht4");
                gewichtung5 = bundle.getInt("lieferGewicht5");
                gewichtung6 = bundle.getInt("lieferGewicht6");

                if (rgroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getMyContext(), "Please select one Button", Toast.LENGTH_SHORT).show();
                } else {
                    h = radioSexButton.getText().toString();
                    if (h.equals("<50 Mbit") || (h.equals(">50 Mbit")) ||
                            (h.equals(">100 Mbit")) || (h.equals(">200 Mbit")) ||
                            (h.equals("nicht bekannt"))) {

                        Log.d("Button 2 ", "Vorherige RadioButton Auswahl: " + youdData1 + youdData11 + "\t" + youdData2 +
                                youdData22 + youdData3 + youdData33 + youdData4 + youdData44 + youdData5 + youdData55 + youdData6 + youdData66 +
                                gewichtung + gewichtung2 + gewichtung3 + gewichtung4 + gewichtung5 + gewichtung6 + "aktuelle Auswahl: " + h);
                        radioSexButton.setChecked(true);
                        antwortbutton = h;
                    }

                    if (h.equals("<50 Mbit")) {
                        antwortwahr = antwortwahrklein50;
                        gewichtung7 = 0;
                        result1 = myDb.updateAntwortJa1(antwortwahr, Fragennummer);
                        if (result1) {
                            Log.d("Successfully 1", "Updated");
                        } else {
                            Log.d("Failed to Update!", "Failed");
                        }
                    }
                    if (h.equals(">50 Mbit")) {
                        antwortwahr = antwortwahrgros50;
                        gewichtung7 = 1;
                        result1 = myDb.updateAntwortJa1(antwortwahr, Fragennummer);
                        if (result1) {
                            Log.d("Successfully 1", "Updated");
                        } else {
                            Log.d("Failed to Update!", "Failed");
                        }
                    }
                    if (h.equals(">100 Mbit")) {
                        antwortwahr = antwortwahrgros100;
                        gewichtung7 = 2;
                        result1 = myDb.updateAntwortJa1(antwortwahr, Fragennummer);
                        if (result1) {
                            Log.d("Successfully 1", "Updated");
                        } else {
                            Log.d("Failed to Update!", "Failed");
                        }
                    }
                    if (h.equals(">200 Mbit")) {
                        antwortwahr = antwortwahrgros200;
                        gewichtung7 = 3;
                        result1 = myDb.updateAntwortJa1(antwortwahr, Fragennummer);
                        if (result1) {
                            Log.d("Successfully 1", "Updated");
                        } else {
                            Log.d("Failed to Update!", "Failed");
                        }
                    }
                    if (h.equals("nicht bekannt")) {
                        antwortwahr = nichtbekannt;
                        gewichtung7 = 0;
                        result1 = myDb.updateAntwortJa1(antwortwahr, Fragennummer);
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

                    TextView tv = (TextView) root.findViewById(R.id.avg_testtv);
                    tv.setMovementMethod(LinkMovementMethod.getInstance());
                    iq_karfragment = new Lieferantacht();
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
                    bundle.putString("lief_key7", h);
                    bundle.putString("lief_key77", antwortwahr);
                    bundle.putInt("lieferGewicht1", gewichtung);
                    bundle.putInt("lieferGewicht2", gewichtung2);
                    bundle.putInt("lieferGewicht3", gewichtung3);
                    bundle.putInt("lieferGewicht4", gewichtung4);
                    bundle.putInt("lieferGewicht5", gewichtung5);
                    bundle.putInt("lieferGewicht6", gewichtung6);
                    bundle.putInt("lieferGewicht7", gewichtung7);


                    iq_karfragment.setArguments(bundle);
                    fragmentManager = myContext.getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                    fragmentTransaction.commit();
                }
            }
        });
        TextView linkTextView2 = root.findViewById(R.id.header);
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
