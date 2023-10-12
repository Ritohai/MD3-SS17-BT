package ra.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Serialization {
    public static void main(String[] args) throws IOException {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "hai", "lamhai", true));
        users.add(new User(2, "hai01", "lamhai01", false));

        File file = new File("user.dat");
        if (file.createNewFile()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (User user : users) {
                objectOutputStream.writeObject(user);
            }
        } else {
            System.out.println("");
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user.dat"))) {
            User loadedUser = (User) inputStream.readObject();
            System.out.println("Đọc object từ file 'user.dat':");
            System.out.println("ID: " + loadedUser.getId());
            System.out.println("Username: " + loadedUser.getUserName());
            System.out.println("Password: " + loadedUser.getPassWord());
            System.out.println("Status: " + loadedUser.isStatus());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user.dat"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt"))) {
            User loadedUser = (User) inputStream.readObject();
            writer.write("ID: " + loadedUser.getId());
            writer.newLine();
            writer.write("Username: " + loadedUser.getUserName());
            writer.newLine();
            writer.write("Password: " + loadedUser.getPassWord());
            writer.newLine();
            writer.write("Status: " + loadedUser.isStatus());
            System.out.println("Dữ liệu đã được đọc từ 'user.dat' và ghi vào 'user.txt'");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
