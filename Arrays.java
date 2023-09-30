package Java;

public class Arrays {
    public static void main(String[] args) {

        // Displaying Array
        int[] marks;
        marks = new int[4];
        marks[0] = 80;
        marks[1] = 85;
        marks[2] = 90;
        marks[3] = 96;
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // reverse
        System.out.println("Printing loop in reverse");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
        // for each-loop
        System.out.println("Printing using for each loop");
        for (int element : marks) {
            System.out.println(element);
        }

        // 2D array
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        // Displaying 2D Array
        System.out.println("Printing 2D Array");
        for (int a = 0; a < flats.length; a++) {
            for (int b = 0; b < flats[b].length; b++) {
                System.out.print(flats[a][b]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        // QUES ON ARRAYS
        // 1 array of 5floats and calculate
        float[] marks3 = { 24.0f, 22.5f, 35.0f, 44.0f, 40.5f };
        float sum = 0;
        for (float element : marks3) {
            sum = sum + element;
        }
        System.out.println("The value of sum is" + " " + sum);

        // 2 given int is present or nt
        float[] marks4 = { 24.0f, 22.5f, 35.0f, 44.0f, 40.5f };
        float num = 24.0f;
        boolean isInArray = false;
        for (float element : marks4) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not present in the array");
        }

        // 3 calculate average marks
        float[] marks5 = { 24.0f, 22.5f, 35.0f, 44.0f, 40.5f };
        float sum2 = 0;
        for (float element : marks) {
            sum2 = sum2 + element;
        }
        System.out.println("The value of average marks is " + sum / marks5.length);

        // 4 add 2x3 matrices
        int[][] mat1 = { { 1, 2, 3 },
                { 4, 5, 6 } };
        int[][] mat2 = { { 2, 6, 13 },
                { 3, 7, 1 } };
        int[][] result = { { 0, 0, 0 },
                { 0, 0, 0 } };
        for (int u = 0; u < mat1.length; u++) {
            for (int v = 0; v < mat1[u].length; v++) {
                System.out.format("setting value for u=%d and v=%d\n", u, v);
                result[u][v] = mat1[u][v] + mat2[u][v];
            }
        }

        // printing elements of 2D array
        for (int k = 0; k < mat1.length; k++) {
            for (int l = 0; l < mat1[k].length; l++) {
                System.out.print(result[k][l] + " ");
                result[k][l] = mat1[k][l] + mat2[k][l];
            }
            System.out.println(" ");
        }

        // 5 to reverse array
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int m = arr.length;
        int n = Math.floorDiv(arr.length, 2);
        int temp;
        for (int p = 0; p < n; p++) {
            // swap a[i] and a[l-1-i]
            // |4||3|||
            temp = arr[p];
            arr[p] = arr[m - p - 1];
            arr[m - p - 1] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }

        // 6 find max element in array
        int[] arr2 = { 1, 2, 3, 4, 66, 88 };
        int max = 0;
        for (int e : arr2) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println("The value of a max element in this array is: " + max);

        // 7 find min ele in array
        int[] arr3 = { 1, 2, 3, 4, 66, 88 };
        int min = 1;
        for (int e : arr3) {
            if (e < min) {
                min = e;
            }
        }
        System.out.println("The value of a min element in this array is: " + min);

        // 8 array is sorted or nt
        boolean isSorted = true;
        int[] arr4 = { 1, 2, 3, 4, 66, 88 };
        for (int f = 0; f < arr4.length - 1; f++) {
            if (arr4[f] > arr4[f + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The Array is sorted");
        } else {
            System.out.println("The Array is not sorted");
        }

        ////////////////// printing column wise ////////////////////////
        int[][] arr5 = {
                { 1, 2, 3, 4, 5 },
                { 21, 32, 42, 15, 11 },
                { 38, 44, 35, 55, 22 },
        };
        int rows = arr5.length;
        int cols = arr5[0].length;

        for (int h = 0; h < cols; h++) {
            for (int d = 0; d < rows; d++) {
                System.out.print(arr5[h][d] + " ");
            }
            System.out.println();
        }
    }
}
