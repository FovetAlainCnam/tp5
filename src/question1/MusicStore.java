package question1;

public class MusicStore {
    SongComponent songList;

    public MusicStore(SongComponent songList) {
        this.songList = songList;
    }

    public void getSongList() {
        songList.displaySongInfo();
    }
}
