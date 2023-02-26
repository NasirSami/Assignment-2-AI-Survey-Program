import java.io.File;
import java.io.IOException;

public class CreatePoliticalPartiesFolder {
    public static void main(String[] args) {
        // Create a File object representing the "Political Parties" folder
        File folder = new File("Political Parties");

        // Create the folder if it doesn't exist
        if (!folder.exists()) {
            folder.mkdir();
        }

        // Create four text files inside the folder, if they don't exist
        String[] partyNames = {"Democratic", "Republican", "Green Party", "Libertarian"};
        for (String name : partyNames) {
            File file = new File(folder, name + ".txt");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                    System.out.println("Created file: " + name + ".txt");
                } catch (IOException e) {
                    System.err.println("Error creating file: " + e.getMessage());
                }
            } else {
                System.out.println("File already exists: " + name + ".txt");
            }
        }
    }
}
