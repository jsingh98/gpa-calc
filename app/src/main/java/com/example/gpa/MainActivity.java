package com.example.gpa;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG= MainActivity.class.getSimpleName();
   String msg= "Activity lifecycle sq: \n";

    EditText grade1;
    EditText grade2;
    EditText grade3;
    EditText grade4;
    EditText grade5;

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grade1 = (EditText) findViewById(R.id.editText2);
        grade2 = (EditText) findViewById(R.id.editText4);
        grade3 = (EditText) findViewById(R.id.editText5);
        grade4 = (EditText) findViewById(R.id.editText3);
        grade5 = (EditText) findViewById(R.id.editText6);


        myTextView = (TextView)findViewById(R.id.textView7);
    }


//    public void doSomething(View view) {
//        myTextView.setText(msg);
//    }

    public void calculate_gpa(View view) {

        int finalGrade = ((Integer.parseInt(grade1.getText().toString())) + (Integer.parseInt(grade2.getText().toString())) + (Integer.parseInt(grade3.getText().toString())) + (Integer.parseInt(grade4.getText().toString())) + (Integer.parseInt(grade5.getText().toString()))) / 5;
       // gpa.setText(Integer.toString(finalGrade));
        String s = finalGrade + "";
        myTextView.setText(s);
    }
}
