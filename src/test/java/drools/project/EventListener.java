package drools.project;


import java.util.concurrent.TimeUnit;

import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.AgendaEventListener;
import org.kie.api.event.rule.AgendaGroupPoppedEvent;
import org.kie.api.event.rule.AgendaGroupPushedEvent;
import org.kie.api.event.rule.BeforeMatchFiredEvent;
import org.kie.api.event.rule.MatchCancelledEvent;
import org.kie.api.event.rule.MatchCreatedEvent;
import org.kie.api.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.api.event.rule.RuleFlowGroupDeactivatedEvent;

public class EventListener implements AgendaEventListener {

	@Override
	public void matchCreated(MatchCreatedEvent arg0) {
		System.out.println("Match Created Rule: " + arg0.getMatch().getRule().getName()  + " Time: " + arg0.getKieRuntime().getSessionClock().getCurrentTime());
	}

	@Override
	public void beforeMatchFired(BeforeMatchFiredEvent arg0) {
		System.out.println("Before Match Rule: " + arg0.getMatch().getRule().getName()  + " Time: " +  arg0.getKieRuntime().getSessionClock().getCurrentTime());
	}

	@Override
	public void afterMatchFired(AfterMatchFiredEvent arg0) {
		System.out.println("After Match Rule: " + arg0.getMatch().getRule().getName()  + " Time: " +  arg0.getKieRuntime().getSessionClock().getCurrentTime());
	}

	@Override
	public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent arg0) {
		System.out.println("afterRuleFlowGroupActivated");
		
	}

	
	
	@Override
	public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent arg0) {
		System.out.println("afterRuleFlowGroupDeactivated");
		
	}

	@Override
	public void agendaGroupPopped(AgendaGroupPoppedEvent arg0) {
		System.out.println("agendaGroupPopped");		
	}

	@Override
	public void agendaGroupPushed(AgendaGroupPushedEvent arg0) {
		System.out.println("agendaGroupPushed");
	}



	@Override
	public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent arg0) {
		System.out.println("beforeRuleFlowGroupActivated");
	}

	@Override
	public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent arg0) {
		System.out.println("beforeRuleFlowGroupDeactivated");
	}

	@Override
	public void matchCancelled(MatchCancelledEvent arg0) {
		System.out.println("matchCancelled");
	}


}