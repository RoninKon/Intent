package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText idIn;
    private EditText abTimeIn;
    private EditText NachTimeIn;
    private EditText placeIn;
    private EditText moneyIn;
    private Button button;

    private String I_d;
    private String abTime;
    private String NachTime;
    private String money;
    private String p_lace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idIn = findViewById(R.id.idIn);
        placeIn = findViewById(R.id.plase);
        NachTimeIn = findViewById(R.id.NachTimeIn);
        abTimeIn = findViewById(R.id.abTimeIn);
        moneyIn = findViewById(R.id.money);

        button = findViewById(R.id.button);
        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            I_d = idIn.getText().toString();
            abTime = abTimeIn.getText().toString();
            NachTime = NachTimeIn.getText().toString();
            money = moneyIn.getText().toString();
            p_lace = placeIn.getText().toString();

            User user = new User(I_d, abTime, NachTime, money, p_lace);
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

            intent.putExtra(User.class.getSimpleName(), user);
            startActivity(intent);

        }
    };
}