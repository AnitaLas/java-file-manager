public class FileCreator {

    private  Reader reader;

    private String[] filePath;
    private String fileName;

    public FileCreator(Reader reader) {
        this.reader = reader;
        setPathAndFileName();
    }

    // to do
    private void setPathAndFileName() {

        // this.filePath = ;
        // this.newFileName = ;
    }

    protected String[] getFilePath() {
        return this.filePath;
    }

    protected String getFileName() {
        return this.fileName;
    }







}
