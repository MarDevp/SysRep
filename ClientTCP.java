import java.io.*;
import java.net.*;

public class ClientTCP {
    public static void main(String[] args) {
        Socket clientSocket = null;
        
        try {
            // Connexion à un serveur TCP sur le port 6789
            clientSocket = new Socket("localhost", 6789);
            PrintWriter outToServer = new PrintWriter(clientSocket.getOutputStream(), true);
            outToServer.println("Hello, serveur TCP!");
            System.out.println("Message envoyé.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (clientSocket != null)
                    clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
