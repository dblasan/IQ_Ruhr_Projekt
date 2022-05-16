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

public class SecondFragmentLieferant extends Fragment {

    public final String Fragennummer = "140";
    public final String antwortwahrweniger12 = "Sie arbeiten seit kurzer Zeit mit Ihrem Lieferanten zusammen. Nutzen Sie die Gelegenheit Ihren Lieferanten " +
            "von Anfang an gut kennenzulernen, um ihn einordnen zu können.";
    public final String antwortwahrmehr12 = "Sie arbeiten mit Ihrem Lieferanten seit über einem Jahr zusammen und haben Ihre Abläufe" +
            " bereits aufeinander abstimmen können. ";
    public final String antwortwahrmehr24 = "Sie arbeiten bereits seit längerer Zeit mit Ihrem Lieferanten zusammen und kennen den Service, " +
            "den Sie bekommen. ";
    public final String antwortwahrmehr36 = "Sie arbeiten langfristig mit Ihrem Lieferanten zusammen. ";
    public final String antwortfalshArbeitsplatz = "  ";
    public String Themenbereich;
    public String InhaltderFrage;
    public String antwortbutton;
    public String antwortnichtwahr;
    FloatingActionButton fab;
    Lieferantthree iq_karfragment;
    FragmentManager fragmentManager;
    DatabaseHelper myDb;
    RadioGroup rgroup;
    RadioButton simpleRadioButton1;
    RadioButton simpleRadioButton2;
    RadioButton simpleRadioButton3;
    RadioButton simpleRadioButton4;
    View root;
    Bundle bundle;
    boolean result1, result;
    String antwortwahr, youdData11, youdData111, h;
    int gewichtung, gew;
    private FragmentActivity myContext;
    private RadioButton radioSexButton;

    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.secondfragmenlieferant, container, false);
        rgroup = (RadioGroup) root.findViewById(R.id.liefer_radiogroup);
        simpleRadioButton1 = (RadioButton) root.findViewById(R.id.lierant_set1);
        simpleRadioButton2 = (RadioButton) root.findViewById(R.id.lierant_set2);
        simpleRadioButton3 = (RadioButton) root.findViewById(R.id.lierant_set3);
        simpleRadioButton4 = (RadioButton) root.findViewById(R.id.lierant_set4);

        bundle = getArguments();

        fab = (FloatingActionButton) root.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // get selected radio button from radioGroup
                int selectedId = rgroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioSexButton = (RadioButton) root.findViewById(selectedId);
                youdData11 = bundle.getString("lief_key1");
                youdData111 = bundle.getString("lief_key11");
                gew = bundle.getInt("lieferGewicht1");

                if (rgroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getMyContext(), "Please select one Button", Toast.LENGTH_SHORT).show();
                } else {
                    h = radioSexButton.getText().toString();
                    if (h.equals("weniger als 12 Monate") || (h.equals("mehr als 12, aber weniger als 24 Monate")) ||
                            (h.equals("mehr als 24, aber weniger als 36 Monate")) || (h.equals("mehr als 36 Monate"))) {
                        Log.d("Button 2 ", "Vorherige RadioButton Auswahl: " + youdData11 + "\t" + "TextFile-Antwort vorherige Fragment:" + "\t" + youdData111 + gew + "aktuelle Auswahl: " + h);
                        radioSexButton.setChecked(true);
                        antwortbutton = h;
                    }

                    if (h.equals("weniger als 12 Monate")) {
                        antwortwahr = antwortwahrweniger12;
                        gewichtung = 0;
                        result1 = myDb.updateAntwortJa1(antwortwahr, Fragennummer);
                        if (result1) {
                            Log.d("Successfully 1", "Updated");
                        } else {
                            Log.d("Failed to Update!", "Failed");
                        }
                    }
                    if (h.equals("mehr als 12, aber weniger als 24 Monate")) {
                        antwortwahr = antwortwahrmehr12;
                        gewichtung = 0;
                        result1 = myDb.updateAntwortJa1(antwortwahr, Fragennummer);
                        if (result1) {
                            Log.d("Successfully 1", "Updated");
                        } else {
                            Log.d("Failed to Update!", "Failed");
                        }
                    }
                    if (h.equals("mehr als 24, aber weniger als 36 Monate")) {
                        antwortwahr = antwortwahrmehr24;
                        gewichtung = 0;
                        result1 = myDb.updateAntwortJa1(antwortwahr, Fragennummer);
                        if (result1) {
                            Log.d("Successfully 1", "Updated");
                        } else {
                            Log.d("Failed to Update!", "Failed");
                        }
                    }
                    if (h.equals("mehr als 36 Monate")) {
                        antwortwahr = antwortwahrmehr36;
                        gewichtung = 0;
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
                    iq_karfragment = new Lieferantthree();
                    bundle = new Bundle();
                    bundle.putString("lief_key1", youdData11);
                    bundle.putString("lief_key11", youdData111);
                    bundle.putString("lief_key2", h);
                    bundle.putString("lief_key22", antwortwahr);
                    bundle.putInt("lieferGewicht1", gew);
                    bundle.putInt("lieferGewicht2", gewichtung);

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