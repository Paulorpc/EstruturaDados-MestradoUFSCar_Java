package com.paulorpc.ufscar.estruturadados.cap05.Criatividade.Ex8;


// TODO IMPLEMENTAR

/**
 * @author paulo
 * @date 22 de mai de 2017
 *
 */
public class Ex8 {
	
	/*
	 * Postfix notation is an unambiguous way of writing an arithmetic expression without parentheses. 
	 * It is defined so that if “(exp1)op(exp2)” is a normal fully parenthesized expression whose operation is op, 
	 * the postfix version of this is “pexp1 pexp2 op”, where pexp1 is the postfix version of exp1 and pexp2 
	 * is the postfix version of exp2. The postfix version of a single number or variable is just that number or 
	 * variable. So, for example, the postfix version of “((5+ 2) ∗(8 − 3))/4” is “5 2 + 8 3 − ∗ 4 /”. 
	 * Describe a nonrecursive way of evaluating an expression in postfix notation. 
	 * 
	 */
	
	/*
	 * Utilizaria uma pilha para empilhar os numeros sequido das operações e um array de operadores. Quando a pilha
	 * receber um operador, ela executa a operação desempilahndo os ultimos dois elementos e empilhando o resultado. 
	 * 
	 */

}
