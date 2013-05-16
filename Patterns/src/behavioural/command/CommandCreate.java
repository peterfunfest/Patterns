package behavioural.command;

public class CommandCreate implements Command {

	ReceiverEntity entity;
	
	public CommandCreate(ReceiverEntity entity) {
		this.entity = entity;
	}

	@Override
	public void execute() {
		entity.create();
	}
	
}
