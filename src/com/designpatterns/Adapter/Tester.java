package Adapter;

public class Tester {

	public static void main(String[] args) {

		MP3Player mp3 = new MP3Player();
		mp3.play("MP3", "Song");
		mp3.play("MP4", "TV");
		mp3.play("VLC", "Movie");
		mp3.play("MPG", "Hello");
	}
}
