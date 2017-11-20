package rm.com.basiclogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText userName,passWord;

    String[] user = {"a","b"};
    String[] pass = {"a","b"};

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.username);
        passWord = findViewById(R.id.password);

        login = findViewById(R.id.button);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Clicked!!!", Toast.LENGTH_SHORT).show();

            }
        });



    }
}
