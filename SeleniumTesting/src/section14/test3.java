package section14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class test3 {

	public static void main(String[] args) {
		test3 tobj = new test3();
		tobj.streamMap();
	}
	
	public void streamMap()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Don");
		names.add("man");
		names.add("women");
		
		//converting arrays to arraylist
		List<String> names1 = Arrays.asList("Abhijeet","Don","Alekhya","Adam","Ram");
		
		//using limit to limit result
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		System.out.println("*************************");
		
		//concat two streams
		Stream<String>newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		
		System.out.println("*************************");
		//to check boolean result
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	

}
