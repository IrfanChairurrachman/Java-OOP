package predefinedclasses;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            String pesanKeluar;
            String pesanMasuk;

            Socket client = new Socket("localhost", 5000);
            System.out.println("Client menghubungi server localhost pada port 5000...");

            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            DataOutputStream out = new DataOutputStream(client.getOutputStream());

            do {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                System.out.println("Masukkan Pesan:");
                pesanKeluar = br.readLine();
                out.writeBytes(pesanKeluar + "\n");

                pesanMasuk = in.readLine();
                System.out.println(pesanMasuk);
            } while(!pesanKeluar.equalsIgnoreCase("exit"));
            System.out.println("Keluar. . . .");
            in.close();
            out.close();
            client.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
