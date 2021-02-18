public class ArrayWithChief {
    public static void main(String[] args) {
        int [] f = {3, 4, 6, 7, 8, 5, 3, 5, 6, 79, 23, 90};
        System.out.println("Element 6 = " + f [5]);

        int [] g = {8, 8, 8, 8, 8};

        float total = 0;
        float[] c = new float[100];

        for(float counter = 0; counter < c.length; counter ++){
            c[ (int) counter] = counter;
            total+= c[(int) counter];
        }
        System.out.println(total);

        int [][] t = new int [2][3];
    }
}
