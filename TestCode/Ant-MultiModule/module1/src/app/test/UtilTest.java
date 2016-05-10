package app.test;
import org.junit.Test;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

public class UtilTest extends TestCase {
   String str = "abc";
   SampleUtil sampleUtil = new SampleUtil(str);

   @Test
   public void testMethod1() {
      assertEquals("abc", sampleUtil.GetMessage());
   }

   @Test
   public void testMethod2() {
      String str = "mno";
      assertEquals("mno", str);
   }
}