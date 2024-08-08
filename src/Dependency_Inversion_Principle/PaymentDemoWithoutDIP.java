package Dependency_Inversion_Principle;

import java.net.SocketOption;
import java.time.LocalDate;
import java.lang.Math;

public class PaymentDemoWithoutDIP {
    public static void main(String[] args) {
        String cardno = "123456";
        LocalDate expiry = LocalDate.now();
        int cvv =3456;
        int otp=1211;
        double amount =100.45;
        int makeChoice = Integer.parseInt(String.valueOf(Math.random()*10));
        if(makeChoice>=5){
            RazorPay razor = new RazorPay();
            int a=razor.doPayment(cardno,expiry,cvv,otp,amount);
            if(a==1){
                System.out.println("Success");
            }
        }
        else{
            JusPay jus = new JusPay();
            String res=jus.makePayment(amount,expiry,cardno,cvv,otp);
            System.out.println(res);
        }
    }

}
