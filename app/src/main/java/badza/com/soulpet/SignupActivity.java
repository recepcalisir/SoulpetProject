package badza.com.soulpet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        final EditText usersignup= (EditText) findViewById(R.id.username_signup);
        final EditText emailsignup= (EditText) findViewById(R.id.email_signup);
        final EditText passwordsignup= (EditText) findViewById(R.id.password_signup);

        final Button btnsignup= (Button) findViewById(R.id.btn_signup);



    }
}
