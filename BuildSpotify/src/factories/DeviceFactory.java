package factories;

import devices.BluetoothSpeakerAdapter;
import devices.HeadPhonesAdapter;
import devices.IAudioOutputDevice;
import devices.WiredSpeakerAdapter;
import enums.DeviceType;
import externals.BluetoothSpeakerAPI;
import externals.HeadPhonesAPI;
import externals.WiredSpeakerAPI;

import static enums.DeviceType.*;

public class DeviceFactory {
    
    public static IAudioOutputDevice createDevice(DeviceType deviceType){
        switch(deviceType){
            case BLUETOOTH:
                return new BluetoothSpeakerAdapter(new BluetoothSpeakerAPI());
            case WIRED: 
                return new WiredSpeakerAdapter(new WiredSpeakerAPI());
            case HEADPHONES: 
            default:
                return new HeadPhonesAdapter(new HeadPhonesAPI());
        }
    }
}
