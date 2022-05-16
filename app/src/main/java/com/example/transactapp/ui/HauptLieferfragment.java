package com.example.transactapp.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

import com.example.transactapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HauptLieferfragment extends Fragment {

    private static final int PERMISSION_REQUEST_CODE = 200;
    private static String FILENAME = "c:/u,sers/lansa/FirstPdf";
    FloatingActionButton fab;
    LieferFragmentMain1 iq_karfragment;
    FragmentManager fragmentManager;
    String antwortwahr, youdData1, youdData11, youdData2, youdData22, youdData3, youdData33,
            youdData4, youdData44, youdData5, youdData55, youdData6, youdData66, youdData7, youdData77,
            youdData8, youdData88, youdData9, youdData99, youdData10, youdData100, youdData111, youdData1111,
            youdData12, youdData112, youdData13, youdData113, youdData14, youdData114, youdData15, youdData115,
            youdData16, youdData116, youdData17, youdData117, youdData18, youdData118, youdData19, youdData119,
            youdData20, youdData200, youdData21, youdData211, h;
    List<String> aktienListe;
    int gewichtung, gewichtung2, gewichtung3, gewichtung4, gewichtung5, gewichtung6,
            gewichtung7, gewichtung8, gewichtung9, gewichtung10, gewichtung11,
            gewichtung12, gewichtung13, gewichtung14, gewichtung15, gewichtung16,
            gewichtung17, gewichtung18, gewichtung19, gewichtung20, gewichtung21;
    Bundle bundle;
    View rootView;
    ArrayAdapter<String> aktienlisteAdapter;
    ListView aktienlisteListView;
    String[] aktienlisteArray;
    int gesamtGew;
    String tx = "Unsere Empfehlungen für Sie:";

    //For the external storage (SD card), use:
    File dir = Environment.getExternalStorageDirectory();
    File gpxfile = new File(dir, "muster.txt");

    private FragmentActivity myContext;

    private static boolean isExternalStorageAvailable() {
        String extStorageState = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(extStorageState)) {
            return true;
        }
        return false;
    }

    private static boolean isExternalStorageReadOnly() {
        String extStorageState = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(extStorageState)) {
            return true;
        }
        return false;
    }

    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        rootView = inflater.inflate(R.layout.hauptlieferfragment, container, false);
        fab = (FloatingActionButton) rootView.findViewById(R.id.fab);

        bundle = getArguments();
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
        youdData10 = bundle.getString("lief_key10");
        youdData100 = bundle.getString("lief_key100");
        youdData111 = bundle.getString("lief_key111");
        youdData1111 = bundle.getString("lief_key1111");
        youdData12 = bundle.getString("lief_key12");
        youdData112 = bundle.getString("lief_key112");
        youdData13 = bundle.getString("lief_key13");
        youdData113 = bundle.getString("lief_key113");
        youdData14 = bundle.getString("lief_key14");
        youdData114 = bundle.getString("lief_key114");
        youdData15 = bundle.getString("lief_key15");
        youdData115 = bundle.getString("lief_key115");
        youdData16 = bundle.getString("lief_key16");
        youdData116 = bundle.getString("lief_key116");
        youdData17 = bundle.getString("lief_key17");
        youdData117 = bundle.getString("lief_key117");
        youdData18 = bundle.getString("lief_key18");
        youdData118 = bundle.getString("lief_key118");
        youdData19 = bundle.getString("lief_key19");
        youdData119 = bundle.getString("lief_key119");
        youdData20 = bundle.getString("lief_key20");
        youdData200 = bundle.getString("lief_key200");
        youdData21 = bundle.getString("lief_key21");
        youdData211 = bundle.getString("lief_key211");

        gewichtung = bundle.getInt("lieferGewicht1");
        gewichtung2 = bundle.getInt("lieferGewicht2");
        gewichtung3 = bundle.getInt("lieferGewicht3");
        gewichtung4 = bundle.getInt("lieferGewicht4");
        gewichtung5 = bundle.getInt("lieferGewicht5");
        gewichtung6 = bundle.getInt("lieferGewicht6");
        gewichtung7 = bundle.getInt("lieferGewicht7");
        gewichtung8 = bundle.getInt("lieferGewicht8");
        gewichtung9 = bundle.getInt("lieferGewicht9");
        gewichtung10 = bundle.getInt("lieferGewicht10");
        gewichtung11 = bundle.getInt("lieferGewicht11");
        gewichtung12 = bundle.getInt("lieferGewicht12");
        gewichtung13 = bundle.getInt("lieferGewicht13");
        gewichtung14 = bundle.getInt("lieferGewicht14");
        gewichtung15 = bundle.getInt("lieferGewicht15");
        gewichtung16 = bundle.getInt("lieferGewicht16");
        gewichtung17 = bundle.getInt("lieferGewicht17");
        gewichtung18 = bundle.getInt("lieferGewicht18");
        gewichtung19 = bundle.getInt("lieferGewicht19");
        gewichtung20 = bundle.getInt("lieferGewicht20");
        gewichtung21 = bundle.getInt("lieferGewicht21");

        Log.d("Button 3", "vorherige Auswahlen : " + youdData1 + ":" + youdData11 + "\t" + youdData2 + ":" + youdData22 + "\t" + youdData3 + ":" + youdData33 + "\t" + youdData4 + ":" + youdData44 +
                "\t" + youdData5 + ":" + youdData55 + "\t" + youdData6 + ":" + youdData66 + "\t" +
                youdData7 + ":" + youdData77 + youdData8 + ":" + youdData88 + youdData9 + ":" + youdData99 +
                youdData10 + ":" + youdData100 + youdData111 + ":" + youdData1111 + youdData12 + ":" + youdData112 +
                youdData13 + ":" + youdData113 + youdData14 + ":" + youdData114 + youdData15 + ":" + youdData115 +
                youdData16 + ":" + youdData116 + youdData17 + ":" + youdData117 + youdData18 + ":" + youdData118 +
                youdData19 + ":" + youdData119 + youdData20 + ":" + youdData200 + youdData21 + ":" + youdData211
                + gewichtung + gewichtung2 + gewichtung3 + gewichtung4 + gewichtung5 + gewichtung6 +
                gewichtung7 + gewichtung8 + gewichtung9 + gewichtung10 + gewichtung11 +
                gewichtung12 + gewichtung13 + gewichtung14 + gewichtung15 + gewichtung16 + gewichtung17 + gewichtung18 +
                gewichtung19 + gewichtung20 + gewichtung21 + "\t" + "aktuelle Auswahl: ");

        aktienlisteArray = new String[]{tx + "\n" + "\n" + youdData11 + "\n" + "\n" + youdData22 + "\n" + "\n" + youdData33 + "\n" + "\n" + youdData44 + "\n" + "\n" + youdData55 +
                "\n" + "\n" + youdData66 + "\n" + "\n" + youdData77 + "\n" + "\n" + youdData88 + "\n" + "\n" + youdData99 + "\n" + "\n" + youdData100 + "\n" + "\n" + youdData1111 + "\n" + "\n"
                + youdData112 + "\n" + "\n" + youdData113 + "\n" + "\n" + youdData114 + "\n" + "\n" + youdData115 + "\n" + "\n" + youdData116 +
                "\n" + "\n" + youdData117 + "\n" + "\n" + youdData118 + "\n" + "\n" + youdData119 + "\n" + "\n" + youdData200 + "\n" + "\n" + youdData211};

        Log.d("Gewichtung", "Ausgabe: " + "\t" + gewichtung + "\t" + gewichtung2 + "\t" + gewichtung3 + "\t" +
                gewichtung4 + "\t" + gewichtung5 + "\t" + gewichtung6 + "\t" +
                gewichtung7 + "\t" + gewichtung8 + "\t" + gewichtung9 + "\t" + gewichtung10 + "\t" + gewichtung11 + "\t" +
                gewichtung12 + "\t" + gewichtung13 + "\t" + gewichtung14 + "\t" + gewichtung15 + "\t" + gewichtung16 + "\t" +
                gewichtung17 + "\t" + gewichtung18 + "\t" + gewichtung19 + "\t" + gewichtung20 + "\t" + gewichtung21);

        gesamtGew = gewichtung + gewichtung2 + gewichtung3 + gewichtung4 + gewichtung5 + gewichtung6 + gewichtung7 +
                gewichtung8 + gewichtung9 + gewichtung10 + gewichtung11 + gewichtung12 + gewichtung13 + gewichtung14 +
                gewichtung15 + gewichtung16 + gewichtung17 + gewichtung18 + gewichtung19 + gewichtung20 + gewichtung21;
        Log.d("Gesamtgewichtung", "Ausgabe: " + gesamtGew);

        aktienListe = new ArrayList<>(Arrays.asList(aktienlisteArray));
        aktienlisteAdapter = new ArrayAdapter<>(
                getActivity(), // Die aktuelle Umgebung (diese Activity)
                R.layout.list_item_aktienliste, // ID der XML-Layout Datei
                R.id.list_item_aktienliste_textview, // ID des TextViews
                aktienListe); // Beispieldaten in einer ArrayList
        aktienlisteListView = (ListView) rootView.findViewById(R.id.listview_aktienliste);

        fab.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (checkPermission()) {
                    Toast.makeText(getMyContext(), "Permission Granted", Toast.LENGTH_SHORT).show();
                    writeToFile();
                    readFromFile();

                } else {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                        requestPermission();
                    }
                }
                iq_karfragment = new LieferFragmentMain1();
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
                bundle.putString("lief_key10", youdData10);
                bundle.putString("lief_key100", youdData100);
                bundle.putString("lief_key111", youdData111);
                bundle.putString("lief_key1111", youdData1111);
                bundle.putString("lief_key12", youdData12);
                bundle.putString("lief_key112", youdData112);
                bundle.putString("lief_key13", youdData13);
                bundle.putString("lief_key113", youdData113);
                bundle.putString("lief_key14", youdData14);
                bundle.putString("lief_key114", youdData114);
                bundle.putString("lief_key15", youdData15);
                bundle.putString("lief_key115", youdData115);
                bundle.putString("lief_key16", youdData16);
                bundle.putString("lief_key116", youdData116);
                bundle.putString("lief_key17", youdData17);
                bundle.putString("lief_key117", youdData117);
                bundle.putString("lief_key18", youdData18);
                bundle.putString("lief_key118", youdData118);
                bundle.putString("lief_key19", youdData19);
                bundle.putString("lief_key119", youdData119);
                bundle.putString("lief_key20", youdData20);
                bundle.putString("lief_key200", youdData200);
                bundle.putString("lief_key21", h);
                bundle.putString("lief_key211", antwortwahr);

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
                bundle.putInt("lieferGewicht11", gewichtung11);
                bundle.putInt("lieferGewicht12", gewichtung12);
                bundle.putInt("lieferGewicht13", gewichtung13);
                bundle.putInt("lieferGewicht14", gewichtung14);
                bundle.putInt("lieferGewicht15", gewichtung15);
                bundle.putInt("lieferGewicht16", gewichtung16);
                bundle.putInt("lieferGewicht17", gewichtung17);
                bundle.putInt("lieferGewicht18", gewichtung18);
                bundle.putInt("lieferGewicht19", gewichtung19);
                bundle.putInt("lieferGewicht20", gewichtung20);
                bundle.putInt("lieferGewicht21", gewichtung21);
                bundle.putInt("LiefekeyGes", gesamtGew);

                iq_karfragment.setArguments(bundle);
                fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                fragmentTransaction.commit();

            }
        });

        aktienlisteListView.setAdapter(aktienlisteAdapter);

        return rootView;
    }

    private boolean checkPermission() {
        // checking of permissions.
        int permission1 = ContextCompat.checkSelfPermission(myContext.getApplicationContext(), WRITE_EXTERNAL_STORAGE);
        int permission2 = ContextCompat.checkSelfPermission(myContext.getApplicationContext(), READ_EXTERNAL_STORAGE);
        return permission1 == PackageManager.PERMISSION_GRANTED && permission2 == PackageManager.PERMISSION_GRANTED;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void requestPermission() {
        // requesting permissions if not provided.
        ActivityCompat.requestPermissions(requireActivity(), new String[]{WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0) {

                // after requesting permissions we are showing
                // users a toast message of permission granted.
                boolean writeStorage = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                boolean readStorage = grantResults[1] == PackageManager.PERMISSION_GRANTED;

                if (writeStorage && readStorage) {
                    Toast.makeText(getMyContext(), "Permission Granted..", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getMyContext(), "Permission Deniened.", Toast.LENGTH_SHORT).show();
                    myContext.finish();
                }
            }
        }
    }

    public void writeToFile() {

        try {
            FileWriter writer = null;
            for (String str : aktienListe) {
                writer = new FileWriter(gpxfile);
                writer.write(str);
                writer.close();

            }
            Toast.makeText(getMyContext(), "Saved your text", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    private void readFromFile() {
        gpxfile = new File(dir, "muster.txt");
        String ret = "";

        try {

                BufferedReader bufferedReader = new BufferedReader(new FileReader(gpxfile));
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();

                while ((receiveString = bufferedReader.readLine()) != null) {
                    stringBuilder.append("\n").append(receiveString);
                }

                ret = stringBuilder.toString();
            } catch (IOException ex) {
            ex.printStackTrace();
        }

        Log.d("Gesamtgewichtung", "Ausgabe: " + ret);
    }

    public String readFile() {

        StringBuilder text = new StringBuilder();
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(gpxfile));
            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
        String result = text.toString();
        return result;

    }

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }

}
