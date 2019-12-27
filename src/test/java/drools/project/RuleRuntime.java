package drools.project;

import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;

public class RuleRuntime implements RuleRuntimeEventListener {

	@Override
	public void objectDeleted(ObjectDeletedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("objectDeleted");

	}

	@Override
	public void objectInserted(ObjectInsertedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("objectInserted");
	}

	@Override
	public void objectUpdated(ObjectUpdatedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("objectUpdated");

	}

}
