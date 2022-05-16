package com.example.transactapp.ui;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.fonts.Font;
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

import com.example.transactapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class FragmentMain extends Fragment {

    private static final int STORAGE_CODE = 1000;
    private static final int PERMISSION_CODE = 1000;
    FloatingActionButton fab;
    FragmentMain1 iq_karfragment;
    FragmentManager fragmentManager;
    String antwortwahr, h, youdData14, youdData13, youdData11, youdData12, youdData15, youdData16,
            youdData17, youdData18, youdData19, youdData20, youdData21, youdData22, youdData23, youdData24,
            youdData111, youdData25, youdData26, youdData112, youdData113, youdData114, youdData115, youdData116,
            youdData117, youdData118, youdData119, youdData200, youdData211, youdData222, youdData233,
            youdData244, youdData255, youdData266, youdData27, youdData277, youdData28, youdData288,
            youdData299, youdData30, youdData29, youdData300, youdData31, youdData311, youdData32,
            youdData322, youdData33, youdData333, youdData34, youdData344, youdData35,
            youdData355, youdData36, youdData366, youdData37, youdData377, youdData38, youdData388,
            youdData39, youdData399, youdData40, youdData400, youdData41, youdData411;
    List<String> aktienListe;
    int gewichtung, gew, gewichtung1, gewichtung2, gewichtung3, gewichtung4, gewichtung5, gewichtung6, gewichtung7,
            gewichtung8, gewichtung9, gewichtung10, gewichtung11, gewichtung12, gewichtung13, gewichtung14, gewichtung15,
            gewichtung16, gewichtung17, gewichtung18, gewichtung19, gewichtung20, gewichtung21, gewichtung22,
            gewichtung23, gewichtung24, gewichtung25, gewichtung26, gewichtung27, gewichtung28, gewichtung29;
    Bundle bundle;
    View rootView;
    ArrayAdapter<String> aktienlisteAdapter;
    ListView aktienlisteListView;
    String[] aktienlisteArray;
    int gesamtGew;
    String txt = "UNSERE EMPFEHLUNG FÜR SIE:";
    private FragmentActivity myContext;
    private static final int PERMISSION_REQUEST_CODE = 200;
    private File dir;
    private File file;

    public FragmentActivity getMyContext() {
        return myContext;
    }

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        fab = (FloatingActionButton) rootView.findViewById(R.id.fabi);

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
        youdData19 = bundle.getString("your_key19");
        youdData119 = bundle.getString("your_key119");
        youdData20 = bundle.getString("your_key20");
        youdData200 = bundle.getString("your_key200");
        youdData21 = bundle.getString("your_key21");
        youdData211 = bundle.getString("your_key211");
        youdData22 = bundle.getString("your_key22");
        youdData222 = bundle.getString("your_key222");
        youdData23 = bundle.getString("your_key23");
        youdData233 = bundle.getString("your_key233");
        youdData24 = bundle.getString("your_key24");
        youdData244 = bundle.getString("your_key244");
        youdData25 = bundle.getString("your_key25");
        youdData255 = bundle.getString("your_key255");
        youdData26 = bundle.getString("your_key26");
        youdData266 = bundle.getString("your_key266");
        youdData27 = bundle.getString("your_key27");
        youdData277 = bundle.getString("your_key277");
        youdData28 = bundle.getString("your_key28");
        youdData288 = bundle.getString("your_key288");
        youdData29 = bundle.getString("your_key29");
        youdData299 = bundle.getString("your_key299");
        youdData30 = bundle.getString("your_key30");
        youdData300 = bundle.getString("your_key300");
        youdData31 = bundle.getString("your_key31");
        youdData311 = bundle.getString("your_key311");
        youdData32 = bundle.getString("your_key32");
        youdData322 = bundle.getString("your_key322");
        youdData33 = bundle.getString("your_key33");
        youdData333 = bundle.getString("your_key333");
        youdData34 = bundle.getString("your_key34");
        youdData344 = bundle.getString("your_key344");
        youdData35 = bundle.getString("your_key35");
        youdData355 = bundle.getString("your_key355");
        youdData36 = bundle.getString("your_key36");
        youdData366 = bundle.getString("your_key366");
        youdData37 = bundle.getString("your_key37");
        youdData377 = bundle.getString("your_key377");
        youdData38 = bundle.getString("your_key38");
        youdData388 = bundle.getString("your_key388");
        youdData39 = bundle.getString("your_key39");
        youdData399 = bundle.getString("your_key399");
        youdData40 = bundle.getString("your_key40");
        youdData400 = bundle.getString("your_key400");
        youdData41 = bundle.getString("your_key41");
        youdData411 = bundle.getString("your_key411");

        gew = bundle.getInt("Gewicht1");
        gewichtung = bundle.getInt("Gewicht2");
        gewichtung1 = bundle.getInt("Gewicht3");
        gewichtung2 = bundle.getInt("Gewicht4");
        gewichtung3 = bundle.getInt("Gewicht5");
        gewichtung4 = bundle.getInt("Gewicht6");
        gewichtung5 = bundle.getInt("Gewicht7");
        gewichtung6 = bundle.getInt("Gewicht8");
        gewichtung7 = bundle.getInt("Gewicht9");
        gewichtung8 = bundle.getInt("Gewicht10");
        gewichtung9 = bundle.getInt("Gewicht11");
        gewichtung10 = bundle.getInt("Gewicht12");
        gewichtung11 = bundle.getInt("Gewicht13");
        gewichtung12 = bundle.getInt("Gewicht14");
        gewichtung13 = bundle.getInt("Gewicht15");
        gewichtung14 = bundle.getInt("Gewicht16");
        gewichtung15 = bundle.getInt("Gewicht17");
        gewichtung16 = bundle.getInt("Gewicht18");
        gewichtung17 = bundle.getInt("Gewicht19");
        gewichtung18 = bundle.getInt("Gewicht20");
        gewichtung19 = bundle.getInt("Gewicht21");
        gewichtung20 = bundle.getInt("Gewicht22");
        gewichtung21 = bundle.getInt("Gewicht23");
        gewichtung22 = bundle.getInt("Gewicht24");
        gewichtung23 = bundle.getInt("Gewicht25");
        gewichtung24 = bundle.getInt("Gewicht26");
        gewichtung25 = bundle.getInt("Gewicht27");
        gewichtung26 = bundle.getInt("Gewicht28");
        gewichtung27 = bundle.getInt("Gewicht29");
        gewichtung28 = bundle.getInt("Gewicht30");
        gewichtung29 = bundle.getInt("Gewicht31");

        Log.d("Button 3", "vorherige Auswahlen : " + youdData11 + ":" + youdData111 + "\t" + youdData12 + ":" + youdData112 + "\t" + youdData13 + ":" + youdData113 + "\t" + youdData14 + ":" + youdData114 +
                "\t" + youdData15 + ":" + youdData115 + "\t" + youdData16 + ":" + youdData116 + "\t" +
                youdData17 + ":" + youdData117 + youdData18 + ":" + youdData118 + youdData19 + ":" + youdData119 +
                youdData20 + ":" + youdData200 + youdData21 + ":" + youdData211 + youdData22 + ":" + youdData222 +
                youdData23 + ":" + youdData233 + youdData24 + ":" + youdData244 + youdData25 + ":" + youdData255 +
                youdData26 + ":" + youdData266 + youdData27 + ":" + youdData277 + youdData28 + ":" + youdData288 +
                youdData29 + ":" + youdData299 + youdData30 + ":" + youdData300 + youdData31 + ":" + youdData311 +
                youdData32 + ":" + youdData322 + youdData33 + ":" + youdData333 + youdData34 + ":" + youdData344 +
                youdData35 + ":" + youdData355 + youdData36 + ":" + youdData366 + youdData37 + ":" + youdData377 +
                youdData38 + ":" + youdData388 + youdData39 + ":" + youdData399 + youdData40 + ":" + youdData400 +
                youdData41 + ":" + youdData411 + gew + gewichtung + gewichtung1 + gewichtung2 + gewichtung3 + gewichtung4 + gewichtung5 + gewichtung6 +
                gewichtung7 + gewichtung8 + gewichtung9 + gewichtung10 + gewichtung11 +
                gewichtung12 + gewichtung13 + gewichtung14 + gewichtung15 + gewichtung16 + gewichtung17 + gewichtung18 +
                gewichtung19 + gewichtung20 + gewichtung21 + gewichtung22 + gewichtung23 + gewichtung24 +
                gewichtung25 + gewichtung26 + gewichtung27 + gewichtung28 + gewichtung29 + "\t" + "aktuelle Auswahl: ");

        aktienlisteArray = new String[]{txt + "\n" + "\n" + youdData111 + "\n" + "\n" + youdData112 + "\n" + "\n" + youdData113 + "\n" + "\n" +
                youdData114 + "\n" + "\n" + youdData115 + "\n" + "\n" + youdData116 + "\n" + "\n" + youdData117 + "\n" + "\n" + youdData118 + "\n"
                + "\n" + youdData119 + "\n" + "\n" + youdData200 + "\n" + "\n" + youdData211 + "\n" + "\n" + youdData222 + "\n" + "\n" + youdData233 + "\n" + "\n" +
                youdData244 + "\n" + "\n" + youdData255 + "\n" + "\n" + youdData266 + "\n" + "\n" + youdData277 + "\n" + "\n" + youdData288 + "\n" + "\n" +
                youdData299 + "\n" + "\n" + youdData300 + "\n" + "\n" + youdData311 + "\n" + "\n" + youdData322 + "\n" + "\n" +
                youdData333 + "\n" + "\n" + youdData344 + "\n" + "\n" + youdData355 + "\n" + "\n" + youdData366 + "\n" + "\n" +
                youdData377 + "\n" + "\n" + youdData388 + "\n" + "\n" + youdData399 + "\n" + "\n" + youdData400 + "\n" + "\n" +
                youdData411
        };

        Log.d("Gewichtung", "Ausgabe: " + gew + "\t" + gewichtung + "\t" + gewichtung1 + "\t" + gewichtung2 + "\t" + gewichtung3 + "\t" +
                gewichtung4 + "\t" + gewichtung5 + "\t" + gewichtung6 + "\t" +
                gewichtung7 + "\t" + gewichtung8 + "\t" + gewichtung9 + "\t" + gewichtung10 + "\t" + gewichtung11 + "\t" +
                gewichtung12 + "\t" + gewichtung13 + "\t" + gewichtung14 + "\t" + gewichtung15 + "\t" + gewichtung16 + "\t" +
                gewichtung17 + "\t" + gewichtung18 + "\t" + gewichtung19 + "\t" + gewichtung20 + "\t" + gewichtung21 + "\t" + gewichtung22 + "\t" + gewichtung23 + "\t" + gewichtung24 + "\t" +
                "\t" + gewichtung25 + "\t" + gewichtung26 + "\t" + gewichtung27 + "\t" + gewichtung28 + "\t" + gewichtung29);

        gesamtGew = gew + gewichtung + gewichtung1 + gewichtung2 + gewichtung3 + gewichtung4 + gewichtung5 + gewichtung6 + gewichtung7 +
                gewichtung8 + gewichtung9 + gewichtung10 + gewichtung11 + gewichtung12 + gewichtung13 + gewichtung14 +
                gewichtung15 + gewichtung16 + gewichtung17 + gewichtung18 + gewichtung19 + gewichtung20 + gewichtung21 + gewichtung22 +
                gewichtung23 + gewichtung24 + gewichtung25 + gewichtung26 + gewichtung27 + gewichtung28 + gewichtung29;


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (checkPermission()) {
                    Toast.makeText(getMyContext(), "Permission Granted", Toast.LENGTH_SHORT).show();
                    try {
                        savePdf();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                        requestPermission();
                    }
                }
                iq_karfragment = new FragmentMain1();
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
                bundle.putString("your_key17", youdData17);
                bundle.putString("your_key117", youdData117);
                bundle.putString("your_key18", youdData18);
                bundle.putString("your_key118", youdData118);
                bundle.putString("your_key19", youdData19);
                bundle.putString("your_key119", youdData119);
                bundle.putString("your_key20", youdData20);
                bundle.putString("your_key200", youdData200);
                bundle.putString("your_key21", youdData21);
                bundle.putString("your_key211", youdData211);
                bundle.putString("your_key22", youdData22);
                bundle.putString("your_key222", youdData222);
                bundle.putString("your_key23", youdData23);
                bundle.putString("your_key233", youdData233);
                bundle.putString("your_key24", youdData24);
                bundle.putString("your_key244", youdData244);
                bundle.putString("your_key25", youdData25);
                bundle.putString("your_key255", youdData255);
                bundle.putString("your_key26", youdData26);
                bundle.putString("your_key266", youdData266);
                bundle.putString("your_key27", youdData27);
                bundle.putString("your_key277", youdData277);
                bundle.putString("your_key28", youdData28);
                bundle.putString("your_key288", youdData288);
                bundle.putString("your_key29", youdData29);
                bundle.putString("your_key299", youdData299);
                bundle.putString("your_key30", youdData30);
                bundle.putString("your_key300", youdData300);
                bundle.putString("your_key31", youdData31);
                bundle.putString("your_key311", youdData311);
                bundle.putString("your_key32", youdData32);
                bundle.putString("your_key322", youdData322);
                bundle.putString("your_key33", youdData33);
                bundle.putString("your_key333", youdData333);
                bundle.putString("your_key34", youdData34);
                bundle.putString("your_key344", youdData344);
                bundle.putString("your_key35", youdData35);
                bundle.putString("your_key355", youdData355);
                bundle.putString("your_key36", youdData36);
                bundle.putString("your_key366", youdData366);
                bundle.putString("your_key37", youdData37);
                bundle.putString("your_key377", youdData377);
                bundle.putString("your_key38", youdData38);
                bundle.putString("your_key388", youdData388);
                bundle.putString("your_key39", youdData39);
                bundle.putString("your_key399", youdData399);
                bundle.putString("your_key40", youdData40);
                bundle.putString("your_key400", youdData400);
                bundle.putString("your_key41", h);
                bundle.putString("your_key411", antwortwahr);

                bundle.putInt("Gewicht1", gew);
                bundle.putInt("Gewicht2", gewichtung);
                bundle.putInt("Gewicht3", gewichtung1);
                bundle.putInt("Gewicht4", gewichtung2);
                bundle.putInt("Gewicht5", gewichtung3);
                bundle.putInt("Gewicht6", gewichtung4);
                bundle.putInt("Gewicht7", gewichtung5);
                bundle.putInt("Gewicht8", gewichtung6);
                bundle.putInt("Gewicht9", gewichtung7);
                bundle.putInt("Gewicht10", gewichtung8);
                bundle.putInt("Gewicht11", gewichtung9);
                bundle.putInt("Gewicht12", gewichtung10);
                bundle.putInt("Gewicht13", gewichtung11);
                bundle.putInt("Gewicht14", gewichtung12);
                bundle.putInt("Gewicht15", gewichtung13);
                bundle.putInt("Gewicht16", gewichtung14);
                bundle.putInt("Gewicht17", gewichtung15);
                bundle.putInt("Gewicht18", gewichtung16);
                bundle.putInt("Gewicht19", gewichtung17);
                bundle.putInt("Gewicht20", gewichtung18);
                bundle.putInt("Gewicht21", gewichtung19);
                bundle.putInt("Gewicht22", gewichtung20);
                bundle.putInt("Gewicht23", gewichtung21);
                bundle.putInt("Gewicht24", gewichtung22);
                bundle.putInt("Gewicht25", gewichtung23);
                bundle.putInt("Gewicht26", gewichtung24);
                bundle.putInt("Gewicht27", gewichtung25);
                bundle.putInt("Gewicht28", gewichtung26);
                bundle.putInt("Gewicht29", gewichtung27);
                bundle.putInt("Gewicht30", gewichtung28);
                bundle.putInt("Gewicht31", gewichtung29);
                bundle.putInt("keyG", gesamtGew);
                iq_karfragment.setArguments(bundle);
                fragmentManager = myContext.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, iq_karfragment);
                fragmentTransaction.commit();

            }
        });
        Log.d("Gesamtgewichtung", "Ausgabe: " + gesamtGew);

        aktienListe = new ArrayList<>(Arrays.asList(aktienlisteArray));
        aktienlisteAdapter = new ArrayAdapter<>(
                getActivity(), // Die aktuelle Umgebung (diese Activity)
                R.layout.list_item_aktienliste, // ID der XML-Layout Datei
                R.id.list_item_aktienliste_textview, // ID des TextViews
                aktienListe); // Beispieldaten in einer ArrayList
        aktienlisteListView = (ListView) rootView.findViewById(R.id.listview_aktienliste);
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


    private void savePdf() throws FileNotFoundException {
        //create object of Document class
        Document mDoc = new Document();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

        //pdf file path
        String mFilePath = Environment.getExternalStorageDirectory().getAbsolutePath() +"C:/Users/lansa/Documents/IqRuhrApp";
        dir = new File(mFilePath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        file = new File(dir, "Trinity PDF" + sdf.format(Calendar.getInstance().getTime()) + ".pdf");


        try {
            FileOutputStream fOut = new FileOutputStream(file);
            //create instance of PdfWriter class
            PdfWriter.getInstance(mDoc,fOut);
            //open the document for writing
            mDoc.open();

            //add author of the document (optional)
            mDoc.addAuthor("Björn Kurrek");
            //add paragraph to the document
            mDoc.add((Element) aktienlisteAdapter);
            //close the document
            mDoc.close();
            //show message that file is saved, it will show file name and file path too
//            Toast.makeText(getMyContext(), mFileName + ".pdf\nis saved to\n" + mFilePath, Toast.LENGTH_SHORT).show();
            Log.d("FilePath", "Ausgabe: " + mFilePath);


        } catch (Exception e) {
            //if any thing goes wrong causing exception, get and show exception message
            Toast.makeText(getMyContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }


}
