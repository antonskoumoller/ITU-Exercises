package exercise_week6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Main1Test {
    @Test void inverseGivesRightOutput() {
        Main1 classUnderTest = new Main1();
        int[] a = {1,2,3,4};
        int[] aInv = {4,3,2,1};
        assertArrayEquals(aInv,classUnderTest.inverse(a), "Output not correct");

    }

    @Test void concatGivesCorrectOutput() {
        Main1 classUnderTest = new Main1();
        String a = "Bicycle";
        String b ="wheel"; 
        assertEquals("Bicycle wheel", classUnderTest.concatString(a, b), "Output not correct");
    }

    @Test void testFuncWithMod1() {
        Main1 classUnderTest = new Main1();
        int a = 1; 
        assertEquals(a+a, classUnderTest.f(a), "Output should be " + a + "+" + a + "=" + a+a);

    } 

    @Test void testFuncWithModNot1() {
        Main1 classUnderTest = new Main1();
        int a = 6; 
        assertEquals(a*a, classUnderTest.f(a), "Output should be " + a + "*" + a + "=" + a*a);
    }
}
