package com.paulorpc.ufscar.estruturadados.cap05.Criatividade.Ex10;


/**
 * @author paulo
 * @date 22 de mai de 2017
 *
 */
public class Ex10 {

	/*
	 * 
	 * Alice has three array-based stacks, A, B, and C, such that A has capacity 100,
	 * B has capacity 5, and C has capacity 3. Initially, A is full, and B and C are
	 * empty. Unfortunately, the person who programmed the class for these stacks
	 * made the push and pop methods private. The only method Alice can use is a static
	 * method, dump(S,T), which transfers (by iteratively applying the private pop and
	 * push methods) elements from stack S to stack T until either S becomes empty
	 * or T becomes full. So, for example, starting from our initial configuration and
	 * performing dump(A,C) results in A now holding 97 elements and C holding 3.
	 * Describe a sequence of dump operations that starts from the initial configuration
	 * and results in B holding 4 elements at the end
	 * 
	 */
	
	/*
	 * 
	 * 1. T(A,C); A[97]; B[0]; C[3]
	 * 2. T(C,B); A[97]; B[3]; C[0]
	 * 3. T(A,C); A[94]; B[3]; C[3]
	 * 4. T(C,B); A[94]; B[5]; C[1]
	 * 5. T(B,A); A[99]; B[0]; C[1]
	 * 6. T(C,B); A[99]; B[1]; C[0]
	 * 7. T(A,C); A[96]; B[1]; C[3]
	 * 8. T(C,B); A[96]; B[4]; C[0]
	 * 
	 */
	
}
