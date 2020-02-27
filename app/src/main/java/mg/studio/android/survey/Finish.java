package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Finish extends AppCompatActivity {
    private Button mBtnQ3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_survey);

        mBtnQ3 = findViewById(R.id.FINISH);  // get the button, it is in activity_main.xml
        mBtnQ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //android.os.Process.killProcess(android.os.Process.myPid());
                Intent intent = new Intent(Finish.this,Report.class);
                startActivity(intent);
                Finish.this.finish();
            }
        });
    }
}



