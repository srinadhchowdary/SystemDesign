package managers;

import models.Playlist;
import models.Song;

import java.util.HashMap;
import java.util.Map;

public class PlayListManager {
    
    private static PlayListManager instance = null;
    private Map<String, Playlist> playLists;
    
    private PlayListManager(){
        playLists = new HashMap<>();
    }
    
    private static synchronized PlayListManager getInstance(){
        if(instance == null){
            instance = new PlayListManager();
        }
        return instance;
    }
    
    public void createPlayList(String name){
        if(playLists.containsKey(name)){
            throw new RuntimeException("Playlist with name: " + name + " already exists.");
        }
        playLists.put(name,new Playlist(name));
    }
    
    public void addSongToPlayList(String playListName, Song Song){
        if(!playLists.containsKey(playListName)){
            throw new RuntimeException("Playlist with name: " + playListName + " does not exist.");
        }
        playLists.get(playListName).addSong(Song);
    }
    
    public Playlist getPlayList(String name){
        if(!playLists.containsKey(name)){
            throw new RuntimeException("Playlist with name: " + name + " does not exist.");
        }
        return playLists.get(name);
    }
}
