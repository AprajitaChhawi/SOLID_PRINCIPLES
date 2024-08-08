package Dependency_Inversion_Principle;

import java.time.LocalDate;

public class PaymentDemoWithDIP {
    public static void main(String[] args) {
        String cardno = "123456";
        LocalDate expiry = LocalDate.now();
        int cvv =3456;
        int otp=1211;
        double amount =100.45;
        double makeChoice = Math.random()*10;
        System.out.println(makeChoice);
        if(makeChoice>=5){
            RazorPay r1 = new RazorPay();
            String res=r1.payment(cardno,expiry,amount,cvv,otp);
            System.out.println(res);
        }
        else{
            JusPay r1 = new JusPay();
            String res=r1.payment(cardno,expiry,amount,cvv,otp);
            System.out.println(res);
        }

    }
}
