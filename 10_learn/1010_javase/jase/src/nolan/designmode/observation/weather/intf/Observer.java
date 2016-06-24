package nolan.designmode.observation.weather.intf;

/**
 * 观察者
 * @author ad
 *
 */
public interface Observer {

	public void update(float temp,float humidity,float pressure);
}
