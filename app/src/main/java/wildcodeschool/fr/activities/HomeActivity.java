package wildcodeschool.fr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final Intent intent = getIntent();
        final String intentExtra = intent.getStringExtra("LOGIN");
        Toast.makeText(getApplicationContext(), intentExtra, Toast.LENGTH_SHORT).show();
    }
}
