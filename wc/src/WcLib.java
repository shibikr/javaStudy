import java.io.*;

class WcLib{

  public int countLines(String text){
	   return (text.split("\n").length);
  };

  public int countWords(String text){
    String[] words = text.split("\\s+");
    int count = 0;
    for(int i=0;i<words.length;i++){
      if(words[i]!="") count++;
    };
  	return count;
  };

  public int countCharacters(String text){
    return text.length();
  };

  public int countBytes(String text){
    byte[] bytes = text.getBytes();
    return bytes.length;
  };

};
