package e.harrison.enginecalculator;


import android.content.Intent;

public class Calculate {


    public String dispCalc(Double Bore, Double Stroke, int Cylinders){

        double displacement, PI, radius;

        PI = 3.14159;
        radius = Bore /2;
        displacement = radius * radius * Stroke * PI * Cylinders;

        String disp = String.valueOf(displacement);

        return disp;


    }

    public String boreStrokeRatio(Double Bore, Double Stroke){

        Double ratio = Bore / Stroke;
        String BSRatio = ratio.toString();

        return BSRatio;
    }

    public String rodRatio(Double Stroke, Double rodLength){
        Double ratio = rodLength / Stroke;
        String rodRatio = ratio.toString();

        return rodRatio;

    }
}





