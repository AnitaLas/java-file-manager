package FileManagerV01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextFile implements IFile {

    @Override
    public void addFile(LineReader reader) {
        try {
            PrintWriter pw = new PrintWriter(new File(reader.getLine()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File name not found." + e);
        }
    }
}
