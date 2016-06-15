package com.bjsxt.util;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

	

public class ImageUtil {
	private final static int WIDTH=240;
	private final static int HEIGHT=240;
	
	
	public static void  getPreviewImage(File srcImage,File distImage,String format){
		try {
			BufferedImage srcImage02 = ImageIO.read(srcImage);
			int x = srcImage02.getWidth();//ԭʼͼƬ�Ŀ��
			int y = srcImage02.getHeight();//ԭʼͼƬ�ĸ߶�
//			��ʧ��Ŀ��
			int  x1 = WIDTH;
//			��ʧ��ĸ߶�
			int y1 = HEIGHT;
			
			if(WIDTH*y<HEIGHT*x){
				
				y1= WIDTH*y/x;
				
			}
			
			if (WIDTH*y>HEIGHT*x) {
				x1= HEIGHT*x/y;
			}
			
			BufferedImage bufferedImage = new BufferedImage(WIDTH, HEIGHT,  Image.SCALE_SMOOTH);
			Graphics2D g = bufferedImage.createGraphics();
			g.fillRect(0, 0, WIDTH, HEIGHT);
			g.setColor(new Color(255, 255, 255));
//			��ȡ����ʧ�������ͼƬ
			Image ss = srcImage02.getScaledInstance(x1, y1, Image.SCALE_SMOOTH);
			
			g.drawImage(ss, (WIDTH-x1)/2, (HEIGHT-y1)/2, null);
			ImageIO.write(bufferedImage, format, distImage);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//��ȡ��ԭʼͼƬ����
		
	}
	
	public static void main(String[] args) {
//		getPreviewImage(new File("d:/wallpaper1.jpg"), new File("e:/yuyu.jpg"), "jpg");
		getPreviewImage(new File("d:/ttttt.bmp"), new File("e:/yuyu.jpg"), "bmp");
	}
}
