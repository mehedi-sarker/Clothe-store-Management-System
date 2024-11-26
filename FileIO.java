package File;
import Entity.*;
import EntityList.*;
import java.io.*;
import java.util.Scanner;

public class FileIO {
   
    public static boolean checkUser(String userName, String userPass) {
        boolean flag = false;
        try {
            Scanner fsc = new Scanner(new File("./File/user.txt"));
            while (fsc.hasNextLine()) {
                String line = fsc.nextLine();
                String[] data = line.split(";");
                
                if (userName.equals(data[0]) && userPass.equals(data[1])) {
                    flag = true;
                    break;
                }
            }
            fsc.close();
        } catch (Exception ex) {
            System.out.println("Cannot Read File: " + ex.getMessage());
        }
        return flag;
    }

    public static void loadClothesFromFile(ClothesList clotheList) {
        try {
            Scanner fsc = new Scanner(new File("./File/clothes.txt"));
            while (fsc.hasNextLine()) {
                String line = fsc.nextLine();
                String[] data = line.split(";");
                Clothe c = new Clothe(data[0], data[1], data[2], data[3], data[4], data[5], 
                                      Integer.parseInt(data[6]), Integer.parseInt(data[7]));
                clotheList.insert(c);
            }
            fsc.close();
        } catch (Exception ex) {
            System.out.println("Cannot Read File: " + ex.getMessage());
        }
    }


    public static void writeClothesInFile(Clothe c) {
        try (FileWriter fw = new FileWriter(new File("./File/clothes.txt"), true))
		{ 
            String line = c.getName() + ";" + c.getSize() + ";" + c.getColor() + ";" +
                          c.getFabric() + ";" + c.getProductId() + ";" + c.getClotheType() + ";" +
                          c.getPrice() + ";" + c.getQuantity() + "\n";
            fw.write(line);
            fw.flush(); 
            System.out.println("Clothe added to file: " + line);
			
        } catch (IOException ex) {
            System.out.println("File Not Found: " + ex.getMessage());
        }
    }

    public static boolean registerUser(String userName, String userPass) {
        try (FileWriter fw = new FileWriter(new File("./File/user.txt"), true)) {
            String line = userName + ";" + userPass + "\n";
            fw.write(line);
            fw.flush();
            System.out.println("Registered user: " + line); 
            return true; 
        } catch (IOException ex) {
            System.out.println("Error writing to file: " + ex.getMessage());
        }
        return false; 
    }
}