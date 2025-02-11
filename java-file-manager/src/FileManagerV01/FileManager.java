package FileManagerV01;

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
            }*/

        } while (!(this.lineReader.getLine()).equals("exit"));

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
