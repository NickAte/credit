public class CreditPaymentService {

    public double calculate(int sum, int month, double percent) {

        double monthPercent = percent / 12 / 100;
        double coefficient = monthPercent * (Math.pow((1 + monthPercent), month)) / ((Math.pow((1 + monthPercent), month)) - 1);
        double monthPay = sum * coefficient;
        return monthPay;
    }
}
