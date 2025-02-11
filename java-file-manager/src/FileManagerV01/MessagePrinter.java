package FileManagerV01;

public class MessagePrinter {

    protected void welcomeMessage() {
        System.out.println("########## FILE MANAGER v0.1 ##########");
    }

    protected void startMessage() {
        System.out.println("Select option (list,details,foldertree,addfolder,addfile,exit)");
    }

    protected void addFolderMessage() {
        System.out.println("Folder name:");
    }

    protected void addFileMessage() {
        System.out.println("File name:");
    }

    protected void addPathMessage() {
        System.out.println("Write path: (res/folderName or G:\\folderName)");
    }
}
