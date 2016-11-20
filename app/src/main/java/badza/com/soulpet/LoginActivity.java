package badza.com.soulpet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        final EditText usernamelogin= (EditText) findViewById(R.id.username_login);
        final EditText passwordlogin= (EditText) findViewById(R.id.password_login);


        final Button btnlogin= (Button) findViewById(R.id.btn_login);
        final TextView getpassword= (TextView) findViewById(R.id.get_password);

        getpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent passwordintent=new Intent(LoginActivity.this,RecoverActivity.class);
                startActivity(passwordintent);
            }
        });
    }
}









