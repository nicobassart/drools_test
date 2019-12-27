package drools.project;


import java.util.concurrent.TimeUnit;

import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.AgendaEventListener;
import org.kie.api.event.rule.AgendaGroupPoppedEvent;
import org.kie.api.event.rule.AgendaGroupPushedEvent;
import org.kie.api.event.rule.BeforeMatchFiredEvent;
import org.kie.api.event.rule.MatchCancelledEvent;
import org.kie.api.event.rule.MatchCreatedEvent;
import org.kie.api.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.api.event.rule.RuleFlowGroupDeactivatedEvent;

public class EventListener2 implements ProcessEventListener{

	@Override
	public void afterNodeLeft(ProcessNodeLeftEvent arg0) {
		System.out.println("afterNodeLeft");
		
	}

	@Override
	public void afterNodeTriggered(ProcessNodeTriggeredEvent arg0) {
		System.out.println("afterNodeTriggered");
	}

	@Override
	public void afterProcessCompleted(ProcessCompletedEvent arg0) {
		System.out.println("afterProcessCompleted");
		
	}

	@Override
	public void afterProcessStarted(ProcessStartedEvent arg0) {
		System.out.println("afterProcessStarted");
		
	}

	@Override
	public void afterVariableChanged(ProcessVariableChangedEvent arg0) {
		System.out.println("afterVariableChanged");
		
	}

	@Override
	public void beforeNodeLeft(ProcessNodeLeftEvent arg0) {
		System.out.println("beforeNodeLeft");
		
	}

	@Override
	public void beforeNodeTriggered(ProcessNodeTriggeredEvent arg0) {
		System.out.println("beforeNodeTriggered");
		
	}

	@Override
	public void beforeProcessCompleted(ProcessCompletedEvent arg0) {
		System.out.println("beforeProcessCompleted");
		
	}

	@Override
	public void beforeProcessStarted(ProcessStartedEvent arg0) {
		System.out.println("beforeProcessStarted");
		
	}

	@Override
	public void beforeVariableChanged(ProcessVariableChangedEvent arg0) {
		System.out.println("beforeVariableChanged");
		
	}
}