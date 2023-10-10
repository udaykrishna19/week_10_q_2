package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
     public static void main(String [] args){
        Veena vn = new Veena();
        vn.play();
        Saxophone sx = new Saxophone();
        sx.play();
        
        Playable playableinstrument1 = new Veena();
        Playable playableintrument2 = new Saxophone();
        
        playableinstrument1.play();
        playableintrument2.play();
     }
}
