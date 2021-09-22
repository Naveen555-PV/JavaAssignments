package org.Tech.app;
import java.util.*;

public class JobPortal {
	public static class Candidate
	{
	        String name;
	        float percentage;
	        boolean resume;
	        String college;
	    }
	    public static class Company
	    {
	        String companyName;
	        float minPercentage;
	        boolean resume;
	    }
		public static void main(String[] args) {
		    List<Candidate> candidatesList = new ArrayList<>();
			Scanner sc = new Scanner(System.in);
			System.out.println("How many candidates data you want to enter:");
			int n = sc.nextInt();
			for(int j=1;j<=n;j++){
			    System.out.println("Enter the details of candidate "+j);
			    Candidate candidate = new Candidate();
			    System.out.println("Enter Candidate"+j+" name");
			    candidate.name = sc.next();
			    System.out.println("Enter Candidate"+j+" percentage");
			    candidate.percentage = sc.nextFloat();
			    System.out.println("Do Candidate"+j+" have resume, Enter true/false");
			    candidate.resume = sc.nextBoolean();
			    System.out.println("Enter Candidate"+j+" college name");
			    candidate.college = sc.next();
			    candidatesList.add(candidate);
			}
			Company company = new Company();
			System.out.println("Enter the company name:");
			company.companyName = sc.next();
			System.out.println("Enter the company minPercentage for shortlist:");
			company.minPercentage = sc.nextFloat();
			System.out.println("Does the company wants a resume? Enter true/false");
			company.resume = sc.nextBoolean();
			List<Candidate> shortListed = new ArrayList<>();
			for(int i=0;i<candidatesList.size();i++){
			    if(candidatesList.get(i).percentage >= company.minPercentage && candidatesList.get(i).resume == company.resume){
			        shortListed.add(candidatesList.get(i));
			    }
			}
			System.out.println("Following candidates have beesn shortlisted");
			for(int i=0;i<shortListed.size();i++){
			    System.out.println(shortListed.get(i).name);
			}
		}
	}


