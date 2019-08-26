package cl.tuserver.clase3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import cl.tuserver.clase3.ENUM.EnumClavesIntents;
import cl.tuserver.testingandroid.R;

public class FormularioPersona extends AppCompatActivity {

    private Spinner spinnerHorasMaximas;
    private EditText txtNombre, txtEdad, txtCorreo;
    private RadioGroup rgEsCasado;
    private Button btnGuardarFormulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_persona);

        // TODO CODE
        spinnerHorasMaximas = findViewById(R.id.spinnerHorasMaximas);
        Intent intent = getIntent();
        ArrayList<Integer> horasMaximasArray = (ArrayList<Integer>) intent.getSerializableExtra(EnumClavesIntents.HORAS_MAXIMAS.toString());

        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, horasMaximasArray);
        spinnerHorasMaximas.setAdapter(adapter);

        // PERSONA
        txtNombre = findViewById(R.id.txtNombrePersona);
        txtEdad = findViewById(R.id.txtEdadPersona);
        txtCorreo = findViewById(R.id.txtCorreoPersona);
        rgEsCasado = findViewById(R.id.radioGroupEsCasado);
        btnGuardarFormulario = findViewById(R.id.btnGuardarFormulario);

        btnGuardarFormulario.setOnClickListener( v -> {
            Persona persona = new Persona();
            persona.setNombre(txtNombre.getText().toString());
            persona.setEdad(Math.abs(Integer.parseInt(txtEdad.getText().toString())));
            persona.setCorreo(txtCorreo.getText().toString());
            persona.setCasado(rgEsCasado.getCheckedRadioButtonId() == 0);
            String output = "Nombre: " + persona.getNombre() + "\n" +
                            "Edad: " + persona.getEdad() + "\n" +
                            "Correo: " + persona.getCorreo() + "\n" +
                            "Es casado: " + persona.getCasado() + "\n";
            Toast.makeText(v.getContext(), output, Toast.LENGTH_SHORT).show();
        });
    }
}