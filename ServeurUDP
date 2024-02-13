import java.net.*;

public class ServeurUDP {
    public static void main(String[] args) {
        DatagramSocket serverSocket = null;
        
        try {
            // Création d'une socket UDP sur le port 9876
            serverSocket = new DatagramSocket(9876);
            byte[] receiveData = new byte[1024];
            
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Message reçu : " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null)
                serverSocket.close();
        }
    }
}
