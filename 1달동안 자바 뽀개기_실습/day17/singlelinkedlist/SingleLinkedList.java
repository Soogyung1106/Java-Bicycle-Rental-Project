package singlelinkedlist;

public class SingleLinkedList <E>{
	
//���� Ŭ���� : Node�� ���� ����
	private class Node<T>{	//���� �Ķ���� T�� ����� ���� : �ٱ� Ŭ������ ���� �Ķ���Ϳ� �������ֱ� ����
		//�������
		private T data;
		private Node<T> next;// ��� �ȿ� ��尡 �ִ�(������ ���� �鿩�� ���� �ּҰ� �ִ�.)
		//������
		public Node(T data) {
			this.data=data;
			this.next=null; // NodeŸ�� �ν��Ͻ��� �����Ǹ� �׻� ������ �ʱ�ȭ��.
		}
		//�޼���
		public String toString() {
			return String.valueOf(data); //?�����??
		}
		
	}//end node ���� Ŭ����
		
//������� ����(SingleLinkedList Ŭ����)
	int size=0; //�迭�� ũ�� 
	Node<E> head=null; //Node Ŭ���� Ÿ���� head �ν��Ͻ� ����
	Node<E> tail=null; //tail �ν��Ͻ� ����
	
//addFirst �޼��� : ��� �� �տ������� �߰��ϴ� �޼���		
	public void addFirst(E input) { 
		Node<E> newNode = new Node<>(input); //newNode �ν��Ͻ� ����
		//���� ���Ѿ���.
		newNode.next=head; //(����1)�ּҸ� �����ý�Ŵ���ν� �����Ű�� �۾�
		head=newNode; //(����2)���� newNode�� head�� �ǹǷ�!!
		size++; //(����3) ��� 1�� �߰������Ƿ� ��ü �迭�� ���� ����
		if(head.next==null) { //? size = 1�� ��� (������ ��尡 1���� �����ٰ� newNode 1�� �߰��� ���)
			tail=head;
		}
	}
	
//addLast �޼��� : ��� �� �ڿ������� �߰��ϴ� �޼���		
	public void addLast(E input) { 
		Node<E> newNode = new Node<>(input);
		if(tail == null) { // �ƹ��͵� ���� ���¿��� �߰��� ��� -> tail�� null�� �� NullPointerException�߻�
			tail=newNode;
			head=tail; // head=newNode
		}else { //��尡 ������ �����ϴ� ��� 
			tail.next=newNode; //(����1)�ּҸ� �����ý�Ŵ���ν� �����Ű�� �۾�
			tail=newNode; //(����2)���� newNode�� tail�� �ǹǷ�!!
		}
		size++;	
	}//���� : tail�� null�� �� 
	
//addMiddle �޼��� : ����Ʈ �߰��� ���ο� ��带 �߰��ϴ� �޼���
	public void addMiddle(int index, E input) {
		//<idea>
		Node <E> pre = head; // pre�� head�� �ʱ�ȭ ��Ŵ���ν� ���� pre = 0��° ���
	
		// ���� �ְ� �;��ϴ� index��ġ�� �� index��ġ ��, pre�� ��ġ�� ã���ִ� �۾�
		//2��° �ε����� ��带 �߰��ϰ� ���� �� 1��° �ε����� �ִ� ��尡 �ʿ���
		for(int i=0;i<index-1;i++) {
			pre=pre.next;
		}
		//0�� �ݺ� 0��° ���, 1�� �ݺ� 1��° ���, 2�� �ݺ� 2��° ���
		//index-1�� �ݺ� : index-1��° ��带 ����Ű�Ե�
		
		
		//<idea>		
		//1. ���ο� ��� �����
		//2. �� ����� �ּҸ� ���� ��尡 ����Ű�� �� ����ϹǷ� newNode�� �ּҸ� tail ��忡 ����Ű�� �س��� ������ pre ����� �ּҰ� 
		//newNode�� �ּҸ� ����Ű�� �ؾ���! (�ֳ��ϸ� ���� �ݴ�� �Ѵٸ� �սǵ�)
		//head prev tail    <- newNode
		Node <E> newNode = new Node<>(input); //����� ����
		newNode.next=pre.next;// pre.next�� pre �ڿ� �ִ� ��带 ���� 
		pre.next=newNode; //pre��尡 newNode ����Ű�Բ�

		size++; //��ü ��� ���� ������Ű�� 
	}
	
//add �޼���
	public void add(int index, E input) {
		if(index==0) // ó���� �߰�
			addFirst(input); 
		else if(index==size) // ���� �߰�
			addLast(input);
		else if(index>size) // �������� �ʴ� �ε����� �߰��� ���
			throw new IndexOutOfBoundsException(String.valueOf(index)); //����ó��
		else { //�߰��� �߰�(index<size)
			addMiddle(index, input);
		}//end for��

	}//end add�޼���
	
//toString �޼��� : ??
	public String toString() {
		if(head == null)
			return "[]";
		Node<E> temp=head;
		String str = "[";
		while(temp.next!=null) {
			str += temp.data+",";
			temp=temp.next;
		}
		str+=temp.data;
		return str + "]";
	}
	
//get �޼��� : �ڿ��� ��� ������ �ʿ��� �޼���, �ڿ��� ��� ������Ʈ�� ��� �ʿ��� �޼���
	public Node<E> get(int index){   //���ڷ� size-2�� ���ٸ�...�����Ϸ��� �� �� ����� �ٷξ� ���
		//<idea>
		//���ϴ� ��带 ������ ��� �ּҸ� �Ҿ������ �ʰ� ��� ��Ƶ� ����(temp ���) �ʿ���
		//1. ��� ��Ƶ� temp��� ��� ����(NodeŸ���� �ν��Ͻ�)
		//2. temp�� head�� �ʱ�ȭ ��Ŵ���ν� ���� head = 0��° ���
		Node<E> temp =head; 
		
		if(index>=size || index<0) { //����ó��
			throw new IndexOutOfBoundsException(String.valueOf(index));
		}else { //�������� ��� 
			for(int i=0;i<index;i++) {  // i= 0 ~ index-1���� (size-3)�� �ݺ������ν�
				temp=temp.next;	 //<���� ���>temp�� �����ϰ� ���� ��� �ٷ� ���� ��尡 �Ǿ�����. 
								//<���� ���>temp�� �����ϰ� ���� ��尡 ��
				//<?>
				//temp�� ��ü�� ���� �ּҸ� �����ұ�?? ��忡 ��带 �����ϴ� ���� (temp.next) but ���� �鿩�ٺ��� �ּҰ� ���� 
 			}
			return temp; //�����ϰ� ���� ��� �ٷ� ���� ��� ��ȯ!
		}
	}
//indexOf �޼��� : ??
	public int indexOf(E input) {
		int index=-1;
		if(head.data == input || head.data.equals(input))
			return 0;
		
			Node<E> temp=head;
			for(int i=1;i<size;i++) {
				temp=temp.next;
				if(temp.data==input||temp.data.equals(input)) {
					index = i;
					break;
				}//end if
			}//end for
		return index;
	}//end indexOf()

//removeFirst �޼��� : ù��° ��� �����ϴ� �޼���
	public void removeFirst() {
		head=head.next; 
		//<?>
		// ��忡 �ּҸ� ����? NO!!��忡 ��带 �����ϴ� ���� (������ �� ��� ���� �鿩�� ���� �ּҸ� ������ ����)
		//������ head�� �޸𸮻󿡼� ������ �����Ǵ� ���� �ƴ����� ����Ʈ�� �������� �����ϰ� ��.
		size--; // list ũ�� ����
	}
//removeLast �޼��� : ������ ��� �����ϴ� �޼���  
	public void removeLast() {
										//<?> get �޼��� ����
		Node<E> temp =this.get(size-2); // temp�� �����ϰ� ���� �ǳ� ��� �ٷ� �տ� �ִ� ��尡 �Ǿ�����...get�޼��忡 ���� ��ȯ�� ��
		temp.next=null; //�� ����� �ּҸ� 
		tail=temp;
		size--;
	}
//removeMiddle �޼��� : �߰��� �ִ� ��带 �����ϴ� �޼���
	public void removeMiddle(int index) {
		Node<E> pre = this.get(index-1); //get(index-1)�� �����ϰ� ���� ��� �ٷ� ���� ��� ��ȯ
		//pre.next�� ���� ������� �ϴ� ���
		pre.next=pre.next.next;
		size--;
	}
	
//remove �޼��� : ó��, �߰�, �� ��� ����  
	public void remove(int index) {
		//3��° �ε����� �ִ� ��带 ���� ����
		if(index==0)  //ù ��� �����ϰ� ���� ���
			removeFirst();
		else if(index==size-1) //������ ��� �����ϰ� ���� ���
			removeLast();
		else if(index>=size || index<0)  
			throw new IndexOutOfBoundsException(String.valueOf(index));
		else {
			removeMiddle(index); //�߰��� �ִ� ��� �����ϰ� ���� ���
		}//end else
	}//end remove()	
	
//update �޼��� : ����ڰ� ������ index�� ��带 ����
	public void update(int index, E input) {  //<?> input ������ ��������?
		Node<E> temp = this.get(index); // <?> get(index) �޼���� ������ ��ȯ�ϳ�?? 
										//����ڰ������ϰ� �;��ϴ� ���(����ڰ� ������ index)
		temp.data=input;
	}
	
// ????
//toArray �޼��� :
	public Object[] toArray() {
		Object[] listArray = new Object[size];
		for(int i=0; i<size; i++) {
			listArray[i] = get(i).data;
		}
		return listArray;
	}

// ????
	//���� String[] strArr = list.toArray(new String[list.size]
	public E[] toArray(E[] e) {
		E[] listArray=e;
		for(int i=0; i<size; i++) {
			listArray[i]=get(i).data;
		}
		return listArray;
	}
	
//main �޼���
	public static void main(String[] args) {
		SingleLinkedList<String> mm = new SingleLinkedList<>();
		//add �޼��� ȣ��
		mm.addLast("��");
		mm.addLast("��");
		mm.addFirst("��");
		mm.addFirst("��");
		mm.addFirst("��");
		mm.addFirst("��");
		mm.add(2,  "abc");
		
		System.out.println(mm);
		
		//remove �޼��� ȣ��
		mm.removeFirst();
		System.out.println(mm);
		mm.removeLast();
		System.out.println(mm);
		System.out.println(mm.head);
		System.out.println(mm.tail);
		mm.remove(1);
		
		System.out.println(mm);
		
		//update �޼��� ȣ��
		mm.update(3,  "abc");
		System.out.println(mm);
		System.out.println(mm.indexOf("abc"));
		String[] mms=mm.toArray(new String[mm.size]);
		System.out.println(mms[0]);

	}
	
	
}//end Ŭ����
