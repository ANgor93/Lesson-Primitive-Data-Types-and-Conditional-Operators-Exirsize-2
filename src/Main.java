public class Main {
    public static void main(String[] args) {
        int check = 100;
        int refill = 3000;
        int bonus = (check + refill) / 100;
        int totalScore = check + refill + bonus;
        int totalScoreNoBonus = check + refill;

        if (refill > 1000) {
            System.out.println(bonus + " бонусный(ых) рублей(я).");
            System.out.println("Итого " + totalScore + " рублей.");
        } else {
            System.out.println("Бонус расчитывается от пополнения больше 1000 руб.");
            System.out.println(totalScoreNoBonus);
        }


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}