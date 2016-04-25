package br.com.gdgabc.gdgtodolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout2;
    private LinearLayout linearLayout3;
    private TextView textoMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout2 = (LinearLayout) findViewById(R.id.linear2);
        linearLayout3 = (LinearLayout) findViewById(R.id.linear3);
        textoMensagem = (TextView) findViewById(R.id.text_mensagem);

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click na View 2", Toast.LENGTH_SHORT).show();
            }
        });

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoMensagem.setText("Hello World!");
            }
        });

    }

    public void clickNoXML(View view){

        Toast.makeText(MainActivity.this, "Click na View 1", Toast.LENGTH_SHORT).show();

    }
}
