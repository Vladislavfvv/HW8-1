package TemperatureConverter;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        while(true){
            System.out.println("������� �� ����� ������� ���������: \n" +
                    "1 - �������, 2- ���������, 3 - �������");

            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();
            System.out.println("������� �����������: (�������� 20.0)");
            double temp = scanner.nextDouble();
            System.out.println("� ����� ������� ���������: \n" +
                    "1 - �������, 2- ���������, 3 - �������");
            int to = scanner.nextInt();


            IBaseConverter iBaseConverter = new BaseConverter();
            BaseConverter baseConverter = new BaseConverter(temp, c, to);
            double result = iBaseConverter.convert(temp, c, to);
            System.out.print(result);
            if (to == 1) System.out.print(" C");
            if (to == 2) System.out.print(" F");
            if (to == 3) System.out.print(" K");

            System.out.println("������� ����������? (y/n)");
            char question = (char)System.in.read();
            if (question == 'n') break;
        }



    }
}
