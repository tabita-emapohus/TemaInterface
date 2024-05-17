
public class EmailTransmitter implements Transmitter {

	final static String TYPE = "EMAIL";

	@Override
	public void store(Message message) {
		return  ;
		
	}
	@Override
	public Message retrieve(Person receiver) {
		return null;
	}
}
