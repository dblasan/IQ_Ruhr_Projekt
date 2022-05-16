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

public class Lieferantfive extends Fragment {

    public final String Fragennummer = "260";
    public final String antwortwahrbestllechtzeit = ".";
    public final String antwortfalschbestllechtzeit = "Wenn Sie den Bestell- und Lagerbestandstatus in Echtzeit einsehen können, können Sie flexibel und " +
            "kurzfristig in die Verarbeitungsprozesse eingreifen und Ihre Wünsche einbringen.";
    public String Themenbereich;
    public String InhaltderFrage;
    public String antwortbutton;
    public String antwortnichtwahr;
    FloatingActionButton fab;
    Lieferantsix iq_karfragment;
    FragmentManager fragmentManager;
    DatabaseHelper myDb;
    RadioGroup rgroup;
    RadioButton simpleRadioButton1;
    RadioButton simpleRadioButton2;

    View root;
    Bundle bundle;
    boolean result1, result;
    String antwortwahr, youdData1, youdData11, youdData2, youdData22, youdData3,
            youdData4, youdData44, youdData33, h;
    int gewichtung, gewichtung2, gewichtung3, gewichtung4, gewichtung5;
    private FragmentActivity myContext;
    private RadioButton radioSexButton;

    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragmenlieferantfive, container, false);
        rgroup = (RadioGroup) root.findViewById(R.id.liefer_radiogroup);
        simpleRadioButton1 = (RadioButton) root.findViewById(R.id.lierant_fiveset1);
        simpleRadioButton2 = (RadioButton) root.findViewById(R.id.lierant_fiveset2);
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
                gewichtung = bundle.getInt("lieferGewicht1");
                gewichtung2 = bundle.getInt("lieferGewicht2");
                gewichtung3 = bundle.getInt("lieferGewicht3");
                gewichtung4 = bundle.getInt("lieferGewicht4");
                if (rgroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getMyContext(), "Please select one Button", Toast.LENGTH_SHORT).show();
                } else {
                    h = radioSexButton.getText().toString();
                    if (h.equals("ja") || (h.equals("Nein"))) {
                        Log.d("Button 2 ", "Vorherige RadioButton Auswahl: " + youdData1 + youdData11 + "\t" + youdData2 +
                                youdData22 + youdData3 + youdData33 + youdData4 + youdData44 +
                                gewichtung + gewichtung2 + gewichtung3 + gewichtung4 + "aktuelle Auswahl: " + h);
                        radioSexButton.setChecked(true);
                        antwortbutton = h;
                    }

                    if (h.equals("ja")) {
                        antwortwahr = antwortwahrbestllechtzeit;
                        gewichtung5 = 2;
                        result1 = myDb.updateAntwortJa1(antwortwahr, Fragennummer);
                        if (result1) {
                            Log.d("Successfully 1", "Updated");
                        } else {
                            Log.d("Failed to Update!", "Failed");
                        }
                    }
                    if (h.equals("Nein")) {
                        antwortwahr = antwortfalschbestllechtzeit;
                        gewichtung5 = 0;
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

                    TextView tv = (TextView) root.findViewById(R.id.avg_fivetv);
                    tv.setMovementMethod(LinkMovementMethod.getInstance());
                    iq_karfragment = new Lieferantsix();
                    bundle = new Bundle();
                    bundle.putString("lief_key1", youdData1);
                    bundle.putString("lief_key11", youdData11);
                    bundle.putString("lief_key2", youdData2);
                    bundle.putString("lief_key22", youdData22);
                    bundle.putString("lief_key3", youdData3);
                    bundle.putString("lief_key33", youdData33);
                    bundle.putString("lief_key4", youdData4);
                    bundle.putString("lief_key44", youdData44);
                    bundle.putString("lief_key5", h);
                    bundle.putString("lief_key55", antwortwahr);
                    bundle.putInt("lieferGewicht1", gewichtung);
                    bundle.putInt("lieferGewicht2", gewichtung2);
                    bundle.putInt("lieferGewicht3", gewichtung3);
                    bundle.putInt("lieferGewicht4", gewichtung4);
                    bundle.putInt("lieferGewicht5", gewichtung5);

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
