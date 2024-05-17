import java.util.ArrayList;

public class MailTransmitter implements Transmitter{

	private ArrayList <Message> buffer;
	private int dimbuffer;
	final static String TYPE = "MAIL";
	
	public MailTransmitter( int dimbuffer) {
		this.buffer = buffer;
		this.dimbuffer = dimbuffer;
		this.buffer = new ArrayList<>();
	}
	@Override
	public void store(Message message) {
		buffer.add(message);
		if (buffer.size() >= dimbuffer) {
            sendBufferedMessages();
        }
	}
	@Override
	public Message retrieve(Person receiver) {
		for (Message message : buffer) {
            if (message.getReciver().equals(receiver)) {
                buffer.remove(message);
                return message;
            }
	}
		return null;
	}
	private void sendBufferedMessages() {
		for (Message message : buffer) {
        }
             buffer.clear();
	}
}
