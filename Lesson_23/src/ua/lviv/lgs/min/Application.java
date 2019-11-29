package ua.lviv.lgs.min;
import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
	  boolean run = true;
		while (run) {		
			System.out.println();
			System.out.println("1 Додати фракцію");
			System.out.println("2 Видалити конкретну фракцію");
			System.out.println("3 Вивести усі  фракції");
			System.out.println("4 Вивести конкретну фракцію");
			System.out.println("5 Додати депутата в фракцію");
			System.out.println("6 Видалити депутата з фракції");
			System.out.println("7 Вивести список хабарників");
			System.out.println("8 Вивести найбільшого хабарника");
		
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
