package Adapter;

public class MP4Player implements VideoPlayer{
	public void play(String videoType, String filename) {
		System.out.println("Playing MP4 video: "+filename);
	}
}
