package strategies;

import models.Playlist;
import models.Song;

import java.util.Queue;
import java.util.Stack;

public class CustomQueueStrategy implements PlayStrategy{
    
    private Playlist currentPlayList;
    private int currentIndex;
    private Queue<Song> nextQueue;
    private Stack<Song> prevStack;
    
    @Override
    public void setPlayList(Playlist playList) {

    }

    @Override
    public Song next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Song previous() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public void addToNext(Song song) {
        PlayStrategy.super.addToNext(song);
    }
}
