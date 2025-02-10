import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TextFile extends FilePath implements IFilePath {

    public TextFile(Reader reader) {
        super(reader);
    }

    @Override
    public void addFfile(Reader textFileName) {
        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File(getReader().getLine()+"/"+textFileName.getLine()), true));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
