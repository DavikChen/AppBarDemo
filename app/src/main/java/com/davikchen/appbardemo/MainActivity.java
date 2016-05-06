package com.davikchen.appbardemo;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 学习扩展开发包中的技术
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener,Toolbar.OnMenuItemClickListener{

    private TextView textViewActionBar;
    private TextView textViewAppCompat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBarHome);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // App Logo
       // toolbar.setLogo(R.mipmap.ic_launcher);
        // Title
        //toolbar.setTitle("App Title");
        // Sub Title
        //toolbar.setSubtitle("Sub title");
       // toolbar.setNavigationIcon(R.drawable.ic_toc_white_24dp);
        toolbar.setNavigationIcon(R.drawable.ab_android);
        toolbar.setOnMenuItemClickListener(this);
        textViewActionBar = (TextView) findViewById(R.id.textViewActionBar);
        textViewAppCompat = (TextView) findViewById(R.id.textViewAppCompat);
        textViewActionBar.setOnClickListener(this);
        textViewAppCompat.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textViewActionBar:
                showDialog();
                break;
            case R.id.textViewAppCompat:

                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Dialog");
        builder.setMessage("少数派客户端");
        builder.setPositiveButton("OK", null);
        builder.setNegativeButton("Cancel", null);
        builder.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_settings:
                Toast.makeText(this,"点击OK"+item.getTitle(),Toast.LENGTH_LONG).show();
                break;
            case R.id.actionShare:
                Toast.makeText(this,"点击OK"+item.getTitle(),Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}
