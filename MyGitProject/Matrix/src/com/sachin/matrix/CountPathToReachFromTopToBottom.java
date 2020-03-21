package com.sachin.matrix;

public class CountPathToReachFromTopToBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pathCount(3,3));
	}

	private static int pathCount(int m, int n) {
		// TODO Auto-generated method stub
		if(m==1 || n == 1)
			return 1;
		
		return pathCount(m-1, n) + pathCount(m, n-1);
	}

}
