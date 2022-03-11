import java.util.ArrayList;

public class Calculate {
    static int countDay = 0, countDays = 0;
    static int countMonth = 0;
    static double resultSum = 0, resultDay = 0, resultMonth = 0;


    public void Calculation() {
        FileReader fr = new FileReader();
        ChoiceMonth(fr.ReadFile());
    }

    private void ChoiceMonth(ArrayList<String> DaysWorks) {
        for (int i = DaysWorks.size() - 1; i >= 0; i--) {

//            if (DaysWorks.get(i).substring(3, 5).equals(Month.JAN.getNumbMonth())) {
//                if (countMonth != 1) {
//                    System.out.println("\nЯнварь");
//                    countMonth = 1;
//                    countDay = 1;
//                    resultMonth = 0;
//                }
//                resultDay = Calculated(Month.JAN);
//                resultMonth += resultDay;

            if (DaysWorks.get(i).substring(3, 5).equals(Month.JAN.getNumbMonth())) {
                Calculated(Month.JAN);
            } else if (DaysWorks.get(i).startsWith("02", 3)) {
                if (countMonth != 1) {
                    System.out.printf("\nИтого: " + countDay + " дней, " + "%.2f" + " рублей.", resultMonth);
                    System.out.println("\n\nФевраль");
                    countMonth = 1;
                    countDay = 0;
                    resultMonth = 0;
                }
                resultDay = Calculated(Month.FEB);
                resultMonth += resultDay;
            } else if (DaysWorks.get(i).substring(3, 5).equals(Month.MAR.getNumbMonth())) {
                if (countMonth != 3) {
                    System.out.printf("\nИтого: " + countDay + " дней, " + "%.2f" + " рублей.", resultMonth);
                    System.out.println("\n\nМарт");
                    countMonth = 3;
                    countDay = 0;
                    resultMonth = 0;
                }
                resultDay = Calculated(Month.MAR);
                resultMonth += resultDay;
            } else if (DaysWorks.get(i).substring(3, 5).equals(Month.APR.getNumbMonth())) {
                if (countMonth != 4) {
                    System.out.printf("\nИтого: " + countDay + " дней, " + "%.2f" + " рублей.", resultMonth);
                    System.out.println("\n\nАпрель");
                    countMonth = 4;
                    countDay = 0;
                    resultMonth = 0;
                }
                resultDay = Calculated(Month.APR);
                resultMonth += resultDay;
            } else if (DaysWorks.get(i).startsWith(Month.MAY.getNumbMonth(), 3)) {
                if (countMonth != 5) {
                    System.out.printf("\nИтого: " + countDay + " дней, " + "%.2f" + " рублей.", resultMonth);
                    System.out.println("\n\nМай");
                    countMonth = 5;
                    countDay = 0;
                    resultMonth = 0;
                }
                resultDay = Calculated(Month.MAY);
                resultMonth += resultDay;
            } else if (DaysWorks.get(i).substring(3, 5).equals("06")) {
                if (countMonth != 6) {
                    System.out.printf("\nИтого: " + countDay + " дней, " + "%.2f" + " рублей.", resultMonth);
                    System.out.println("\n\nИюнь");
                    countMonth = 6;
                    countDay = 0;
                    resultMonth = 0;
                }
                resultDay = Calculated(Month.JUN);
                resultMonth += resultDay;
            } else if (DaysWorks.get(i).substring(3, 5).equals("07")) {
                if (countMonth != 7) {
                    System.out.printf("\nИтого: " + countDay + " дней, " + "%.2f" + " рублей.", resultMonth);
                    System.out.println("\n\nИюль");
                    countMonth = 7;
                    countDay = 0;
                    resultMonth = 0;
                }
                resultDay = Calculated(Month.JUL);
                resultMonth += resultDay;
            } else if (DaysWorks.get(i).substring(3, 5).equals("08")) {
                if (countMonth != 8) {
                    System.out.printf("\nИтого: " + countDay + " дней, " + "%.2f" + " рублей.", resultMonth);
                    System.out.println("\n\nАвгуст");
                    countMonth = 8;
                    countDay = 0;
                    resultMonth = 0;
                }
                resultDay = Calculated(Month.AUG);
                resultMonth += resultDay;
            } else if (DaysWorks.get(i).substring(3, 5).equals("09")) {
                if (countMonth != 9) {
                    System.out.printf("\nИтого: " + countDay + " дней, " + "%.2f" + " рублей.", resultMonth);
                    System.out.println("\n\nСентябрь");
                    countMonth = 9;
                    countDay = 0;
                    resultMonth = 0;
                }
                resultDay = Calculated(Month.SEP);
                resultMonth += resultDay;
            } else if (DaysWorks.get(i).substring(3, 5).equals("10")) {
                if (countMonth != 10) {
                    System.out.printf("\nИтого: " + countDay + " дней, " + "%.2f" + " рублей.", resultMonth);
                    System.out.println("\n\nОктябрь");
                    countMonth = 10;
                    countDay = 0;
                    resultMonth = 0;
                }
                resultDay = Calculated(Month.OCT);
                resultMonth += resultDay;
            } else if (DaysWorks.get(i).substring(3, 5).equals("11")) {
                if (countMonth != 11) {
                    System.out.printf("\nИтого: " + countDay + " дней, " + "%.2f" + " рублей.", resultMonth);
                    System.out.println("\n\nНоябрь");
                    countMonth = 11;
                    countDay = 0;
                    resultMonth = 0;
                }
                resultDay = Calculated(Month.NOV);
                resultMonth += resultDay;
            } else if (DaysWorks.get(i).substring(3, 5).equals("12")) {
                if (countMonth != 12) {
                    System.out.printf("\nИтого: " + countDay + " дней, " + "%.2f" + " рублей.", resultMonth);
                    System.out.println("\n\nДекабрь");
                    countMonth = 12;
                    countDay = 0;
                    resultMonth = 0;
                }
                resultDay = Calculated(Month.DEC);
                resultMonth += resultDay;
            }

            countDays++;
            resultSum += resultDay;
            System.out.printf(++countDay + ". " + DaysWorks.get(i) + " - " + "%.2f\n", resultDay);
        }
        System.out.printf("\nИтого: " + countDay + " дней, " + "%.2f" + " рублей.", resultMonth);
        System.out.println("\n----------------------------------------------");
        System.out.printf("Итого: " + countDays + " дней, " + "%.3f" + " рублей.", resultSum);
    }

    private double Calculated(Month month) {
        int day = 30, dayS = 28, dayL = 31;
        double salaryF = 140, salaryS = 146.25, salaryT = 146.35;
        switch (month) {
            case JAN: {
                if (countMonth != 1) {
                    System.out.println("\nЯнварь");
                    countMonth = 1;
                    countDay = 1;
                    resultMonth = 0;
                }
                resultDay = salaryF / dayL;
                resultMonth += resultDay;
            }
            case MAR:
            case MAY:
            case JUL:
            case AUG: {
                return salaryF / dayL;
            }
            case FEB: {
                return salaryF / dayS;
            }
            case APR:
            case JUN: {
                return salaryF / day;
            }
            case SEP: {
                return salaryS / day;
            }
            case OCT:
            case DEC: {
                return salaryT / dayL;
            }
            case NOV: {
                return salaryT / day;
            }
            default:
                return 0;
        }
    }
}
