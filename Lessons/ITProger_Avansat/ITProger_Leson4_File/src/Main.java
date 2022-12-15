import java.io.*;

public class Main {
    public static void main(String[] args) {
     File file =new File("newFile.txt");
      BufferedReader br=null;
     try {
         if(!file.exists()) {
             file.createNewFile();
         }
         PrintWriter files=new PrintWriter(file);
         files.write("Alex merge la scoala:\n");
         files.print("Damian merge la scoala: ");
         files.close();

         br=new BufferedReader(new FileReader("newFile.txt"));
         String line = null;
        while ((line= br.readLine()) !=null){
            System.out.println(line);
        }
         System.out.println();
     }catch (IOException e){
         System.out.println("Not exixt File:" + e);
     }
     finally {
         try {
             br.close();
         }catch (IOException e){
             System.out.println("Not exixt File:" + e);
         }
     }
    }
}