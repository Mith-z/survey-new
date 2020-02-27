package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question9 extends AppCompatActivity {
    private Button mBtnQ3;
    public static String q9;
    private RadioGroup rg;
    private RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_nine);

        mBtnQ3 = findViewById(R.id.Q9);  // get the button, it is in activity_main.xml
        mBtnQ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Question9.this, Question10.class);
                startActivity(intent);
                Question9.this.finish();
            }
        });
        rg = findViewById(R.id.RGQ9);
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
        q9 = selectText;
    }

}
