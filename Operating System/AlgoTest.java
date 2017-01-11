/*
 * Ji Pan
 * N11489385
 * CS6233-Operating System
 */

import java.io.FileNotFoundException;
import java.util.Scanner;


public class AlgoTest {

	
	public static void main(String args[]) throws FileNotFoundException{	
		PageRefGeneration.generate();
		int P = 10000;
		
		// 5 Tests for the PFF Algorithm
		
		int F1 = 20;		
		PFFAlgorithm test1 = new PFFAlgorithm( P, F1, new Scanner(PageRefGeneration.returnFile()));
		test1.PageFaultCalculation();
		System.out.println("PFF--> If F ="+F1+" The frequency of minimum number (1~10) of frames allocated: "+test1.returnMinFramesRate()*100+"%");
		System.out.println("PFF--> The MAX number of Frames is: "+test1.returnMaxFrameValue());
		System.out.println("PFF--> The page fault is: "+test1.returnPageFault());
		System.out.println("PFF--> The page fault rate is: "+test1.returnFaultRate()*100+"%");
		System.out.println();
	
		int F2 = 50;		
		PFFAlgorithm test2 = new PFFAlgorithm( P, F2, new Scanner(PageRefGeneration.returnFile()));
		test2.PageFaultCalculation();
		System.out.println("PFF--> If F ="+F2+" The frequency of minimum number (1~10) of frames allocated: "+test2.returnMinFramesRate()*100+"%");
		System.out.println("PFF--> The MAX number of Frames is: "+test2.returnMaxFrameValue());
		System.out.println("PFF--> The page fault is: "+test2.returnPageFault());
		System.out.println("PFF--> The page fault rate is: "+test2.returnFaultRate()*100+"%");
		System.out.println();
		
		int F3 = 100;		
		PFFAlgorithm test3 = new PFFAlgorithm( P, F3, new Scanner(PageRefGeneration.returnFile()));
		test3.PageFaultCalculation();
		System.out.println("PFF--> If F ="+F3+" The frequency of minimum number (1~10) of frames allocated: "+test3.returnMinFramesRate()*100+"%");
		System.out.println("PFF--> The MAX number of Frames is: "+test3.returnMaxFrameValue());
		System.out.println("PFF--> The page fault is: "+test3.returnPageFault());
		System.out.println("PFF--> The page fault rate is: "+test3.returnFaultRate()*100+"%");
		System.out.println();
		
		int F4 = 150;		
		PFFAlgorithm test4 = new PFFAlgorithm( P, F4, new Scanner(PageRefGeneration.returnFile()));
		test4.PageFaultCalculation();
		System.out.println("PFF--> If F ="+F4+" The frequency of minimum number (1~10) of frames allocated: "+test4.returnMinFramesRate()*100+"%");
		System.out.println("PFF--> The MAX number of Frames is: "+test4.returnMaxFrameValue());
		System.out.println("PFF--> The page fault is: "+test4.returnPageFault());
		System.out.println("PFF--> The page fault rate is: "+test4.returnFaultRate()*100+"%");
		System.out.println();
		
		int F5 = 200;		
		PFFAlgorithm test5 = new PFFAlgorithm( P, F5, new Scanner(PageRefGeneration.returnFile()));
		test5.PageFaultCalculation();
		System.out.println("PFF--> If F ="+F5+" The frequency of minimum number (1~10) of frames allocated: "+test5.returnMinFramesRate()*100+"%");
		System.out.println("PFF--> The MAX number of Frames is: "+test5.returnMaxFrameValue());
		System.out.println("PFF--> The page fault is: "+test5.returnPageFault());
		System.out.println("PFF--> The page fault rate is: "+test5.returnFaultRate()*100+"%");
		System.out.println();
	
		
			
		// 5 Tests for the VSWS Algorithm
		int L1 = 50;
		int M1 = 100;
		int Q1 = 20;
		VSWSAlgorithm testA = new VSWSAlgorithm( P, L1, M1, Q1, new Scanner(PageRefGeneration.returnFile()));
		testA.PageFaultCalculation();
		System.out.println("VSWS--> If L ="+ L1+ " If M ="+ M1+ " If Q="+ Q1+" The frequency of minimum number (1~10) of frames allocated: "+testA.returnMinFramesRate()*100+"%");
		System.out.println("VSWS--> The MAX number of Frames is: "+testA.returnMaxFrameValue());
		System.out.println("VSWS--> The page fault is: "+testA.returnPageFault());
		System.out.println("VSWS--> The page fault rate is: "+testA.returnFaultRate()*100+"%");
		System.out.println();
	
		int L2 = 70;
		int M2 = 100;
		int Q2 = 20;
		VSWSAlgorithm testB = new VSWSAlgorithm( P, L2, M2, Q2, new Scanner(PageRefGeneration.returnFile()));
		testB.PageFaultCalculation();
		System.out.println("VSWS--> If L ="+ L2+ " If M ="+ M2+ " If Q="+ Q2+" The frequency of minimum number (1~10) of frames allocated: "+testB.returnMinFramesRate()*100+"%");
		System.out.println("VSWS--> The MAX number of Frames is: "+testB.returnMaxFrameValue());
		System.out.println("VSWS--> The page fault is: "+testB.returnPageFault());
		System.out.println("VSWS--> The page fault rate is: "+testB.returnFaultRate()*100+"%");
		System.out.println();
		
		int L3 = 30;
		int M3 = 100;
		int Q3 = 20;
		VSWSAlgorithm testC = new VSWSAlgorithm( P, L3, M3, Q3, new Scanner(PageRefGeneration.returnFile()));
		testC.PageFaultCalculation();
		System.out.println("VSWS--> If L ="+ L3+ " If M ="+ M3+ " If Q="+ Q3+" The frequency of minimum number (1~10) of frames allocated: "+testC.returnMinFramesRate()*100+"%");
		System.out.println("VSWS--> The MAX number of Frames is: "+testC.returnMaxFrameValue());
		System.out.println("VSWS--> The page fault is: "+testC.returnPageFault());
		System.out.println("VSWS--> The page fault rate is: "+testC.returnFaultRate()*100+"%");
		System.out.println();
		
		int L4 = 50;
		int M4 = 150;
		int Q4 = 20;
		VSWSAlgorithm testD = new VSWSAlgorithm( P, L4, M4, Q4, new Scanner(PageRefGeneration.returnFile()));
		testD.PageFaultCalculation();
		System.out.println("VSWS--> If L ="+ L4+ " If M ="+ M4+ " If Q="+ Q4+" The frequency of minimum number (1~10) of frames allocated: "+testD.returnMinFramesRate()*100+"%");
		System.out.println("VSWS--> The MAX number of Frames is: "+testD.returnMaxFrameValue());
		System.out.println("VSWS--> The page fault is: "+testD.returnPageFault());
		System.out.println("VSWS--> The page fault rate is: "+testD.returnFaultRate()*100+"%");
		System.out.println();
		
		int L5 = 50;
		int M5 = 150;
		int Q5 = 40;
		VSWSAlgorithm testE = new VSWSAlgorithm( P, L5, M5, Q5, new Scanner(PageRefGeneration.returnFile()));
		testE.PageFaultCalculation();
		System.out.println("VSWS--> If L ="+ L5+ " If M ="+ M5+ " If Q="+ Q5+" The frequency of minimum number (1~10) of frames allocated: "+testE.returnMinFramesRate()*100+"%");
		System.out.println("VSWS--> The MAX number of Frames is: "+testE.returnMaxFrameValue());
		System.out.println("VSWS--> The page fault is: "+testE.returnPageFault());
		System.out.println("VSWS--> The page fault rate is: "+testE.returnFaultRate()*100+"%");
		System.out.println();
		
	//From the result we know that the bigger the F is, the smaller the total number of page faults. So we can reduce the fault pages by increasing F.	
	//From the result we know that the bigger L, M, and the gap between M and L(M-L),  the smaller the total number of page faults. Also the bigger the Q, the smaller the total number of page faults.
	//If (M-L) keep constant, the bigger L and M, the smaller the total number of page fault
		System.out.println("Comments: From the result we know that the bigger the F is, the smaller the total number of page faults. So  we can reduce the fault pages by increasing F.");
		System.out.println();
		System.out.println("Comments: From the result we know that the bigger gap between M and L(M-L), the smaller the total number of page faults. Also the bigger the Q, the smaller the total number of page faults.");
		System.out.println("Comments: If (M-L) keep constant, the bigger L and M, the smaller the total number of page fault");
		System.out.println();
	//The frequency of minimum number(1-10) of frames allocated is the ratio of the frequency of 0-10 frames dividing the times during the Algorithm traversal which is 10000.
	//The result of minimum and maxmum number of frames allocated of the two algorithms seems similar. I conjecture that it's because I used random numbers to form the sample of 10000 integers, however in real life many data have locality. 
	//We also can know that the VSWS can improve the performance because PFF has the shortcoming that it doesn't perform well during transient periods.
		System.out.println("Comments: The result of minimum and maxmum number of frames allocated of the two algorithms seems similar. I conjecture that it's because I used random numbers to form the sample of 10000 integers, however in real life many data have more locality. ");
		System.out.println();
		System.out.println("Comments: We also can know that the VSWS can improve the performance because PFF has the shortcoming that it doesn't perform well during transient periods. ");
		System.out.println();
		System.out.println("Finished!");
	
}
}