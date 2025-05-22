package com.club.pas_absen22_absen34;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new ListFootball())
                .commit();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            int itemId = item.getItemId();

            if (itemId == R.id.nav_ListFootballPremier) {
                fragment = new ListFootball();
            } else if (itemId == R.id.nav_DaftarJadwal) {
                fragment = new DaftarJadwal();
            } else if (itemId == R.id.Biodata) {
                fragment = new Biodata();
            }

            if (fragment != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_layout, fragment)
                        .commit();

                return true;
            }
            return false;
        });
    }

    }
