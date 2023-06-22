package com.example.Sort;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class QuickSort implements SortingAlgorithm {

	@Override
	public List<Integer> Sort(List<Integer> l) {
		// TODO Auto-generated method stub
		if(l.size()>2)
		{
			int halfIndex = l.size()/2;
			List h1 = l.subList(0, halfIndex);
			List h2 = l.subList(halfIndex, l.size());
			h1 = Sort(h1);
			h2 = Sort(h2);
			h1.addAll(h2);
			return h1;
		}
		else
		{
			if(l.get(0).compareTo((l.get(l.size())))>0)
			{
				int temp = l.get(0);
				l.set(0, l.size());
				l.set(l.size(), temp);
			}
			return l;
		}
	}

}
