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

public class CSVUtilities {
	ArrayList<String> CSVData;
	int numColumns;
	
	public CSVUtilities(File csv)
	{
		ArrayList<String> CSVData = new ArrayList<String>();
		Path pathToFile = Paths.get("Water_Consumption_In_The_New_York_City.csv");
		
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
			while (line != null) 
			{
				String[] attributes = line.split(",");
			}
	}
	
	public List<String> getColumnHeaders()
	{
		
	}
	
	public List<String> getDataString(int column)
	{
		
	}
	
	public List<Integer> getDataInt(int column)
	{
		
	}

	public List<Double> getDataDouble(int column)
	{
		
	}
}
