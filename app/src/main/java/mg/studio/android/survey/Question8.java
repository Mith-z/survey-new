package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question8 extends AppCompatActivity {
    private Button mBtnQ3;
    public static String q8;
    private RadioGroup rg;
    private RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eight);

        mBtnQ3 = findViewById(R.id.Q8);  // get the button, it is in activity_main.xml
        mBtnQ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Question8.this, Question9.class);
                startActivity(intent);
                Question8.this.finish();
            }
        });

        rg = findViewById(R.id.RGQ8);
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
        q8 = selectText;
    }

}
