package behavioural.command;

public class CommandUpdate implements Command {

	ReceiverEntity entity;
	
	public CommandUpdate(ReceiverEntity entity) {
		this.entity = entity;
	}

	@Override
	public void execute() {
		entity.update();
	}
	
}
