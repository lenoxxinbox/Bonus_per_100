public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int accountBalance = 582;
        int depositAmount = 1_893;
        int bonus;
        int finalAmountWithBonuses;

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        if (depositAmount >= 1_000) {
            bonus = depositAmount / 100;
            finalAmountWithBonuses = accountBalance + depositAmount + bonus;
        } else {
            finalAmountWithBonuses = accountBalance + depositAmount;
        }
        System.out.println("Общая сумма на счете: " + finalAmountWithBonuses);
    }
}
