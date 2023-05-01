package P_0501;

public class Study09 {
	private Study02 from;
	private Study02 to;
	public Study09(Study02 from, Study02 to) {
		this.from = new Study02(from);
		this.to = new Study02(to);
	}
	public Study02 getFrom() {
		return from;
	}
	public Study02 getTo() {
		return to;
	}
	@Override
	public String toString() {
		return "{" + from + "~" + to + "}";
	}
}
