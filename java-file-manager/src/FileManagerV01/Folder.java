package FileManagerV01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Folder implements IFile {

    @Override
    public void addFile(LineReader reader) {
        File folder = new File(reader.getLine());
        folder.mkdirs();
    }

    private File[] getListOfFiles(String path) {
        File folder = new File(path);

        if (folder.exists()) {
            return folder.listFiles();
        } else {
            throw new RuntimeException("\n[F1] Folder not found. Check if path exists.");
        }
    }

    protected void showFilesSimple(String path) {
        try {
            File[] files = getListOfFiles(path);
            for (File file : files) {
                System.out.println(file.getName());
            }
        } catch (RuntimeException re) {
            throw new RuntimeException("\n[F2] Folder not found. Check if path exists. " + re );
        }
    }

    protected void showFilesTree(String path) {
        try {
            File[] files = getListOfFiles(path);

            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getAbsoluteFile());
                    showFilesTree(file.getAbsoluteFile().toString());
                } else
                    System.out.println(file.getAbsoluteFile());
            }
        } catch (RuntimeException re) {
            throw new RuntimeException("\n[F3] Folder not found. Check if path exists. ");
        }
    }

    protected void showFilesDetails(String path) throws IOException {
        File[] files = getListOfFiles(path);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String columnName = "%-40s%10s%30s%30s\n";
        System.out.printf(columnName, "Name", "DIR or size", "Creation date", "Modyfication date");

        for (File file : files) {
            Path path1 = null;
            try {
                path1 = Paths.get(file.getAbsolutePath());
                BasicFileAttributes attr = Files.readAttributes(path1, BasicFileAttributes.class);
                System.out.printf(columnName,
                        (file.getName()),
                        (file.isDirectory() ? "DIR" : attr.size()),
                        df.format(attr.creationTime().toMillis()),
                        df.format(attr.lastModifiedTime().toMillis())
                );
            } catch (IOException ioe) {
                throw new IOException("\n[F4] File not found. Check if path exists. ");
            } catch (RuntimeException re) {
                throw new RuntimeException("\n[F5] Folder not found. Check if path exists. ");

            }
        }
    }

}
