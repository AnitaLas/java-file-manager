public class Printer {

    protected void welcomeMessage() {
        System.out.print("File manager.");
    }

    protected void startMessage(){
        System.out.println("enter path and press enter to open the file");
        System.out.print("");
    }

    protected void startMessage2(){
        System.out.println("type folder name");
        System.out.print("");
    }

    protected void textFileAndFolderMessage(){
        System.out.println("path folder ->  \n1 - print1, 2 - print2, 3- add textFile or Folder");
    }

}
