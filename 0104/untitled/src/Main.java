import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("какое действие вы хотите выбрать:");
            System.out.println("1 - перевод ");
            System.out.println("2 - сложение или вычитание");
            int deistv = in.nextInt();
            String chislo1, chislo2;
            switch (deistv) {
                case 1:
                    System.out.println("1 - из 10 в 2 \n" +
                            "2 - из 2 в 10\n" +
                            "3 - из 10 в 16 \n" +
                            "4 - из 16 в 10\n" +
                            "5 - из 2 в 16\n" +
                            "6 - из 16 в 2");
                    deistv = in.nextInt();
                    System.out.print("введите число:");
                    chislo1 = in.next();
                    switch (deistv) {
                        case 1:
                            System.out.println(perevodv2(Integer.parseInt(chislo1)));
                            break;
                        case 2:
                            System.out.println(perevodv10(chislo1));
                            break;
                        case 3:
                            System.out.println(DesVShes(Integer.parseInt(chislo1)));
                            break;
                        case 4:
                            System.out.println(ShesVDes(chislo1));
                            break;
                        case 5:
                            System.out.println(DesVShes(perevodv10(chislo1)));
                            break;
                        case 6:
                            System.out.println(perevodv2(Integer.parseInt(ShesVDes(chislo1))));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1 - сложение в 2 \n" +
                            "2 - сложение в 16\n" +
                            "3 - вычитание в 2 \n" +
                            "4 - вычитание в 16\n");
                    deistv = in.nextInt();
                    System.out.println("Введите 1 число");
                    chislo1 = in.next();
                    System.out.println("Введите 2 число");
                    chislo2 = in.next();
                    switch (deistv) {
                        case 1:
                            System.out.println(SlozhenieVdv(chislo1,chislo2));
                            break;
                        case 2:
                            break;
                        case 3:
                            System.out.println(vichitanieVdv(chislo1,chislo2));
                            break;
                        case 4:
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private static int perevodv10(String chislo) {
        int numberTwo = 0, number = 0;

        for (int i = chislo.length() - 1; i >= 0; i--) {
            if (chislo.charAt(i) == '1')
                numberTwo += Math.pow(2, number);
            number++;
        }
        return numberTwo;
    }

    private static String perevodv2(int chislo) {
        if (chislo == 0) {
            return "0";
        } else
            return perevodv2(chislo / 2) + chislo % 2;
    }

    private static String SlozhenieVdv(String number, String numberTwo) {
        StringBuilder result = new StringBuilder();
        while (number.length() < numberTwo.length()) {
            number = "0" + number;
        }
        while (numberTwo.length() < number.length()) {
            numberTwo = "0" + numberTwo;
        }
        int perenos = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int bit1 = number.charAt(i) - '0';
            int bit2 = numberTwo.charAt(i) - '0';
            int sum = bit1 + bit2 + perenos;
            result.append(sum % 2);
            perenos = sum / 2;
        }
        if (perenos != 0) {
            result.append(perenos);
        }
        return result.reverse().toString();
    }

    private static String vichitanieVdv(String number, String numberTwo) {

        while (number.length() < numberTwo.length()) {
            number = "0" + number;
        }
        while (numberTwo.length() < number.length()) {
            numberTwo = "0" + numberTwo;
        }
        int perenos = 0;
        String number3 = "";
        for (int i = numberTwo.length() - 1; i >= 0; i--) {
            if (numberTwo.charAt(i) == '1')
                number3 = "0" + number3;
            else
                number3 = "1" + number3;
            System.out.println(numberTwo + "   " + number3);
        }
        return SlozhenieVdv(SlozhenieVdv(number3, "1"), number).substring(1);
    }

    private static String DesVShes(int desyat) {
        StringBuilder d = new StringBuilder();
        while (desyat != 0) {
            int b = desyat - desyat / 16 * 16;
            desyat = desyat / 16;
            switch (b) {
                case 1:
                    d.append("1");
                    break;
                case 2:
                    d.append("2");
                    break;
                case 3:
                    d.append("3");
                    break;
                case 4:
                    d.append("4");
                    break;
                case 5:
                    d.append("5");
                    break;
                case 6:
                    d.append("6");
                    break;
                case 7:
                    d.append("7");
                    break;
                case 8:
                    d.append("8");
                    break;
                case 9:
                    d.append("9");
                    break;
                case 10:
                    d.append("A");
                    break;
                case 11:
                    d.append("B");
                    break;
                case 12:
                    d.append("C");
                    break;
                case 13:
                    d.append("D");
                    break;
                case 14:
                    d.append("E");
                    break;
                case 15:
                    d.append("F");
                    break;
                default:
                    break;
            }
        }
        return d.reverse().toString();
    }

    private static String ShesVDes(String d) {
        int desyat = 0;
        int p = 0;
        for (int i = d.length() - 1; i >= 0; i--) {
            char c = d.charAt(i);
            int s;
            if (c >= '0' && c <= '9') {
                s = c - '0';
            } else {
                s = c - 'A' + 10;
            }
            desyat += s * Math.pow(16, p);
            p++;
        }
        return Integer.toString(desyat);
    }
}

