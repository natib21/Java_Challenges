package LinkeListChallenge.Music;
import java.util.LinkedList;
import java.util.ArrayList;
record Song (String title,double duration){
    @Override
      public  String toString(){
        return this.title + ": " + this.duration;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);
        System.out.println(albums);
    }
}
class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs = new ArrayList<>();

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) != null){
            System.out.println(title +" song already exist");
            return false;
        }
        songs.add(new Song(title,duration));
        return true;

    }

    private Song findSong(String title){
        for(Song el : songs){
            if(el.title().equals(title)){
                return el;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber - 1; // because users think in track numbers (1-based)
        if (index >= 0 && index < songs.size()) {
            playList.add(songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;

    }

    public boolean addToPlayList(String title,  LinkedList<Song> playList){
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println(title + " is not in this album");
        return false;

    }

}
