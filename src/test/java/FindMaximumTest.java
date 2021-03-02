import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void IntegermaximumAtFirstPosition(){
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.getMaximum(10,8,3);
        Assert.assertEquals(10,max);
    }
    @Test
    public void IntegermaximumAtSecondPosition(){
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.getMaximum(8,10,3);
        Assert.assertEquals(10,max);
    }
    @Test
    public void IntegermaximumAtThirdPosition(){
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.getMaximum(3,8,10);
        Assert.assertEquals(10,max);
    }

    @Test
    public void FloatmaximumAtFirstPosition(){
        FindMaximum findMaximum = new FindMaximum();
        float max = findMaximum.getMaximum(10.25f,8.5f,3.2f);
        Assert.assertEquals(10.25,max,0.00);
    }
    @Test
    public void FloatmaximumAtSecondPosition(){
        FindMaximum findMaximum = new FindMaximum();
        float max = findMaximum.getMaximum(8.5f,10.25f,3.2f);
        Assert.assertEquals(10.25,max,0.00);
    }
    @Test
    public void FloatmaximumAtThirdPosition(){
        FindMaximum findMaximum = new FindMaximum();
        float max = findMaximum.getMaximum(3.2f,8.5f,10.25f);
        Assert.assertEquals(10.25,max,0.00);
    }

    @Test
    public void StringmaximumAtFirstPosition(){
        FindMaximum findMaximum = new FindMaximum();
        String max = findMaximum.getMaximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach",max);
    }
    @Test
    public void StringmaximumAtSecondPosition(){
        FindMaximum findMaximum = new FindMaximum();
        String max = findMaximum.getMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach",max);
    }
    @Test
    public void StringmaximumAtThirdPosition(){
        FindMaximum findMaximum = new FindMaximum();
        String max = findMaximum.getMaximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach",max);
    }
}
