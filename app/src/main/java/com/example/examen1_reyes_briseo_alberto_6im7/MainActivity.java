package com.example.examen1_reyes_briseo_alberto_6im7;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Peso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickConvertir(View v)
    {
        Double peso;
        Intent intento = new Intent(this, Actividad2.class);
        Bundle dat = new Bundle();


        Peso = (EditText) findViewById(R.id.Pesos);

        try
        {
            peso = Double.parseDouble(Peso.getText().toString());
            peso = peso / 15;
            dat.putDouble("peso", peso);
            intento.putExtras(dat);
            finish();
            startActivity(intento);
        }
        catch(Exception e)
        {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Nain nain papu, solo:", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
