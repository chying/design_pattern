package responsibilitychain;

public interface Pipeline {
	public void addValve(Valve valve);

	public Valve getBasic();

	public void setBasic(Valve valve);

	public Valve getFirst();
}
