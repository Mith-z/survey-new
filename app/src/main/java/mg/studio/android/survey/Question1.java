package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Question1 extends AppCompatActivity {
    private Button mBtnQ1;
    public static String q1;
    private RadioGroup rg;
    private RadioButton rb;
    private RadioButton init;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_one);

        mBtnQ1 = findViewById(R.id.Q1);  // get the button, it is in activity_main.xml
        mBtnQ1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Question1.this, Question2.class);
                startActivity(intent);
                Question1.this.finish();
            }
        });


        rg = findViewById(R.id.RGQ1);
        /*init = findViewById(R.id.radioButtonQ1);
        init.setChecked(true);*/
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                selectRadioBtn();
            }
        });

    }
    private void selectRadioBtn(){
        rb = findViewById(rg.getCheckedRadioButtonId());
        String selectText = rb.getText().toString();
        q1 = selectText;
    }

}
