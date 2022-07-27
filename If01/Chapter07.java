package If01;

public class Chapter07 {
	public static void main (String[] args) {
		int val = 12;
		if (val <= 5) {
			System.out.println("とても近いです");
		} else if (5 < val && val <= 10 ) {
			System.out.println("近いです");
		} else if (10 < val && val <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}

		String str = "blue";
		switch (str) {
		case "blue":
			System.out.println("青信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "red":
			System.out.println("赤信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}
}
