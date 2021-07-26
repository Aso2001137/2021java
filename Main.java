import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        System.out.println("*****************");
        System.out.println("    戦艦ゲーム    ");
        System.out.println("*****************");
        Scanner scan = new Scanner(System.in);
		System.out.println("爆弾を落とす場所を0~4で決めてください");
        System.out.print("x軸:");
		String cooX = scan.next();
        System.out.println("");
        System.out.print("y軸:");
        String cooY = scan.next();

        Ship1 ship1 = new Ship1(3);
        ship2 ship2 = new ship2(3);
        ship3 ship3 = new ship3(3);
        int totalShip = 3;

    }
}
