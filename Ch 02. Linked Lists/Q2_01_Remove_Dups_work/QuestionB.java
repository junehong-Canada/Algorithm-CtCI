import MyLibrary.LinkedListNode;

class QuestionB {
  public static void deleteDups(LinkedListNode n){
    LinkedListNode current = n;
    while(current != null){
      LinkedListNode runner = current;
      while(runner.next != null){
        if (runner.next.data == current.data) {
          runner.next = runner.next.next;
        } else {
          runner = runner.next;
        }
      }
      current = current.next;
    }
  }

  public static void main(String[] args){
    LinkedListNode first = new LinkedListNode(0, null, null);
    LinkedListNode head = first;
    LinkedListNode second = first;
    for(int i=1; i<8; i++) {
      second = new LinkedListNode(i%2, null, null);
      first.setNext(second);
      second.setPrevious(first);
      first = second;
    }
    System.out.println(head.printForward());
    // deleteDups(head);
    // System.out.println(head.printForward());

    LinkedListNode cloneA = head.clone();
		LinkedListNode cloneB = head.clone();
		LinkedListNode cloneC = head.clone();
		QuestionA.deleteDups(cloneA);
		QuestionA.deleteDups(cloneB);
		QuestionA.deleteDups(cloneC);

		System.out.println(cloneA.printForward());
		System.out.println(cloneB.printForward());
		System.out.println(cloneC.printForward());
  }
}
