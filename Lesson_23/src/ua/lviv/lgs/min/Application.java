package ua.lviv.lgs.min;
import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
	  boolean run = true;
		while (run) {		
			System.out.println();
			System.out.println("1 ������ �������");
			System.out.println("2 �������� ��������� �������");
			System.out.println("3 ������� ��  �������");
			System.out.println("4 ������� ��������� �������");
			System.out.println("5 ������ �������� � �������");
			System.out.println("6 �������� �������� � �������");
			System.out.println("7 ������� ������ ���������");
			System.out.println("8 ������� ���������� ���������");
		
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			switch (i) {
			case 1:
				VerkhovnaRada.getInstance().addFraction();
				break;
			case 2:
				VerkhovnaRada.getInstance().deleteFraction();
				break;
			case 3:
				VerkhovnaRada.getInstance().getAllFractions();
				break;
			case 4:
				VerkhovnaRada.getInstance().getFraction();
				break;
			case 5:
				VerkhovnaRada.getInstance().addDeputy();
				break;
			case 6:
				VerkhovnaRada.getInstance().deleteDeputy();
				break;
			case 7:
				VerkhovnaRada.getInstance().getCorruptionist();
				break;
			case 8:
				VerkhovnaRada.getInstance().getMostCorruptionist();
				break;
				
			
			default: run=false;break;
			}
		}
}
}
