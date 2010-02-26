package universe;
abstract class Universe {
	protected UniverseState state;
	
	public void start();
	
	abstract Bundle onNew(World world);
	
	abstract Bundle onMessage(ClientMessage msg);
	
	abstract Bundle onTick();
	
	abstract Bundle onDisconnect(World world);
	
}