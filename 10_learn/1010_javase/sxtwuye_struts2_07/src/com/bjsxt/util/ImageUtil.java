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
			int x = srcImage02.getWidth();//原始图片的宽度
			int y = srcImage02.getHeight();//原始图片的高度
//			不失真的宽度
			int  x1 = WIDTH;
//			不失真的高度
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
//			获取到不失真的缩放图片
			Image ss = srcImage02.getScaledInstance(x1, y1, Image.SCALE_SMOOTH);
			
			g.drawImage(ss, (WIDTH-x1)/2, (HEIGHT-y1)/2, null);
			ImageIO.write(bufferedImage, format, distImage);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//获取到原始图片对象
		
	}
	
	public static void main(String[] args) {
//		getPreviewImage(new File("d:/wallpaper1.jpg"), new File("e:/yuyu.jpg"), "jpg");
		getPreviewImage(new File("d:/ttttt.bmp"), new File("e:/yuyu.jpg"), "bmp");
	}
}
