package behavioural.command;

public class CommandDelete implements Command {

	ReceiverEntity entity;
	
	public CommandDelete(ReceiverEntity entity) {
		this.entity = entity;
	}

	@Override
	public void execute() {
		entity.delete();
	}
	
}
