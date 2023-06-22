package com.example.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortController {
	@Autowired
	SortingDemo sd;
	
	@PostMapping(value = "/bubblesort")
	public String bubbleSort() throws Exception
	{
		sd.add(10);
		sd.add(5);
		sd.add(7);
		sd.BubbleSort();
		return sd.l.toString();
	}
	@PostMapping(value = "/quicksort")
	public String quickSort() throws Exception
	{
		sd.add(20);
		sd.add(10);
		sd.add(14);
		sd.QuickSort();
		return sd.l.toString();
	}
}
