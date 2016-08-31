import java.util.*;
import java.io.*;

public class Histogram {
	public static void main(String[] args) throws IOException {
		ArrayList<Character> list = new ArrayList<Character>();
		FileReader in = null; //initiate FileReader
		
		try{
			in = new FileReader(args[0]); //open to be read from command line 
			
			int c;
			while((c = in.read()) != -1){  //read file character by character
				list.add((char) c);         //type cast it to char and add to list
			} 
		}
		
		finally{
			if(in != null){
				in.close();
			}
			
		}
		
		ArrayList<Character> list2 = listOfChars(list);
		System.out.println(list2.size());	
        for (int i = 0; i <list2.size(); i++){
		   System.out.print(list2.get(i));
		}
		char modee = mode(list2);
		System.out.println(modee);
		int count = occurenceOfChar(list2, "A");
		double percentage = percentageOfOccurence(list2, count);
		System.out.println(" ");
	    System.out.println(count);
	    System.out.println(String.format("%.2f",percentage) +"%");
	}

		/*
		//method to get ArrayList of just Characters.........
		ArrayList<Character> list2 = new ArrayList<Character>();
		for (int z = 0; z <list.size(); z++){
			if ((String.valueOf(list.get(z)).matches("[A-Z]+")) || (String.valueOf(list.get(z)).matches("[a-z]+"))) {
				list2.add(list.get(z));
			}
		} 
		*/
	    public static ArrayList<Character> listOfChars (ArrayList<Character> list){
			ArrayList<Character> list2 = new ArrayList<Character>();
		    for (int z = 0; z <list.size(); z++){
			if (String.valueOf(list.get(z)).matches("[A-Z]+")) {
				list2.add(list.get(z));
			}
		} 
		return list2;
		}
	
/*
       System.out.println(list2.size());	
       for (int i = 0; i <list2.size(); i++){
		   System.out.print(list2.get(i));
	   }
	   */
	   
	   /*method to get occurence of each character
	   int counting = 0;
	   for (int x=0; x<list2.size();x++){
		   if ((String.valueOf(list2.get(x)).matches("A")) || (String.valueOf(list.get(x)).matches("a"))) {
			    counting = counting + 1;
		   }
		
	   }
	   */
	   public static int  occurenceOfChar (ArrayList<Character> list2, String X){
		   int counting = 0;
	    for (int i=0; i<list2.size(); i++){
		   if (String.valueOf(list2.get(i)).matches(X)) {
			    counting = counting + 1;
		   }
		
	   }
	   return counting;
	   }
	   
       // method to calculate percentage
	   public static double percentageOfOccurence(ArrayList<Character> list2, int counting){
        double percentage = (double)counting / list2.size();
		return percentage;
	   }
	   
	   // calculate mode
	   public static char mode(ArrayList<Character> markList){ 
		char mode = markList.get(0);
		int maxCount = 0;
		for (int i = 0; i < markList.size(); i++){
			char value = markList.get(i);
			int count = 1;
			for(int j = 0; j < markList.size(); j++){
				if (markList.get(j) == value) count++;
				if (count > maxCount){
					mode = value;
					maxCount = count;
				}
			}
        }
		System.out.println(maxCount);
		return mode;
	}
	
}