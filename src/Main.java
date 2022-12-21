import enams.Color;
import enams.Country;
import flowers.Cornation;
import flowers.Flower;
import flowers.Roz;
import flowers.Tulyp;
import service.CarnationServiceImpl;
import service.RozServiceImpl;
import service.TulypServiceImpl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static CarnationServiceImpl serviceC = new CarnationServiceImpl();
    public static RozServiceImpl serviceR = new RozServiceImpl();
    public static TulypServiceImpl serviceT = new TulypServiceImpl();

    public static void main(String[] args) {


        List<Tulyp> tulyp = List.of(
                new Tulyp(Country.KYRGYZSTAN, (byte) 7, Color.PINK, BigDecimal.valueOf(1000)),
                new Tulyp(Country.USA, (byte) 5, Color.RED, BigDecimal.valueOf(1200)),
                new Tulyp(Country.RUSSIA, (byte) 3, Color.YELLOW, BigDecimal.valueOf(1100)));

        List<Roz> roz = List.of(
                new Roz(Country.KYRGYZSTAN, (byte) 11, Color.YELLOW, BigDecimal.valueOf(1500)),
                new Roz(Country.RUSSIA, (byte) 13, Color.RED, BigDecimal.valueOf(1600)),
                new Roz(Country.USA, (byte) 11, Color.PINK, BigDecimal.valueOf(1700)));

        List<Cornation> cornation = List.of(
                new Cornation(Country.KYRGYZSTAN, (byte) 3, Color.RED, BigDecimal.valueOf(500)),
                new Cornation(Country.USA, (byte) 4, Color.WHITE, BigDecimal.valueOf(600)),
                new Cornation(Country.RUSSIA, (byte) 5, Color.YELLOW, BigDecimal.valueOf(700)));


        while (true) {
            System.out.println("""
                    1.ADD FLOWERS ROZ
                    2.GET ALL FLOWERS ROZ
                    3.GET FLOWERS FIND BY COLOR ROZ
                    4.GROUPING FLOWERS BY COLOR ROZ
                    5.GET SUM ALL FLOWERS ROZ
                    6.GET ALL FLOWERS SORT BY PRICE ROZ
                    ===================================
                    7.ADD FLOWERS TULYP
                    8.GET ALL FLOWERS TULYP
                    9.GET FLOWERS FIND BY COLOR TYLUP
                    10.GROUPING FLOWERS BY COLOR TULYP
                    11.GET SUM ALL FLOWERS TULYP
                    12.GET ALL FLOWERS SORT BY PRICE TULYP
                    ===================================
                    13.ADD FLOWERS CORNATION
                    14.GET ALL FLOWERS CORNATION
                    15.GET FLOWERS FIND BY COLOR CORNATION
                    16.GROUPING FLOWERS BY COLOR CORNATION
                    17.GET SUM ALL FLOWERS CORNATION
                    18.GET ALL FLOWERS SORT BY PRICE CORNATION
                    """);
            System.out.println("Enter by command : ");
            int num = new Scanner(System.in).nextInt();
            switch (num) {
                case 1 -> System.out.println(serviceR.addFlowers(roz));
                case 2 -> System.out.println(serviceR.getAllFlowers());
                case 3 -> {
                    System.out.println("Enter by color : ");
                    String color = new Scanner(System.in).nextLine();
                    System.out.println(serviceR.getFlowersFinByColor(color));
                }
                case 4 -> System.out.println(serviceR.groupingFlowersByColor());
                case 5 -> System.out.println(serviceR.getSumAllFlowers());
                case 6 -> {
                    System.out.println("Enter by command : (ascending / descending)");
                    String command = new Scanner(System.in).nextLine();
                    System.out.println(serviceR.getAllFlowersSortByPrice(command));
                }
                case 7 -> System.out.println(serviceT.addFlowers(tulyp));
                case 8 -> System.out.println(serviceT.getAllFlowers());
                case 9 -> {
                    System.out.println("Enter by color : ");
                    String color = new Scanner(System.in).nextLine();
                    System.out.println(serviceT.getFlowersFinByColor(color));
                }
                case 10 -> System.out.println(serviceT.groupingFlowersByColor());
                case 11 -> System.out.println(serviceT.getSumAllFlowers());
                case 12 -> {
                    System.out.println("Enter by command : (ascending / descending)");
                    String command = new Scanner(System.in).nextLine();
                    System.out.println(serviceT.getAllFlowersSortByPrice(command));
                }
                case 13 -> System.out.println(serviceC.addFlowers(cornation));
                case 14 -> System.out.println(serviceC.getAllFlowers());
                case 15 -> {
                    System.out.println("Enter by color : ");
                    String color = new Scanner(System.in).nextLine();
                    System.out.println(serviceC.getFlowersFinByColor(color));
                }
                case 16 -> System.out.println(serviceC.groupingFlowersByColor());
                case 17 -> System.out.println(serviceC.getSumAllFlowers());
                case 18 -> {
                    System.out.println("Enter by command : (ascending / descending)");
                    String command = new Scanner(System.in).nextLine();
                    System.out.println(serviceC.getAllFlowersSortByPrice(command));
                }
                default -> System.out.println("No such command !");

            }

        }
    }
}