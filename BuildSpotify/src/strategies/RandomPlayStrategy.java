package strategies;

import models.Playlist;
import models.Song;

import java.util.*;

public class RandomPlayStrategy implements PlayStrategy {
    
    private Playlist currentPlaylist;
    private List<Song> remainingSongs;
    private Stack<Song> history;
    private Random random;
    
    public RandomPlayStrategy(){
        currentPlaylist = null;
        random = new Random();
    }


    @Override
    public void setPlayList(Playlist playList) {
        
        currentPlaylist = playList;
        if(currentPlaylist == null || currentPlaylist.getSize()==0){
            throw new RuntimeException("No playlist loaded or playlist is empty.");
        }
        remainingSongs = new ArrayList<>(currentPlaylist.getSongs());
        history = new Stack<>();
        
    }

    @Override
    public Song next() {
        
        if(currentPlaylist == null || currentPlaylist.getSize() == 0){
            throw new RuntimeException("No playlist loaded or playlist is empty.");
        }
        
        if(remainingSongs.isEmpty()){
            throw new RuntimeException("No Songs left to play");
        }
        
        int idx = random.nextInt(remainingSongs.size());
        Song selectedSong = remainingSongs.get(idx);
        
        // Remove the selected song from the list ( Swap and pop technique for O(1) removal)
        int lastIndex = remainingSongs.size()-1;
        remainingSongs.set(idx,remainingSongs.get(lastIndex));
        remainingSongs.remove(lastIndex);
        
        history.push(selectedSong);
        return selectedSong;
    }

    @Override
    public boolean hasNext() {
        return currentPlaylist != null && !remainingSongs.isEmpty();
    }

    @Override
    public Song previous() {
        
        if(history.isEmpty()){
            throw new RuntimeException("No previous song available.");
        }
        Song song = history.pop();
        return song;
        
    }

    @Override
    public boolean hasPrevious() {
        return history.size() > 0;
    }
}
