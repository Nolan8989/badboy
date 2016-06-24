package nolan.thread.produce1;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Movie movie =new Movie();
		Player player =new Player(movie);
		Watcher watcher =new Watcher(movie);
		
		
		//启动线程
		new Thread(player).start();
		new Thread(watcher).start();
		
	}

}
