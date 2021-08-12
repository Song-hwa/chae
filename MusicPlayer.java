import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	// 음악의 재생을 제어하는 클래스 : 컨트롤러 역할

	// 노래를 담을 수 있도록 만들자!

	// 여러 개의 음악을 담을 수 있는 가변리스트(ArrayList)생성
	ArrayList<Music> list = new ArrayList<>();

	// MP3Player 클래스를 사용하기 위한 객체 생성
	MP3Player mp3 = new MP3Player();
	Music song;
	// 플레이되고 있는 곡의 인덱스 번호를 기억하기 위한 변수 생성
	int num = 0;

	// 여러 개의 음악을 list에 추가해줄 생성자 메소드
	public MusicPlayer() {
		Music m = new Music("라일락", "아이유", 40, "music/lilac.mp3");
		list.add(m);
		list.add(new Music("On the ground", "로제", 90, "music/on the ground.mp3"));
		list.add(new Music("parachute", "John K", 100, "music/parachute.mp3"));
		list.add(new Music("peaches", "Justin Bieber", 10, "music/peaches.mp3"));
		list.add(new Music("rollin", "브레이브 걸스", 117, "music/rollin.mp3"));
//		외부 경로일 경우 : "C://music/lilac.mp3"
	}

	// 노래를 재생하기 위한 메소드 생성
	public Music play() {
		Music song = list.get(num);

		// 재생의 조건 추가하기 -> 현재 재생되고 있는 노래가 없을때에만 노래를 재생
		// boolean 타입의 .isPlaying() : 재생되고 있는 노래가 있을 시 (true), 없을 시 (false)
		if (!mp3.isPlaying()) {
			// MP3Player의 play()
			mp3.play(song.getMusicPath());
		}
		return song;
	}

	// 음악 재생시 정보를 보여주는 메소드 생성
	public String musicInfo(Music song) {
		return song.getTitle() + ", " + song.getSinger() + ", " + changeTime(song);
	}

	// 재생시간을 분/초로 나눠주는 메소드
	public String changeTime(Music song) {
		return (song.getPlayTime() / 60) + "분" + (song.getPlayTime() % 60 + "초");
	}

	// 음악재생을 멈춰줄 수 있는 메소드
	public void stop() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
	}

	// 다음 곡을 재생하기 위한 메소드
	public Music nextPlay() {
		if (num < list.size() - 1) {
			num++;
		} else {
			num = 0;
		}
		// 현재 재생되고 있는 노래가 있다면 곡을 정지해주자
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		song = list.get(num);
		mp3.play(song.getMusicPath());
		return song;

	}

	// 이전곡을 재생하기 위한 메소드 생성
	public Music prePlay() {
		if (num > 0) {
			num--;
		} else {
			num = list.size()-1;  // 요기가 -1 일이 빠져서 그... 배열의 크기를 넘기는 오류 였어용!
		}
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		song = list.get(num);
		mp3.play(song.getMusicPath());
		return song;
	}
}
