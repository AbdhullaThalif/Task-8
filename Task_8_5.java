package javaprogramming;

public class Task_8_5 {
	public static void main(String[] args) {
		 int x = 10, i, count=0;
	      
	      for(i=2; i<x; i++)
	      {
	         if(x%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	         System.out.println("Prime Number");
	      else
	         System.out.println("Not a Prime Number");
	   }
}
