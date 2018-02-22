package interfaceeksempler;

public class SumHelper implements ProcessHelper {

	private double sum = 0.0;

	@Override
	public void accumulate(StepData stepData) {
		sum += stepData.count;
	}

	@Override
	public double getResult() {
		return sum;
	}
}
