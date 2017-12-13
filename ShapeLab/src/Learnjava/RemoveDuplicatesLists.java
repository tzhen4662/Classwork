package Learnjava;
import java.util.ArrayList;
import java.util.Collections;


public class RemoveDuplicatesLists {
	public static void main(String[] args)
	{
		ArrayList tim = new ArrayList();
		tim.add(`)
	}
	public static ArrayList<Integer> removeDupes (ArrayList<Integer> nums)
	{
		Collections.sort(nums);
		for (int i = 0; i < nums.size()-1; i++)
		{
			for (int j = i+1; j < nums.size(); j++)
			{
				if (nums.get(i) == nums.get(j))
				{
					nums.remove(i);
				}
			}
		}
		return nums;
	}
	
}
