package universe;
import java.io.Serializable;
import java.io.ObjectOutputStream;

class Mail {
	IWorld iworld;
	Serializable payload;
	Mail(IWorld world, Serializable payload) {
		this.iworld = iworld;
		this.payload = payload;
	}
	
	public void send() {
		out = new ObjectOutputStream(???);
		out.writeObject(this.payload);
		out.close();
	}
}