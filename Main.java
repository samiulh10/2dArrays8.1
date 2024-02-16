public class Main {
    public static void main(String[] args) {
        int[][] intArray = {{1, 1, 1}, {2, 2, 2}};
        String[][] stringArray = {{"Hello", "World", "!"}, {"Samiul", "Sakib", "Holmer"}};
        boolean[][] booleanArray = {{true, true, true}, {false, false, false}};
        double[][] doubleArray = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        Cat[][] catArray = new Cat[3][3];

        catArray[0][0] = new Cat("blue");
        doubleArray[0][2] = doubleArray[1][2];
        booleanArray[0][1] = booleanArray[1][2];
        stringArray[0][2] = "!!";
        intArray[0][1] = 2;

        for (int row = 0; row < intArray.length; row++) {
            for (int column = 0; column < intArray[0].length; column++) {
                System.out.print(intArray[row][column]);
            }
        }

        System.out.println();


        for (int column = 0; column < intArray.length; column++) {
            for (int row = 0; row < intArray.length; row++) {
                System.out.print(intArray[row][column]);
            }
        }

        System.out.println();

        for (int row = 0; row < stringArray.length; row++) {
            for (int column = 0; column < stringArray[0].length; column++) {
                System.out.print(stringArray[row][column]);
            }
        }

        System.out.println();


        for (int column = 0; column < stringArray.length; column++) {
            for (int row = 0; row < stringArray.length; row++) {
                System.out.print(stringArray[row][column]);
            }
        }

        System.out.println();

        for (int row = 0; row < booleanArray.length; row++) {
            for (int column = 0; column < booleanArray[0].length; column++) {
                System.out.print(booleanArray[row][column]);
            }
        }

        System.out.println();


        for (int column = 0; column < booleanArray.length; column++) {
            for (int row = 0; row < booleanArray.length; row++) {
                System.out.print(booleanArray[row][column]);
            }
        }

        System.out.println();

        for (int row = 0; row < doubleArray.length; row++) {
            for (int column = 0; column < doubleArray[0].length; column++) {
                System.out.print(doubleArray[row][column]);
            }
        }

        System.out.println();


        for (int column = 0; column < doubleArray.length; column++) {
            for (int row = 0; row < doubleArray.length; row++) {
                System.out.print(doubleArray[row][column]);
            }
        }

        System.out.println();

        for (int row = 0; row < catArray.length; row++) {
            for (int column = 0; column < catArray[0].length; column++) {
                System.out.print(catArray[row][column]);
            }
        }

        System.out.println();


        for (int column = 0; column < catArray.length; column++) {
            for (int row = 0; row < catArray.length; row++) {
                System.out.print(catArray[row][column]);
            }
        }








    }
}
