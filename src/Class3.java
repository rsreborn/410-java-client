/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public class Class3
{
    public static Class31 aClass31_99;
    public long aLong100;
    public long aLong101;
    public static int anInt102;
    public int anInt103 = 0;
    public static Class31 aClass31_104;
    public static int anInt105;
    public long aLong106;
    public static Class31 aClass31_107;
    public byte[] aByteArray108;
    public static Class31 aClass31_109 = Class64.method992("Unknown", 255);
    public static int anInt110;
    public static Class31 aClass31_111;
    public static Class31 aClass31_112;
    public int anInt113;
    public long aLong114;
    public static int anInt115;
    public static int anInt116;
    public static int anInt117;
    public static int anInt118;
    public long aLong119;
    public static int[] anIntArray120;
    public static Class31 aClass31_121;
    public static int anInt122;
    public static Class31 aClass31_123;
    public static int anInt124;
    public static int anInt125;
    public static Class31[] aClass31Array126;
    public byte[] aByteArray127;
    public long aLong128;
    public static int anInt129;
    public static int anInt130;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_131;
    public static Class31 aClass31_132;
    public Class5 aClass5_133;
    /*synthetic*/ public static Class aClass134;
    
    public static void method50(byte arg0) {
	try {
	    anIntArray120 = null;
	    aClass31_104 = null;
	    aClass31_99 = null;
	    aClass31_109 = null;
	    aClass31_111 = null;
	    aClass31_107 = null;
	    aClass31Array126 = null;
	    if (arg0 >= -62)
		method52((byte) 91);
	    aClass31_132 = null;
	    aClass31_123 = null;
	    aClass31_121 = null;
	    aClass11_Sub10_Sub13_Sub3_131 = null;
	    aClass31_112 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "d.F(" + arg0 + ')');
	}
    }
    
    public void method51(long arg0, int arg1) {
	do {
	    try {
		anInt118++;
		if (arg0 >= 0L) {
		    aLong100 = arg0;
		    if (arg1 == -22121)
			break;
		    aClass31_121 = null;
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class58.method939(runtimeexception,
					"d.D(" + arg0 + ',' + arg1 + ')');
	    }
	    break;
	} while (false);
    }
    
    public static void method52(byte arg0) {
	try {
	    anInt102++;
	    if (arg0 == 21 && Class40.aClass61_729 != null) {
		long l = System.currentTimeMillis();
		if ((Class57.aLong1184 ^ 0xffffffffffffffffL)
		    > (l ^ 0xffffffffffffffffL)) {
		    Class40.aClass61_729.method957(l);
		    int i = (int) (-Class57.aLong1184 + l);
		    Class57.aLong1184 = l;
		    synchronized (aClass134 != null ? aClass134
				  : (aClass134 = method59("Class61"))) {
			Class11_Sub10_Sub1.anInt1933
			    += i * Class11_Sub10_Sub9.anInt2203;
			int i_0_ = ((-(Class11_Sub10_Sub9.anInt2203 * 2000)
				     + Class11_Sub10_Sub1.anInt1933)
				    / 1000);
			if ((i_0_ ^ 0xffffffff) < -1) {
			    if (Class7.aClass11_Sub2_1421 != null)
				Class7.aClass11_Sub2_1421.method113(i_0_);
			    Class11_Sub10_Sub1.anInt1933 -= i_0_ * 1000;
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "d.A(" + arg0 + ')');
	}
    }
    
    public void method53(byte[] arg0, int arg1, int arg2, int arg3)
	throws IOException {
	anInt105++;
	try {
	    if (arg3 < 17)
		anIntArray120 = null;
	    if ((aLong119 ^ 0xffffffffffffffffL)
		> (aLong100 + (long) arg1 ^ 0xffffffffffffffffL))
		aLong119 = (long) arg1 + aLong100;
	    if (aLong101 != -1L
		&& ((aLong101 ^ 0xffffffffffffffffL) < (aLong100
							^ 0xffffffffffffffffL)
		    || aLong100 > aLong101 + (long) anInt103))
		method57(111);
	    if ((aLong101 ^ 0xffffffffffffffffL) != 0L
		&& (aLong100 - -(long) arg1
		    > (long) aByteArray127.length + aLong101)) {
		int i = (int) (aLong101 - aLong100
			       + (long) aByteArray127.length);
		arg1 -= i;
		Class21.method574(arg0, arg2, aByteArray127,
				  (int) (-aLong101 + aLong100), i);
		arg2 += i;
		aLong100 += (long) i;
		anInt103 = aByteArray127.length;
		method57(103);
	    }
	    if (arg1 > aByteArray127.length) {
		if ((aLong114 ^ 0xffffffffffffffffL)
		    != (aLong100 ^ 0xffffffffffffffffL)) {
		    aClass5_133.method71(0, aLong100);
		    aLong114 = aLong100;
		}
		long l = -1L;
		aClass5_133.method67((byte) 15, arg2, arg1, arg0);
		long l_1_ = -1L;
		if (aLong106 <= aLong100
		    && (((long) anInt113 + aLong106 ^ 0xffffffffffffffffL)
			< (aLong100 ^ 0xffffffffffffffffL)))
		    l_1_ = aLong100;
		else if (aLong106 >= aLong100
			 && aLong100 - -(long) arg1 > aLong106)
		    l_1_ = aLong106;
		aLong114 += (long) arg1;
		if ((aLong106 ^ 0xffffffffffffffffL) > (aLong100 - -(long) arg1
							^ 0xffffffffffffffffL)
		    && (long) anInt113 + aLong106 >= aLong100 + (long) arg1)
		    l = aLong100 - -(long) arg1;
		else if (((aLong100 ^ 0xffffffffffffffffL)
			  > (aLong106 - -(long) anInt113
			     ^ 0xffffffffffffffffL))
			 && ((aLong106 + (long) anInt113 ^ 0xffffffffffffffffL)
			     >= (aLong100 - -(long) arg1
				 ^ 0xffffffffffffffffL)))
		    l = (long) anInt113 + aLong106;
		if ((aLong114 ^ 0xffffffffffffffffL)
		    < (aLong128 ^ 0xffffffffffffffffL))
		    aLong128 = aLong114;
		if ((l_1_ ^ 0xffffffffffffffffL) < 0L
		    && ((l_1_ ^ 0xffffffffffffffffL)
			> (l ^ 0xffffffffffffffffL))) {
		    int i = (int) (-l_1_ + l);
		    Class21.method574(arg0,
				      (int) (l_1_ + (long) arg2 + -aLong100),
				      aByteArray108, (int) (-aLong106 + l_1_),
				      i);
		}
		aLong100 += (long) arg1;
	    } else if (arg1 > 0) {
		if (aLong101 == -1L)
		    aLong101 = aLong100;
		Class21.method574(arg0, arg2, aByteArray127,
				  (int) (-aLong101 + aLong100), arg1);
		aLong100 += (long) arg1;
		if ((-aLong101 + aLong100 ^ 0xffffffffffffffffL)
		    < ((long) anInt103 ^ 0xffffffffffffffffL))
		    anInt103 = (int) (-aLong101 + aLong100);
	    }
	} catch (IOException ioexception) {
	    aLong114 = -1L;
	    throw ioexception;
	}
    }
    
    public void method54(byte arg0) throws IOException {
	try {
	    anInt113 = 0;
	    if (arg0 != -36)
		aClass31_111 = null;
	    if (aLong100 != aLong114) {
		aClass5_133.method71(arg0 ^ ~0x23, aLong100);
		aLong114 = aLong100;
	    }
	    anInt122++;
	    aLong106 = aLong100;
	    int i;
	    for (/**/; anInt113 < aByteArray108.length; anInt113 += i) {
		i = aClass5_133.method68(aByteArray108,
					 -anInt113 + aByteArray108.length,
					 anInt113, 74);
		if ((i ^ 0xffffffff) == 0)
		    break;
		aLong114 += (long) i;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "d.E(" + arg0 + ')');
	}
    }
    
    public void method55(int arg0, int arg1, int arg2, byte[] arg3)
	throws IOException {
	anInt129++;
	try {
	    if (arg0 != 27487)
		return;
	    if ((arg3.length ^ 0xffffffff) > (arg2 + arg1 ^ 0xffffffff))
		throw new ArrayIndexOutOfBoundsException(-arg3.length + arg2
							 + arg1);
	    if ((aLong101 ^ 0xffffffffffffffffL) != 0L && aLong100 >= aLong101
		&& (((long) arg2 + aLong100 ^ 0xffffffffffffffffL)
		    >= ((long) anInt103 + aLong101 ^ 0xffffffffffffffffL))) {
		Class21.method574(aByteArray127, (int) (-aLong101 + aLong100),
				  arg3, arg1, arg2);
		aLong100 += (long) arg2;
		return;
	    }
	    int i = arg1;
	    long l = aLong100;
	    int i_2_ = arg2;
	    if ((aLong100 ^ 0xffffffffffffffffL) <= (aLong106
						     ^ 0xffffffffffffffffL)
		&& ((aLong100 ^ 0xffffffffffffffffL)
		    > ((long) anInt113 + aLong106 ^ 0xffffffffffffffffL))) {
		int i_3_ = (int) ((long) anInt113 - (-aLong106 + aLong100));
		if (arg2 < i_3_)
		    i_3_ = arg2;
		arg2 -= i_3_;
		Class21.method574(aByteArray108, (int) (-aLong106 + aLong100),
				  arg3, arg1, i_3_);
		aLong100 += (long) i_3_;
		arg1 += i_3_;
	    }
	    if ((aByteArray108.length ^ 0xffffffff) > (arg2 ^ 0xffffffff)) {
		aClass5_133.method71(arg0 ^ 0x6b5f, aLong100);
		aLong114 = aLong100;
		while ((arg2 ^ 0xffffffff) < -1) {
		    int i_4_ = aClass5_133.method68(arg3, arg2, arg1,
						    arg0 + -27423);
		    if (i_4_ == -1)
			break;
		    aLong100 += (long) i_4_;
		    arg2 -= i_4_;
		    aLong114 += (long) i_4_;
		    arg1 += i_4_;
		}
	    } else if (arg2 > 0) {
		method54((byte) -36);
		int i_5_ = arg2;
		if (i_5_ > anInt113)
		    i_5_ = anInt113;
		arg2 -= i_5_;
		Class21.method574(aByteArray108, 0, arg3, arg1, i_5_);
		aLong100 += (long) i_5_;
		arg1 += i_5_;
	    }
	    if (aLong101 != -1L) {
		if (aLong101 > aLong100 && arg2 > 0) {
		    int i_6_ = arg1 + (int) (aLong101 - aLong100);
		    if (i_6_ > arg1 + arg2)
			i_6_ = arg2 + arg1;
		    while ((arg1 ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
			arg3[arg1++] = (byte) 0;
			arg2--;
			aLong100++;
		    }
		}
		long l_7_ = -1L;
		long l_8_ = -1L;
		if ((aLong101 ^ 0xffffffffffffffffL) <= (l
							 ^ 0xffffffffffffffffL)
		    && (((long) i_2_ + l ^ 0xffffffffffffffffL)
			< (aLong101 ^ 0xffffffffffffffffL)))
		    l_7_ = aLong101;
		else if (l >= aLong101 && l < aLong101 - -(long) anInt103)
		    l_7_ = l;
		if ((l ^ 0xffffffffffffffffL) > (aLong101 + (long) anInt103
						 ^ 0xffffffffffffffffL)
		    && l + (long) i_2_ >= aLong101 - -(long) anInt103)
		    l_8_ = aLong101 + (long) anInt103;
		else if (aLong101 < (long) i_2_ + l
			 && (long) i_2_ + l <= (long) anInt103 + aLong101)
		    l_8_ = (long) i_2_ + l;
		if (l_7_ > -1L && ((l_7_ ^ 0xffffffffffffffffL)
				   > (l_8_ ^ 0xffffffffffffffffL))) {
		    int i_9_ = (int) (-l_7_ + l_8_);
		    Class21.method574(aByteArray127, (int) (l_7_ + -aLong101),
				      arg3, i - -(int) (l_7_ + -l), i_9_);
		    if (l_8_ > aLong100) {
			arg2 -= l_8_ - aLong100;
			aLong100 = l_8_;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    aLong114 = -1L;
	    throw ioexception;
	}
	if (arg2 > 0)
	    throw new EOFException();
    }
    
    public long method56(int arg0) {
	try {
	    anInt117++;
	    if (arg0 <= 48)
		aClass31_99 = null;
	    return aLong119;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "d.G(" + arg0 + ')');
	}
    }
    
    public void method57(int arg0) throws IOException {
	try {
	    if ((aLong101 ^ 0xffffffffffffffffL) != 0L) {
		if ((aLong114 ^ 0xffffffffffffffffL)
		    != (aLong101 ^ 0xffffffffffffffffL)) {
		    aClass5_133.method71(0, aLong101);
		    aLong114 = aLong101;
		}
		aClass5_133.method67((byte) 23, 0, anInt103, aByteArray127);
		aLong114 += (long) anInt103;
		long l = -1L;
		long l_10_ = -1L;
		if (aLong114 > aLong128)
		    aLong128 = aLong114;
		if (((aLong106 ^ 0xffffffffffffffffL)
		     > ((long) anInt103 + aLong101 ^ 0xffffffffffffffffL))
		    && ((long) anInt103 + aLong101
			<= (long) anInt113 + aLong106))
		    l = aLong101 + (long) anInt103;
		else if (aLong101 < aLong106 + (long) anInt113
			 && (aLong101 - -(long) anInt103
			     >= (long) anInt113 + aLong106))
		    l = aLong106 + (long) anInt113;
		if ((aLong106 ^ 0xffffffffffffffffL) < (aLong101
							^ 0xffffffffffffffffL)
		    || (long) anInt113 + aLong106 <= aLong101) {
		    if (((aLong106 ^ 0xffffffffffffffffL)
			 <= (aLong101 ^ 0xffffffffffffffffL))
			&& ((aLong106 ^ 0xffffffffffffffffL)
			    > ((long) anInt103 + aLong101
			       ^ 0xffffffffffffffffL)))
			l_10_ = aLong106;
		} else
		    l_10_ = aLong101;
		if ((l_10_ ^ 0xffffffffffffffffL) < 0L && l > l_10_) {
		    int i = (int) (l - l_10_);
		    Class21.method574(aByteArray127, (int) (l_10_ - aLong101),
				      aByteArray108, (int) (-aLong106 + l_10_),
				      i);
		}
		anInt103 = 0;
		aLong101 = -1L;
	    }
	    if (arg0 < 81)
		method51(-121L, 81);
	    anInt110++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "d.H(" + arg0 + ')');
	}
    }
    
    public void method58(int arg0) throws IOException {
	method57(97);
	aClass5_133.method66(-1);
	anInt115++;
	if (arg0 < 36)
	    method51(-85L, 31);
    }
    
    public Class3(Class5 arg0, int arg1, int arg2) throws IOException {
	aLong101 = -1L;
	aLong106 = -1L;
	try {
	    aClass5_133 = arg0;
	    aLong119 = aLong128 = arg0.method69(1);
	    aLong100 = 0L;
	    aByteArray127 = new byte[arg2];
	    aByteArray108 = new byte[arg1];
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("d.<init>("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ')'));
	}
    }
    
    /*synthetic*/ public static Class method59(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aClass31_104
	    = Class64.method992("Enter name of player to add to list", 255);
	aClass31_111 = Class64.method992("(Z", 255);
	aClass31_123
	    = Class64.method992("@yel@ days of*6nmember credit remaining)3",
				255);
	aClass31Array126 = new Class31[100];
	aClass31_112
	    = Class64.method992("Invalid username or password)3", 255);
	aClass31_121 = Class64.method992("Password: ", 255);
	aClass31_107 = Class64.method992("Loaded gamescreen", 255);
	aClass31_99 = null;
	anIntArray120
	    = (new int[]
	       { 0, 0, 0, -1, 0, 0, 0, 8, 0, 0, 0, 5, 0, 0, 0, 8, 0, 0, 0, 0,
		 0, 14, 0, 0, 8, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 6, 0, 2, 0,
		 0, 0, 0, 0, 0, -2, 7, 0, 0, 0, 0, 0, 0, -2, -2, 0, 5, 0, 10,
		 0, 0, 0, 5, 7, 0, 0, 1, 0, 0, 15, 2, -1, 0, 0, 1, 0, 0, 0, 0,
		 0, 6, 0, 0, 0, 4, -1, 0, 0, 0, 0, 6, 0, 0, 0, 2, 0, 0, 4, 0,
		 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, 4,
		 0, 2, 0, -2, 0, 0, 0, -2, 0, -2, 4, 0, 0, 6, 6, 0, 6, 4, 0, 0,
		 0, 0, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 23, 0, 10, 0, -2,
		 0, 0, 0, 0, 6, 4, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0,
		 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0,
		 0, 0, 0, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 6, 1, 0, 0, 0,
		 0, 3, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0,
		 6, 0, 0, 4, 0, 0, 0, 0, 2, 5, 0, 3, 0, 0, 4 });
	aClass31_132 = Class64.method992("Connecting to server)3)3)3", 255);
	anInt130 = -1;
    }
}
