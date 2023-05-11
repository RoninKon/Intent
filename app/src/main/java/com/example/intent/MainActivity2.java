package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView DataMainActivity;
    private Button button;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        DataMainActivity = findViewById(R.id.dataUser);
        button = findViewById(R.id.button2);

        Bundle bundleIntent = getIntent().getExtras();
        if (bundleIntent != null) {
            user = (User) bundleIntent.getSerializable(User.class.getSimpleName());
            DataMainActivity.setText("Id:" + user.getI_d() + "\n"
                    + " Место:" + user.getP_lace() + "\n"
                    + "Время отбытия:" + user.getAbTime() + "\n"
                    + "Время прибытия:" + user.getNachTime() + "\n"
                    + "Стоймость:" + user.getMoney());
        }
        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
}
