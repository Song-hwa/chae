import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// View가 되는 부분
		Scanner sc = new Scanner(System.in);

		boolean isOk = true;

		MusicPlayer mp = new MusicPlayer();
		Music song;

		// mp3를 계속해서 사용할 수 있도록 반복문으로 작성
		while (isOk) {
			// 사용자가 볼 수 있는 메뉴선택 기능 생성
			System.out.print("[1]재생 [2]정지 [3]다음곡 [4]이전곡 [5]종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				song = mp.play();
				System.out.println(mp.musicInfo(song));

			} else if (menu == 2) {
				mp.stop();

			} else if (menu == 3) {
				song = mp.nextPlay();
				System.out.println(mp.musicInfo(song));

			} else if (menu == 4) {
				song = mp.prePlay();
				System.out.println(mp.musicInfo(song));
				
			} else if (menu == 5) {
				System.out.println("프로그램이 종료되었습니다.");
				isOk = false;
			}

		}
	}
}
