/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmethod;

import java.util.stream.IntStream;

/**
 *
 * @author HP
 */
public class StringMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
	String a = new String("Java String Example"); 
        String c = "New String";
       
        a.charAt(1);
        IntStream b=a.chars();
        a.codePointAt(0);
        a.codePointBefore(1);
        a.toUpperCase();
        a.toLowerCase();
        a.length();
        a.concat(c);
        
	System.out.println(a);
	System.out.println(a.charAt(2));
        System.out.println(a.codePointAt(0)); 
        System.out.println(a.codePointBefore(2)); 
        System.out.println(a.toUpperCase()); 
        System.out.println(a.toLowerCase()); 
        System.out.println(a.length()); 
        System.out.println(a.concat(" "+c)); 
        System.out.println(a.getBytes());
        System.out.println(a.hashCode()); 
        System.out.println(a.compareTo(c));
        System.out.println(a.lastIndexOf(c));
    }
    
}
