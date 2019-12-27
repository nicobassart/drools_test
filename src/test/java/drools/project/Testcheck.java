package drools.project;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Testcheck {
	private LocalDateTime before;
	private LocalDateTime after;

	public LocalDateTime getBefore() {
		return before;
	}
	public boolean setBefore(LocalDateTime before) throws InterruptedException {
		this.before = before;
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Before");
		return true;
	}
	public boolean check() {
		System.out.println("passing query");
		return true;
	}
	
	public LocalDateTime getAfter() {
		return after;
	}
	public boolean setAfter(LocalDateTime after) {
		this.after = after;
		System.out.println("After");
		return true;
	}
	public int diferencia() {
		int a = Duration.between(before,after ).getNano();
		return a;
	}
	public void clear() {
		this.after = null;
		this.before= null;
	}
}
