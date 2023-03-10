package USTBATCHNO3.JUNIT5TESTCASES;
import java.util.*;

public class NameChecker {

	public static long  checkname(List<String> name, String targetname) {
	
		return name.stream().filter(n->n.equalsIgnoreCase(targetname)).count();
	}
	
}

