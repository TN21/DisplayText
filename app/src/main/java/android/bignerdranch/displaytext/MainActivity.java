package android.bignerdranch.displaytext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int num=0;
    EditText enterText;
    TextView enterDisplay;
    Button donateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterText = (EditText)findViewById(R.id.enterNumber);
        donateBtn = (Button)findViewById(R.id.DonateNow);
        enterDisplay = (TextView)findViewById(R.id.TextShow);

        donateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(enterText.getText().toString());
                enterDisplay.setText(Integer.toString(num));
             }
        });
    ;}

}