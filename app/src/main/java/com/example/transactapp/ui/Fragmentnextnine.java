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

public class Fragmentnextnine extends Fragment {

    private FragmentActivity myContext;
    FloatingActionButton fab;
    Fragmentnextten iq_karfragment;
    FragmentManager fragmentManager;
    View root;
    RadioGroup rgroup;
    RadioButton simpleRadioButton1;
    RadioButton simpleRadioButton3;
    public final String Fragennummer = "520";
    public String Themenbereich;
    public String InhaltderFrage;
    public String antwortbutton;
    public String antwortwahr;
    public String antwortnichtwahr;
    private RadioButton radioSexButton;
    DatabaseHelper myDb;
    String h, youdData111, youdData14, youdData13, youdData11, youdData12, youdData15, youdData16, youdData17, youdData18,
            youdData19, youdData112, youdData113, youdData114, youdData115, youdData116, youdData117, youdData118, youdData119,
            youdData20, youdData200;
    Bundle bundle;
    int gewichtung, gew, gewichtung1, gewichtung2, gewichtung3, gewichtung4, gewichtung5, gewichtung6, gewichtung7;

    public final String antwortjaCloudSp = "Sie nutzen die Möglichkeiten der Cloudspeicherung bereits. Je nachdem, welche Daten Sie online speichern, sollten sie diese als Backup auf mindestens einem weiteren " +
            "Datenspeicher in Kopie bevorraten. Achten Sie auf verschlüsselte Übertragungswege.";

    public final String antwortNeinCloudSp = "Eine Nutzung der Cloudspeicherung bietet für Sie Potenziale. Je nachdem, welche Daten Sie online speichern, sollten sie diese als Backup auf mindestens einem weiteren" +
            " Datenspeicher in Kopie bevorraten. Achten Sie auf verschlüsselte Übertragungswege.";
    boolean result1, result;
    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_fragmtestradio9, container, false);
        rgroup = (RadioGroup) root.findViewById(R.id.set_radiogroup9);
        simpleRadioButton1 = (RadioButton) root.findViewById(R.id.two_sets9);
        simpleRadioButton3 = (RadioButton) root.findViewById(R.id.two_set9);
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
        gew = bundle.getInt("Gewicht1");
        gewichtung = bundle.getInt("Gewicht2");
        gewichtung1 = bundle.getInt("Gewicht3");
        gewichtung2 = bundle.getInt("Gewicht4");
        gewichtung3 = bundle.getInt("Gewicht5");
        gewichtung4 = bundle.getInt("Gewicht6");
        gewichtung5 = bundle.getInt("Gewicht7");
        gewichtung6 = bundle.getInt("Gewicht8");

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
                if (h.equals("ja") || (h.equals("Nein"))) {
                    Log.d("Button 3", "vorherige Auswahlen : " + youdData11 + ":" + youdData111 + "\t" + youdData12 + ":" + youdData112 + "\t" + youdData13 + ":" + youdData113 + "\t" + youdData14 + ":" + youdData114 +
                            "\t" + youdData15 + ":" + youdData115 + "\t" + youdData16 + ":" + youdData116 +youdData17 + ":" + youdData117+
                            youdData18 + ":" + youdData118+
                            gew + gewichtung + gewichtung1 + gewichtung2 + gewichtung3 + gewichtung4 + gewichtung5 + gewichtung6 + "\t" + ":" + "\t" + "aktuelle Auswahl: " + h);
                    radioSexButton.setChecked(true);
                    antwortbutton = h;
                }
                if (h.equals("ja")) {
                    antwortwahr = antwortjaCloudSp;
                    gewichtung7 = 1;
                    result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully 1", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                if (h.equals("Nein")) {
                    antwortwahr = antwortNeinCloudSp;
                    gewichtung7 = 0;
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

                TextView tv = (TextView) root.findViewById(R.id.avg_testtv9);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                iq_karfragment = new Fragmentnextten();
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
                bundle.putString("your_key19", h);
                bundle.putString("your_key119", antwortwahr);
                bundle.putInt("Gewicht1", gew);
                bundle.putInt("Gewicht2", gewichtung);
                bundle.putInt("Gewicht3", gewichtung1);
                bundle.putInt("Gewicht4", gewichtung2);
                bundle.putInt("Gewicht5", gewichtung3);
                bundle.putInt("Gewicht6", gewichtung4);
                bundle.putInt("Gewicht7", gewichtung5);
                bundle.putInt("Gewicht8", gewichtung6);
                bundle.putInt("Gewicht9", gewichtung7);

                iq_karfragment.setArguments(bundle);
                fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                fragmentTransaction.commit();
            }}
        });
        TextView linkTextView2 = root.findViewById(R.id.header9);
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
