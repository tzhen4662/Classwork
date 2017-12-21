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
		Path pathToFile = Paths.get(csv.getAbsolutePath());
		
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
			while (line != null) 
			{
				String[] attributes = line.split(",");
				this.CSVData.add(line);
				line = br.readLine();
				if (attributes != null)
				{
					for (int i = 0; i < line.length(); i++)
					{
						CSVData.add(line);
					}
				}
			}
		}
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
		}
		
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
		
	}
	
	public List<Integer> getDataInt(int column)
	{
		
	}

	public List<Double> getDataDouble(int column)
	{
		
	}
}
