package day4;

import java.io.File;

public class DirectoryFileSystem {
    public static void main(String[] args) {
        // Creates Single Directory/Folder
        File singleDirectory = new File("exampleForFileSystem");
        if (singleDirectory.mkdir()) {
            System.out.println(singleDirectory.getName() + " is successfully created in " + singleDirectory.getAbsolutePath());
        } else {
            System.out.println("Directory creation failed for " + singleDirectory.getName());
        }

        // Creates Nested Directory
        File nestedDirectory = new File("fp1/fp2");
        if (nestedDirectory.mkdirs()) {
            System.out.println(nestedDirectory.getName() + " is successfully created in " + nestedDirectory.getAbsolutePath());
        } else {
            System.out.println("Directory creation failed for " + nestedDirectory.getName());
        }
    }
}

