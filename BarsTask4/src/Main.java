class RentCalc {

    public double rentCalc(double PL, double PL1, double BS, double K_INF, int TERM) {
        double result = ((PL + PL1) * BS * K_INF) / 12 * TERM;
        result = Math.round(result * 100);
        return result / 100;
    }

    public double rentCalc(double PL, double BS, int TERM, double K_INF) {
        double result = ((PL) * BS * K_INF) / 12 * TERM;
        result = Math.round(result * 100);
        return result / 100;
    }

    /**
     * @param PL
     * @param PL1
     * @param BS
     * @param TERM
     * @return
     */
    public double rentCalc(double PL, double PL1, double BS, int TERM) {
        double result = ((PL + PL1) * BS) / 12 * TERM;
        result = Math.round(result * 100);
        return result / 100;
    }

    /**
     * @param PL
     * @param BS
     * @param TERM
     * @return
     */
    public double rentCalc(double PL, double BS, int TERM) {
        double result = ((PL) * BS) / 12 * TERM;
        result = Math.round(result * 100);
        return result / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        double PL = 102.3; //Площадь сооружения, кв.м.
        double PL1 = 50.1; //Площадь прилегающей территории, кв.м.
        double BS = 252.35; // Базовая ставка, рублей копеек в год
        double K_INF = 1.15; //Коэффициент инфляции годовой
        int TERM = 9; // Срок использования, мес
        RentCalc result = new RentCalc();
        System.out.println(result.rentCalc(PL, PL1, BS, K_INF, TERM)); //Передаются все параметры
        System.out.println(result.rentCalc(PL, BS, TERM, K_INF)); //Кроме площади прилегающей территории
        System.out.println(result.rentCalc(PL, PL1, BS, TERM));//Кроме коэффициента инфляции
        System.out.println(result.rentCalc(PL, BS, TERM));//Кроме площади прилегающей территории  и Кроме коэффициента инфляции
    }
}

////С использованием конструкторов - хуйня- не получается
//class RentCalc{
//   private double PL ; //Площадь сооружения, кв.м.
//  private   double PL1 ; //Площадь прилегающей территории, кв.м.
// private    double BS ; // Базовая ставка, рублей копеек в год
//   private double K_INF ; //Коэффициент инфляции годовой
// private    int TERM;
//    public double rentCalc(double pl, double pl1, double bs, double k_inf, int term) {
//         PL = pl; //Площадь сооружения, кв.м.
//        PL1 = pl1; //Площадь прилегающей территории, кв.м.
//         BS = bs; // Базовая ставка, рублей копеек в год
//         K_INF = k_inf; //Коэффициент инфляции годовой
//         TERM = term;
//        double result = ((PL + PL1) * BS * K_INF) / 12 * TERM;
//        result = Math.round(result * 100);
//        return result/100;
//    }
////    public double rentCalc(double PL, double BS, int TERM, double K_INF) {
////        double result = ((PL ) * BS * K_INF) / 12 * TERM;
////        result = Math.round(result * 100);
////        return result/100;
////    }
//    public double rentCalc(double pl, double pl1, double bs, int term) {
//        this(pl, pl1, bs, 1.1, term);
////        double result = ((PL + PL1) * BS) / 12 * TERM;
////        result = Math.round(result * 100);
////        return result/100;
//    }
//    public double rentCalc(double PL, double BS, int TERM) {
//        double result = ((PL) * BS ) / 12 * TERM;
//        result = Math.round(result * 100);
//        return result/100;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        double PL = 102.3; //Площадь сооружения, кв.м.
//        double PL1 = 50.1; //Площадь прилегающей территории, кв.м.
//        double BS = 252.35; // Базовая ставка, рублей копеек в год
//        double K_INF = 1.15; //Коэффициент инфляции годовой
//        int TERM = 9; // Срок использования, мес
//        RentCalc result = new RentCalc();
//        System.out.println(result.rentCalc(PL, PL1, BS, K_INF, TERM)); //Передаются все параметры
//        System.out.println(result.rentCalc(PL, BS, TERM, K_INF)); //Кроме площади прилегающей территории
//        System.out.println(result.rentCalc(PL, PL1, BS, TERM));//Кроме коэффициента инфляции
//        System.out.println(result.rentCalc(PL,  BS, TERM));//Кроме площади прилегающей территории  и Кроме коэффициента инфляции
//    }
//}