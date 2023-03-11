package wsb.rest.services;

import org.springframework.stereotype.Service;
import wsb.rest.models.Song;
import wsb.rest.repositories.SongRepository;

import java.util.List;

@Service
public class songService {

    final private SongRepository songRepository;

    public songService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> findALL() {
        return songRepository.findAll();
    }
}
