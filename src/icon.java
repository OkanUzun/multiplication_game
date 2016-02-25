
import javax.swing.ImageIcon;

public class Icon {

    private static final ImageIcon SUCCESS = new ImageIcon("oyun_images\\success.png");
    private static final ImageIcon WARNING = new ImageIcon("oyun_images\\warning.png");
    private static final ImageIcon LOGIN = new ImageIcon("oyun_images\\login.png");
    private static final ImageIcon ADD = new ImageIcon("oyun_images\\add.png");
    private static final ImageIcon SCORE = new ImageIcon("oyun_images\\score.png");

    public static ImageIcon getSUCCESS() {
        return SUCCESS;
    }

    public static ImageIcon getWARNING() {
        return WARNING;
    }

    public static ImageIcon getLOGIN() {
        return LOGIN;
    }

    public static ImageIcon getADD() {
        return ADD;
    }

    public static ImageIcon getSCORE() {
        return SCORE;
    }

}
