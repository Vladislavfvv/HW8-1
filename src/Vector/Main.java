package Vector;

import static Vector.Vector.randomVectors;
import static Vector.Vector.scalar2;

public class Main {
    public static void main(String[] args) {
        //������ 1
        Vector vector1 = new Vector(2, 2, 3, 4, 5, 6);

        double rez1 = vector1.lengthVector();
        System.out.println("����� ������� 1: " + rez1);
        //������ 2
        Vector vector2 = new Vector(3, 15, 7, 12, 3, 10);

        double rez2 = vector2.lengthVector();
        System.out.println("����� ������� 2: " + rez2);
        int test2 = scalar2(vector1, vector2);
        System.out.println("C�������� ������������ ���� ��������: (���� �����)" + test2);
        IVector iVector = new Vector();
        int test1 = (int) iVector.scalar(vector1, vector2);
        System.out.println("C�������� ������������ ���� ��������: " + test1);
        int[] proiz = iVector.proizved(vector1, vector2);
        System.out.print("������������ �������: {");
        for (int i = 0; i < proiz.length; i++) {
            System.out.print(proiz[i]);
            if (i < 2) {System.out.print(", ");}
            else System.out.print("}");
        }

        System.out.println("\n���� ����� ����� ���������: ");
        double allfa = iVector.corner(vector1, vector2);
        System.out.println(allfa);
        System.out.println("����� ��������:");
        Vector summVector = iVector.summ(vector1, vector2);
        iVector.soutVector(summVector);
        System.out.println("�������� ��������:");
        Vector substrVector = iVector.subtraction(vector1, vector2);
        iVector.soutVector(substrVector);
        System.out.println("��������� 20 �������� � ��������� �� 0 �� 20:");
        Vector[] randVec = randomVectors(20);
        iVector.soutRandVector(randVec);
    }
}

