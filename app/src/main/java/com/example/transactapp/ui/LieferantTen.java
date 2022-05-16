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

public class LieferantTen extends Fragment {

    public final String Fragennummer = "390";
    public final String antwortwahrklein = "Da die Auswahl Ihre Lieferanten klein ist, ist es sinnvoll ein gutes Vertrauensverhältnis zu Ihrem Lieferanten aufzubauen," +
            " damit die Abhängigkeit besser zu umgehen ist. ";
    public final String antwortwahrmitell = "Bei einer mittleren Auswahl eines Lieferanten sind sie zwar nicht stark abhängig, dennoch sind " +
            "die Auswahlmöglichkeiten begrenzt.";
    public final String antwortwahrgross = "Bei einer großen Auswahl an Lieferanten ist es sinnvoll einige Lieferanten miteinander zu vergleichen, um das Optimum " +
            "für Ihr Unternehmen zu erreichen. ";
    public String Themenbereich;
    public String InhaltderFrage;
    public String antwortbutton;
    public String antwortnichtwahr;
    FloatingActionButton fab;
    Lieferant11 iq_karfragment;
    FragmentManager fragmentManager;
    DatabaseHelper myDb;
    RadioGroup rgroup;
    RadioButton simpleRadioButton1;
    RadioButton simpleRadioButton2;
    RadioButton simpleRadioButton3;
    View root;
    Bundle bundle;
    boolean result1, result;
    String antwortwahr, youdData1, youdData11, youdData2, youdData22, youdData3,
            youdData4, youdData44, youdData5, youdData55, youdData6, youdData66, youdData7, youdData77,
            youdData8, youdData88, youdData9, youdData99, youdData33, h;
    int gewichtung, gewichtung2, gewichtung3, gewichtung4, gewichtung5, gewichtung6,
            gewichtung7, gewichtung8, gewichtung9, gewichtung10;
    private FragmentActivity myContext;
    private RadioButton radioSexButton;

    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragmenlieferantten, container, false);
        rgroup = (RadioGroup) root.findViewById(R.id.liefer_radiogroup10);
        simpleRadioButton1 = (RadioButton) root.findViewById(R.id.lierant_tenset1);
        simpleRadioButton2 = (RadioButton) root.findViewById(R.id.lierant_tenset2);
        simpleRadioButton3 = (RadioButton) root.findViewById(R.id.lierant_tenset3);

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
                youdData7 = bundle.getString("lief_key7");
                youdData77 = bundle.getString("lief_key77");
                youdData8 = bundle.getString("lief_key8");
                youdData88 = bundle.getString("lief_key88");
                youdData9 = bundle.getString("lief_key9");
                youdData99 = bundle.getString("lief_key99");
                gewichtung = bundle.getInt("lieferGewicht1");
                gewichtung2 = bundle.getInt("lieferGewicht2");
                gewichtung3 = bundle.getInt("lieferGewicht3");
                gewichtung4 = bundle.getInt("lieferGewicht4");
                gewichtung5 = bundle.getInt("lieferGewicht5");
                gewichtung6 = bundle.getInt("lieferGewicht6");
                gewichtung7 = bundle.getInt("lieferGewicht7");
                gewichtung8 = bundle.getInt("lieferGewicht8");
                gewichtung9 = bundle.getInt("lieferGewicht9");
                if (rgroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getMyContext(), "Please select one Button", Toast.LENGTH_SHORT).show();
                } else {
                    h = radioSexButton.getText().toString();
                    if (h.equals("klein") || (h.equals("mittel")) ||
                            (h.equals("groß"))) {
                        Log.d("Button 2 ", "Vorherige RadioButton Auswahl: " + youdData1 + youdData11 + "\t" + youdData2 +
                                youdData22 + youdData3 + youdData33 + youdData4 + youdData44 + youdData5 + youdData55 + youdData6 + youdData66 +
                                youdData7 + youdData77 + youdData8 + youdData88 + youdData9 + youdData99 + gewichtung + gewichtung2 + gewichtung3 + gewichtung4 +
                                gewichtung5 + gewichtung6 + gewichtung7 + gewichtung8 + gewichtung9 + "aktuelle Auswahl: " + h);
                        radioSexButton.setChecked(true);
                        antwortbutton = h;
                    }

                    if (h.equals("klein")) {
                        antwortwahr = antwortwahrklein;
                        gewichtung10 = 0;
                        result1 = myDb.updateAntwortJa1(antwortwahr, Fragennummer);
                        if (result1) {
                            Log.d("Successfully 1", "Updated");
                        } else {
                            Log.d("Failed to Update!", "Failed");
                        }
                    }
                    if (h.equals("mittel")) {
                        antwortwahr = antwortwahrmitell;
                        gewichtung10 = 1;
                        result1 = myDb.updateAntwortJa1(antwortwahr, Fragennummer);
                        if (result1) {
                            Log.d("Successfully 1", "Updated");
                        } else {
                            Log.d("Failed to Update!", "Failed");
                        }
                    }

                    if (h.equals("groß")) {
                        antwortwahr = antwortwahrgross;
                        gewichtung10 = 2;
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

                    TextView tv = (TextView) root.findViewById(R.id.avg_10ttv);
                    tv.setMovementMethod(LinkMovementMethod.getInstance());
                    iq_karfragment = new Lieferant11();
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
                    bundle.putString("lief_key10", h);
                    bundle.putString("lief_key100", antwortwahr);
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
