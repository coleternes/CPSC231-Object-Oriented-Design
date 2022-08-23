/* Name: Cole Ternes
 * ID: 2323955
 */

import java.io.*;
import java.util.*;

public class ThreadAssignment implements Runnable, Serializable {

  private String m_file_thread;
  private String m_target_word;
  private HashMap<Integer, String> m_target_word_hm;
  private int m_hm_size;

  public ThreadAssignment(String fileThread, String targetWord) {
    m_file_thread = fileThread;
    m_target_word = targetWord;
    m_target_word_hm = new HashMap<Integer, String>();
  }

  public HashMap<Integer, String> getTargetWordHM() {
    return m_target_word_hm;
  }

  public int getHMSize() {
    return m_hm_size;
  }

  public void run() {
    BufferedReader threadReader = null;
    Integer counter = Integer.valueOf(0);
    String targetWord = this.m_target_word;
    targetWord = targetWord.toLowerCase();

    try {
      threadReader = new BufferedReader(new FileReader(this.m_file_thread + ".txt"));

      String line = "";
      while ((line = threadReader.readLine()) != null) {
        String[] wordsArray = line.split("\\s+"); //Splits on one or more white space characters
        for (String word : wordsArray) {
          word = word.replaceAll("\\W+",""); //Replaces all non-letter characters with nothing
          word = word.toLowerCase();
          if (word.equals(targetWord)) {
            counter++;
            this.m_target_word_hm.put(counter, this.m_file_thread);
            this.m_hm_size = counter;
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        threadReader.close();
      }
      catch (Exception e) {}
    }
  }

  public void writeToFile(HashMap<Integer, String> hm) throws IOException{
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.m_file_thread + ".hm"));
    oos.writeObject(hm);
    oos.close();
  }

  public int readFile() throws IOException, ClassNotFoundException{
    int tempSize = 0;
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.m_file_thread + ".hm"));
    tempSize = this.m_hm_size;
    ois.close();
    return tempSize;
  }

  public static void main(String[] args) {
    String searchWord = args[4];
    int file1Size = 0;
    int file2Size = 0;
    int file3Size = 0;
    int file4Size = 0;

    //Creates the Threads
    ThreadAssignment ta1 = new ThreadAssignment(args[0], searchWord);
    ThreadAssignment ta2 = new ThreadAssignment(args[1], searchWord);
    ThreadAssignment ta3 = new ThreadAssignment(args[2], searchWord);
    ThreadAssignment ta4 = new ThreadAssignment(args[3], searchWord);

    Thread t1 = new Thread(ta1);
    Thread t2 = new Thread(ta2);
    Thread t3 = new Thread(ta3);
    Thread t4 = new Thread(ta4);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    try {
      t1.join();
      t2.join();
      t3.join();
      t4.join();

      try{
        ta1.writeToFile(ta1.getTargetWordHM());
        ta2.writeToFile(ta2.getTargetWordHM());
        ta3.writeToFile(ta3.getTargetWordHM());
        ta4.writeToFile(ta4.getTargetWordHM());
      } catch(IOException e){
        System.out.println(e.getMessage());
      }

      try{
        file1Size = ta1.readFile();
        file2Size = ta2.readFile();
        file3Size = ta3.readFile();
        file4Size = ta4.readFile();
      } catch(IOException | ClassNotFoundException e){
        System.out.println(e.getMessage());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    PrintWriter pw = null;
    int grandTotal = file1Size + file2Size + file3Size + file4Size;
    try {
      System.out.println(searchWord + " - " + grandTotal);
      
      pw = new PrintWriter(new FileWriter("Aggregate.txt"));
      pw.println(searchWord + " - " + grandTotal);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    finally {
      pw.close();
    }

  }
}
