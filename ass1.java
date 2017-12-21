
import java.util.*;
public class ass1{
	public static void main(String[] args) {
	
		

		Scanner sc=new Scanner(System.in);  
     
   System.out.println("Statement:");  
   String Statement=sc.nextLine();  

HashMap<String,String> hm=new HashMap<String,String>();  

			
		Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        Map.Entry mentry = (Map.Entry)iterator.next();
     

	   
	if(Statement.equals("add")){
		System.out.println("In Kyrgyz:");
		String key=sc.nextLine(); 
   		System.out.println("Translation:");
   		String valye=sc.nextLine();

   			

   				
   					hm.put(key,valye);
   				


	}else if(Statement.equals("translate")) {
		System.out.println("Give a word:");  
   		String word=sc.nextLine();
   		System.out.println("Translation:");
   		

		   		if(mentry.getKey().equals(word)){
		   			System.out.println(mentry.getValue());	
		   		}else{
		   			System.out.println("Unknown statement");
		   		}
		
	}else if (Statement.equals("quit")) {
		System.out.println("See u!");
	}
	else{
		System.out.println("Unknown statement");
	}
	


   
   
   sc.close();        



  





	}

}