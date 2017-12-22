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
	ArrayList<String> CSVData = new ArrayList<String>();
	int numColumns;
	
	public CSVUtilities(File csv)
	{
		Path pathToFile = Paths.get("Water_Consumption_In_The_New_York_City.csv");
		
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
			while (line != null) 
			{
				String[] attributes = line.split(",");
				this.CSVData.add(line);
				line = br.readLine();
			}
		}
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
		}
		this.numColumns = getColumnHeaders().size();
	}
	
	public List<String> getColumnHeaders()
	{
		ArrayList<String> data = new ArrayList<String>();
		if (!CSVData.isEmpty())
		{
			String[] split = CSVData.get(0).split(",");
			for(int i = 0; i < split.length; i++)
			{
				data.add(split[i]);
			}
		}
		return data;
	}
	
	public List<String> getDataString(int column)
	{
		ArrayList<String> data = new ArrayList<String>();
		for (int i = 0; i < CSVData.size(); i++)
		{
			data.add(CSVData.get(i));
		}
		return data;
	}
	
	public List<Integer> getDataInt(int column)
	{
		ArrayList<Integer> data = new ArrayList<Integer>();
		for(int i = 0; i < CSVData.size(); i++)
		{
			try
			{
				data.add(Integer.parseInt(CSVData.get(i)));
			}
			catch(NumberFormatException e)
			{
				System.out.println("no");
				//continue;
			}
		}
		return data;
	}

	public List<Double> getDataDouble(int column)
	{
		ArrayList<Double> data = new ArrayList<Double>();
		for(int i = 0; i < CSVData.size(); i++)
		{
			try
			{
				data.add(Double.parseDouble(CSVData.get(i)));
			}
			catch(NumberFormatException e)
			{
				System.out.println("no");
			}
		}
		return data;
	}
}
