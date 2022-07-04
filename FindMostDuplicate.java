package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicate {
	public static void main(String[] args) {
		String input="abbaba";
        int count=0;
        char str=input.charAt(0);
        Map<Character,Integer> map=new HashMap<>();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            map.put(charArray[i], map.getOrDefault(charArray[i],0)+1);
            if(map.get(charArray[i])>count) {
                str=charArray[i];
                count=map.get(charArray[i]);
                
            }
            
        }
        System.out.println("Most duplicate:" + str);
        System.out.println("Count: " + count);

               
	}

}
