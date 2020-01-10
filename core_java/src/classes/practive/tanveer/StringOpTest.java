package classes.practive.tanveer;

import com.java.pack.m12.d22.StringOutput3;
import org.junit.Assert;
import org.junit.Test;

public class StringOpTest {

    StringOp strOp = new StringOp();

    @Test
    public void testmethod1() {
        String input = "-Xmx1G -Xms256M -Darg1=arg1override";
        String output = "min-memory: 256.00, max-memory: 1000.00";
        Assert.assertEquals(output,
                strOp.stringOutput(input)
        );
    }
    @Test
    public void testmethod2() {
        String input = "-Xmx1000M -Xms256M -Darg1=arg1override";
        String output = "min-memory: 256.00, max-memory: 1000.00";
        Assert.assertEquals(output,
                strOp.stringOutput(input)
        );
    }
    @Test
    public void testmethod3() {
        String input = "-Xmx1000 -Xms256M -Darg1=arg1override";
        String output = "min-memory: 256.00, max-memory: 1000.00";
        Assert.assertEquals(output,
                strOp.stringOutput(input)
        );
    }


    @Test
    public void testmethod4() {
        String input = "-Xmx1G -Xms128M -Darg1=arg1override";
        String output = "min-memory: 128.00, max-memory: 1000.00";
        Assert.assertEquals(output,
                strOp.stringOutput(input)
        );
    }
}
