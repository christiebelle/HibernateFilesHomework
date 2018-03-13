import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Main {

        public static void main(String[] args) {

            Folder folder1 = new Folder("A MidSummer Night's Dream");
            DBHelper.save(folder1);
            Folder folder2 = new Folder("Romeo and Juliet");
            DBHelper.save(folder2);

            File file1 = new File("Puck", ".jpg", 2, folder1);
            DBHelper.save(file1);

            File file2 = new File("Hippolyta", ".docx", 3, folder2);
            DBHelper.save(file2);

            File foundfile = DBHelper.findById(File.class, file1.getId());

            Folder foundFolder = DBHelper.findById(Folder.class, folder1.getId());

            List<File> foundfiles = DBHelper.findByFolder(folder1);
        }
    }
