package com.abc.collegeguide;

import android.database.Cursor;
import android.database.SQLException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class Activity3 extends AppCompatActivity {

    Cursor c = null;
    public TextView tv;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        final RadioGroup rg = (RadioGroup) findViewById(R.id.rg2);
        final RadioGroup rgg = (RadioGroup) findViewById(R.id.rg1);

        TextView tv=(TextView) findViewById(R.id.tv1);
        tv.setText("   :   " +Integer.toString(Activity2.r));


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.r0:
                        rgg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                switch (checkedId) {
                                    case R.id.g1:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("IT", new String[]{"g"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g2:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("IT", new String[]{"column2","se"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g3:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("IT", new String[]{"column2","sc"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g4:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("IT", new String[]{"column2","st"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;



                                }
                            }

                        });
                        break;
                    case R.id.r1:

                        rgg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                switch (checkedId) {
                                    case R.id.g1:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Computer", new String[]{"g"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g2:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Computer", new String[]{"column2","se"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g3:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Computer", new String[]{"column2","sc"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g4:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Computer", new String[]{"column2","st"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;



                                }
                            }

                        });
                        break;

                    case R.id.r2:

                        rgg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                switch (checkedId) {
                                    case R.id.g1:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Mechanical", new String[]{"g"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g2:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Mechanical", new String[]{"column2","se"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g3:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Mechanical", new String[]{"column2","sc"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g4:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Mechanical", new String[]{"column2","st"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;



                                }
                            }

                        });
                        break;


                    case R.id.r3:
                        rgg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                switch (checkedId) {
                                    case R.id.g1:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Civil", new String[]{"g"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g2:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Civil", new String[]{"column2","se"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g3:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Civil", new String[]{"column2","sc"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g4:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Civil", new String[]{"column2","st"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;



                                }
                            }

                        });
                        break;



                    case R.id.r4:
                        rgg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                switch (checkedId) {
                                    case R.id.g1:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("EC", new String[]{"g"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g2:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("EC", new String[]{"column2","se"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g3:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("EC", new String[]{"column2","sc"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g4:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("EC", new String[]{"column2","st"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;



                                }
                            }

                        });
                        break;
                    case R.id.r6:
                        rgg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                switch (checkedId) {
                                    case R.id.g1:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Electrical", new String[]{"g"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g2:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Electrical", new String[]{"column2","se"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g3:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Electrical", new String[]{"column2","sc"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;

                                    case R.id.g4:
                                        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                DatabaseHelper myDbHelper = new DatabaseHelper(Activity3.this);
                                                try {
                                                    myDbHelper.createDataBase();
                                                } catch (IOException ioe) {
                                                    throw new Error("Unable to create database");
                                                }
                                                try {
                                                    myDbHelper.openDataBase();
                                                } catch (SQLException sqle) {
                                                    throw sqle;
                                                }
                                                c = myDbHelper.query("Electrical", new String[]{"column2","st"}, null, new String[]{String.valueOf(Activity2.r)}, null, null, null,"10");
                                                if (c.moveToFirst()) {

                                                    do {

                                                        Toast.makeText(Activity3.this,
                                                                " Name: " + c.getString(0) + "\n"
                                                                ,
                                                                Toast.LENGTH_LONG).show();
                                                    } while (c.moveToNext());
                                                }
                                            }
                                        });
                                        break;



                                }
                            }

                        });
                        break;
                }
            }
        });



    }




}
