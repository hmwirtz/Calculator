package e.harrison.enginecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Calculate dispCalc;
    private Button calculate;
    private TextView dispOut;
    private EditText Bore, Stroke, Cylinder;
    private Variables variables;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculate.setOnClickListener(calculateListener);
        calculate = findViewById(R.id.calculate);
        dispOut = findViewById(R.id.dispOut);
        Bore = findViewById(R.id.BoreInput);
        Stroke = findViewById(R.id.StrokeInput);
        Cylinder = findViewById(R.id.CyInput);

        variables.Bore = Double.parseDouble(Bore.getText().toString());
        variables.Stroke = Double.parseDouble(Stroke.getText().toString());
        variables.Cy = Integer.parseInt(Cylinder.getText().toString());



    }



    View.OnClickListener calculateListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            dispCalc



        }
    };





}
