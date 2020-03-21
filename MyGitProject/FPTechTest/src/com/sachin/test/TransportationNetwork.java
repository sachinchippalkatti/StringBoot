package com.sachin.test;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.TreeSet;

public class TransportationNetwork {
		
		static Reader in = new Reader();
		static OutputWriter out = new OutputWriter(System.out);
		
		public static void main(String[] args) throws IOException {
			int n = in.nextInt(), q = in.nextInt();
			TreeSet<Integer> roadway = new TreeSet<Integer>();
	        TreeSet<Integer> railway = new TreeSet<Integer>();
			while(q-- > 0) {
				int k = in.nextInt(), u = in.nextInt(), v = in.nextInt();
				if(k == 1) {
					railway.add(u);
					railway.add(v);
				}
				else {
					roadway.add(u);
					roadway.add(v);
				}
				if(railway.size() == roadway.size()) {
					int flag = 0;
					Iterator<Integer> itr = railway.iterator();
					while(itr.hasNext()) {
						int city = itr.next();
						if(roadway.contains(city) == false) {
							out.printLine("NO");
							flag = 1;
							break;
						}
					}
					if(flag == 0)
						out.printLine("YES");
				}
				else
					out.printLine("NO");
				out.flush();
			}
			out.close();
			in.close();
		}
	}
	 
	class Reader {
	    final private int BUFFER_SIZE = 1 << 16;
	    private DataInputStream din;
	    private byte[] buffer;
	    private int bufferPointer, bytesRead;
	 
	    public Reader() {
	        din = new DataInputStream(System.in);
	        buffer = new byte[BUFFER_SIZE];
	        bufferPointer = bytesRead = 0;
	    }
	 
	    public Reader(String file_name) throws IOException {
	        din = new DataInputStream(new FileInputStream(file_name));
	        buffer = new byte[BUFFER_SIZE];
	        bufferPointer = bytesRead = 0;
	    }
	 
	    public String readLine() throws IOException {
	        byte[] buf = new byte[64]; // line length
	        int cnt = 0, c;
	        while ((c = read()) != -1) {
	            if (c == '\n')
	                break;
	            buf[cnt++] = (byte) c;
	        }
	        return new String(buf, 0, cnt);
	    }
	 
	    public int nextInt() throws IOException {
	        int ret = 0;
	        byte c = read();
	        while (c <= ' ')
	            c = read();
	        boolean neg = (c == '-');
	        if (neg)
	            c = read();
	        do {
	            ret = ret * 10 + c - '0';
	        }  while ((c = read()) >= '0' && c <= '9');
	 
	        if (neg)
	            return -ret;
	        return ret;
	    }
	 
	    public long nextLong() throws IOException {
	        long ret = 0;
	        byte c = read();
	        while (c <= ' ')
	            c = read();
	        boolean neg = (c == '-');
	        if (neg)
	            c = read();
	        do {
	            ret = ret * 10 + c - '0';
	        }
	        while ((c = read()) >= '0' && c <= '9');
	        if (neg)
	            return -ret;
	        return ret;
	    }
	 
	    public double nextDouble() throws IOException {
	        double ret = 0, div = 1;
	        byte c = read();
	        while (c <= ' ')
	            c = read();
	        boolean neg = (c == '-');
	        if (neg)
	            c = read();
	 
	        do {
	            ret = ret * 10 + c - '0';
	        }
	        while ((c = read()) >= '0' && c <= '9');
	 
	        if (c == '.') {
	            while ((c = read()) >= '0' && c <= '9') {
	                ret += (c - '0') / (div *= 10);
	            }
	        }
	 
	        if (neg)
	            return -ret;
	        return ret;
	    }
	 
	    private void fillBuffer() throws IOException {
	        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
	        if (bytesRead == -1)
	            buffer[0] = -1;
	    }
	 
	    private byte read() throws IOException {
	        if (bufferPointer == bytesRead)
	            fillBuffer();
	        return buffer[bufferPointer++];
	    }
	 
	    public void close() throws IOException {
	        if (din == null)
	            return;
	        din.close();
	    }
	}
	 
	class OutputWriter {
		
		private final PrintWriter writer;
	 
		public OutputWriter(OutputStream outputStream) {
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
		}
	 
		public OutputWriter(Writer writer) {
			this.writer = new PrintWriter(writer);
		}
	 
		public void print(Object...objects) {
			for (int i = 0; i < objects.length; i++) {
				if (i != 0)
					writer.print(' ');
				writer.print(objects[i]);
			}
		}
	 
		public void printLine(Object...objects) {
			print(objects);
			writer.println();
		}
	 
		public void close() {
			writer.close();
		}
	 
		public void flush() {
			writer.flush();
		}

}
