public class Main {
    public static void main(String[] args) {

        // ���������� ���������� ��� ������� ������ �
        // ���������� ���������: ���������� �����,
        // ����� ���������� � ��

        int accountBalance = 582;
        int depositAmount = 1_893;
        int bonus;
        int finalAmountWithBonuses;

        // �������� ���������� ���������� ��������� ��
        // ����� ���������� ����� � ��� ���� ���� ������
        // ��������� ������������� ����� ������ � ��������
        // �� �����.

        if (depositAmount >= 1_000) {
            bonus = depositAmount / 100;
            finalAmountWithBonuses = accountBalance + depositAmount + bonus;
        } else {
            finalAmountWithBonuses = accountBalance + depositAmount;
        }
        System.out.println("����� ����� �� �����: " + finalAmountWithBonuses);
    }
}
