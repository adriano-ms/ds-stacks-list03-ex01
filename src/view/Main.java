package view;

import br.edu.fateczl.stack.IntStack;

public class Main {

	public static void main(String[] args) {
		
		int[] array = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		
		IntStack stack = new IntStack();
		
		try {
			for(int n : array) 
				if(n >= 0)
					stack.push(n);
				else {
					int aux = n;
					int sum = stack.pop() + stack.pop();
					stack.push(aux);
					stack.push(sum);
				}
			
			System.out.println(stack.size());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
