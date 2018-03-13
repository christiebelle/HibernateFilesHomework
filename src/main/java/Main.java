import db.DBHelper;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

public class Main {

        public static void main(String[] args) {

            Owner owner1 = new Owner("Malvolio", "MalvolioTheYellow");
            DBHelper.save(owner1);

            Owner owner2 = new Owner("Olivia", "OliviaCesario");
            DBHelper.save(owner2);

            Folder folder1 = new Folder("A MidSummer Night's Dream", owner1);
            DBHelper.save(folder1);
            Folder folder2 = new Folder("Romeo and Juliet", owner2);
            DBHelper.save(folder2);

            File file1 = new File("Puck", ".jpg", 2, folder1);
            DBHelper.save(file1);

            File file2 = new File("Hippolyta", ".docx", 3, folder2);
            DBHelper.save(file2);

            File file3 = new File("Mercutio", ".txt", 2, folder1);
            DBHelper.save(file3);

            File file4 = new File("Tybalt", ".doc", 3, folder2);
            DBHelper.save(file4);

            File foundfile = DBHelper.findById(File.class, file1.getId());

            Folder foundFolder = DBHelper.findById(Folder.class, folder1.getId());

            List<File> foundfiles = DBHelper.findByFolder(folder1);
        }
    }
