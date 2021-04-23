package opg.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
//    @Autowired
//    private Music music;
//
////    //способ 1 - autowired над конструктором
////    @Autowired
////    public MusicPlayer(Music music) {
////        this.music = music;
////    }
//
////    //способ 2 - autowired над сеттером
////    @Autowired
////    public void setMusic(Music music) {
////        this.music = music;
////    }
    private  Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
}
