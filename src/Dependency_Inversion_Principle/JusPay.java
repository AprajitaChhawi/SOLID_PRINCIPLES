package Dependency_Inversion_Principle;

import java.time.LocalDate;

public class JusPay implements paymentGateway{
    public String makePayment(double amount, LocalDate expiry, String cardno, int cvv, int otp){
        return "SUCCESS";
        //returns a String
    }

    @Override
    public String payment(String cardno, LocalDate expiry, double amount, int cvv, int otp) {
        return makePayment(amount,expiry,cardno,cvv,otp);
    }
}
