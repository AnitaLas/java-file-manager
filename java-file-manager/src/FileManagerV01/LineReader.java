package FileManagerV01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineReader {

    private BufferedReader br;
    private String line = "";

    LineReader() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    protected String getLine() {
        if (this.line == null || this.line.isBlank()) {
            throw new RuntimeException("Line is null or empty.");
        }
        return this.line;
    }

    protected void setLine() {
        try {
            this.line = br.readLine();
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.err.println("Error reading line.");
        }
    }
}
