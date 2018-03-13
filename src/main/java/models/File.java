package models;

import javax.persistence.*;

@Entity
@Table(name="files")
public class File {

        private int id;
        private String fileName;
        private String extension;
        private int size;
        private Folder folder;

        public File() {
        }

        public File(String fileName, String extension, int size, Folder folder) {
            this.fileName = fileName;
            this.extension = extension;
            this.size = size;
            this.folder = folder;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Column(name="fileName")
        public String getfileName() {
            return fileName;
        }

        public void setfileName(String fileName) {
            this.fileName = fileName;
        }

        @Column(name="extension")
        public String getextension() {
            return extension;
        }

        public void setextension(String extension) {
            this.extension = extension;
        }

        @Column(name="size")
        public int getsize() {
            return size;
        }

        public void setsize(int size) {
            this.size = size;
        }

        @ManyToOne
        @JoinColumn(name="folder_id", nullable= false)
        public Folder getfolder() {
            return folder;
        }

        public void setfolder(Folder folder) {
            this.folder = folder;
        }
}
