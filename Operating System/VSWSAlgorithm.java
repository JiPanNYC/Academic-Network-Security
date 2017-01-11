/*
 * Ji Pan
 * N11489385
 * CS6233-Operating System
 */

import java.util.Scanner;


public class VSWSAlgorithm {
	private int P;	
	private Node[] PageState = null;
	private Scanner file = null;
	private int currentTravesalRecord = 0;
	private int pageFault = 0;
	private int lastPageFault = 0;
	private int L = 0;
	private int M = 0;
	private int Q = 0;
	private int indexOfLM = 0;
	private int CurrentFrameValue = 0;
	private int FramesFrequency = 10000;
	private int MinFramesFrequency = 0;
	private int MaxFrameValue = 0;
	
	
	VSWSAlgorithm(int P, int l, int m, int q, Scanner file){
		
		this.P = P;
		this.file = file;
		this.L = l;
		this.M = m;
		this.Q = q;
		PageState = new Node[this.P];
		for(int i = 0; i < PageState.length; i++){
			PageState[i] = new Node();
		}
	}
	
	void PageFaultCalculation(){
		
		file.nextLine();//Because the first line is indication, not page references
		
		while(file.hasNext()){
			CurrentFrameValue=0;
			int page = file.nextInt();
			if(PageState[page].inWorkingSet==1){
				PageState[page].state=1;
				
			}
			
			else if(PageState[page].inWorkingSet == 0){
					pageFault++;	
					PageState[page].inWorkingSet = 1;					
					PageState[page].state=1;		
					}
			
			currentTravesalRecord++;
			indexOfLM++;
			
			if(indexOfLM==L){
				pageStateReset();
				lastPageFault = pageFault;
			}
			
			if(indexOfLM>=M)
				if(pageFault-lastPageFault>=Q){
					PageKickOut();
					indexOfLM=0;
				}
			
			calCurrentFrameNum();
			calMinFrameFrequency();
			calMaxFrameValue();
			
			}
			
			
		}
		
	
	
	void PageKickOut(){
		for(int i = 0; i < PageState.length; i++){
		
			if(PageState[i].inWorkingSet == 1 && PageState[i].state == 0){
				PageState[i].inWorkingSet = 0;
			}
		}
	}
	
	void pageStateReset(){
		for(int i = 0; i < PageState.length; i++){
			PageState[i].state = 0;
		}
	}
	
	void calCurrentFrameNum(){
		for(int i = 0; i < PageState.length; i++){
			if(PageState[i].inWorkingSet == 1)
				CurrentFrameValue++;
		}
	}
	
	void calMinFrameFrequency(){
		if(CurrentFrameValue>=1 && CurrentFrameValue<10)
			MinFramesFrequency++;
	}
	
	void calMaxFrameValue(){
		if(CurrentFrameValue>= MaxFrameValue)
			MaxFrameValue = CurrentFrameValue;
	}
	
	double returnMinFramesRate(){
		return (double)MinFramesFrequency/FramesFrequency;
	}
	
	int returnMaxFrameValue(){
		return MaxFrameValue;
	}
	
	int returnPageFault(){
		return pageFault;
	}
	
	double returnFaultRate(){
		return (double) pageFault/currentTravesalRecord;
	}
	
}