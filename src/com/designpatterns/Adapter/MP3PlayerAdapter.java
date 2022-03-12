package Adapter;

public class MP3PlayerAdapter implements AudioPlayer{
	VideoPlayer vp;
	
	public void play(String audioType, String filename) {
		if(audioType.equalsIgnoreCase("MP4")) {
			vp = new MP4Player();
			vp.play(audioType, filename);
		}
		else if (audioType.equalsIgnoreCase("VLC")) {
			vp = new VLCPlayer();
			vp.play(audioType, filename);
		}
	}
}
