package test;

import java.awt.Dimension; 
import java.awt.Rectangle; 
import java.awt.Robot; 
import java.awt.Toolkit; 
import java.awt.image.BufferedImage; 
import java.io.File; 
 
import javax.imageio.ImageIO; 
 
/******************************************************************* 
 * ��JavaBean����ֱ��������JavaӦ�ó����е��ã�ʵ����Ļ��"����" 
 * This JavaBean is used to snapshot the GUI in a  
 * Java application! You can embeded 
 * it in to your java application source code, and us 
 * it to snapshot the right GUI of the application 
 * @see javax.ImageIO 
 * @author liluqun ([email]liluqun@263.net[/email]) 
 * @version 1.0 
 * 
 *****************************************************/ 
 
public class GuiCamera 
{   
    private String fileName; //�ļ���ǰ׺ 
    private String defaultName = "GuiCamera"; 
    static int serialNum=0; 
    private String imageFormat; //ͼ���ļ��ĸ�ʽ 
    private String defaultImageFormat="png"; 
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); 
 
    /**************************************************************** 
     * Ĭ�ϵ��ļ�ǰ׺ΪGuiCamera���ļ���ʽΪPNG��ʽ 
     * The default construct will use the default  
     * Image file surname "GuiCamera",  
     * and default image format "png" 
     ****************************************************************/ 
    public GuiCamera() { 
      fileName = defaultName; 
      imageFormat=defaultImageFormat; 
     
    } 
 
    /**************************************************************** 
     * @param s the surname of the snapshot file 
     * @param format the format of the  image file,  
     * it can be "jpg" or "png" 
     * ������֧��JPG��PNG�ļ��Ĵ洢 
     ****************************************************************/ 
    public GuiCamera(String s,String format) { 
     
      fileName = s; 
      imageFormat=format; 
    } 
     
    /**************************************************************** 
     * ����Ļ�������� 
     * snapShot the Gui once 
     ****************************************************************/ 
    public void snapShot() { 
     
      try { 
      //������Ļ��һ��BufferedImage����screenshot 
        BufferedImage screenshot = (new Robot()).createScreenCapture(new 
            Rectangle(0, 0, (int) d.getWidth(), (int) d.getHeight())); 
        serialNum++; 
        //�����ļ�ǰ׺�������ļ���ʽ�������Զ������ļ��� 
        String name=fileName+String.valueOf(serialNum)+"."+imageFormat; 
        File f = new File(name); 
        System.out.print("Save File "+name); 
      //��screenshot����д��ͼ���ļ� 
        ImageIO.write(screenshot, imageFormat, f); 
        System.out.print("..Finished!\n"); 
      } 
      catch (Exception ex) { 
        System.out.println(ex); 
      } 
    } 
 
    public static void main(String[] args) 
    { 
        GuiCamera cam= new GuiCamera("d:\\Hello", "png");// 
 
        cam.snapShot(); 
    } 
}
 
 