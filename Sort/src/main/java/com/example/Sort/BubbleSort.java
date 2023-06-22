package com.example.Sort;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class BubbleSort implements SortingAlgorithm {

	@Override
	public List<Integer> Sort(List<Integer> l) {
		// TODO Auto-generated method stub
		for(int i = 0; i<l.size(); i++)
		{
			for(int j=i; j<l.size()-1; j++)
			{
				if(l.get(j).compareTo(l.get(j+1))>0)
				{
					int temp = l.get(j);
					l.set(j, l.get(j+1));
					l.set(j+1, temp);
				}
			}
		}
		return l;
	}

}
