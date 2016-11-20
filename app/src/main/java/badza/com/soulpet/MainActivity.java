package badza.com.soulpet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void changeActivityLogin(View view)
    {
        Intent intent=new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
    }

    public void changeActivitySignup(View view)
    {
        Intent intent=new Intent(MainActivity.this,SignupActivity.class);
        startActivity(intent);
    }

}
