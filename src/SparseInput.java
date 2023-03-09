import java.util.Scanner;

public class SparseInput
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Cash Register
        double[] prices = new double[50];
        int numItems = -1;
        boolean done = false;
        double itemPrice = 0.0;
        double totalCost = 0.0;
        double averageCost = 0.0;
        do {
            // prompt
            itemPrice = SafeInput.getRangedDouble(in, "\nEnter the item price: ", 0.0, 10.0);

            // add it to the array
            numItems++;
            prices[numItems] = itemPrice;
            totalCost += itemPrice;

            done = SafeInput.getYNConfirm(in, "Are you done");

        }while(!done);

        averageCost = totalCost / (numItems + 1);

        // display the prices
        for(int p = 0; p <= numItems; p++)
        {
            System.out.printf("\n\t\t\t\t   %8.2f", prices[p]);
        }
        System.out.println("\nTotal cost is:   " + String.format("%10.2f", totalCost));
        System.out.println("\nAverage cost is: " + String.format("%10.2f", averageCost));



    }
}
