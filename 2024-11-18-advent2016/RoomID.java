import java.io.*;
import java.util.*;


public class RoomID{
  public static void main(String[] args){
    System.out.println(northPole("Input.txt"));
  }
  public static int idsum(String filename){
    int out = 0;
      try{
        File file = new File(filename);
        Scanner sc= new Scanner(file);
        for(int i=0;sc.hasNextLine();i++){
          String line = sc.nextLine();
          String code=line.substring(line.length()-6,line.length()-1);
          int id= Integer.parseInt(line.substring(line.length()-10,line.length()-7));
          String[] alphabet = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
          int[] count =new int[26];
          String name = line.substring(0,line.length()-11);
          for(int j = 0;j < name.length();j++){
            for(int k = 0;k < alphabet.length;k++){
              if(name.substring(j,j+1).equals(alphabet[k])){
                count[k]=count[k]+1;
              }
            }
          }
          int[] sortedIndices = new int[26];
          for (int j=0;j < 26;j++) {
              sortedIndices[j] = j;
          }
          for (int j=0;j < 26;j++) {
              for (int k = j + 1;k < 26;k++) {
                  if (count[sortedIndices[k]] > count[sortedIndices[j]]||(count[sortedIndices[k]]==count[sortedIndices[j]] && sortedIndices[k] < sortedIndices[j])) {
                      int temp = sortedIndices[j];
                      sortedIndices[j] = sortedIndices[k];
                      sortedIndices[k] = temp;
                  }
              }
          }
          String realCode = "";
          for (int j=0; j<5; j++) {
              if (count[sortedIndices[j]] > 0) {
                  realCode += (char) (sortedIndices[j] + 'a');
              }
          }
          if (realCode.equals(code)) {
              out += id;
          }
        }
        return out;
      }catch (Exception e){
      System.out.println("Exception");
      return 0;
    }
  }
  public static int northPole(String filename){
    int out = 0;
      try{
        File file = new File(filename);
        Scanner sc= new Scanner(file);
        for(int i=0;sc.hasNextLine();i++){
          String line = sc.nextLine();
          int id= Integer.parseInt(line.substring(line.length()-10,line.length()-7));
          int shift= id % 26;
          String[] alphabet = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
          String[] codedAlphabet = new String[26];
          String name = line.substring(0,line.length()-11);
          String[] message = name.split("-");
          String text = "";
          for(int j=0; j<26;j++){
            codedAlphabet[j] = alphabet[(j + shift) % 26];
          }
          for(int j=0;j<message.length;j++){
            String word = message[j];
            for(int k=0;k<word.length();k++){
              for(int l=0;l<26;l++){
                if(word.substring(k,k+1).equals(alphabet[l])){
                  text+=codedAlphabet[l];
                }
              }
            }
            text+=" ";

          }
          if(text.substring(0,9).equals("northpole")) {
            System.out.println(text + " " +id);
          }
        }
        return 0;
      }catch (Exception e){
      System.out.println("Exception");
      return 0;
    }
  }
}
