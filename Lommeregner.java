package dev.asmussen;

public class Lommeregner {
    
    // Min lommeregner logic er ikke færdig endnu, for at kunne komme vidre med den skal jeg lave GUI.java færdig.
    public static float calculate(float input) {

        float result = 0;

        int convertedInput = Integer.parseInt(String.valueOf(input));
        int calculatedInput = Integer.valueOf(convertedInput);

        result = Float.valueOf(String.valueOf(calculatedInput));

        return result;
    }
}
