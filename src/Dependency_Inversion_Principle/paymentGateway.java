package Dependency_Inversion_Principle;

import java.time.LocalDate;

public interface paymentGateway {
    public String payment(String cardno, LocalDate expiry, double amount, int cvv, int otp);
}
