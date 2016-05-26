/**
 * Created by Sam on 5/26/2016.
 */
public class Client {
    private Server s; // the server that this client is connected to

    public Server getS() {
        return s;
    }

    public void setS(Server s) {
        this.s = s;
    }

    private User user; // user using this client

    public Client(Server s) {
        this.s = s;
        ClientGUI gui = new ClientGUI(this);
    }

    //  class req: the Client with GUI
    //  component functions:
    //  pre: register() for registration
    private void register() {

    }
    //  pre: login() for logging in
    private void login() {

    }
    //  01. sending friend request: sendFriendRequest(String username), triggered by a button clicking;
    private void sendFriendRequest(String username){

    }
    //  02. receiving messages: (implemented by ActionListener on a JLabel) in class ClientGUI
    private class ClientGUI {
        private final Client client;

        public ClientGUI(Client client) {
            this.client = client;
        }
        /* Requirements:
         * 01. a login button, activated if login information is valid, and triggers login() function
         * 02. a register button, activated if registration information is valid, and triggers register() function
         *     returns noticing information (success/fail) through JOptionPane
         * 03. a send button, activated if send message information is valid, and triggers sendMessage() function
         *     returns sending message in a displaypanel
         * 04. a logout button, activated if logout button is pressed, and triggers logOut() function
         */

    }
    //  03. sending messages: sendMessage(String message, String receiver), triggered by a button clicking;
    private void sendMessage(String message, User receiver){

    }
    //  04. log out: logOut(), triggered by a button clicking
    private void logOut(){

    }
}
