package USTBATCHNO3.JUNIT5TESTCASES;

    import static org.junit.Assert.assertEquals;

    import org.junit.Test;

    public class VechicleTest {
    	
    	@Test
    	public void vehicaltest() {
    		//String state = "KL";
    		int dis = 7;
    		String expected = "Ernakulam";
    		assertEquals(expected,Vechicle.district(dis));
    	}
    }

    

