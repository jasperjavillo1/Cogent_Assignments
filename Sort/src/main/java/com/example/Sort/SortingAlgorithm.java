package com.example.Sort;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface SortingAlgorithm {
	public List<Integer> Sort(List<Integer> l);
}
