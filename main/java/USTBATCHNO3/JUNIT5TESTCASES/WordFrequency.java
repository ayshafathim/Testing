package USTBATCHNO3.JUNIT5TESTCASES;



	import java.util.Arrays;
	import java.util.List;
	import java.util.Map;
	import java.util.function.Function;
	import java.util.stream.Collectors;

	public class WordFrequency {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<String> ls = Arrays.asList("Aysha","Meera","Anu");
			Map<String,Long> count = count(ls);
			System.out.println(count);
		}
		
		public static Map<String,Long> count(List<String> s) {
			
			Map<String,Long> m = s.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			return m;
			
		}
	}	
		
		
		
		
		
		
		