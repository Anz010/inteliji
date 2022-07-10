package com.syntax.class25;

public class Task1 {
    public static void main(String[] args) {
        File[]files={new JavaFile(),new PdfFile(),new WordFile()};
        for(File file:files){
        file.open();
        }
    }

}
abstract class File{
   abstract void open();
   void edit(){
       System.out.println("Editing the file");
   }
void close(){
    System.out.println("Closing the file");
    }
}

class JavaFile extends File{
    void open(){
        System.out.println("Use intllij to open Java files");
    }
}
class WordFile extends File{
    @Override
    void open(){
        System.out.println("Use Microsoft word to open the word file");
    }
}
class PdfFile extends File{
    @Override
    void open(){
        System.out.println("Use adobe reader to open the pdf file");
    }
}