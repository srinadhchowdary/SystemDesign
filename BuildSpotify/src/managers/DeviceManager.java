package managers;

import devices.IAudioOutputDevice;
import enums.DeviceType;
import factories.DeviceFactory;

public class DeviceManager {
    
    private static DeviceManager instance = null;
    private IAudioOutputDevice currentOutputDevice;
    
    private DeviceManager(){
        currentOutputDevice = null;
    }
    
    public static synchronized DeviceManager getInstance(){
        if(instance == null){
            instance = new DeviceManager(); 
        }
        return instance;
    }
    
    public void connect(DeviceType deviceType){
        
        if(currentOutputDevice != null){
            System.out.println("Disconnecting current device: " + currentOutputDevice.getClass().getSimpleName());
        }
        
        currentOutputDevice = DeviceFactory.createDevice(deviceType);
        
        switch (deviceType){
            case BLUETOOTH :
                    System.out.println("Connected to Bluetooth Speaker: " + currentOutputDevice.getClass().getSimpleName());
                    break;
            case WIRED :
                    System.out.println("Connected to Wired Speaker: " + currentOutputDevice.getClass().getSimpleName());
                    break;
            case HEADPHONES :
                    System.out.println("Connected to Headphones: " + currentOutputDevice.getClass().getSimpleName());
                    break;
        }
    }
    
    public IAudioOutputDevice getOutputDevice(){
        if(currentOutputDevice == null){
            throw new RuntimeException("No output device is connected.");
        }
        return currentOutputDevice;
    }
    
    public boolean hasOutputDevice(){
        return currentOutputDevice != null;
    }
    
}