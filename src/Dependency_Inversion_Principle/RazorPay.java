package Dependency_Inversion_Principle;

import java.time.LocalDate;

public class RazorPay implements paymentGateway {
    public int doPayment(String cardNo, LocalDate expiry, int cvv, int otp, double amount){
        return 1;
        //0->failure
        //1->success
        //2->inprogress
    }

    @Override
    public String payment(String cardno, LocalDate expiry, double amount, int cvv, int otp) {
        String res1 = "";
        int res = doPayment(cardno,expiry,cvv,otp,amount);
        if(res==1){
            res1="Success";
        }
        return res1;
    }
}
