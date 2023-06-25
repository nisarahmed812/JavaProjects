package section14;

import java.util.ArrayList;
import java.util.stream.Stream;

public class test2 {

	public static void main(String[] args) {
		test2 tobj = new test2();
		tobj.streamFilter();
		tobj.streamMap();
		tobj.streamMapTest2();
		tobj.streamMapTest3();
	}
	
	public void streamFilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//using limit to limit result
		System.out.println("*************************");
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		System.out.println("*************************");
	}
	
	public void streamMap()
	{
		//print names which has last letter as "a" with UPPERCASE
		Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
		s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("*************************");
	}
	
	public void streamMapTest2()
	{
		//print names which has last letter as "a" with UPPERCASE
		Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").map(s->s.toUpperCase()).
		forEach(s->System.out.println(s));

		System.out.println("*************************");
	}
	
	public void streamMapTest3()
	{
		//print names which has last letter as "a" with UPPERCASE
		Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").forEach(s->System.out.println(s));

		System.out.println("*************************");
	}

}
