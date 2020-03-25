package Blok_1_VvedenieJava.Peremennye_operatory.Z1_Money_Transfer;

public class Main {
    public static void main(String[] args) {
        int currentAccount = 2_000_000_000;
        int transfer = 500_000_000;
        int sum = currentAccount + transfer;
        System.out.println("текущий баланс счёта клиента: " + sum);
    }
}
