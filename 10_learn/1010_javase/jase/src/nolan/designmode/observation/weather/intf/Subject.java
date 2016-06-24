package nolan.designmode.observation.weather.intf;
/**
 *  主题
 * @author ad
 *
 */
public interface Subject {

	public void registerObserver(Observer o);
	
	
	public void removeObserver(Observer o);
	
	public void notifyObservers();
}
