package collection.practice;

import java.util.ArrayList;
import java.util.Iterator;

class TestJavaCollection1
{  
	public static void main(String args[])
	{  

		ArrayList<String> list=new ArrayList<String>();//Creating arraylist 

		list.add("Ravi");//Adding object in arraylist  

		list.add("Vijay");  

		list.add("Ravi");  

		list.add("Ajay");  

		//Traversing list through Iterator  

		Iterator itr=list.iterator();  

		while(itr.hasNext()){  

			System.out.println(itr.next());  
		}  
	}  
}  

//LinkedList<String> al=new LinkedList<String>();  
//Vector<String> v=new Vector<String>();  
