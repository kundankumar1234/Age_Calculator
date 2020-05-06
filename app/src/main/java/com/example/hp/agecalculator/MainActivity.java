package com.example.hp.agecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText d;
    private EditText m;
    private EditText y;
    private EditText d1;
    private EditText m1;
    private EditText y1;
    private EditText d2;
    private EditText m2;
    private EditText y2;
    private Button Age;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d = (EditText)findViewById(R.id.editText1);
        m = (EditText)findViewById(R.id.editText2);
        y = (EditText)findViewById(R.id.editText3);

        d1 = (EditText)findViewById(R.id.editText4);
        m1 = (EditText)findViewById(R.id.editText5);
        y1 = (EditText)findViewById(R.id.editText6);

        Age = (Button)findViewById(R.id.button);

        result = (TextView)findViewById(R.id.textView7);

        Age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numd = Integer.parseInt(d.getText().toString());
                int numm = Integer.parseInt(m.getText().toString());
                int numy = Integer.parseInt(y.getText().toString());

                int numd1 = Integer.parseInt(d1.getText().toString());
                int numm1 = Integer.parseInt(m1.getText().toString());
                int numy1 = Integer.parseInt(y1.getText().toString());

                int numd2, numm2;
                int numy2=0;

                if (numd >= numd1){
                    numd2 = numd-numd1;
                }
                else {
                    numd2 = (30+numd)-numd1;
                }

                if (numm >= numm1){
                    if (numd1 > numd){
                        numm2 = numm-numm1-1;
                    }
                    else {
                        numm2=numm-numm1;
                    }
                }
                else {
                    if (numd1 > numd){
                        numm2=(12+numm-1)-numm1;
                    }
                    else
                    {
                        numm2=(12+numm)-numm1;
                    }
                }

                if (numy >= numy1)
                {
                    if (numm >= numm1){
                        numy2 = numy - numy1;
                    }
                    else {
                        numy2 = numy - numy1 - 1;
                    }
                }
                result.setText(String.valueOf(numy2) +  " Years, "  +String.valueOf(numm2) + " Months, "+String.valueOf(numd2) + " Days");
            }
        });
    }
}
