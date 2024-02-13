public class ClientUDP {
    public static void main(String[] args) {
        DatagramSocket clientSocket = null;
        
        try {
            // Création d'une socket UDP
            clientSocket = new DatagramSocket();
            InetAddress IPAddress = InetAddress.getByName("localhost");
            byte[] sendData = "Hello, serveur UDP!".getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
            clientSocket.send(sendPacket);
            System.out.println("Message envoyé.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (clientSocket != null)
                clientSocket.close();
        }
    }
}
