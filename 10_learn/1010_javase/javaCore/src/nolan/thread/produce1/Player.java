package nolan.thread.produce1;
/**
 * ������
 * @author Administrator
 *
 */
public class Player  implements Runnable{
	private Movie movie;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(Movie movie){
		this.movie =movie;
	}
	
	@Override
	public void run() {
		for(int i=0;i<20;i++){
			if(i%2==0){
				this.movie.play("������");
			}else{
				this.movie.play("�Ұ׻�");
			}
		}
	}

}
