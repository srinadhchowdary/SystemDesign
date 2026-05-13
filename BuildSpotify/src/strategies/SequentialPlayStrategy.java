package strategies;

import models.Playlist;
import models.Song;

public class SequentialPlayStrategy implements PlayStrategy{
    
    private Playlist currentPlayList;
    private int currentIndex;
    
    @Override
    public void setPlayList(Playlist playList) {
        currentPlayList = playList;
        currentIndex = -1;
    }

    @Override
    public Song next() {
        
        if(currentPlayList == null || currentPlayList.getSize()==0){
            throw new RuntimeException("No playlist loaded or playlist is empty.");
        }
        currentIndex= currentIndex+1;
        return currentPlayList.getSongs().get(currentIndex);
        
    }

    @Override
    public boolean hasNext() {
        return ((currentIndex+1) < currentPlayList.getSize());
    }

    @Override
    public Song previous() {
        if(currentPlayList == null || currentPlayList.getSize() == 0){
            throw new RuntimeException("No playlist loaded or playlist is empty.");
        }
        currentIndex = currentIndex -1;
        return currentPlayList.getSongs().get(currentIndex);
    }

    @Override
    public boolean hasPrevious() {
        return (currentIndex - 1 > 0);
    }
}
