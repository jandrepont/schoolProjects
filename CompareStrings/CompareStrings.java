import java.util.ArrayList;
/**                                                                                                                                      
 * Class CompareStrings
 * Author: Joel Andrepont, University of New Orleans, Dept of Computer Science
 * Created On: 6/20/2015
 * Version: Alpha
 * Description:  Class CompareStrings uses two methods. compareTo() takes two strings and orders them alphabetically. 
 * 
 **/

public class CompareStrings {	
 		
		/**
       	*  compareTo() takes two String arguments and returns a value based on their natural ordering.
		*  It ignores whitespaces and capitalization, only alhpabetical order is taken into account. 
      	*  @param takes two strings
        *  @return a value < 0 if s1 comes before s2, 0 if s1 == s2, and a value > 0 if s1 comes after s2
        **/

		public static int compareTo(String s1, String s2, int i) {	
				int result = 2;
				s1 = s1.replaceAll("\\s","");
				s2 = s2.replaceAll("\\s", "");
				System.out.println(s1 + " " + s2);
				int s1Length = s1.length();
				int s2Length = s2.length();
				Character s1char = new Character(s1.toLowerCase().charAt(i));
				Character s2char = new Character(s2.toLowerCase().charAt(i));
				if(s1.equalsIgnoreCase(s2) == true){                          
                	result = 0;
				}
				else if(s1Length-1 == i && s2Length-1 > i){
					result = -1;
                }
                else if(s1Length-1 > i && s2Length-1 == i){
                	result = 1;
                }
				else if (s1char < s2char){
						result = -1;
				}
				else if (s1char > s2char){
						result = 1;
				}
				else if (s1Length-1 > i && s2Length-1 > i){
					if(s1char.equals(s2char)){
                    	i++;
						return compareTo(s1, s2, i); 
					                   
                    }
				}	
				return result;
		}
		/** takes one argument, an ArrayList of generic type string 
		*	and finds the string that is first by alphabetical order
		*   given the array and number of strings in the array. It uses the compareTo() to eliminate an element with each comparison,
		*	keeping the element that is of highest alphabetical order, then ends by returning the element that is the minimum, i.e. 
		*	first by alphabetical order. If there is a repition in the list it removes one of the repitions in order to continue
		* 	the element with other elements
		*   @param takes an ArrayList<String> 
		*   @return returns a string that is the minimum  
		**/

		public static String findMinimum(ArrayList<String> stringArray){
			//how do without destroying the arraylist?
			int size = stringArray.size();
			String minimum = stringArray.get(0);
			String result = "string";
			if(size == 1){
				result = minimum;
			}
			else if(compareTo(stringArray.get(0), stringArray.get(1), 0) == 0) {
				stringArray.remove(1);
				System.out.println(stringArray);
				return findMinimum(stringArray);
			}
			else if(compareTo(stringArray.get(0), stringArray.get(1), 0) == -1){
				stringArray.remove(1);
				System.out.println(stringArray);
				return findMinimum(stringArray);
			}
			else if(compareTo(stringArray.get(0), stringArray.get(1), 0) == 1){
				stringArray.remove(0);
				System.out.println(stringArray);
				return findMinimum(stringArray);
			}
			System.out.println(result);
			return result;
		}



			
		




}

