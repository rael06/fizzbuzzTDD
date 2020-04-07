import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzzImpl();

    @Test
    public void FizzBuzz_TestNumber_ShouldReturnTrue(){
        boolean result = fizzBuzz.testNumber(6, 3);
        Assert.assertTrue(result);
    }

    @Test
    public void FizzBuzz_TestNumber_ShouldReturnFalse(){
        boolean result = fizzBuzz.testNumber(5, 3);
        Assert.assertFalse(result);
    }

    @Test
    public void FizzBuzz_IsFizz_ShouldBeTrue() {
        boolean result = fizzBuzz.isFizz(3);
        Assert.assertTrue(result);
    }

    @Test
    public void FizzBuzz_IsBuzz_ShouldBeTrue() {
        boolean result = fizzBuzz.isBuzz(5);
        Assert.assertTrue(result);
    }

    @Test
    public void FizzBuzz_IsFizzBuzz_ShouldBeTrue() {
        boolean result = fizzBuzz.isFizzBuzz(15);
        Assert.assertTrue(result);
    }

    @Test
    public void FizzBuzz_main() {
        fizzBuzz.main();
    }
}
