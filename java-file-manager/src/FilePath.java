public class FilePath {

    private Reader reader;

    public FilePath(Reader reader) {
        this.reader = reader;
    }

    protected Reader getReader(){
        return reader;
    }
}
