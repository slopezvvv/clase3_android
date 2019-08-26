package cl.tuserver.clase3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

import cl.tuserver.clase3.ENUM.EnumClavesIntents;
import cl.tuserver.testingandroid.R;

public class MainActivity extends Activity {

    private Button btnRegistrarUsuario;

    private ArrayList<Integer> horasMaximasArray;

    public MainActivity(){
        horasMaximasArray = new ArrayList<>();
        horasMaximasArray.add(1);
        horasMaximasArray.add(2);
        horasMaximasArray.add(3);
        horasMaximasArray.add(4);
        horasMaximasArray.add(5);
    }

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_main);

        btnRegistrarUsuario = findViewById(R.id.btnRegistrarPersona);

        btnRegistrarUsuario.setOnClickListener(
            v ->{

                Intent formularioIntent = new Intent(v.getContext(), FormularioPersona.class);

                formularioIntent.putExtra(
                        EnumClavesIntents.HORAS_MAXIMAS.toString(),
                        horasMaximasArray
                );

                startActivity(formularioIntent);
            }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();

        // TODO code

        // ..
    }
}