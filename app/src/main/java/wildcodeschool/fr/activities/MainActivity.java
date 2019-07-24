package wildcodeschool.fr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.main_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final Intent message = new Intent(MainActivity.this, HomeActivity.class);
                final EditText loginField = findViewById(R.id.login);
                final String loginText = loginField.getText().toString();
                message.putExtra("LOGIN", loginText);
                startActivity(message);
            }
        });
    }
}
