package com.vquochuy.adapter2;

public class VlcPlayer implements AdvancedMediaplayer {

	@Override
	public void playVLC(String fileName) {
		System.out.println("Play with VLC "+fileName);
		
	}

	@Override
	public void playMP4(String fileName) {
		
	}

}
