package interfaceeksempler;

import java.util.ArrayList;
import java.util.List;

public class Steps {

	public List<List<StepData>> stepSegments = new ArrayList<List<StepData>>();

	public void startNewSegment() {
		stepSegments.add(new ArrayList<StepData>());
	}

	public void addStepData(StepData stepData) {
		if (stepSegments.isEmpty()) {
			throw new IllegalStateException("Must all startNewSegment first");
		}
		stepSegments.get(stepSegments.size() - 1).add(stepData);
	}
	
	public double sum() {
		return process(new SumHelper());
	}
	
	public double average() {
		int count = 0;
		double sum = 0.0;
		for (List<StepData> segment : stepSegments) {
			for (StepData step : segment) {
				sum += step.count;
				count += step.seconds;
			}
		}
		return sum / count;
	}
	
	public double process(ProcessHelper helper) {
		for (List<StepData> segment : stepSegments) {
			for (StepData step : segment) {
				helper.accumulate(step);
			}
		}
		return helper.getResult();
	}
	double result = process(new SumHelper());
}
