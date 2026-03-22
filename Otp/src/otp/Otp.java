
package otp;

import java.util.Scanner;
public class Otp 
{

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String  originalOtp ="4589";
       System.out.print("Enter otp:");
       String userOtp=sc.nextLine();
       if(originalOtp.equals(userOtp))
       {
        System.out.println("OTP verifed successfully");
       }
       else
       {
       System.out.println("invaild OTP");
       }
       originalOtp.concat("123");
       System.out.println("After concat"+originalOtp);
       sc.close();
       
       }
    }
    

