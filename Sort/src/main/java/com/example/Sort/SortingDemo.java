package com.example.Sort;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SortingDemo {
	@Autowired
	SortingAlgorithm sa1;
	@Autowired
	SortingAlgorithm sa2;
	List<Integer> l = new ArrayList();
	
	public SortingAlgorithm getSa1() {
		return sa1;
	}

	public void setSa1(SortingAlgorithm sa) {
		this.sa1 = sa;
	}
	
	
	public SortingAlgorithm getSa2() {
		return sa2;
	}

	public void setSa2(SortingAlgorithm sa2) {
		this.sa2 = sa2;
	}

	public List<Integer> getL() {
		return l;
	}

	public void setL(List<Integer> l) {
		this.l = l;
	}

	public void add(int i)
	{
		l.add(i);
	}
	
	public void BubbleSort()
	{
		l = sa1.Sort(l);
	}
	
	public void QuickSort()
	{
		l = sa2.Sort(l);
	}
	
}
