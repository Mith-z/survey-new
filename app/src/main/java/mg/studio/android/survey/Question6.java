package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Question6 extends AppCompatActivity {
    private Button mBtnQ3;
    public static String q6;
    private EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_six);

        mBtnQ3 = findViewById(R.id.Q6);  // get the button, it is in activity_main.xml
        mBtnQ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Question6.this, Question7.class);
                startActivity(intent);
                Question6.this.finish();

                edt = findViewById(R.id.edtQ6);
                q6 = edt.getText().toString();

            }
        });
    }
}
