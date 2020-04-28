

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author bala
 */
public class FileAppender {


    public static void AppendtoFile(String filename, String content)
    {
        System.out.println(content);
         try {
            PrintStream out =
                new PrintStream(new AppendFileStream(filename));
            out.print(content+ "\n");
            out.close();
         }
         catch(Exception e) {
            System.out.println(e.toString());
         }



    }


}

class AppendFileStream extends OutputStream {
   RandomAccessFile fd;
   public AppendFileStream(String file) throws IOException {
     fd = new RandomAccessFile(file,"rw");
     fd.seek(fd.length());
     }
   public void close() throws IOException {
     fd.close();
     }
   public void write(byte[] b) throws IOException {
     fd.write(b);
     }
   public void write(byte[] b,int off,int len) throws IOException {
     fd.write(b,off,len);
     }
   public void write(int b) throws IOException {
     fd.write(b);
     }
}