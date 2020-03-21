package com.sachin.matrix;

public class IslandAndWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IslandAndWater ls = new IslandAndWater();
		int[][] a = {{1,1,0,0,0},
					{0,1,0,0,1},
					{1,0,0,0,1},
					{0,0,0,0,0},
					{0,1,0,1,0}};
		int m=5,n=5;
		boolean[][] visited = new boolean[m][n];
		for(int i =0 ;i<m;i++)
			for(int j=0;j<n;j++)
				visited[i][j]=false;
		
		int count=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j]==1 && !visited[i][j]) {
					ls.DST(a,i,j,m,n,visited);
					count++;
				}
			}
		}
		System.out.println("Count:" +count);
	}

	private void DST(int[][] a, int i, int j,int m,int n, boolean[][] visited) {
		// TODO Auto-generated method stub
		int[] R= {-1,-1,-1,0,0,1,1,1};
		int[] L= {-1,0,1,-1,1,-1,0,1};
		visited[i][j]=true;
		for(int k=0;k<8;k++) {
			if(isSafe(a,m,n,i+R[k],j+L[k],visited)) {
				DST(a,i+R[k],j+L[k],m,n,visited);
			}
		}
		
	}

	private boolean isSafe(int[][] a, int m, int n, int i, int j,boolean[][] visited) {
		// TODO Auto-generated method stub
		return ((i>=0 && i<m) && (j>=0 &&j<n) && (a[i][j]==1) && !visited[i][j]);
	}

}
