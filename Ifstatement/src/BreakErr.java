// This program contains an error.
class BreakErr {
	public static void main(String args[]) {
		one: for(int i=0; i<3; i++) {
		System.out.print("Pass " + i + ": ");
		}
		for(int j=0; j<100; j++) {
		if(j == 10) break one; // WRONG
		System.out.print(j + " ");
		}
		}
		}
/*
Since the loop labeled one does not enclose the break statement, it is not possible to transfer
control out of that block.*/