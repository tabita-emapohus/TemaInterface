
public class Message {

	private Person sender;
	private Person receiver;
	private String content;
	public Message(Person sender, Person reciver,String content) {
		this.sender = sender;
		this.receiver = reciver;
		this.content = content;
	}
	public Person getSender() {
		return sender;
	}
	public Person getReciver() {
		return receiver;
	}
	public String getContent() {
		return content;
	}
	
	
}
