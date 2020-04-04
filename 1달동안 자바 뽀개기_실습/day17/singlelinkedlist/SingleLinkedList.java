package singlelinkedlist;

public class SingleLinkedList <E>{
	
//내부 클래스 : Node의 구조 정의
	private class Node<T>{	//유형 파라미터 T를 사용한 이유 : 바깥 클래스의 유형 파라미터와 구분해주기 위해
		//멤버변수
		private T data;
		private Node<T> next;// 노드 안에 노드가 있다(하지만 안을 들여다 보면 주소가 있다.)
		//생성자
		public Node(T data) {
			this.data=data;
			this.next=null; // Node타입 인스턴스가 생성되면 항상 포인터 초기화됨.
		}
		//메서드
		public String toString() {
			return String.valueOf(data); //?뭔기능??
		}
		
	}//end node 내부 클래스
		
//멤버변수 선언(SingleLinkedList 클래스)
	int size=0; //배열의 크기 
	Node<E> head=null; //Node 클래스 타입의 head 인스턴스 생성
	Node<E> tail=null; //tail 인스턴스 생성
	
//addFirst 메서드 : 노드 맨 앞에서부터 추가하는 메서드		
	public void addFirst(E input) { 
		Node<E> newNode = new Node<>(input); //newNode 인스턴스 생성
		//순서 지켜야함.
		newNode.next=head; //(생각1)주소를 포인팅시킴으로써 연결시키는 작업
		head=newNode; //(생각2)이제 newNode가 head가 되므로!!
		size++; //(생각3) 노드 1개 추가했으므로 전체 배열의 갯수 증가
		if(head.next==null) { //? size = 1인 경우 (기존에 노드가 1개도 없었다가 newNode 1개 추가한 경우)
			tail=head;
		}
	}
	
//addLast 메서드 : 노드 맨 뒤에서부터 추가하는 메서드		
	public void addLast(E input) { 
		Node<E> newNode = new Node<>(input);
		if(tail == null) { // 아무것도 없는 상태에서 추가할 경우 -> tail이 null일 때 NullPointerException발생
			tail=newNode;
			head=tail; // head=newNode
		}else { //노드가 여러개 존재하는 경우 
			tail.next=newNode; //(생각1)주소를 포인팅시킴으로써 연결시키는 작업
			tail=newNode; //(생각2)이제 newNode가 tail이 되므로!!
		}
		size++;	
	}//주의 : tail이 null일 때 
	
//addMiddle 메서드 : 리스트 중간에 새로운 노드를 추가하는 메서드
	public void addMiddle(int index, E input) {
		//<idea>
		Node <E> pre = head; // pre를 head로 초기화 시킴으로써 현재 pre = 0번째 노드
	
		// 내가 넣고 싶어하는 index위치의 전 index위치 즉, pre의 위치를 찾아주는 작업
		//2번째 인덱스에 노드를 추가하고 싶을 때 1번째 인덱스에 있는 노드가 필요함
		for(int i=0;i<index-1;i++) {
			pre=pre.next;
		}
		//0번 반복 0번째 노드, 1번 반복 1번째 노드, 2번 반복 2번째 노드
		//index-1번 반복 : index-1번째 노드를 가리키게됨
		
		
		//<idea>		
		//1. 새로운 노드 만들기
		//2. 한 노드의 주소를 여러 노드가 가리키는 것 허용하므로 newNode의 주소를 tail 노드에 가리키게 해놓은 다음에 pre 노드의 주소가 
		//newNode의 주소를 가리키게 해야함! (왜냐하면 순서 반대로 한다면 손실됨)
		//head prev tail    <- newNode
		Node <E> newNode = new Node<>(input); //새노드 생성
		newNode.next=pre.next;// pre.next는 pre 뒤에 있는 노드를 말함 
		pre.next=newNode; //pre노드가 newNode 가리키게끔

		size++; //전체 노드 갯수 증가시키기 
	}
	
//add 메서드
	public void add(int index, E input) {
		if(index==0) // 처음에 추가
			addFirst(input); 
		else if(index==size) // 끝에 추가
			addLast(input);
		else if(index>size) // 존재하지 않는 인덱스에 추가할 경우
			throw new IndexOutOfBoundsException(String.valueOf(index)); //예외처리
		else { //중간에 추가(index<size)
			addMiddle(index, input);
		}//end for문

	}//end add메서드
	
//toString 메서드 : ??
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
	
//get 메서드 : 뒤에서 노드 삭제시 필요한 메서드, 뒤에서 노드 업데이트할 경우 필요한 메서드
	public Node<E> get(int index){   //인자로 size-2가 들어간다면...삭제하려는 맨 끝 노드의 바로앞 노드
		//<idea>
		//원하는 노드를 삭제할 경우 주소를 잃어버리지 않고 잠시 담아둘 공간(temp 노드) 필요함
		//1. 잠시 담아둘 temp라는 노드 생성(Node타입의 인스턴스)
		//2. temp를 head로 초기화 시킴으로써 현재 head = 0번째 노드
		Node<E> temp =head; 
		
		if(index>=size || index<0) { //예외처리
			throw new IndexOutOfBoundsException(String.valueOf(index));
		}else { //정상적인 경우 
			for(int i=0;i<index;i++) {  // i= 0 ~ index-1까지 (size-3)번 반복함으로써
				temp=temp.next;	 //<삭제 경우>temp는 삭제하고 싶은 노드 바로 앞의 노드가 되어있음. 
								//<수정 경우>temp는 수정하고 싶은 노드가 됨
				//<?>
				//temp의 정체는 뭔데 주소를 저장할까?? 노드에 노드를 저장하는 개념 (temp.next) but 안을 들여다보면 주소가 있음 
 			}
			return temp; //삭제하고 싶은 노드 바로 앞의 노드 반환!
		}
	}
//indexOf 메서드 : ??
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

//removeFirst 메서드 : 첫번째 노드 삭제하는 메서드
	public void removeFirst() {
		head=head.next; 
		//<?>
		// 노드에 주소를 대입? NO!!노드에 노드를 대입하는 개념 (하지만 그 노드 안을 들여다 보면 주소를 가지고 있음)
		//기존의 head가 메모리상에서 완전히 삭제되는 것은 아니지만 리스트와 떨어져서 존재하게 됨.
		size--; // list 크기 감소
	}
//removeLast 메서드 : 마지막 노드 삭제하는 메서드  
	public void removeLast() {
										//<?> get 메서드 참고
		Node<E> temp =this.get(size-2); // temp는 삭제하고 싶은 맨끝 노드 바로 앞에 있는 노드가 되어있음...get메서드에 의해 반환된 것
		temp.next=null; //끝 노드의 주소를 
		tail=temp;
		size--;
	}
//removeMiddle 메서드 : 중간에 있는 노드를 삭제하는 메서드
	public void removeMiddle(int index) {
		Node<E> pre = this.get(index-1); //get(index-1)은 삭제하고 싶은 노드 바로 앞의 노드 반환
		//pre.next가 내가 지우고자 하는 노드
		pre.next=pre.next.next;
		size--;
	}
	
//remove 메서드 : 처음, 중간, 끝 노드 삭제  
	public void remove(int index) {
		//3번째 인덱스에 있는 노드를 삭제 가정
		if(index==0)  //첫 노드 삭제하고 싶은 경우
			removeFirst();
		else if(index==size-1) //마지막 노드 삭제하고 싶은 경우
			removeLast();
		else if(index>=size || index<0)  
			throw new IndexOutOfBoundsException(String.valueOf(index));
		else {
			removeMiddle(index); //중간에 있는 노드 삭제하고 싶은 경우
		}//end else
	}//end remove()	
	
//update 메서드 : 사용자가 선택한 index의 노드를 수정
	public void update(int index, E input) {  //<?> input 변수가 뭐였더라?
		Node<E> temp = this.get(index); // <?> get(index) 메서드는 무엇을 반환하나?? 
										//사용자가수정하고 싶어하는 노드(사용자가 선택한 index)
		temp.data=input;
	}
	
// ????
//toArray 메서드 :
	public Object[] toArray() {
		Object[] listArray = new Object[size];
		for(int i=0; i<size; i++) {
			listArray[i] = get(i).data;
		}
		return listArray;
	}

// ????
	//사용법 String[] strArr = list.toArray(new String[list.size]
	public E[] toArray(E[] e) {
		E[] listArray=e;
		for(int i=0; i<size; i++) {
			listArray[i]=get(i).data;
		}
		return listArray;
	}
	
//main 메서드
	public static void main(String[] args) {
		SingleLinkedList<String> mm = new SingleLinkedList<>();
		//add 메서드 호출
		mm.addLast("가");
		mm.addLast("나");
		mm.addFirst("다");
		mm.addFirst("라");
		mm.addFirst("마");
		mm.addFirst("바");
		mm.add(2,  "abc");
		
		System.out.println(mm);
		
		//remove 메서드 호출
		mm.removeFirst();
		System.out.println(mm);
		mm.removeLast();
		System.out.println(mm);
		System.out.println(mm.head);
		System.out.println(mm.tail);
		mm.remove(1);
		
		System.out.println(mm);
		
		//update 메서드 호출
		mm.update(3,  "abc");
		System.out.println(mm);
		System.out.println(mm.indexOf("abc"));
		String[] mms=mm.toArray(new String[mm.size]);
		System.out.println(mms[0]);

	}
	
	
}//end 클래스
