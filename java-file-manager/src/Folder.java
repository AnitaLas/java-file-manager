import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Folder extends FilePath implements IFilePath {

    private Reader folderName;

    public Folder(Reader reader) {
        super(reader);
    }

    @Override
    public void addFfile(Reader folderName) {
        this.folderName = folderName;
        //File folder1 = new File("res/cwicze");
        File folder = new File(getReader().getLine()+"/"+folderName.getLine());
        folder.mkdirs();

        // ?
        //Path path1 = Files.createDirectories(Path.of("res/cwiczenia3"));
        // new File(String.valueOf(path1)).mkdirs();
    }

    // to do - add String
    protected void showFilesSimple() {
        File folder = new File(getReader().getLine());
        File[] listOfFiles = folder.listFiles();
        for(File file : listOfFiles) {
            System.out.println(file.getName());
        }
    }

    // to do - add String
    protected void showFilesTree() {
        File folder = new File(getReader().getLine());
        File[] listOfFiles = folder.listFiles();
        for(File file : listOfFiles) {
            System.out.println(file.getAbsoluteFile());
        }
    }

    // to do - fix -> .txt .pdf + add String
    protected void showFilesDetails() throws IOException {
        File folder = new File(getReader().getLine());
        File[] listOfFiles = folder.listFiles();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String columnName= "%-40s%10s%30s%30s\n";
        System.out.printf(columnName, "File name","size","date creator", "date modified");

        for(File file : listOfFiles) {

            Path path = Paths.get(file.getAbsolutePath());
            BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
            int dotIndex = path.toString().lastIndexOf(".");

            String extension = (dotIndex > 0) ? path.toString().substring(dotIndex + 1) : "";
            System.out.printf(columnName,
                    (file.getName()+ "." +extension),
                    attr.size(),
                    df.format(attr.creationTime().toMillis()),
                    df.format(attr.lastModifiedTime().toMillis())
            );
        }
    }


}
