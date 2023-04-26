package preparation.link;

public class ReverseMe {

	public NodeList reverse(NodeList head) {
		
		NodeList next=null;
		NodeList current=head;
		NodeList prev=null;
		
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		
		head=prev;
		
		return prev;
	}
	
	
	public NodeList reverseRecursion(NodeList head) {
		
		if(head==null || head.next==null)
			return head;
		
		NodeList rest=reverseRecursion(head.next);
		
		head.next.next=head;
		head.next=null;
		
		return rest;
	}
	
	
	public static void main(String[] args) {
		
		NodeList node=new NodeList(1,
				new NodeList(3, new NodeList(5,
				new NodeList(7, new NodeList(9, null)))));
		
		//System.out.println("Before Reverse:"+node);
		//NodeList result=new ReverseMe().reverse(node);
		//System.out.println("After Reverse:"+result);
		
		System.out.println("Before Recursive Reverse:"+node);
		NodeList result=new ReverseMe().reverseRecursion(node);
		System.out.println("After Recursive Reverse:"+result);
	}
}
