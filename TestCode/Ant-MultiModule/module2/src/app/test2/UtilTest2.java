package app.test2;
import org.junit.Test;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

public class UtilTest2 extends TestCase {
   String str = "abc";
   SampleUtil2 sampleUtil = new SampleUtil2(str);

   @Test
   public void testMethod3() {
      assertEquals("abc", sampleUtil.GetMessage());
   }

   @Test
   public void testMethod4() {
      String str = "mno";
      assertEquals("mno", str);
   }
}