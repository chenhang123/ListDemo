package com.example.ontop.listdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.ontop.listdemo.activitys.LoginActivity;
import com.example.ontop.listdemo.fragments.ArticleFragment;
import com.example.ontop.listdemo.fragments.BeautyFragment;
import com.example.ontop.listdemo.fragments.MusicFragment;
import com.example.ontop.listdemo.fragments.SayingFragment;
import com.example.ontop.listdemo.activitys.WriteArticleActivity;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private MusicFragment musicFragment;
    private ArticleFragment articleFragment;
    private SayingFragment sayingFragment;
    private BeautyFragment beautyFragment;
    private WriteArticleActivity writeArticleFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, WriteArticleActivity.class);
                startActivity(intent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
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
        int id = item.getItemId();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideFragment(transaction);
        if (id == R.id.action_music) {
            Toast.makeText(MainActivity.this, "Hei，young man lets listen some music", Toast.LENGTH_SHORT).show();
            if (musicFragment == null) {
                musicFragment = new MusicFragment();
                transaction.add(R.id.main_frame_layout, musicFragment);
            }
            transaction.show(musicFragment);
        } else if (id == R.id.action_article) {
            Toast.makeText(MainActivity.this, "Hei，young man lets listen some music", Toast.LENGTH_SHORT).show();
            if (articleFragment == null) {
                articleFragment = new ArticleFragment();
                transaction.add(R.id.main_frame_layout, articleFragment);
            }
            transaction.show(articleFragment);
        } else if (id == R.id.action_saying) {
            Toast.makeText(MainActivity.this, "Hei，young man lets listen some music", Toast.LENGTH_SHORT).show();
            if (sayingFragment == null) {
                sayingFragment = new SayingFragment();
                transaction.add(R.id.main_frame_layout, sayingFragment);
            }
            transaction.show(sayingFragment);
        } else if (id == R.id.action_beauty) {
            Toast.makeText(MainActivity.this, "Hei，young man lets listen some music", Toast.LENGTH_SHORT).show();
            if (beautyFragment == null) {
                beautyFragment = new BeautyFragment();
                transaction.add(R.id.main_frame_layout, beautyFragment);
            }
            transaction.show(beautyFragment);
        }
        transaction.commit();
        return super.onOptionsItemSelected(item);
    }

    //隐藏所有的fragment
    private void hideFragment(FragmentTransaction transaction) {
        if (musicFragment != null) {
            transaction.hide(musicFragment);
        }
        if (articleFragment != null) {
            transaction.hide(articleFragment);
        }
        if (sayingFragment != null) {
            transaction.hide(sayingFragment);
        }
        if (beautyFragment != null) {
            transaction.hide(beautyFragment);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_login) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, LoginActivity.class);
            startActivity(intent);
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
}
