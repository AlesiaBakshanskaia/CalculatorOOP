
import logger.Log;
import model.Calculation;
import presenter.Presenter;
import view.View;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Старт программы");
        Presenter p = new Presenter(new Calculation(), new View());
        p.startProgram();
    }
}