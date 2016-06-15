package norlando.util;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageUtil {

	private final static int WIDTH = 240;
	private final static int HEIGHT = 240;
	
	public static void getPreviewImage(File srcImage, File distImage , String format){
		try {
			
			
			BufferedImage srcImage02 = ImageIO.read(srcImage);//读取图片
			
			
			int x = srcImage02.getWidth();//原始图片的宽度;
			int y = srcImage02.getHeight();//原始图片的高度;
			int x1 = WIDTH;//不失真宽度
			int y1 = HEIGHT;//不失真高度
			

			
			
			if(WIDTH * y < HEIGHT *x){ //图片宽度 小于高度
				y1 = WIDTH * y / x;
			}

			
			
			if(WIDTH * y >HEIGHT * x){ //图片宽度大于高度
				x1 = HEIGHT * x / y;
			}
			
			
			BufferedImage bufferedImage = new BufferedImage(WIDTH,HEIGHT,Image.SCALE_SMOOTH);
			Graphics2D g = bufferedImage.createGraphics();//
			g.fillRect(0, 0, WIDTH, HEIGHT);//画出来一个矩形.
			g.setColor(new Color(255,255,255));
			Image ss = srcImage02.getScaledInstance(x1, y1, Image.SCALE_SMOOTH);
			
			g.drawImage(ss, (WIDTH - x1)/2, (HEIGHT -y1)/2, null);
			ImageIO.write(bufferedImage, format, distImage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String args[]){
		
		getPreviewImage(new File("d:/2013-10-4 23-29-37.png"),new File("e:/2013-10-4 23-29-37.png"),"png");
	}
	
}
