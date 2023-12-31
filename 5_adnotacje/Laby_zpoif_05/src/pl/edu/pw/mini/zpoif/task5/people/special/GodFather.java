package pl.edu.pw.mini.zpoif.task5.people.special;

import pl.edu.pw.mini.zpoif.task5.people.MafiaWorker;
import pl.edu.pw.mini.zpoif.task5.solution.annotation.ImportantWorkers;
import pl.edu.pw.mini.zpoif.task5.solution.annotation.InitMe;
import pl.edu.pw.mini.zpoif.task5.solution.annotation.PrimaryMafiaWorker;

@PrimaryMafiaWorker
@ImportantWorkers
public class GodFather extends MafiaWorker {
	
	@InitMe
	protected Pocket pocket;

	public GodFather() {
		super();
	}

	public GodFather(String name, String surname) {
		super(name, surname);
	}

	public GodFather(String name) {
		super(name);
	}

}
