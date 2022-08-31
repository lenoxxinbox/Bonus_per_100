public class Main {
    public static void main(String[] args) {

        int accountBalance = 582; // Остаток по счету
        int depositAmount = 1_893; // Пополнение счета
        int bonus; // Бонус за пополнение баланса
        int finalAmountWithBonuses; // Итоговая сумма на счету

        if (depositAmount > 1_000) { // Если сумма пополнения больше 1 000 рублей
            bonus = depositAmount / 100; // Подсчитывается количество бонусов на сумму пополнения
            finalAmountWithBonuses = accountBalance + depositAmount + bonus; // Подсчитывается итоговая сумма на счету
        } else {
            bonus = 0;
            finalAmountWithBonuses = accountBalance + depositAmount; // Иначе подсчитывается итоговая сумма без бонусов
        }
        System.out.println("Общая сумма на счете: " + finalAmountWithBonuses); // Итоговая сумма выводится в консоль
        System.out.println("Количество бонусов: " + bonus); // Количество бонусов выводится в консоль
    }
}
