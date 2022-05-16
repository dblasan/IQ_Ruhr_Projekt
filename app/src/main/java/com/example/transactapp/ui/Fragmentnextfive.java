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

public class Fragmentnextfive extends Fragment {

    private FragmentActivity myContext;
    FloatingActionButton fab;
    Fragmentnextseven iq_karfragment;
    FragmentManager fragmentManager;
    public final String Fragennummer = "390";
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
    int gewichtung, gew, gewichtung1, gewichtung2, gewichtung3, gewichtung4;

    String h, youdData14, youdData114, youdData13, youdData113, youdData111, youdData11, youdData12, youdData112, youdData15, youdData115;

    public final String antwortjalicensemanag = "Durch ein vorhandenes Lizenzmanagement ist Ihr Unternehmen in Bezug auf die Übersicht der Arbeitsprozesse gut aufgestellt.  Durch ihr Lizenzmanagement haben Sie einen guten Überblick über vorhandene Softwarelizenzen. So können Sie sicher sein, " +
            "dass sie rechtssicher arbeiten und ihre Kosten optimal ihren tatsächlichen Bedarf an Lizenzen widerspiegeln.";

    public final String antwortneinlicensemanag = "Sie besitzen noch kein Lizenzmanagement. Ein Lizenzmanagement kann Ihrem Unternehmen dabei helfen " +
            "eine Übersicht zu behalten, rechtskonform zu handeln und die Kosten zu senken.";

    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_fragmtestradio5, container, false);
        rgroup = (RadioGroup) root.findViewById(R.id.set_radiogroup5);
        simpleRadioButton1 = (RadioButton) root.findViewById(R.id.two_sets5);
        simpleRadioButton3 = (RadioButton) root.findViewById(R.id.two_set5);
        bundle = getArguments();
        youdData11 = bundle.getString("your_key11");
        youdData111 = bundle.getString("your_key111");
        youdData12 = bundle.getString("your_key12");
        youdData112 = bundle.getString("your_key112");
        youdData13 = bundle.getString("your_key13");
        youdData113 = bundle.getString("your_key113");
        youdData14 = bundle.getString("your_key14");
        youdData114 = bundle.getString("your_key114");
        youdData15 = bundle.getString("your_key15");
        youdData115 = bundle.getString("your_key115");
        gew = bundle.getInt("Gewicht1");
        gewichtung = bundle.getInt("Gewicht2");
        gewichtung1 = bundle.getInt("Gewicht3");
        gewichtung2 = bundle.getInt("Gewicht4");
        gewichtung3 = bundle.getInt("Gewicht5");

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
                        Log.d("Button 3", "vorherige Auswahlen : " + youdData11 + ":" + youdData111 + "\t" + youdData12 + ":" + youdData112 + "\t" + youdData13 + ":" + youdData113 + youdData14 +
                                youdData114 + youdData15 + youdData115 +
                                gew + gewichtung + gewichtung1 + gewichtung2 + gewichtung3 + "\t" + "aktuelle Auswahl: " + h);
                        radioSexButton.setChecked(true);
                        antwortbutton = h;
                    }
                    if (h.equals("ja")) {
                        antwortwahr = antwortjalicensemanag;
                        gewichtung4 = 1;
                        result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                        if (result1) {
                            Log.d("Successfully 1", "Updated");
                        } else {
                            Log.d("Failed to Update!", "Failed");
                        }
                    }
                    if (h.equals("Nein")) {
                        antwortwahr = antwortneinlicensemanag;
                        gewichtung4 = 0;
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

                    TextView tv = (TextView) root.findViewById(R.id.avg_testtv5);
                    tv.setMovementMethod(LinkMovementMethod.getInstance());
                    iq_karfragment = new Fragmentnextseven();
                    bundle = new Bundle();
                    bundle.putString("your_key11", youdData11);
                    bundle.putString("your_key111", youdData111);
                    bundle.putString("your_key12", youdData12);
                    bundle.putString("your_key112", youdData112);
                    bundle.putString("your_key13", youdData13);
                    bundle.putString("your_key113", youdData113);
                    bundle.putString("your_key14", youdData14);
                    bundle.putString("your_key114", youdData114);
                    bundle.putString("your_key15", youdData15);
                    bundle.putString("your_key115", youdData115);
                    bundle.putString("your_key16", h);
                    bundle.putString("your_key116", antwortwahr);
                    bundle.putInt("Gewicht1", gew);
                    bundle.putInt("Gewicht2", gewichtung);
                    bundle.putInt("Gewicht3", gewichtung1);
                    bundle.putInt("Gewicht4", gewichtung2);
                    bundle.putInt("Gewicht5", gewichtung3);
                    bundle.putInt("Gewicht6", gewichtung4);

                    iq_karfragment.setArguments(bundle);
                    fragmentManager = myContext.getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                    fragmentTransaction.commit();
                }
            }
        });
        TextView linkTextView2 = root.findViewById(R.id.header5);
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
