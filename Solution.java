import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int number_of_line = sc.nextInt();
        ArrayList<ArrayList> all_lines = new ArrayList();
        for(int i=0; i<number_of_line; i++){
            ArrayList<Integer> line = new ArrayList();
            int number_of_elements = sc.nextInt();
            for(int j=0; j<number_of_elements; j++){
                line.add(sc.nextInt());
            }
            all_lines.add(line);
            
        }
        
        int number_of_query = sc.nextInt();
        for(int i=0; i<number_of_query; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>0 && x<=all_lines.size()){
                if(y>=0 && y<=all_lines.get(x-1).size()){
                    System.out.println(all_lines.get(x-1).get(y-1));
                }
                else{
                    System.out.println("ERROR!");
                }
            }
            
        }
    }
}