package biochemsimulation.simulation.matching;

public enum PatternMatchingEngineEnum {
	ViatraEngine("ViatraEngine");
	
	private String name;
	private PatternMatchingEngineEnum(String name) {
		this.name = name;
	}
	
	 @Override
	 public String toString() {
		 return name;
	 }
}
