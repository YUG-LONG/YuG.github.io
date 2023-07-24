package AircraftBattl;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Music {
    public Clip clip;

    public Music() {
        try {
            //D:\project\LYG_IDEAjava\src\AircraftBattl\barrier.java
            File file = new File("src\\AircraftBattl\\Images\\BackgroundMusic.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void play() {
        clip.start();
    }
//    qidonqi
    /*

    public static void main(String[] args) {
      WavMusicPlayer runRun = new WavMusicPlayer();
      runRun.play2();
   }

   try {
         Thread.sleep(300000);  // 暂停 30 秒
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      clip.stop();  // 停止播放
     */

}
