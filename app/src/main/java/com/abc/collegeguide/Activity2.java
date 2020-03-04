package com.abc.collegeguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    double r1,r2,r3,r4;
    static int r;
    public Button add;
    public EditText tv1;
    public EditText tv2;
    public TextView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button add=(Button) findViewById(R.id.result);
         final EditText tv1=(EditText) findViewById(R.id.e1);
         final EditText tv2=(EditText) findViewById(R.id.e2);
         final TextView rv=(TextView) findViewById(R.id.res);

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String mynum1=tv1.getText().toString();
                String mynum2=tv2.getText().toString();
                r1=Double.parseDouble(mynum1);
                r2=Double.parseDouble(mynum2);
                r3=100-((0.6)*r1+(0.4)*r2);
                r4=61094*(r3/100);
                r=(int)r4;
                if(r>0) {
                    rv.setText("Merit Rank : " + Integer.toString(r));
                }
                else
                {
                    Toast.makeText(Activity2.this,"Invalid Percentile",Toast.LENGTH_SHORT).show();
                }
            }

        });

    }



    public void goToActivity3(View view) {
        Intent intent = new Intent (this, Activity3.class);
        startActivity(intent);
    }




}
