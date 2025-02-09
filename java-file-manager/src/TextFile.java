import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TextFile extends FileCreator implements IFile {

    public TextFile(Reader reader) {
        super(reader);
    }

    @Override
    public void showFile() {
        System.out.println("TextFile: " + getFileName());
    }

    @Override
    public void addFfile() {
        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File(getFileName()), true));
            for(String fileName : getFilePath()){
                pw.println(fileName);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}
