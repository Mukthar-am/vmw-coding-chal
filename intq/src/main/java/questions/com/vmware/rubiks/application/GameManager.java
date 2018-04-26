package questions.com.vmware.rubiks.application;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import questions.com.vmware.smartmart.application.SmallMart;

/**
 * Description:
 * - Game manager which starts a game proc
 * - Takes input from user on his move
 * - Takes it to the finish with OR without time limit
 */
public class GameManager {
    private Logger LOG = LoggerFactory.getLogger(SmallMart.class);

    public static void main(String[] args) {
        GameManager manager =
                new GameManager()
                        .init()
                        .start();
    }


    /**
     * Description: initialize with properties.
     * @return - instance of itself for much better manageability
     */
    private GameManager init() {

        return this;
    }


    /**
     *  Description: start over the proc/thread
     *  @return  - instance of its self
     */
    private GameManager start() {



        return this;
    }
}
