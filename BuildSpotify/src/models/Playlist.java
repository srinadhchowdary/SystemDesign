package models;

import java.util.*;

public class Playlist {
    
    private String playListName;
    private List<Song> songList;
    
    public Playlist(String name){
        this.playListName = name;
        this.songList  = new ArrayList<>();
    }
    
    public String getPlayListName(){
        return playListName;
    }
    
    public List<Song> getSongs(){
        return songList;
    }
    
    public int getSize(){
        return songList.size();
    }
    
    public void addSong(Song song){
        
        if(song == null){
            throw new IllegalArgumentException("Song cannot be null");
        }
        songList.add(song);
    }
}
