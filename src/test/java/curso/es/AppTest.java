package curso.es;

import org.junit.Test;
import com.sun.tools.javac.util.Assert;

public class AppTest {
    
    @Test
    public void should_sum_positive_numbers() {
        double result = App.sum(5, 1);
        assertEqual(6.0, result, 0);
    }
    
    @Test
    public void should_sum_negative_numbers() {
        double result = App.sum(-5, -1);
        assertEqual(-6.0, result, 0);
    }
    
     
    @Test
    public void should_sum_mix_numbers() {
        double result = App.sum(-5, 1);
        assertEqual(-4.0, result, 0);
    }

     
    @Test
    public void should_sum_numbers_with_zero() {
        double result = App.sum(0, 1);
        assertEqual(1, result, 0);
    }
    
    
    @Test
    public void should_double_positive_number() {
        double result = App.doubled(5);
        assertEqual(10, result, 0);
    }
    
     
    @Test
    public void should_doubled_negative_number() {
        double result = App.doubled(-2);
        assertEqual(-4.0, result, 0);
    }

     
    @Test
    public void should_double_zero() {
        double result = App.doubled(0);
        assertEqual(0.0, result, 0);
    }
}
