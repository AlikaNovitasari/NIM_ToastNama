package id.kampuskoding.nim_toasnama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonSimpan;
    EditText editTextNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSimpan = (Button) findViewById(R.id.buttonSimpan);
        editTextNama = (EditText) findViewById(R.id.editTextNama);

        buttonSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello "+editTextNama.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
