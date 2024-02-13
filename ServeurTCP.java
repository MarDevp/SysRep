import java.io.*;
import java.net.*;

public class ServeurTCP {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        
        try {
            // Création d'une socket TCP sur le port 6789
            serverSocket = new ServerSocket(6789);
            
            while (true) {
                Socket clientSocket = serverSocket.accept();
                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String message = inFromClient.readLine();
                System.out.println("Message reçu : " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (serverSocket != null)
                    serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
