import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void maximumAtFirstPosition(){
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.getMaximum(10,8,3);
        Assert.assertEquals(10,max);
    }
    @Test
    public void maximumAtSecondPosition(){
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.getMaximum(8,10,3);
        Assert.assertEquals(10,max);
    }
    @Test
    public void maximumAtThirdPosition(){
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.getMaximum(3,8,10);
        Assert.assertEquals(10,max);
    }
}
