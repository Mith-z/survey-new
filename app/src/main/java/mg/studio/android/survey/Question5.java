package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class Question5 extends AppCompatActivity {
    private Button mBtnQ3;
    private CheckBox cbM;
    public static List<String> Q5 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_five);

        mBtnQ3 = findViewById(R.id.Q5);  // get the button, it is in activity_main.xml
        mBtnQ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Question5.this, Question6.class);
                startActivity(intent);
                Question5.this.finish();

                cbM = findViewById(R.id.cbMusic5);
                if(cbM.isChecked()==true){
                    Q5.add(cbM.getText().toString());
                }
                cbM = findViewById(R.id.cbPhoto5);
                if(cbM.isChecked()==true){
                    Q5.add(cbM.getText().toString());
                }
                cbM = findViewById(R.id.cbGame5);
                if(cbM.isChecked()==true){
                    Q5.add(cbM.getText().toString());
                }
                cbM = findViewById(R.id.cbBusy5);
                if(cbM.isChecked()==true){
                    Q5.add(cbM.getText().toString());
                }
                cbM = findViewById(R.id.cbData5);
                if(cbM.isChecked()==true){
                    Q5.add(cbM.getText().toString());
                }
                cbM = findViewById(R.id.cbGPS5);
                if(cbM.isChecked()==true){
                    Q5.add(cbM.getText().toString());
                }
                cbM = findViewById(R.id.cbOther5);
                if(cbM.isChecked()==true){
                    Q5.add(cbM.getText().toString());
                }
            }
        });

    }
}
