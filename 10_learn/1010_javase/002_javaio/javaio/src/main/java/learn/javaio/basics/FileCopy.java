package learn.javaio.basics;

import java.io.*;  

public class FileCopy {  
   
  public static void main(String[] args) {  
     byte[] buffer=new byte[512];   //一次取出的字节数大小,缓冲区大小  
     int numberRead=0;  
     FileInputStream input=null;  
     FileOutputStream out =null;  
     FileOutputStream out2 =null;  
     try {  
        input=new FileInputStream("D:\\nolan\\ref\\bndlib-2.1.0.jar");  
        out=new FileOutputStream("D:\\nolan\\ref\\bndlib-2.1.3.jar"); //如果文件不存在会自动创建  
        while ((numberRead=input.read(buffer))!=-1) {  //numberRead的目的在于防止最后一次读取的字节小于buffer长度，  
           out.write(buffer, 0, numberRead);       //否则会自动被填充0  
        }  
     } catch (final IOException e) {  
        e.printStackTrace();  
     }finally{  
        try {  
           input.close();  
           out.close();  
        } catch (IOException e) {  
           e.printStackTrace();  
        }  
         
     }  
  }  
   
}  

