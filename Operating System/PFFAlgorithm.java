/*
 * Ji Pan
 * N11489385
 * CS6233-Operating System
 */

import java.util.Scanner;


public class PFFAlgorithm {
	private int P;
	private int F;
	private Node[] PageState = null;
	private Scanner file = null;
	private int currentTravesalRecord = 0;
	private int lastTravesalRecord = 0;
	private int pageFault = 0;
	private int CurrentFrameValue = 0;
	private int FramesFrequency = 10000;
	private int MinFramesFrequency = 0;
	private int MaxFrameValue = 0;
	
	PFFAlgorithm(int P, int f,Scanner file){
		
		this.P = P;
		this.F = f;
		this.file = file;
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
					
					
					if((currentTravesalRecord - lastTravesalRecord) > F){
						PageKickOut();
					}
					lastTravesalRecord = currentTravesalRecord; 
					pageStateReset();
				}
			currentTravesalRecord++;
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