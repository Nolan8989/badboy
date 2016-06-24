package nolan.thread.produce1;
/**
 * 生产者
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
				this.movie.play("左青龙");
			}else{
				this.movie.play("右白虎");
			}
		}
	}

}
