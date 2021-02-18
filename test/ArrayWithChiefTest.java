import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayWithChiefTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test() {
        int [] score = {25, 3, 12, 21, 19};
        int [] studentScores;
        int [] testScore = new int[4];

        testScore[0] = 17;
        testScore[1] = 25;
        testScore[2] = 7;
        testScore[3] = 23;


        String [] names = {"Ibukun", "Onyi", "Lasuite"};

        System.out.println("Implementing for loop");

        for (int counter = 0; counter < names.length; counter++){
            System.out.println(names[counter]);
        }

        System.out.println();

        System.out.println("Implementing while loop");
        int counter = 0;
        while (counter < names.length){
            System.out.println(names[counter]);
            counter++;
        }


    }

    @Test
    void multiDimensionalArrayTest() {
        int [][] grades = new int[3][4];

        int [][] scores = {
                {70, 89, 98, 93},
                {57, 49, 82, 90},
                {75, 34, 99, 45}
        };

        for (int row = 0; row < scores.length; row++){
            System.out.println("Processing row " +row);
            for (int col = 0; col < scores[row].length; col++){
                System.out.print(scores[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Loop with enhanced for loop");
        for (int[] row : scores){
            System.out.println("Processing row");
            for (int col : row){
                System.out.print(col);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    @Test
    void testAndAssignValueToArray(){
        float total = 0;
        float[] c = new float[100];

        for(float counter = 0; counter < c.length; counter ++){
            c[ (int) counter] = counter;
            total+= c[(int) counter];
        }
        System.out.println(total);
        assertEquals(4950, total);
    }

    @Test
    void salesCommissionTest(){
        int [] salesAmount = {4000, 5000, 500, 100000, 5500};
        int [] frequency = new int [9];

        SalesCommission.getSalesCommissionDistribution(salesAmount, frequency);
        assertEquals(1, frequency[3]);
    }
}