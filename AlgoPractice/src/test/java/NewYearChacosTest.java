import com.algo.sorting.BubbleSortDemo;
import com.practice.hackerrank.NewYearChacos;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class NewYearChacosTest {
    Integer[] arr;

    public NewYearChacosTest() {
        arr = new Integer[] {25, 10, 15, 5, 1};
    }

    @Before
    public void beforeTest() {
        System.out.println("In before test");
    }

    @Test
    public void doTest1() {
        Assert.assertEquals(NewYearChacos.minimumBribes1(Arrays.asList(new Integer[] {1, 2, 5, 3, 4, 7, 8, 6})), 4);
    }

    @Test
    public void doTest2() {
        Assert.assertEquals(NewYearChacos.minimumBribes2(Arrays.asList(new Integer[] {1, 2, 5, 3, 7, 8, 6, 4})), 7);
    }
    @Test
    public void doTest3() {
        Assert.assertEquals(NewYearChacos.minimumBribes1(Arrays.asList(new Integer[] {1, 2, 5, 3, 7, 8, 6, 4})), 7);
    }

    @After
    public void afterTest() {
        System.out.println("In after test");
    }
}
