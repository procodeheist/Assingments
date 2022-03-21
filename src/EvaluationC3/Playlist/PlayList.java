package EvaluationC3.Playlist;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    List<Song> songs = new ArrayList<>();

    public void addSong(Song song){
        boolean flag=true;
        for (Song item:songs){
            if(item.getMovieName().equals(song.getMovieName()) && item.getSongName().equals(song.getSongName())){
                flag = false;
            }
            else
                flag = true;
        }

       if(flag){
           songs.add(song);
           System.out.println("Song added to the playlist successfully.");
       }
       else
           System.out.println("Song is already added in the playlist");
    }
}
