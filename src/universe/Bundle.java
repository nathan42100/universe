package universe;
import java.util.List;

import world.World;

class Bundle {
	List<Mail> mails;
	List<World> worlds;
	
	Bundle (List<Mail> mails, List<World> worlds) {
		this.mails = mails;
		this.worlds = worlds;
	}
}