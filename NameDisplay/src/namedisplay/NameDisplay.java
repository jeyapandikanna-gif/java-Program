
package namedisplay;

public class NameDisplay {

    
    public static void main(String[] args)
    {
         String[] names = {"DIWAKAR", "KARTHIK", "RAJESH", "SATHISH", "SURYA"};

        for (String name : names) {
            System.out.println(name);
            try {
                Thread.sleep(2000); // 2 seconds delay
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

