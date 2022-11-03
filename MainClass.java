package assignment6;

import java.io.*;
import java.util.*;


public class MainClass 
{

    static void CountWords(String filename, Map<String, Integer> lyrics) throws FileNotFoundException
    {
        File myFile = new File("C:\\Users\\davng\\Downloads\\happy.txt");
        
        
        Scanner readFile = new Scanner (myFile);
        
        while(readFile.hasNext())
        {
            String word = readFile.next();
            word = word.replaceAll("[^\\w]", "");
            word = word.toLowerCase();
            Integer count = lyrics.get(word);
            if(count != null)
            
                count++;
            
            else
            
                count = 1;
                lyrics.put(word,count);
            
        }
        
        readFile.close();
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {
        Map<String,Integer> lyrics = new HashMap<>();
        CountWords("happy.txt",lyrics);
        System.out.println("There are " + lyrics.size() + " unique words.");
        Scanner lookupWord = new Scanner(System.in);
        System.out.print("Enter a word in the song to see how many times it is repeated: ");
        String specWord = lookupWord.next();
        int value = lyrics.get(specWord);
        System.out.println("The word '" + specWord +  "' is repeated " + value + " times.");
    }

    
   
    
    
    
    
}

        
        
    
    

