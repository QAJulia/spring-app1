package opg.example;

import org.springframework.beans.factory.annotation.Autowired;
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
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
    }
}
