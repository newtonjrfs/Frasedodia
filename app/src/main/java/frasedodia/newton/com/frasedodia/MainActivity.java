package frasedodia.newton.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases={
            "No homem, o desejo gera o amor. Na mulher, o amor gera o desejo",
            "Amor , quando duas pessoas fazem amor , não estão apenas fazendo amor , estão dando corda ao relógio do mundo",
            "O sexo é o consolo que a gente tem quando o amor não nos alcança",
            "Amor é prosa, sexo é poesia",
            "O sexo é o alívio da tensão. O amor é a causa",
            "Eu e minha língua queremos saborear você sem pressa",
            "Homem safado é aquele que só chama mulher de amor quando quer sexo",
            "O amor é, sem dúvida alguma, uma espécie de nobre seletividade na esfera do sexo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFrase);

        //textoNovaFrase.setText(frases[0]);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);

                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });

    }
}
