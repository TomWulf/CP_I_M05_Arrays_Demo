import java.util.Random;

public class ArrayIntro {
    public static void main(String[] args) {
        Random rnd = new Random();

        String[] users = {"Tom", "Susan", "Bill", "Bevo", "Frank", "Toby", "Matt"};
        int[] ages = {65, 45, 15, 27, 24, 37, 23};

        System.out.println(users[0]);
        System.out.println(users[users.length - 1]);  //

        for (int x = 0; x < users.length; x++)
            System.out.printf("%-8s\t%3d\n", users[x], ages[x]);

        int[] data = new int[100];  // Creates an array of 100 ints index 0 - 99

        for (int x = 0; x < data.length; x++) {
            data[x] = rnd.nextInt(100) + 1;
            System.out.printf("%-4d\t", data[x]);
        }

        // Sum and Average
        int sum = 0;
        double average = 0.0;

        for (int x = 0; x < data.length; x++)
        {
            sum = sum + data[x]; // sum += data[x]
        }

        System.out.println();

        average = (double)sum / data.length;

        System.out.printf("%-6d\t%5.2f", sum, average);

        // What is the average age?

        int ageSum = 0;

        for(int x = 0; x < ages.length; x++)
            ageSum += ages[x];

        System.out.println("\nAge total is " + ageSum);

        double ageAverage = 0.0;

        ageAverage = (double)ageSum / ages.length;

        System.out.printf("Average age: %5.2f" , ageAverage);

        // Linear search
        int target = 23;

        for (int x = 0; x < data.length; x++)
        {
            if(data[x] == target)
                System.out.println(target + "  found at " + x);
        }

        // Find first
        boolean targetFound = false;
        for (int x = 0; x < data.length; x++)
        {
            if(data[x] == target) {
                System.out.println("\n" + target + "  found at " + x);
                targetFound = true;
                break;
            }
        }
        if(!targetFound)
            System.out.println("\nWe did not find the target: " + target);


        // min and max
        int min = data[0];
        int max = data[0];

        for (int x = 0; x < data.length; x++)
        {
            if(data[x] > max)
                max = data[x];
            if(data[x] < min)
                min = data[x];

        }
        System.out.printf("\nMin: %4d Max: %4d\n", min, max);

        // Selection Sort
        int minDex = 0;
        min = data[minDex];
        int temp = 0;  // use in the swap
        int e = 0;
        for (int x = 0; x < data.length; x++) {
            // find the minimum
            for (e = x; e < data.length; e++) {
                if (data[x] < min) {
                    min = data[x];
                    minDex = x;
                }
            }
            // and swap it out
            temp = data[x];
            data[x] = data[minDex];
            data[minDex] = temp;

        }
        // display the sorted array


        System.out.println("\nSorted array:");
        for (int c = 0; c < data.length; c++)
            System.out.printf("%5d\t", data[c]);

    }
}