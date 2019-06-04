package day45;

import java.util.ArrayList;

	public class JobSeeking 
	{

	public static void main(String[] args) 
	{
//	    *   Create few job objects and and add it to ArrayList<Job> object
//	    *   iterate over all items and print them out
		Job job1 = new Job("SME", "Citi", 195000f);
		Job job2 = new Job("CEO", "Cybertek", 180000f);
		Job job3 = new Job();
		Job job4 = new Job("SDET", "Google", 150000);
		
		
		ArrayList<Job> jobs = new ArrayList<Job>();
		jobs.add(job1);
		jobs.add(job2);
		jobs.add(job3);
		jobs.add(job4);
		
		int []a1 = new int [5];
	
		int x = jobs.size();
		
		for(int i=0; i<x ; i++)
		{
			System.out.println(jobs.toString());
		}
		
		
		
		
		
	}

}
