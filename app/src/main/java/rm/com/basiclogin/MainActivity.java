package rm.com.basiclogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText userName,passWord;

    String[] user = {"a","b","c"};
    String[] pass = {"a","b","c"};

    Button login;

    int flag = 0;

    String u,p;




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
//                Toast.makeText(MainActivity.this, "Button Clicked!!!", Toast.LENGTH_SHORT).show();
                u = userName.getText().toString();
                p = passWord.getText().toString();

                if(u != "" && p != "") {

                    flag = 0;


                    for (int i = 0; i < user.length; i++) {

                        if(u.equals(user[i])){

                            flag = 1;

                            if(p.equals(pass[i])){
                                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                                break;
                            }else{
                                Toast.makeText(MainActivity.this, "Wrong password", Toast.LENGTH_SHORT).show();
                                break;
                            }
                        }

                    }


                    if(flag == 0){
                        Toast.makeText(MainActivity.this, "Invalid username", Toast.LENGTH_SHORT).show();
                    }


                }

            }
        });



    }
}
