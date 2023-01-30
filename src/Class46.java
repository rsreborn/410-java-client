/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.zip.GZIPInputStream;

public class Class46 implements Runnable
{
    public static int anInt844 = -1;
    public static long[] aLongArray845;
    public static int[] anIntArray846;
    public static int anInt847;
    public static int anInt848 = 0;
    public boolean aBoolean849 = true;
    public static int anInt850;
    public static int anInt851;
    public static int anInt852;
    public static int anInt853;
    public static Class31 aClass31_854;
    public static int anInt855 = 0;
    public static int anInt856;
    public static int anInt857;
    public Object anObject858 = new Object();
    public static int anInt859;
    public int anInt860;
    public int[] anIntArray861 = new int[500];
    public static Class31 aClass31_862;
    public int[] anIntArray863 = new int[500];
    
    public static void method781(int arg0) {
	try {
	    if (arg0 == -3) {
		aClass31_854 = null;
		aClass31_862 = null;
		anIntArray846 = null;
		aLongArray845 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "rd.D(" + arg0 + ')');
	}
    }
    
    public static byte[] method782(byte arg0, byte[] arg1) {
	try {
	    anInt852++;
	    Buffer buffer = new Buffer(arg1);
	    int i = buffer.readUByte();
	    int i_0_ = buffer.readUIntBE();
	    if (arg0 < 84)
		anInt850 = 51;
	    if ((i_0_ ^ 0xffffffff) > -1
		|| Class11.anInt220 != 0 && Class11.anInt220 < i_0_)
		throw new RuntimeException();
	    if (i == 0) {
		byte[] is = new byte[i_0_];
		buffer.method169(0, i_0_, is, -48);
		return is;
	    }
	    int i_1_ = buffer.readUIntBE();
	    if ((i_1_ ^ 0xffffffff) > -1
		|| Class11.anInt220 != 0 && i_1_ > Class11.anInt220)
		throw new RuntimeException();
	    byte[] is = new byte[i_1_];
	    if (i != 1) {
		try {
		    DataInputStream datainputstream
			= (new DataInputStream
			   (new GZIPInputStream
			    (new ByteArrayInputStream(arg1, 9, i_0_))));
		    datainputstream.readFully(is);
		    datainputstream.close();
		} catch (java.io.IOException ioexception) {
		    /* empty */
		}
	    } else
		Class38.method715(is, i_1_, arg1, i_0_, 9);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("rd.B(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static Class11_Sub10_Sub8 method783(int arg0, int arg1) {
	try {
	    Class11_Sub10_Sub8 class11_sub10_sub8
		= ((Class11_Sub10_Sub8)
		   Class6.aClass40_159.method735((long) arg1, (byte) -113));
	    anInt859++;
	    if (arg0 != 3)
		anInt853 = 6;
	    if (class11_sub10_sub8 != null)
		return class11_sub10_sub8;
	    byte[] is = Class15.aClass55_318.method887((byte) -125, arg1, 1);
	    class11_sub10_sub8 = new Class11_Sub10_Sub8();
	    if (is != null)
		class11_sub10_sub8.method363(new Buffer(is), 122, arg1);
	    class11_sub10_sub8.method364((byte) 110);
	    Class6.aClass40_159.method742(-120, (long) arg1,
					  class11_sub10_sub8);
	    return class11_sub10_sub8;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "rd.E(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static Class11_Sub10_Sub13_Sub4 method784(byte arg0) {
	try {
	    anInt851++;
	    Class11_Sub10_Sub13_Sub4 class11_sub10_sub13_sub4
		= new Class11_Sub10_Sub13_Sub4();
	    class11_sub10_sub13_sub4.anInt2779 = Class11_Sub10_Sub3.anInt2023;
	    class11_sub10_sub13_sub4.anInt2777 = Class59.anInt1233;
	    class11_sub10_sub13_sub4.anInt2778 = Class44.anIntArray814[0];
	    class11_sub10_sub13_sub4.anInt2774
		= Class11_Sub4.anIntArray1505[0];
	    class11_sub10_sub13_sub4.anInt2780 = Class28.anIntArray523[0];
	    class11_sub10_sub13_sub4.anInt2775 = Class6.anIntArray153[0];
	    if (arg0 != -57)
		method785(35, 30, -62, -89);
	    int i = (class11_sub10_sub13_sub4.anInt2775
		     * class11_sub10_sub13_sub4.anInt2780);
	    byte[] is = Class51.aByteArrayArray1013[0];
	    class11_sub10_sub13_sub4.anIntArray2776 = new int[i];
	    for (int i_2_ = 0; i > i_2_; i_2_++)
		class11_sub10_sub13_sub4.anIntArray2776[i_2_]
		    = Class39_Sub1.anIntArray1833[Class20.method572(is[i_2_],
								    255)];
	    Class52.method855(20);
	    return class11_sub10_sub13_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "rd.C(" + arg0 + ')');
	}
    }
    
    public void run() {
	try {
	    while (aBoolean849) {
		synchronized (anObject858) {
		    if (anInt860 < 500) {
			anIntArray861[anInt860] = Class11_Sub6.anInt1590;
			anIntArray863[anInt860] = Class11_Sub10_Sub7.anInt2161;
			anInt860++;
		    }
		}
		Class53.method864(true, 50L);
	    }
	    anInt847++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "rd.run(" + ')');
	}
    }
    
    public static int method785(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt857++;
	    arg3 &= 0x3;
	    if ((arg3 ^ 0xffffffff) == -1)
		return arg0;
	    if (arg1 < 64)
		anInt853 = -21;
	    if (arg3 == 1)
		return arg2;
	    if ((arg3 ^ 0xffffffff) == -3)
		return -arg0 + 7;
	    return 7 + -arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("rd.A(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ')'));
	}
    }
    
    public Class46() {
	anInt860 = 0;
    }
    
    static {
	aLongArray845 = new long[100];
	anInt850 = 0;
	anInt853 = -1;
	aClass31_862
	    = Class64.method992("Please use a different world)3", 255);
	aClass31_854
	    = (Class64.method992
	       ("No matching objects found)1 please shorten search", 255));
	anInt856 = -1;
    }
}
