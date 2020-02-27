package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class Question4 extends AppCompatActivity {
    private Button mBtnQ3;
    private CheckBox cbM;
    public static List<String> Q4 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_four);



        mBtnQ3 = findViewById(R.id.Q4);  // get the button, it is in activity_main.xml
        mBtnQ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Question4.this, Question5.class);
                startActivity(intent);
                Question4.this.finish();

            cbM = findViewById(R.id.cbMusic);
            if(cbM.isChecked()==true){
                Q4.add(cbM.getText().toString());
            }
                cbM = findViewById(R.id.cbPhoto);
                if(cbM.isChecked()==true){
                    Q4.add(cbM.getText().toString());
                }
                cbM = findViewById(R.id.cbGame);
                if(cbM.isChecked()==true){
                    Q4.add(cbM.getText().toString());
                }
                cbM = findViewById(R.id.cbBusy);
                if(cbM.isChecked()==true){
                    Q4.add(cbM.getText().toString());
                }
                cbM = findViewById(R.id.cbData);
                if(cbM.isChecked()==true){
                    Q4.add(cbM.getText().toString());
                }
                cbM = findViewById(R.id.cbGPS);
                if(cbM.isChecked()==true){
                    Q4.add(cbM.getText().toString());
                }
                cbM = findViewById(R.id.cbOther);
                if(cbM.isChecked()==true){
                    Q4.add(cbM.getText().toString());
                }


            }
        });


    }
}
