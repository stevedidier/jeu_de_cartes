package carte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Brown", "Purple"));
        String color = "Yellow";
 
        colors.add(3, color);
        System.out.println(colors);
    }



}
