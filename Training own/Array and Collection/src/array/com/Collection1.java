package array.com;

import java.util.*;

public class Collection1 {

	public static void main(String[] args) {
	 
		//List(Interface)=> Class(ArrayList,LinkedList,Vector,Stack)		
	
	 List<Integer> l1=new ArrayList(); // Four method => add,addAll,remove,removeAll.
	 List<Integer> l4=new ArrayList(); //size()
	 l1.add(111);
	 l1.add(121);
	 l1.add(121);
	 l1.remove(1);
	 l4.addAll(l1);
	 System.out.println("ArrayList contains "+l1);
	 System.out.println("ArrayList contains l4 using of AddAll "+l4);

	//method 1 Iteration using FOREACH
     for(int l2:l1)
	 {
		 System.out.println(l2 +" USING OF FOREACH");
	 }
	 
     //Method 2 Iteration using of ITERATOR INTERFACE. 	
	
	 /* In the iterater interface there are Three methods
	 	 1) hasNext() - it is using for boolean Condition of element.
	 	 2) next()- it is print the next element in the object.
	 	 3) remove()-it is remove last element. 
	 */
     Iterator t1=l1.iterator(); 
   
     while(t1.hasNext())
     {
    	 System.out.println("It is using of Iterator Interface "+t1.next());
     }    
  
     
	}
}
