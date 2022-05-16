package com.example.transactapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

import com.example.transactapp.ui.Firstlieferfragment;
import com.example.transactapp.ui.FragmenttestForm;
import com.example.transactapp.ui.home.HomeFragment;
import com.google.android.material.navigation.NavigationView;

import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    FragmentActivity myContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
        }
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    public FragmentActivity getMyContext() {
        return myContext;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.homeunterMen1:
                Intent shareIntent = new Intent (Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String shareBody = "your body here";
                String shareSub = "Your subject here";
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                shareIntent.putExtra (Intent.EXTRA_TEXT, shareBody);
                startActivity (Intent.createChooser (shareIntent,"Share App Locker"));
                return true;

            case R.id.item5:
               getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new HomeFragment()).commit();
                return true;

            case R.id.iqunterMen2:
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new Firstlieferfragment()).commit();
                return true;

            case R.id.iqunterMen4:
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new FragmenttestForm()).commit();
                return true;

            case R.id.iqunterMen1:
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new Kennzahlenfragment()).commit();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.onse_set:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.two_set:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
}