package devices;

import externals.BluetoothSpeakerAPI;
import models.Song;

public class BluetoothSpeakerAdapter implements IAudioOutputDevice{
    
    
    private BluetoothSpeakerAPI bluetoothSpeakerAPI;
    
    public BluetoothSpeakerAdapter (BluetoothSpeakerAPI bluetoothSpeakerAPI){
        this.bluetoothSpeakerAPI = bluetoothSpeakerAPI;
    }
    
    @Override
    public void playAudio(Song song) {
        
        String payload = song.getTitle() + " by " + song.getArtist();
        bluetoothSpeakerAPI.playSoundViaBluetooth(payload);
        
    }
}
