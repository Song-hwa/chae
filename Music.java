
public class Music {
	// ���ǿ� ���� ������ ������ �� �ִ� Model -> Value Object (VO Class)

	// �뷡����, �����̸�, �÷���Ÿ��, �뷡���
	private String title;
	private String singer;
	private int playTime;
	private String musicPath;

	// �������� �߰��� �� �� �ִ� ������ �޼ҵ�
	public Music(String title, String singer, int playTime, String musicPath) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.musicPath = musicPath;
	}

	//������ ������ �� �� �ִ� getter() ����
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public int getPlayTime() {
		return playTime;
	}
	public String getMusicPath() {
		return musicPath;
	}
	
}
