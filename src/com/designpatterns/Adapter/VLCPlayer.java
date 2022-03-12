package Adapter;

public class VLCPlayer implements VideoPlayer{
	public void play(String videoType, String filename) {
		System.out.println("Playing VLC video: "+filename);
	}
}
