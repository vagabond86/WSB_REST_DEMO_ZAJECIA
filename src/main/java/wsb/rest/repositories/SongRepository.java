package wsb.rest.repositories;

import org.springframework.stereotype.Repository;
import wsb.rest.models.Song;

import java.util.LinkedList;
import java.util.List;


@Repository
public class SongRepository {
    private List<Song> songs = new LinkedList<>() {{
        add(new Song(1L, "Yellow", "Coldplay", 2005L));
        add(new Song(2L, "Stairway to Heaven", "Led Zeppelin", 1971L));
        add(new Song(3L, "Bohemian Rhapsody", "Queen", 1975L));
        add(new Song(4L, "Smells Like Teen Spirit", "Nirvana", 1991L));
        add(new Song(5L, "Hotel California", "Eagles", 1976L));
        add(new Song(6L, "Thriller", "Michael Jackson", 1982L));
    }};

    public List<Song> findAll(){
        return songs;
    }

}
