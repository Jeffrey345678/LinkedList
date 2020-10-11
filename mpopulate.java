package populate0;
import java.lang.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 import java.util.Scanner;

import java.util.LinkedList;

public class mpopulate
{
 
 
	public static void main(String[] args) throws IOException
	{
		LinkedList0 ll = new LinkedList0();


		System.out.println("let's print to a LL");

		String dataFile = "D:\\Users\\Jeffrey Blumel\\git\\CSIS2420F20\\Week 2\\GenRandAccounts\\AccountNumbers.csv";
		BufferedReader reader = new BufferedReader(new FileReader(dataFile));
		
		int numLines = 0;
        String line = reader.readLine();
        
       
        System.out.println("Counting lines in the data file ... ");
		long startmyapi = System.nanoTime(); // start timer for my api
        while (line != null){ 
			numLines++;
			ll.append(line);
			line = reader.readLine();
		}
        reader.close();
        long finishmyapi = System.nanoTime();
        long elapsedmyapi =  finishmyapi - startmyapi;
        
    //list walk and length my api     
        long startmyapilength = System.nanoTime();
        ll.length(); 
        long finishmyapilength = System.nanoTime();
        long elapsedmyapilength = finishmyapilength - startmyapilength;
   
    //search list my api  
        
        String searchvalue =  "298853"; // value to search for using my api
        long startsearchmyapi = System.nanoTime();
        ll.searchList(searchvalue);
        long finishsearchmyapi = System.nanoTime();
        long elapsedsearchmyapi = finishsearchmyapi - startsearchmyapi;
        
        //print LL my API
		ll.printList();
		
		
		BufferedReader reader1 = new BufferedReader(new FileReader(dataFile));
		LinkedList<String> stringList = new LinkedList<String>();
		line = reader1.readLine(); 
		
		long startjavaapi = System.nanoTime();
		System.out.print("List: ");
		 while (line != null){ 
				stringList.add(line);
				line = reader1.readLine();
			}
		 
		 long finishjavaapi =  System.nanoTime();
		 long elapsedjavaapi =  finishjavaapi - startjavaapi;
		 
	//walk/count number of entries java api	 
		 long startjavaapilength = System.nanoTime();
		 System.out.println(stringList.size() + ": number of cells in the list.");
		 System.out.println(stringList);
		 long finishjavaapilength = System.nanoTime();
		 long elapsedjavaapilength = finishjavaapilength - startjavaapilength;
		 
	
	// search using java api	
		 Boolean javaapisearch; 
		 long startsearchjavaapi = System.nanoTime();
		 javaapisearch = stringList.contains("880337"); // input value to search for
		 long finishsearchjavaapi = System.nanoTime();
		 long elapsedsearchjavaapi = finishsearchjavaapi - startsearchjavaapi;
		 System.out.println("Does the LL contain the value you inserted? " + javaapisearch);
		 
	// append my api
		 long startappendmyapi = System.nanoTime();
		 ll.append();
		 long finishappendmyapi = System.nanoTime();
		 long elapsedappendmyapi = finishappendmyapi - startappendmyapi;
	
	// java api append	 
		 String valuetoappend;
		 valuetoappend = "880337";
		 long startappendjavaapi = System.nanoTime();
		 stringList.addLast(valuetoappend);
		 long finishappendjavaapi = System.nanoTime();
		 long elapsedappendjavaapi = finishappendjavaapi - startappendjavaapi;
		 
		
		 
		
		System.out.println("Time for Java api to print to LL " + elapsedjavaapi + " NS.");
		System.out.println("Time for my api print to LL " + elapsedmyapi + " NS.");
		System.out.println("Time it takes to walk the list with my api " + elapsedmyapilength + " NS.");
		System.out.println("Time it takes to walk the list with java api " + elapsedjavaapilength + " NS.");
		System.out.println("Time it takes to search the list with my api " + elapsedsearchmyapi + " NS.");
		System.out.println("Time it takes to search the list with java api " + elapsedsearchjavaapi + " NS.");
		System.out.println("Time it takes to append list using my api " + elapsedappendmyapi + " NS.");
		System.out.println("Time it takes to append list using java api " + elapsedappendjavaapi + " NS.");
		
		reader1.close();
	}
}


