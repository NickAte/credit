public class CreditPaymentService {

    public double calculate(int a, int b, double c) {

        double monthPercent = c / 12 / 100;
        double coefficient = monthPercent * (Math.pow((1 + monthPercent), b)) / ((Math.pow((1 + monthPercent), b)) - 1);
        double monthPay = a * coefficient;
        return monthPay;
    }
}
