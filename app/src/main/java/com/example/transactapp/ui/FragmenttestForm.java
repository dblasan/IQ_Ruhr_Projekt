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


public class FragmenttestForm extends Fragment implements RadioGroup.OnCheckedChangeListener {

    private FragmentActivity myContext;
    FloatingActionButton fab;
    FragmentManager fragmentManager;
    View root;
    Fragmentnextone iq_karfragment;
    RadioButton simpleRadioButton;
    RadioButton simpleRadioButton1;
    RadioButton simpleRadioButton2;
    RadioButton simpleRadioButton3;
    RadioGroup rgroup;
    DatabaseHelper myDb;
    public final String  Fragennummer = "120";
    public String Fragetext;
    public String Themenbereich;
    public String InhaltderFrage;
    public String antwortbutton;
    String aus;

    public String getAntwortwahr() {
        return antwortwahr10;
    }

    public final String antwortwahr10 = "Mit einer Unternehmensgröße weniger als 10 Mitarbeitern gehören Sie zu den über drei Millionen Unternehmen dieser Klasse, die einen wichtigen Beitrag zur Wirtschaftsleistung Deutschlands beisteuern. Als produzierender Kleinbetrieb stehen Sie höchstwahrscheinlich in Abhängigkeit zu größeren Unternehmen. Die Globalisierung " +
            " in Zusammenhang mit der digitalen Transformation birgt Gefahren, aber auch Chancen für Sie.";

    public final String antwortwahr50 = "Mit einer Unternehmensgröße von mehr als 10 aber weniger als 50 Mitarbeitern gehören Sie zu den gut 350.000 Unternehmen dieser Klasse, die einen wichtigen Beitrag zur Wirtschaftsleistung Deutschlands beisteuern. Als produzierender Betrieb stehen Sie höchstwahrscheinlich im direkten internationalen Wettbewerb. Die Globalisierung  in " +
            "Zusammenhang mit der digitalen Transformation birgt Gefahren, aber auch Chancen für Sie.";
    public final String antwortwahr250 = "Mit einer Unternehmensgröße von mehr als 50 und weniger als 250 Mitarbeitern gehören Sie in Deutschland zu circa 75.000 Unternehmen dieser Klasse, die einen wichtigen Beitrag zur Wirtschaftsleistung Deutschlands beisteuern.Als produzierender Betrieb stehen Sie höchstwahrscheinlich im direkten internationalen Wettbewerb. Die Globalisierung " +
            " in Zusammenhang mit der digitalen Transformation birgt Gefahren, aber auch Chancen für Sie.";

    public final String antwortwahrgros250 = "Mit einer Unternehmensgröße von mehr als 250 Mitarbeitern gehören Sie in Deutschland zu circa 16.000 Unternehmen dieser Klasse, die einen wichtigen Beitrag zur Wirtschaftsleistung Deutschlands beisteuern. Als produzierender Betrieb stehen Sie höchstwahrscheinlich im direkten internationalen Wettbewerb. Die Globalisierung  " +
            "in Zusammenhang mit der digitalen Transformation birgt Gefahren, aber auch Chancen für Sie.";
    public String antwortnichtwahr;
    public final int gewichtung = 0;
    private RadioButton radioSexButton;
    Bundle bundle;
    String h, antwortwahr, s;
    boolean result1, result;

    public FragmentActivity getMyContext() {
        return myContext;
    }

    public RadioButton getRadioSexButton() {
        return radioSexButton;
    }

    public String getH() {
        return h;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_fragmtestradio, container, false);
        rgroup = (RadioGroup) root.findViewById(R.id.set_radiogroup);
        simpleRadioButton = (RadioButton) root.findViewById(R.id.onse_set);
        simpleRadioButton1 = (RadioButton) root.findViewById(R.id.two_sets);
        simpleRadioButton2 = (RadioButton) root.findViewById(R.id.three_sets);
        simpleRadioButton3 = (RadioButton) root.findViewById(R.id.two_set);
        fab = (FloatingActionButton) root.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("LongLogTag")
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
                if (h.equals("< 10") || (h.equals("< 50"))
                        || (h.equals("< 250")) || h.equals(">= 250")) {
                    Log.d("Button 1 mit Fragenummer " + Fragennummer, "Aktuelle Radiobutton Auswahl: " + h + gewichtung);
                    radioSexButton.setChecked(true);
                    antwortbutton = h;
                }
                if (h.equals("< 10")) {
                    antwortwahr = antwortwahr10;
                    result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully ", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                if (h.equals("< 50")) {
                    antwortwahr = antwortwahr50;
                    result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully 28.02.2022", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                if (h.equals("< 250")) {
                    antwortwahr = antwortwahr250;
                    result1 = myDb.updateAntwortJa(antwortwahr, Fragennummer);
                    if (result1) {
                        Log.d("Successfully 1", "Updated");
                    } else {
                        Log.d("Failed to Update!", "Failed");
                    }
                }
                if (h.equals(">= 250")) {
                    antwortwahr = antwortwahrgros250;
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

                //saveUI();
                TextView tv = (TextView) root.findViewById(R.id.avg_testtv);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                iq_karfragment = new Fragmentnextone();
                bundle = new Bundle();
                bundle.putString("your_key11", h);
                bundle.putString("your_key111", antwortwahr);
                bundle.putInt("Gewicht1", gewichtung);

                iq_karfragment.setArguments(bundle);
                fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                fragmentTransaction.commit();

            }}
        });
        TextView linkTextView2 = root.findViewById(R.id.header);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView2.setTypeface(null, Typeface.BOLD);
        return root;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDb = new DatabaseHelper(myContext.getApplicationContext());
        s = Fragetext = Themenbereich = InhaltderFrage = antwortbutton = antwortnichtwahr = "";
        //gewichtung = 0;
    }

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }

    public void saveUI() {
        simpleRadioButton = (RadioButton) root.findViewById(R.id.onse_set);
        simpleRadioButton1 = (RadioButton) root.findViewById(R.id.two_sets30);
        simpleRadioButton2 = (RadioButton) root.findViewById(R.id.two_set301);
        simpleRadioButton3 = (RadioButton) root.findViewById(R.id.two_set);

        //Fragennummer = "130";
        Themenbereich = "Fragen zum Unternehmen";
        Fragetext = "Zu welchem dieser Bereiche zählt Ihr Unternehmen?";
        InhaltderFrage = "Unternehmensgröße";
        antwortbutton = "< 10";
        antwortwahr = "Mit einer Unternehmensgröße weniger als 10 Mitarbeitern gehören Sie zu den über drei Millionen Unternehmen dieser Klasse, die einen wichtigen Beitrag zur Wirtschaftsleistung Deutschlands beisteuern. Als produzierender Kleinbetrieb stehen Sie höchstwahrscheinlich in Abhängigkeit zu größeren Unternehmen. Die Globalisierung  " +
                "in Zusammenhang mit der digitalen Transformation birgt Gefahren, aber auch Chancen für Sie. ";
        antwortnichtwahr = "keine Antwort";
        //gewichtung = 0;
        result = myDb.saveResult(Fragennummer, Themenbereich, Fragetext, InhaltderFrage, antwortbutton, antwortwahr, antwortnichtwahr, gewichtung);
        if (result) {
            Toast.makeText(myContext.getApplicationContext(), "Successfully saved!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(myContext.getApplicationContext(), "Failed to save!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

    }
}
