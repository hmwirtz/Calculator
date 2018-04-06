package e.harrison.enginecalculator;


public class Calculate {

    private Variables variables;

    public String dispCalc(){

        double displacement, PI, radius;

        PI = 3.14159;
        radius = variables.Bore /2;
        displacement = radius * radius * variables.Stroke * PI * variables.Cy;

        String disp = String.valueOf(displacement);

        return disp;





    }




}
