/* this function is for multi line comments. code wont be read*/
// is for a single line. code wont be read
/* println bring it onto the line before, print remains on the same line

print
--
(word)   would resume here
--
println

(word)
         would resume here*/


public class First {
    public static void main(String[] args) {
        
        System.out.println("First Java Program"); // println() - print and move to next line
        System.out.println("Software Development 1");
        System.out.print("Atlantic Technological "); //print() - print and remain on same line
        System.out.println("University");
        System.out.println(); // Skip a line

        /* 
        \n prints upto \n on one line, 
        and what comes after \n is 
        moved to next line
        */
        System.out.print("Escape sequence new line\nNext line"); 
        /* Same as:
         System.out.println("Escape sequence new line");
         System.out.println("Next line"); 
         */

    }     
}
