import java.io.*;

public class MyFileRW {
    public static void main(String[] args) {
        // Assume user input is already stored in uData
        String uData = "This is a test statement.\n"; // Example user data

        // Define file path
        String filePath = "D:/User/UserData.txt";

        try {
            // Ensure directory exists
            File userDir = new File("D:/User");
            if (!userDir.exists()) {
                userDir.mkdirs();
            }

            // Writing user data to the file
            try (FileOutputStream fos = new FileOutputStream(filePath, true);
                 BufferedOutputStream bos = new BufferedOutputStream(fos);
                 DataOutputStream dos = new DataOutputStream(bos)) {

                dos.writeUTF(uData);
            }

            // Reading data from the file
            try (FileInputStream fis = new FileInputStream(filePath);
                 BufferedInputStream bis = new BufferedInputStream(fis);
                 DataInputStream dis = new DataInputStream(bis)) {

                while (dis.available() > 0) {
                    System.out.println(dis.readUTF());
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("IOException occurred");
        }
    }
}
