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

        try {
            do {
                this.messagePrinter.welcomeMessage();
                this.messagePrinter.startMessage();
                this.lineReader.setLine();

                if ((this.lineReader.getLine()).equals("list"))
                    showFilesSimple();

                if ((this.lineReader.getLine()).equals("details"))
                    showFilesDetails();

                if ((this.lineReader.getLine()).equals("foldertree"))
                    showFilesTree();

                if ((this.lineReader.getLine()).equals("addfolder"))
                    addFolder();

                if ((this.lineReader.getLine()).equals("addfile"))
                    addFile();

            /*else {
                //to do -> when input is wrong
                System.out.println("Invalid command");
            }*/

            } while (!(this.lineReader.getLine()).equals("exit"));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    // to do -> name to change
    private void setFolder() {
        this.folder = new Folder();
        this.messagePrinter.addPathMessage();
        this.lineReader.setLine();
    }

    private void showFilesSimple() {
        setFolder();
        this.folder.showFilesSimple(this.lineReader.getLine());
    }

    private void showFilesDetails() {
        setFolder();
        this.folder.showFilesDetails(this.lineReader.getLine());
    }

    private void showFilesTree() {
        setFolder();
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
