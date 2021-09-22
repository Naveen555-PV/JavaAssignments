package org.Tech.app;

import java.util.Scanner;

public class ApptitudeExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st[] = {
				
				"1. Which of the following is not  with industrial food production?"+"\r\na) The use of fossil fuels\r\n" +"b) Chemical fertilizers\r\n" +"c) Large amount of labour\r\n" +"d) Machinery",
				"2. With what bio-region is the team ‘steppe’ associated?"+"\r\na) Coniferous forest\r\n" +"b) Tropical forests\r\n" +"c) Savanna\r\n"+"d) Grass land",
				"3. In which of the following areas do international environmental treaties exist?"+"\r\na) Fisheries\r\n"+"b) Whaling\r\n" +"c) Ocean pollution\r\n" +"d) All",
				"4. What percentage of earths water is fresh water?"+"\r\na) 75 percent\r\n"+"b) 3 percent\r\n" +"c) 27 percent\r\n"+"d) 10 percent",
				"5. Which country ratified the Kyoto protocol in late 2004 and thus caused it to become international law?"+"\r\na) Russia\r\n"+"b) USA\r\n" +"c) China\r\n"+"d) India",
				"6. A sum of money at simple interest amounts to Rs. 815 in 3 years and to Rs. 854 in 4 years. The sum is:"+"\r\na) Rs. 650\r\n" +"b) Rs. 690\r\n" +"c) Rs. 698\r\n" +"d) Rs. 700",
				"7. Which natural disaster causes more deaths than any other?"+"\r\na) Volcano\r\n"+"b) Fire\r\n" +"c) Flooding \r\n"+"d) Earthquakes",
				"8. The natural process of the earths atmosphere heating through the traping of re-radiated infra-red radiation is known as"+"\r\na) Global warming\r\n" +"b) Green house effect\r\n" +"c) Solar heating\r\n" +"d) Thermal inversion",
				"9. Temperate forests are likely to have which of the following species of trees?"+"\r\na) Maple\r\n"+"b) Spruce\r\n" +"c) Pine\r\n"+"d) All",
				"10. About what percentage of Earth people live in areas where water shortage are common."+"\r\na) 40 percent\r\n"+"b) 30 percent\r\n" +"c) 45 percent\r\n"+"d) 25 percent",
				"11 Tropo pause is the boundary line between troposphere and ———"+"\r\na) Mesosphere\r\n" +"b) Stratosphere\r\n" +"c) ionosphere\r\n"+"d) Exosphere",
				"12. Shrubs, thickest and stunted trees like kikar,jal and others are found in"+"\r\na) evergreen forests\r\n" +"b) deciduous forests\r\n" +"c) dry forests\r\n" +"d) hill forests",
				"13. The study of day-to-day variations in weather is called"+"\r\na) Climatology\r\n"+" b) Meteorology\r\n" +"c) Cyclogensis\r\n"+"d) None",
				"14. The world’s growing appetite for what food product is a leading cause of tropical deforestation?"+"\r\na) Lamb\r\n"+"b) Sugar\r\n" +"c) Beef\r\n"+"d) Pork",
				"15. According to your text, what can “be thought of as the genetic library that keeps life going on earth”?"+"\r\na) Bio-diversity\r\n" +"b) Human genes\r\n" +"c) The human genome project\r\n" +"d) None",
				"16. Between 1950 and 1980, an area of the size of Denmark has been decertified in which country."+"\r\na) China\r\n"+"b) India\r\n"+"c) Bangladesh\r\n"+"d) Iran ",
				"17. If current rates of deforestation continues in south-east Asia, then how many years would it take for the region to become completely stripped of its forest?"+"\r\na) 30\r\n"+"b) 40\r\n"+"c) 50\r\n"+"d) 60",
				"18. In what type of bio-region is desertification most likely to occur?"+"\r\na) Temperate forest\r\n" +"b) Savanna\r\n" +"c) Tropical forests\r\n" +"d) Grass lands",
				"19. Why is cattle ranching not sustainable in areas that were formerly tropical forests?"+"\r\na) Cattle reaching quickly exhausts the nutrient-poor soil of tropical rainforests.\r\n" +"b) Cattle waste is toxic to rainforest soils.\r\n" +"c) Both (a) and (b)\r\n" +"d) None",
				"20. According tom United National estimate about how much of the world’s range-lands are threatened by desertification?"+"\r\na) 60 percent\r\n"+"b) 70 percent\r\n" +"c) 50 percent\r\n"+"d) 30 percent",
				
				};
		char ch[]= {'c','b','b','d','a','c','d','d','b','a','c','d','a','a','b','d','b','c','a','a'};
		char ans;
		int i,count=0;
		for( i=0;i<st.length;i++) {
			 System.out.println(st[i]+" ");
					System.out.println();
			        ans=sc.next().charAt(0);
			        if(ans==ch[i])
			        	count++;}
		System.out.println("No.of questions Attempted: "+i);
		System.out.println("No.of questions Correct: "+count);
		double per=(count*100)/i;
		System.out.println("Percentage: "+per);
		if(per>=86.0&&per<=100.0) System.out.println("Excellent");
		else if(per>=71.0&&per<=85.0) System.out.println("Very Good");
		else if(per>=50.0&&per<=70.0) System.out.println("Good");
		else if(per>=35.0&&per<=49.0) System.out.println("Poor");
		else System.out.println("Bad");
		
		if(per>=50.0)
			System.out.println("Candidate is eligible for Next Round");
	}

}
