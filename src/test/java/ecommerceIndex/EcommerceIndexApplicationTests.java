package ecommerceIndex;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EcommerceIndexApplicationTests {

	@Test
    public void Case1() {
		System.out.println("testCase1");
		assertTrue(true);
    }

    @Test
    public void Case2() {
    	System.out.println("testCase2");
    	assertTrue(false);
    }
}
