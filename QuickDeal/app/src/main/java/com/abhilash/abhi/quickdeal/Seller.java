package com.abhilash.abhi.quickdeal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import static com.abhilash.abhi.quickdeal.R.styleable.Toolbar;

public class Seller extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout1);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav1_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout1);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home_id) {
            Toast.makeText(this,"HOME",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.conversations_id) {
            Toast.makeText(this,"CONVERSATIONS",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.profile_id) {
            Toast.makeText(this,"PROFILE",Toast.LENGTH_SHORT).show();

        }  else if (id == R.id.support_id) {
            Toast.makeText(this,"SUPPORT",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.logout_id) {
            Toast.makeText(this,"LOGOUT",Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer1 = (DrawerLayout) findViewById(R.id.drawer_layout1);
        drawer1.closeDrawer(GravityCompat.START);
        return true;
    }
}
