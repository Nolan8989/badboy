package nolan.thread.produce1;
/**
 * �۲��ߣ�������
 * @author Administrator
 *
 */
public class Watcher implements Runnable{
	private Movie movie;
	public Watcher() {
		// TODO Auto-generated constructor stub
	}
	public Watcher(Movie movie){
		this.movie =movie;
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++){
			this.movie.watch();
		}
	}
}
