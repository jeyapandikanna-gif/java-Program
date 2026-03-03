class Number {
    int a;
    int b;
}

public class SwapReference {
    
    public static void swap(Number n) {
        int temp = n.a;
        n.a = n.b;
        n.b = temp;
    }

    public static void main(String[] args) {
        
        Number obj = new Number();
        obj.a = 10;
        obj.b = 20;

        System.out.println("Before Swapping:");
        System.out.println("a = " + obj.a + " b = " + obj.b);

        swap(obj);   // Passing object (reference)

        System.out.println("After Swapping:");
        System.out.println("a = " + obj.a + " b = " + obj.b);
    }
}