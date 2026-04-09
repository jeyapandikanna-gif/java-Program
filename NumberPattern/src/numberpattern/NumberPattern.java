
package numberpattern;


public class NumberPattern {

    
    public static void main(String[] args)
    {
          int n = 5;

        for (int i = 1; i <= n; i++) {
            int num = i;
            int increment = n - 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + increment;
                increment--;
            }

            System.out.println();
        }
    }
}
       
    
    
}
