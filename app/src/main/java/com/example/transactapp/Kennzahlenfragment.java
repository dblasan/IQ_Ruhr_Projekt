package com.example.transactapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.math.RoundingMode;
import java.text.DecimalFormat;


public class Kennzahlenfragment extends Fragment implements View.OnClickListener {

    FloatingActionButton fab, fab1, fab2, fab3, fab4, fab5, fab6, fab7, fab8, fab9, fab66, fab11;
    View root;
    TextView textview, linkTextView2, textview2, textview3, textview4, textview5, textview55, textview6, textview7, textview8, textview9;
    EditText edit, edit2, edit3, edit4, edit5, edit6, edit7,
            edit8, edit9, edit10, edit11, edit12, edit13, edit14, edit15, edit16, edit17, edit18, edit19, edit100, edit111, edit20;
    private FragmentActivity myContext;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.first_kennzahlen, container, false);
        linkTextView2 = root.findViewById(R.id.headKennzahl);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView2.setTypeface(null, Typeface.BOLD);
        textview = root.findViewById(R.id.textView2);
        textview.setMovementMethod(LinkMovementMethod.getInstance());
        textview.setTypeface(null, Typeface.BOLD);
        textview2 = root.findViewById(R.id.textView3);
        textview2.setMovementMethod(LinkMovementMethod.getInstance());
        textview2.setTypeface(null, Typeface.BOLD);
        textview3 = root.findViewById(R.id.textView4);
        textview3.setMovementMethod(LinkMovementMethod.getInstance());
        textview3.setTypeface(null, Typeface.BOLD);
        textview4 = root.findViewById(R.id.textView5);
        textview4.setMovementMethod(LinkMovementMethod.getInstance());
        textview4.setTypeface(null, Typeface.BOLD);
        textview5 = root.findViewById(R.id.textView6);
        textview5.setMovementMethod(LinkMovementMethod.getInstance());
        textview5.setTypeface(null, Typeface.BOLD);
        textview55 = root.findViewById(R.id.textView55);
        textview55.setMovementMethod(LinkMovementMethod.getInstance());
        textview55.setTypeface(null, Typeface.BOLD);
        textview6 = root.findViewById(R.id.textView7);
        textview6.setMovementMethod(LinkMovementMethod.getInstance());
        textview6.setTypeface(null, Typeface.BOLD);
        textview7 = root.findViewById(R.id.textView8);
        textview7.setMovementMethod(LinkMovementMethod.getInstance());
        textview7.setTypeface(null, Typeface.BOLD);
        textview8 = root.findViewById(R.id.textView9);
        textview8.setMovementMethod(LinkMovementMethod.getInstance());
        textview8.setTypeface(null, Typeface.BOLD);
        textview9 = root.findViewById(R.id.textView10);
        textview9.setMovementMethod(LinkMovementMethod.getInstance());
        textview9.setTypeface(null, Typeface.BOLD);
        edit = root.findViewById(R.id.editTextTextPersonName2);
        edit2 = root.findViewById(R.id.editTextTextPersonName3);
        edit3 = root.findViewById(R.id.editTextTextPersonName);
        edit4 = root.findViewById(R.id.editTextTextPersonNameone);
        edit5 = root.findViewById(R.id.editTextTextPersonName4);
        edit6 = root.findViewById(R.id.editTextTextPersonName5);
        edit100 = root.findViewById(R.id.editTextTextPersonName100);
        edit111 = root.findViewById(R.id.editTextTextPersonName111);
        edit7 = root.findViewById(R.id.editTextTextPersonName6);
        edit8 = root.findViewById(R.id.editTextTextPersonName7);
        edit9 = root.findViewById(R.id.editTextTextPersonName8);
        edit10 = root.findViewById(R.id.editTextTextPersonName9);
        edit11 = root.findViewById(R.id.editTextTextPersonName10);
        edit12 = root.findViewById(R.id.editTextTextPersonName11);
        edit13 = root.findViewById(R.id.editTextTextPersonName12);
        edit14 = root.findViewById(R.id.editTextTextPersonName13);
        edit15 = root.findViewById(R.id.editTextTextPersonName14);
        edit16 = root.findViewById(R.id.editTextTextPersonName15);
        edit17 = root.findViewById(R.id.editTextTextPersonName16);
        edit18 = root.findViewById(R.id.editTextTextPersonName17);
        edit19 = root.findViewById(R.id.editTextTextPersonName18);
        edit20 = root.findViewById(R.id.editTextTextPersonName19);

        fab = (FloatingActionButton) root.findViewById(R.id.floatingActionButton);
        fab1 = (FloatingActionButton) root.findViewById(R.id.floatingActionButton1);
        fab2 = (FloatingActionButton) root.findViewById(R.id.floatingActionButton3);
        fab3 = (FloatingActionButton) root.findViewById(R.id.floatingActionButton4);
        fab4 = (FloatingActionButton) root.findViewById(R.id.floatingActionButton5);
        fab5 = (FloatingActionButton) root.findViewById(R.id.floatingActionButton6);
        fab66 = (FloatingActionButton) root.findViewById(R.id.floatingActionButton66);
        fab6 = (FloatingActionButton) root.findViewById(R.id.floatingActionButton7);
        fab7 = (FloatingActionButton) root.findViewById(R.id.floatingActionButton8);
        fab8 = (FloatingActionButton) root.findViewById(R.id.floatingActionButton9);
        fab9 = (FloatingActionButton) root.findViewById(R.id.floatingActionButton10);
        fab.setOnClickListener(this);
        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);
        fab3.setOnClickListener(this);
        fab4.setOnClickListener(this);
        fab5.setOnClickListener(this);
        fab6.setOnClickListener(this);
        fab66.setOnClickListener(this);
        fab7.setOnClickListener(this);
        fab8.setOnClickListener(this);
        fab9.setOnClickListener(this);

        return root;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }

    public double BerechneKennzahlen() {
        String a = edit.getText().toString();
        String b = edit2.getText().toString();
        double industrie_40 = 0.0;
        if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(b)) {
            double n = Double.parseDouble(a);
            double s = Double.parseDouble(b);
            industrie_40 = (n / s) * 100;
            System.out.println("double : " + df.format(industrie_40));
            df.setRoundingMode(RoundingMode.HALF_EVEN);
            linkTextView2.setText("Industrie 4.0-Kompetenz : " + df.format(industrie_40));
        } else {
            Toast.makeText(getMyContext(), "Sie müssen einer Zahl eingeben", Toast.LENGTH_SHORT).show();
        }
        return industrie_40;
    }

    public double BerechneKennzahlen1() {
        String c = edit3.getText().toString();
        String d = edit4.getText().toString();
        double big_Data_Integra = 0.0;
        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(d)) {
            double m = Double.parseDouble(c);
            double o = Double.parseDouble(d);
            big_Data_Integra = (m / o) * 100;
            System.out.println("Big Data-Integration:" + String.format("%.2f", big_Data_Integra));
            textview.setText("Big Data-Integration: " + String.format("%.2f", big_Data_Integra));
        } else {
            Toast.makeText(getMyContext(), "Sie müssen einer Zahl eingeben", Toast.LENGTH_SHORT).show();
        }
        return big_Data_Integra;
    }

    public double BerechneKennzahlen2() {
        String e = edit5.getText().toString();
        String f = edit6.getText().toString();
        double IT_Auf_geschlossenhe = 0.0;
        if (!TextUtils.isEmpty(e) && !TextUtils.isEmpty(f)) {
            double se = Double.parseDouble(e);
            double sw = Double.parseDouble(f);
            IT_Auf_geschlossenhe = (1 - (se / sw)) * 100;
            System.out.println("IT-Auf geschlossenheit:" + String.format("%.2f", IT_Auf_geschlossenhe));
            textview2.setText("IT-Auf geschlossenheit: " + String.format("%.2f", IT_Auf_geschlossenhe));
        } else {
            Toast.makeText(getMyContext(), "Sie müssen einer Zahl eingeben", Toast.LENGTH_SHORT).show();
        }
        return IT_Auf_geschlossenhe;
    }

    public double BerechneKennzahlen3() {
        String g = edit7.getText().toString();
        String h = edit8.getText().toString();
        double it_aufgeschlossenheit = 0.0;
        if (!TextUtils.isEmpty(g) && !TextUtils.isEmpty(h)) {
            double sq = Double.parseDouble(g);
            double tr = Double.parseDouble(h);
            it_aufgeschlossenheit = (sq / tr) * 100;
            System.out.println("Strategische Bedeutung:" + String.format("%.2f", it_aufgeschlossenheit));
            textview3.setText("Strategische Bedeutung der IT in der Produktion: " + String.format("%.2f", it_aufgeschlossenheit));
        } else {
            Toast.makeText(getMyContext(), "Sie müssen einer Zahl eingeben", Toast.LENGTH_SHORT).show();
        }
        return it_aufgeschlossenheit;
    }

    public double BerechneKennzahlen4() {
        String i = edit9.getText().toString();
        String j = edit10.getText().toString();
        double it_aufgeschlossenheit = 0.0;
        if (!TextUtils.isEmpty(i) && !TextUtils.isEmpty(j)) {
            double er = Double.parseDouble(i);
            double qw = Double.parseDouble(j);
            it_aufgeschlossenheit = (er / qw) * 100;
            System.out.println("Industrie 4.0 Innovationsstärke 4.0 :" + String.format("%.2f", it_aufgeschlossenheit));
            textview4.setText("Industrie 4.0 Innovationsstärke: " + String.format("%.2f", it_aufgeschlossenheit));
        } else {
            Toast.makeText(getMyContext(), "Sie müssen einer Zahl eingeben", Toast.LENGTH_SHORT).show();
        }
        return it_aufgeschlossenheit;
    }

    public double BerechneKennzahlen5() {
        String k = edit11.getText().toString();
        String l = edit12.getText().toString();
        double it_aufgeschlossenheit = 0.0;
        if (!TextUtils.isEmpty(k) && !TextUtils.isEmpty(l)) {
            double er = Double.parseDouble(k);
            double qw = Double.parseDouble(l);
            it_aufgeschlossenheit = (er / qw) * 100;
            System.out.println("Cloud-Computing-Integration :" + String.format("%.2f", it_aufgeschlossenheit));
            textview5.setText("Cloud-Computing-Integration: " + String.format("%.2f", it_aufgeschlossenheit));
        } else {
            Toast.makeText(getMyContext(), "Sie müssen einer Zahl eingeben", Toast.LENGTH_SHORT).show();
        }
        return it_aufgeschlossenheit;
    }
    public double BerechneKennzahlen6() {
        String k = edit13.getText().toString();
        String l = edit14.getText().toString();
        double zeiteffiz = 0.0;
        if (!TextUtils.isEmpty(k) && !TextUtils.isEmpty(l)) {
            double er = Double.parseDouble(k);
            double qw = Double.parseDouble(l);
            zeiteffiz = (1 - (er / qw)) * 100;
            System.out.println("Zeiteffizienz: " + String.format("%.2f", zeiteffiz));
            textview6.setText("Zeiteffizienz [%]: " + String.format("%.2f", zeiteffiz));
        } else {
            Toast.makeText(getMyContext(), "Sie müssen einer Zahl eingeben", Toast.LENGTH_SHORT).show();
        }
        return zeiteffiz;
    }
    public double BerechneKennzahlen7() {
        String k = edit15.getText().toString();
        String l = edit16.getText().toString();
        double finanzerfolg = 0.0;
        if (!TextUtils.isEmpty(k) && !TextUtils.isEmpty(l)) {
            double er = Double.parseDouble(k);
            double qw = Double.parseDouble(l);
            finanzerfolg = (er / qw) * 100;
            System.out.println("Finanzieller Erfolg [%]: " + String.format("%.2f", finanzerfolg));
            textview7.setText("Finanzieller Erfolg [%]: " + String.format("%.2f", finanzerfolg));
        } else {
            Toast.makeText(getMyContext(), "Sie müssen einer Zahl eingeben", Toast.LENGTH_SHORT).show();
        }
        return finanzerfolg;
    }
    public double BerechneKennzahlen8() {
        String k = edit17.getText().toString();
        String l = edit18.getText().toString();
        double kundenerfolg = 0.0;
        if (!TextUtils.isEmpty(k) && !TextUtils.isEmpty(l)) {
            double er = Double.parseDouble(k);
            double qw = Double.parseDouble(l);
            kundenerfolg = (er / qw) * 100;
            System.out.println("Kundenerfolg [%]: " + String.format("%.2f", kundenerfolg));
            textview8.setText("Kundenerfolg [%]: " + String.format("%.2f", kundenerfolg));
        } else {
            Toast.makeText(getMyContext(), "Sie müssen einer Zahl eingeben", Toast.LENGTH_SHORT).show();
        }
        return kundenerfolg;
    }
    public double BerechneKennzahlen9() {
        String k = edit19.getText().toString();
        String l = edit20.getText().toString();
        double Prozesskosteneffizienz = 0.0;
        if (!TextUtils.isEmpty(k) && !TextUtils.isEmpty(l)) {
            double er = Double.parseDouble(k);
            double qw = Double.parseDouble(l);
            Prozesskosteneffizienz = (er / qw) * 100;
            System.out.println("Prozesskosteneffizienz [%]: " + String.format("%.2f", Prozesskosteneffizienz));
            textview9.setText("Prozesskosteneffizienz [%]: " + String.format("%.2f", Prozesskosteneffizienz));
        } else {
            Toast.makeText(getMyContext(), "Sie müssen einer Zahl eingeben", Toast.LENGTH_SHORT).show();
        }
        return Prozesskosteneffizienz;
    }

    public double BerechneKennzahlen10() {
        String k = edit100.getText().toString();
        String l = edit111.getText().toString();
        double Prozesskosteneffizienz = 0.0;
        if (!TextUtils.isEmpty(k) && !TextUtils.isEmpty(l)) {
            double er = Double.parseDouble(k);
            double qw = Double.parseDouble(l);
            Prozesskosteneffizienz = ((er / qw) - 1) * 100;
            System.out.println("Bedeutung neuer IT-Technologien [%]: " + String.format("%.2f", Prozesskosteneffizienz));
            textview55.setText("Bedeutung neuer IT-Technologien [%]: " + String.format("%.2f", Prozesskosteneffizienz));
        } else {
            Toast.makeText(getMyContext(), "Sie müssen einer Zahl eingeben", Toast.LENGTH_SHORT).show();
        }
        return Prozesskosteneffizienz;
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.floatingActionButton) {
            System.out.println("Industrie 4.0 :" + BerechneKennzahlen());
        }
        if (v.getId() == R.id.floatingActionButton1) {
            System.out.println("Big Data-Integration:" + BerechneKennzahlen1());
        }
        if (v.getId() == R.id.floatingActionButton3) {
            System.out.println("IT-Auf geschlossenheit:" + BerechneKennzahlen2());
        }
        if (v.getId() == R.id.floatingActionButton4) {
            System.out.println("Strategische Bedeutung der IT in der Produktion:" + BerechneKennzahlen3());
        }
        if (v.getId() == R.id.floatingActionButton5) {
            System.out.println("Industrie 4.0 Innovationsstärke:" + BerechneKennzahlen4());
        }
        if (v.getId() == R.id.floatingActionButton6) {
            System.out.println("Cloud-Computing-Integration:" + BerechneKennzahlen5());
        }
        if (v.getId() == R.id.floatingActionButton7) {
            System.out.println("Zeiteffizienz:" + BerechneKennzahlen6());
        }
        if (v.getId() == R.id.floatingActionButton8) {
            System.out.println("Finanzieller Erfolg [%]:" + BerechneKennzahlen7());
        }
        if (v.getId() == R.id.floatingActionButton9) {
            System.out.println("Kundenerfolg [%]:" + BerechneKennzahlen8());
        }
        if (v.getId() == R.id.floatingActionButton10) {
            System.out.println("Prozesskosteneffizienz [%]:" + BerechneKennzahlen9());
        }
        if (v.getId() == R.id.floatingActionButton66) {
            System.out.println("Bedeutung neuer IT-Tech [%]:" + BerechneKennzahlen10());
        }
    }
}
