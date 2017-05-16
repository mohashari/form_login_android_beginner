package sinau.com.cobalogin2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String username,password;
    String id="ashari",idpass="123";
    EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loginMain(View v){
        ed1=(EditText)findViewById(R.id.edtUser);
        ed2=(EditText)findViewById(R.id.edtPas);
        username=ed1.getText().toString();
        password=ed2.getText().toString();

        if ((username.contains(id))&&(password.contains(idpass))){
            Intent in = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(in);
        }else{
            Toast.makeText(this,"LOGIN GAGAL", Toast.LENGTH_SHORT).show();
        }
    }
}
