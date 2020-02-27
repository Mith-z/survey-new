package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question7 extends AppCompatActivity {
    private Button mBtnQ3;
    public static String q7;
    private RadioGroup rg;
    private RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_seven);

        mBtnQ3 = findViewById(R.id.Q7);  // get the button, it is in activity_main.xml
        mBtnQ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Question7.this, Question8.class);
                startActivity(intent);
                Question7.this.finish();
            }
        });

        rg = findViewById(R.id.RGQ7);
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
        q7 = selectText;
    }
}
