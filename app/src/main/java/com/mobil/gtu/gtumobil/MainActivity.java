package com.mobil.gtu.gtumobil;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.mobil.gtu.gtumobil.Etkinlik.EtkinlikMainActivity;
import com.mobil.gtu.gtumobil.Login.LoginActivity;
import com.mobil.gtu.gtumobil.Ulasim.UlasimTasarim;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,View.OnClickListener {


    CardView cardViewUlasimGlobal;
    CardView cardViewHaberlerGlobal;
    CardView cardViewLogin2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CardView cardViewUlasim = (CardView) findViewById(R.id.ulasim);
        //CardView cardViewHaberler = (CardView) findViewById(R.id.haberler);
        CardView cardViewLogin = (CardView) findViewById(R.id.login);
        CardView cardViewKisayolEkleCikar = (CardView) findViewById(R.id.kisayolekle);
        CardView cardViewEtkinlik = (CardView) findViewById(R.id.etkinlikler);


        cardViewUlasim.setOnClickListener(this);
        //cardViewHaberler.setOnClickListener(this);
        cardViewLogin.setOnClickListener(this);
        cardViewKisayolEkleCikar.setOnClickListener(this);
        cardViewEtkinlik.setOnClickListener(this);

        cardViewUlasimGlobal=cardViewUlasim;
        //cardViewHaberlerGlobal=cardViewHaberler;
        //cardViewLogin2=cardViewLogin;


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View view) {

        Intent i;
        Log.d("Boyut", Integer.toString(10));

        switch (view.getId()) {

            case R.id.login : i = new Intent(this,LoginActivity.class);startActivity(i); break;
            case R.id.ulasim : i = new Intent(this,UlasimTasarim.class);startActivity(i); break ;
            case R.id.etkinlikler : i = new Intent(this,EtkinlikMainActivity.class);startActivity(i); break;
/*

            case R.id.haberler : i = new Intent(this,UlasimActivity.class);startActivity(i); break;
            //
            case R.id.kisayolekle : i = new Intent(this,ListActivityShortWay.class);startActivity(i); break;

            default:break;

*/

        }

    }

}
