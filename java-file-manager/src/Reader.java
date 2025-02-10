import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

    private BufferedReader br;
    private String line = "";

    Reader(){
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

  public String getLine() {
        return this.line;
  }

  public void readLine() {
      try {
          this.line = br.readLine();
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
  }
}
