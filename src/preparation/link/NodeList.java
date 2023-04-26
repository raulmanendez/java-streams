package preparation.link;

public class NodeList {

	public int val;
	public NodeList next;

	NodeList() { }

	NodeList(int val) {
		this.val = val;
	}

	NodeList(int val, NodeList next) {
		this.val = val;
		this.next = next;
	}

	
	public String toString() {
		return "val=" + val + ", next=" + next;
	}
	
	
}
