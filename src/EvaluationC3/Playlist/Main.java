package EvaluationC3.Playlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayList playList = new PlayList();
        Scanner scan = new Scanner(System.in);
        int count=1;
        while(true){
            System.out.println("Enter Details Of Song"+count++);
            System.out.println("Song Name:");
            String songName = scan.next();
            System.out.println("Movie Name:");
            String movieName = scan.next();

            playList.addSong(new Song(movieName,songName));

            System.out.println("Do You Want To Add More:(Y/N)?");
            String choice = scan.next();
            if(choice.equalsIgnoreCase("n"))
                break;
        }

        for(Song song:playList.songs){
            song.play();
        }
    }
}
