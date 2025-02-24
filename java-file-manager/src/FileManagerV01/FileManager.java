package FileManagerV01;

import java.io.IOException;

public class FileManager {

    private MessagePrinter messagePrinter;
    private LineReader lineReader;
    private Folder folder;
    private TextFile textFile;

    FileManager() {
        this.messagePrinter = new MessagePrinter();
        this.lineReader = new LineReader();
    }

    protected void runFileManager() {

        do {
            try {
                this.messagePrinter.welcomeMessage();
                this.messagePrinter.startMessage();
                this.lineReader.setLine();

                if ((this.lineReader.getLine()).equals("list")) {
                    showFilesSimple();
                } else if ((this.lineReader.getLine()).equals("details")) {
                    showFilesDetails();
                } else if ((this.lineReader.getLine()).equals("foldertree")) {
                    showFilesTree();
                } else if ((this.lineReader.getLine()).equals("addfolder")) {
                    addFolder();
                } else if ((this.lineReader.getLine()).equals("addfile")) {
                    addFile();
                } else {
                    System.out.println("Invalid command");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println();
            }

        } while (!(this.lineReader.getLine()).equals("exit"));
    }

    private void getFolder() {
        this.folder = new Folder();
        this.messagePrinter.addPathMessage();
        this.lineReader.setLine();
    }

    private void showFilesSimple() {
        getFolder();
        this.folder.showFilesSimple(this.lineReader.getLine());
    }

    private void showFilesDetails() throws IOException {
        getFolder();
        this.folder.showFilesDetails(this.lineReader.getLine());
    }

    private void showFilesTree() {
        getFolder();
        this.folder.showFilesTree(this.lineReader.getLine());
    }

    private void addFolder() {
        this.messagePrinter.addFolderMessage();
        this.lineReader.setLine();
        this.folder = new Folder();
        folder.addFile(this.lineReader);
    }

    private void addFile() {
        this.messagePrinter.addFileMessage();
        this.lineReader.setLine();
        this.textFile = new TextFile();
        this.textFile.addFile(this.lineReader);
    }
}
