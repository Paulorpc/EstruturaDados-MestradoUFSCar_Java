package com.paulorpc.ufscar.estruturadados.cap08.Reforco.Ex4;


import net.datastructures.Entry;
import net.datastructures.HeapPriorityQueue;

public class MaxHeap<K, V> extends HeapPriorityQueue<K, V> {

	@Override
	protected void upheap(int j) {
		while (j > 0) { // continue until reaching root (or break statement)
			int p = parent(j);
			if (compare(heap.get(j), heap.get(p)) <= 0)
				break; // heap property verified
			swap(j, p);
			j = p; // continue from the parent's location
		}
	}

	@Override
	protected void downheap(int j) {
		while (hasLeft(j)) { // continue to bottom (or break statement)
			int leftIndex = left(j);
			int smallChildIndex = leftIndex; // although right may be smaller
			if (hasRight(j)) {
				int rightIndex = right(j);
				if (compare(heap.get(leftIndex), heap.get(rightIndex)) > 0)
					smallChildIndex = rightIndex; // right child is smaller
			}
			if (compare(heap.get(smallChildIndex), heap.get(j)) <= 0)
				break; // heap property has been restored
			swap(j, smallChildIndex);
			j = smallChildIndex; // continue at position of the child
		}
	}

	public Entry<K, V> max() {
		if (heap.isEmpty())
			return null;
		return heap.get(0);
	}

	public Entry<K, V> removeMax() {
		if (heap.isEmpty())
			return null;
		Entry<K, V> answer = heap.get(0);
		swap(0, heap.size() - 1); // put minimum item at the end
		heap.remove(heap.size() - 1); // and remove it from the list;
		downheap(0); // then fix new root
		return answer;
	}

}
