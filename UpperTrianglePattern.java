//Upper Star Triangle Pattern

import java.util.Scanner;
public class UpperTrianglePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	System.out.println("Enter number of rows : ");
	int n = s.nextInt();
	s.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
