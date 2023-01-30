/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class5
{
    public File aFile148;
    public long aLong149;
    public RandomAccessFile aRandomAccessFile150;
    public long aLong151;
    
    public void method66(int arg0) throws IOException {
	aRandomAccessFile150.close();
	aRandomAccessFile150 = null;
	if (arg0 != -1)
	    aLong149 = 58L;
    }
    
    public void method67(byte arg0, int arg1, int arg2, byte[] arg3)
	throws IOException {
	try {
	    if ((aLong151 + (long) arg2 ^ 0xffffffffffffffffL)
		< (aLong149 ^ 0xffffffffffffffffL)) {
		aRandomAccessFile150.seek(aLong149 + 1L);
		aRandomAccessFile150.write(1);
		throw new EOFException();
	    }
	    aRandomAccessFile150.write(arg3, arg1, arg2);
	    aLong151 += (long) arg2;
	    int i = 34 / ((arg0 - -54) / 42);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public int method68(byte[] arg0, int arg1, int arg2, int arg3)
	throws IOException {
	try {
	    int i = aRandomAccessFile150.read(arg0, arg2, arg1);
	    if (arg3 <= 25)
		method70(-11);
	    if (i > 0)
		aLong151 += (long) i;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public long method69(int arg0) throws IOException {
	try {
	    if (arg0 != 1)
		method70(114);
	    return aRandomAccessFile150.length();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public File method70(int arg0) {
	try {
	    if (arg0 <= 90)
		aRandomAccessFile150 = null;
	    return aFile148;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void method71(int arg0, long arg1) throws IOException {
	try {
	    if (arg0 != 0)
		method70(-106);
	    aRandomAccessFile150.seek(arg1);
	    aLong151 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Class5(File arg0, String arg1, long arg2) throws IOException {
	try {
	    if (arg2 == -1L)
		arg2 = 9223372036854775807L;
	    if ((arg0.length() ^ 0xffffffffffffffffL)
		<= (arg2 ^ 0xffffffffffffffffL))
		arg0.delete();
	    aRandomAccessFile150 = new RandomAccessFile(arg0, arg1);
	    aLong149 = arg2;
	    aFile148 = arg0;
	    aLong151 = 0L;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
}
