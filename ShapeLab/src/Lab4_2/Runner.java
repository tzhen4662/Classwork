package Lab4_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List; 

public class Runner {
	public static void main (String[] arg)
	{
		File plzwork = new File("Water_Consumption_In_The_New_York_City.csv");
		CSVUtilities plswork = new CSVUtilities(plzwork);
		List<Integer> column = plswork.getDataInt(1);
		/* for (int i = 0; i < column.size(); i++)
		{
			System.out.print(i);
		} */
		System.out.print(column);
	}
}
