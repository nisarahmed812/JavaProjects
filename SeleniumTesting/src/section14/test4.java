package section14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class test4 {

	public static void main(String[] args) {
		test4 tobj = new test4();
		tobj.streamCollect();
		System.out.println("*************************");
		tobj.streamInteger();
	}
	
	public void streamCollect()
	{
		//converting arrays to arraylist
		List<String> ls = Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
		s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
	}
	
	public void streamInteger()
	{
		//print unique number from this array
		//sort the array
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		values.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("*************************");
		
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}
	

}
