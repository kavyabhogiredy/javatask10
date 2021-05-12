import java.io.*;
class FRead
{
public static void main(String a[])throws IOException,FileN
{
Inputstream is=new FileInputstream("FRead.java");
int size=is.available();
for(int i=0;i<size;i++)
System.out.print((char)is.read());
is.close();
}
}