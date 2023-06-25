package section14;

import java.util.ArrayList;
import java.util.stream.Stream;

public class test1 {

	public static void main(String[] args) {
		test1 tobj = new test1();
		tobj.regular(); //with for loop
		tobj.streamFilter(); //with stream
		tobj.streamOfFalse(); //with streamOf false
		tobj.streamOfTrue(); //with streamOf true
	}
	
	public void regular()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		int count = 0;
		
		for(int i=0; i<names.size(); i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void streamFilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		//there is no life of intermediate operation if there is no terminal operation
		//terminal operation will execute only if intermediate operation (filter) returns true
		//we can create stream with stream package
		//how to use filter in stream API
		
		long c = names.stream().filter(s->s.startsWith("A")).count(); //count data type is long
		System.out.println(c);
	}
		
		
		public void streamOfFalse()
		{
			long f = Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
			{
				s.startsWith("A");
				return false;
			}).count();
			
			System.out.println(f);
		}
		
		public void streamOfTrue()
		{
			long t = Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(var->
			{
				var.startsWith("A");
				return true;
			}).count();
			
			System.out.println(t);
		}
	

}
