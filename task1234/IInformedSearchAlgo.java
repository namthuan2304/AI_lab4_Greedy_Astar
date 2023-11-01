package task1234;

public interface IInformedSearchAlgo {
	public Node execute(Node root, String goal);

	public Node execute(Node root, String start, String goal);

	public boolean isAdmissibleH(Node root, String goal);
}
