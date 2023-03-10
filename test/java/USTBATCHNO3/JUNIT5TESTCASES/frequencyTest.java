package USTBATCHNO3.JUNIT5TESTCASES;

	import static org.junit.Assert.assertEquals;

	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.function.Function;
	import java.util.stream.Collectors;

import org.junit.Test;

	public class frequencyTest {
		
		@Test
		public void freqtest() {
			List<String> s = Arrays.asList("Aysha","Meera","Anu");
			Map<String,Long> expected = new HashMap<String,Long>();
			expected.put("Aysha", (long) 1);
			expected.put("Meera",(long) 1);
			expected.put("Anu",(long) 1);
			
			Map<String,Long> actual = WordFrequency.count(s);
			assertEquals(expected,actual);
		}
	}

	


