package practice_code;

import java.util.HashMap;

public class CountWordsinString_UsinghashMap {

	public static void main(String[] args) {
		
		
		
		//String long_String="welcome to java and Selenium";
		
		//using hashmap
	/*	HashMap<String, Integer> hashmap=new HashMap<String, Integer>();
		
		String[] words=long_String.split(" ");
		for(String word:words)
		{
			Integer integer=hashmap.get(word);
		
			if(integer==null)
			{
				hashmap.put(word, 1);
			}
				else
	            {
	                // Incrementing the value if the word
	                // is already present in the HashMap.
	            	hashmap.put(word, integer + 1);
	            }
	        }
	        System.out.println(hashmap);
	      */  
	        
	        
	        String words = "One Two Three Four";
	        int countWords = words.split("\\s").length;
	        System.out.println(countWords);
			}
		}
		


	
