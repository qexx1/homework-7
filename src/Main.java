public class Main {
    public static void main(String[] args) {
        //task 1
        var Money = 15000;
        var overall = 0;
        int i = 1;
        while (overall < 2_459_000) {
            overall += Money;
            overall = overall + overall * 12 / 100;
            i++;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + overall + " рублей");
        }

        //task 2
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(" " + a);
        }
        System.out.println();
        for (int b = 10; b > 0; b--) System.out.print(" " + b);
        System.out.println();

        //task 3
        var population = 12_000_000;
        var deathRate = 8 * population / 1000;
        var birthRate = 17 * population / 1000;
        for (int z = 1; z <= 10; z++) {
            population = population + birthRate - deathRate;
            System.out.println("Год " + z + " ,численность населения составляет " + population );
        }

        //task 4
        var firstSum = 15_000;
        for (int q = 0; firstSum <= 12_000_000; q++) {
            firstSum *= 1.07;
            System.out.println("Месяц: " + q + " Накопления: " + firstSum);
        }

        //task 5
        var Sum = 15_000;
        for (int w = 1; Sum <= 12_000_000; w++) {
            Sum *= 1.07;
            if ( w % 6 == 0) {
                System.out.println("Месяц: " + w + " Накопления: " + Sum);
            }
        }

        //task 6
        var sum = 15_000;
        var month = 9 * 12;
        for (int e = 1; e <= month; e++){
            sum *= 1.07;
            if (e % 6 == 0){
                System.out.println("Месяц: " + e + " Накопления: " + sum);
            }
        }

        //task 7
        int friday = 6;
        for (int r = friday; r <= 31; r = r + 7) {
            System.out.println("Сегодня пятница, " + r + " -е число. Необходимо сделать отчёт");
        }

        //task 8
        for (var time = 0; time < 2123; time = time + 79) {
            if (time >= 1823 && time <= 2123 ) {
                System.out.println(time);
            }
        }
    }
}