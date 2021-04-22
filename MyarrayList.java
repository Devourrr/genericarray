package week5day3_arrayList;


class MyArrayList {
	Object[] nums;
	int current;
	public MyArrayList() {
		nums = new Object[10];
		current=0;
	}
	public void add(Object obj) {
		nums[current] = obj;
		current++;
		}
	public Object get (int index) {
		return nums[index];
		}
	public int size() {
		return current;
		}

	}



