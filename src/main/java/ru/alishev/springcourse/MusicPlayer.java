package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    // можно здесь через рефлексию
//    @Autowired
//    private Music Music;

    //можно здесь
    //@Autowired
    //public MusicPlayer(Music music) {
    //    this.Music = music;
    //}

    //    можно здесь
    //    @Autowired
    //    public void setMusic(ru.alishev.springcourse.Music music) {
    //        Music = music;
    //    }

    public String  playMusic() {
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());

        return "Playing: " + classicalMusic.getSong();
    }
}
