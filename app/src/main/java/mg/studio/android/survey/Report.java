package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Report extends AppCompatActivity {
    private Button mBtnQ1,mBtn;
    private EditText edt;
    private int k = 0, i = 0;
    private String text = "", text5 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        edt = findViewById(R.id.EDTQ1);
        edt.setText("Q1: "+Question1.q1);

        edt = findViewById(R.id.EDTQ2);
        edt.setText("Q2: "+Question2.q2);

        edt = findViewById(R.id.EDTQ3);
        edt.setText("Q3: "+Question3.q3);

        edt = findViewById(R.id.EDTQ4);
        for(; k< Question4.Q4.size();k++){
            text = Question4.Q4.get(k) +", " + text;
        }
        edt.setText("Q4: "+text);

        edt = findViewById(R.id.EDTQ5);
        for(; i< Question5.Q5.size();i++){
            text5 = Question5.Q5.get(i) +", " + text5;
        }
        edt.setText("Q5: "+text5);



        mBtnQ1 = findViewById(R.id.nextPage);
        mBtnQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // android.os.Process.killProcess(android.os.Process.myPid());
                setContentView(R.layout.activity_report_2);

                edt = findViewById(R.id.EDTQ6);
                edt.setText("Q6: "+Question6.q6);

                edt = findViewById(R.id.EDTQ7);
                edt.setText("Q7: "+Question7.q7);

                edt = findViewById(R.id.EDTQ8);
                edt.setText("Q8: "+Question8.q8);

                edt = findViewById(R.id.EDTQ9);
                edt.setText("Q9: "+Question9.q9);

                edt = findViewById(R.id.EDTQ10);
                edt.setText("Q10: "+Question10.q10);

                edt = findViewById(R.id.EDTQ11);
                edt.setText("Q11: "+Question11.q11);

                edt = findViewById(R.id.EDTQ12);
                edt.setText("Q12: "+Question12.q12);


                mBtn = findViewById(R.id.report);
                mBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        android.os.Process.killProcess(android.os.Process.myPid());
                    }
                });


            }
        });

       /* mBtn = findViewById(R.id.report);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 android.os.Process.killProcess(android.os.Process.myPid());
            }
        });*/

    }

}