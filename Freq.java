import java.util.HashMap;
import java.util.Map;
public class Freq {
    public static void main(String[] args) {
        String word = "Sai Krishna";
        word = word.toLowerCase().replaceAll("\\s+","");
        Map<Character,Integer>freqMap= new HashMap<>();
        for(char ch : word.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+ 1);
        }
        for(Map.Entry<Character,Integer>entry:freqMap.entrySet()){
            System.out.println("Character: "+entry.getKey()+"-> Frequency: "+entry.getValue());
        }
    }
}
