/**
 * Created by Sam on 5/26/2016.
 */
public class IM {
    private static final int CLIENT_NUMBER = 4;

    public static void main(String[] args) {
        Server s = new Server();
        for(int i=0;i<CLIENT_NUMBER;i++){
            Client c = new Client(s);
        }
        s.start();
    }
}
