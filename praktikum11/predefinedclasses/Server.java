package predefinedclasses;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import java.util.Vector;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server siap pada port 5000...");

            while (true) {
                Socket client = server.accept();

                Hashtable h = new Hashtable();
                h.put("Galih", client);

                Vector users = new Vector();
                users.addElement(h);

                users.removeElement(h);

                System.out.println("Ada client dari IP: " + client.getInetAddress().getHostAddress());
                new ClientHandler(client);
            }


//            server.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
