package com.jessequinn;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String title) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        } else {
            System.out.println(this.albumName +
                    " does not have a track number of " +
                    trackNumber);
            return false;
        }
    }

    public boolean addToPlayList(String trackTitle, LinkedList<Song> playList) {
        Song checkedSong = findSong(trackTitle);

        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        } else {
            System.out.println("The song " +
                    trackTitle +
                    " is not in this album");
            return false;
        }
    }
}
