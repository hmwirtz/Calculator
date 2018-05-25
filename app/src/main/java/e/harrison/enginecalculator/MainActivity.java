package e.harrison.enginecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView dispOut, BSRatio, rodRatio;
    Button calculate;
    EditText Bore, Stroke, Cylinder, RodLength;
    Double bore, stroke, rodLength;
    int cylinders;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();


    }

    private void initializeViews (){



        calculate = findViewById(R.id.calculate);
        calculate.setOnClickListener(calculateListener);
        dispOut = findViewById(R.id.dispOut);
        Bore = findViewById(R.id.BoreInput);
        Stroke = findViewById(R.id.StrokeInput);
        Cylinder = findViewById(R.id.CyInput);
        BSRatio = findViewById(R.id.boreStrokeRatio);
        RodLength = findViewById(R.id.rodInput);
        rodRatio = findViewById(R.id.rodRatioOut);


    }


    public void doAllCalcs(Double Bore, Double Stroke, Double RodLength, int Cylinders){

        Calculate Calc = new Calculate();
        dispOut.setText((Calc.dispCalc(Bore, Stroke, Cylinders)));
        BSRatio.setText(Calc.boreStrokeRatio(Bore, Stroke));
        rodRatio.setText(Calc.rodRatio(Stroke, RodLength));


    }


    View.OnClickListener calculateListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            bore = Double.parseDouble(Bore.getText().toString());
            stroke = Double.parseDouble(Stroke.getText().toString());
            cylinders = Integer.parseInt(Cylinder.getText().toString());
            rodLength = Double.parseDouble(RodLength.getText().toString());
            doAllCalcs(bore, stroke,rodLength,cylinders);


        }
    };





}
