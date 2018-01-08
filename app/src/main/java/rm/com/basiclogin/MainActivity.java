package rm.com.basiclogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

//    Declaring the two EditText - one for username and the other for password
    EditText userName,passWord;



//    Initializing two  String arrays - one for username and the other for password
//    For example...the username and password of the first user will be one and a respectively
    String[] user = {"one","two","three"};
    String[] pass = {"a","b","c"};

//    Declaring a button
    Button login;

    int flag = 0;

//    String to store the contents that is entered by bthe user to the two EditText.
    String u,p;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        This is the line in which the java file and the corresponding xml file are linked together
        setContentView(R.layout.activity_main);




//        linking the items in the layout file using their id and the method findViewById
        userName = findViewById(R.id.username);
        passWord = findViewById(R.id.password);

        login = findViewById(R.id.button);





//        The user enters the credentials and then clicks the login button
//        The code below is for the functionality that needs to be added when the button is clicked

//        We first add an OnClickListener for the button as shown in the next line
        login.setOnClickListener(new View.OnClickListener() {

//            What needs to happen when the button in clicked is given inside the onClick method
            @Override
            public void onClick(View v) {


//                We retrive the text from the edit text using the getText() method and then convert it into a string using the toString() method and then store it to a string variable
                u = userName.getText().toString();
                p = passWord.getText().toString();




//                Checking if both username and password are not empty
                if(u != "" && p != "") {

//                    Setting flag = 0
                    flag = 0;


//                    Looping inside the user array to find if the entered username exists or not.
                    for (int i = 0; i < user.length; i++) {

//                        if username is present in the array
                        if(u.equals(user[i])){

//                            we set flag = 1
                            flag = 1;

//                            We then check the corresponding password from the other array
//                            If it matches with the entered password Login is successfull
                            if(p.equals(pass[i])){
                                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                                break;
                            }else{
//                                Else if the password is incorrect
                                Toast.makeText(MainActivity.this, "Wrong password", Toast.LENGTH_SHORT).show();
                                break;
                            }
                        }

                    }


//                    If the username was not present in the array, the flag will still be 0.
                    if(flag == 0){
                        Toast.makeText(MainActivity.this, "Invalid username", Toast.LENGTH_SHORT).show();
                    }


                }

            }
        });



    }
}
