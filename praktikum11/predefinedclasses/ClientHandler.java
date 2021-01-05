package predefinedclasses;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class ClientHandler extends Thread {
    private Socket client;
    public ClientHandler(Socket client) {
        this.client = client;
        start();
    }

    @Override
    public void run() {
        try {
            String pesanMasuk;

            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            DataOutputStream out = new DataOutputStream(client.getOutputStream());

            do {
                pesanMasuk = in.readLine();
                System.out.println(pesanMasuk);

                out.writeBytes("[Server]: Pesan diterima\n");
            } while(!pesanMasuk.equalsIgnoreCase("exit"));

            in.close();
            out.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
