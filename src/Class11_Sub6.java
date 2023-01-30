/* Class11_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public class Class11_Sub6 extends Class11
{
    public static int anInt1576;
    public static int anInt1577;
    public static Class64[] aClass64Array1578;
    public static int anInt1579 = 0;
    public int[] anIntArray1580;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_1581;
    public int anInt1582;
    public static Class31 aClass31_1583;
    public static int anInt1584;
    public static Class31 aClass31_1585;
    public static Class31 aClass31_1586;
    public static int[][][] anIntArrayArrayArray1587;
    public static int anInt1588;
    public static int anInt1589;
    public static int anInt1590 = 0;
    public int anInt1591;
    public int[][] anIntArrayArray1592;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_1593;
    public static Class34 aClass34_1594;
    public static int anInt1595;
    
    public static void method205(Class55 arg0, int arg1, Class55 arg2) {
	try {
	    anInt1577++;
	    Class31.aClass55_1395 = arg0;
	    if (arg1 == 3) {
		Applet_Sub1.aClass55_25 = arg2;
		Class58.anInt1226
		    = Applet_Sub1.aClass55_25.method895(3, (byte) 120);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ga.B("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ','
				     + (arg2 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static int method206(int arg0, int arg1, int arg2) {
	try {
	    anInt1584++;
	    long l = (long) ((arg0 << arg2) + arg1);
	    if (Class50.aClass11_Sub10_Sub16_1001 == null
		|| Class50.aClass11_Sub10_Sub16_1001.aLong231 != l)
		return 0;
	    return ((Class9.aBuffer_193.position * 99
		     / (Class9.aBuffer_193.payload.length
			+ -Class50.aClass11_Sub10_Sub16_1001.aByte2429))
		    + 1);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ga.A(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public Class11_Sub6(int arg0, byte[] arg1) {
	try {
	    anInt1582 = arg0;
	    Buffer buffer = new Buffer(arg1);
	    anInt1591 = buffer.readUByte();
	    anIntArray1580 = new int[anInt1591];
	    anIntArrayArray1592 = new int[anInt1591][];
	    for (int i = 0; anInt1591 > i; i++)
		anIntArray1580[i] = buffer.readUByte();
	    for (int i = 0; (anInt1591 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
		anIntArrayArray1592[i] = new int[buffer.readUByte()];
	    for (int i = 0; (i ^ 0xffffffff) > (anInt1591 ^ 0xffffffff); i++) {
		for (int i_0_ = 0;
		     ((anIntArrayArray1592[i].length ^ 0xffffffff)
		      < (i_0_ ^ 0xffffffff));
		     i_0_++)
		    anIntArrayArray1592[i][i_0_] = buffer.readUByte();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ga.<init>(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method207(byte arg0) {
	aClass64Array1578 = null;
	aClass11_Sub10_Sub13_Sub3_1581 = null;
	aClass34_1594 = null;
	aClass31_1585 = null;
	anIntArrayArrayArray1587 = null;
	aClass31_1586 = null;
	aClass11_Sub10_Sub13_Sub3_1593 = null;
	aClass31_1583 = null;
	if (arg0 != 35)
	    aClass31_1585 = null;
    }
    
    public static void method208(int arg0, Graphics arg1) {
	try {
	    anInt1589++;
	    if (arg0 != 4)
		anIntArrayArrayArray1587 = null;
	    Class11_Sub10_Sub9.aClass37_2211.method704(0, arg1, 550, 4);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ga.D(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method209(int arg0, int arg1) {
	anInt1588++;
	Applet_Sub1.method28(false, (byte) -92, null, 0, arg0);
	if (arg1 != -16877)
	    aClass31_1585 = null;
    }
    
    static {
	aClass31_1586 = Class64.method992("red:", 255);
	aClass31_1583
	    = (Class64.method992
	       ("To change your recovery questions:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WSet new recovery questions(W)3",
		255));
	aClass31_1585 = Class64.method992("@whi@", 255);
    }
}
