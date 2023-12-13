package src.exceptionhandlingprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionP1 {
    public static void main(String [] args)throws IOException, FileNotFoundException {


        System.out.println("program start");
        int firstNo=10;
        int lastNo=0;
        int result=0;

        File file=new File("D:/resume");
        FileInputStream fli=new FileInputStream(file);
        System.out.println(fli);
try {
    result = firstNo / lastNo;

}
catch (ArithmeticException ae){
    System.out.println(ae.toString());  // write a logic to enter this message into logfiles.

    throw ae;

}

finally {
    System.out.println("finally block");
}
        System.out.println(result);

        System.out.println("program end");



    }
}
