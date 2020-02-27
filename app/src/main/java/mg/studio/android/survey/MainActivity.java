package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {
    private Button mBtnStart;
    private CheckBox cb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        cb = findViewById(R.id.checkBox1);
        mBtnStart = findViewById(R.id.btnStart);  // get the button, it is in activity_main.xml
        mBtnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(cb.isChecked()==true){
                    Intent intent = new Intent(MainActivity.this, Question1.class);
                    startActivity(intent);
                    MainActivity.this.finish();

                }
                else {
                    Toast.makeText(MainActivity.this,"Please check the Box",Toast.LENGTH_SHORT).show();
                }
            }
        });
    };
}



