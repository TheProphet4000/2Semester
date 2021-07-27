/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/10/2020
 *
 */

package zunit;

public abstract class TestSuite {
    private int passed; // private - kun klassen selv kan se den
    private int failed;

    public void runTestSuite(){
        passed = 0;
        failed = 0;

        testMethodList();

        System.out.println("Tests passed: " + passed);
        System.out.println("Tests failed: " + failed);
    }
    public abstract void testMethodList();

    public void assertEquals(int expected, int actual){
        if(expected == actual) {
            passed++;
        }else{
            failed++;
            System.out.println("Test " + (passed + failed) +  " has failed.\n" + "Expected result: " + expected + "\n" +
            "Actual result: " + actual);
        }
    }
}
