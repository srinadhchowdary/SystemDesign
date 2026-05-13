package devices;

import externals.HeadPhonesAPI;
import models.Song;

public class HeadPhonesAdapter implements IAudioOutputDevice{
    
    private HeadPhonesAPI headPhonesAPI;
    
    public HeadPhonesAdapter(HeadPhonesAPI headPhonesAPI){
        this.headPhonesAPI = headPhonesAPI;
    }
    
    @Override
    public void playAudio(Song song) {
        String payload = song.getTitle() + " by " + song.getArtist();
        headPhonesAPI.playSoundViaHeadphones(payload);
    }
}
