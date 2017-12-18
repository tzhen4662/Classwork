package helloWorld;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List;

public class HelloWorld {
	public static void main(String[] args)
	{
		List<Person> people = readPeopleFromCSV("TimZhen.csv");
		
		for (Person b : people)
		{
			System.out.println(b);
		}
	}
	
	private static List<Person> readPeopleFromCSV(String fileName)
	{
		List<Person> people = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
			while (line != null)
			{
				String[] attributes = line.split(",");
				Person person = createPerson(attributes);
				people.add(person);
				line = br.readLine();
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}

		return people;
	}
	
	private static Person createPerson(String[] metadata)
	{
		String name = metadata[0];
		int age = Integer.parseInt(metadata[1]);
		String occupation = metadata[2];
		
		return new Person(name, age, occupation);
	}
}

class Person
{
	private String name;
	private int age;
	private String occupation;
	
	public Person(String name, int age, String occupation)
	{
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getOccupation()
	{
		return occupation;
	}
	
	public void setOccupation(String occupation)
	{
		this.occupation = occupation;
	}
	
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + ", occupation=" + occupation + "]";
	}
	
}
