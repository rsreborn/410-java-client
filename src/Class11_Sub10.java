/* Class11_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10 extends Class11
{
    public static boolean aBoolean1652 = false;
    public static volatile boolean aBoolean1653;
    public static int anInt1654;
    public static int anInt1655;
    public static Class31[] aClass31Array1656;
    public static int[] anIntArray1657;
    public static boolean[] aBooleanArray1658 = new boolean[5];
    public Class11_Sub10 aClass11_Sub10_1659;
    public static int[] anIntArray1660;
    public static int[] anIntArray1661;
    public static int[] anIntArray1662;
    public static volatile long aLong1663;
    public static int anInt1664;
    public static int anInt1665;
    public static int anInt1666;
    public static int[] anIntArray1667;
    public static int[] anIntArray1668;
    public static Class31 aClass31_1669;
    public static int[] anIntArray1670;
    public static int anInt1671;
    public static int[] anIntArray1672;
    public static Class31 aClass31_1673;
    public static int[] anIntArray1674;
    public Class11_Sub10 aClass11_Sub10_1675;
    
    public static void method224(boolean arg0, byte[] arg1, byte arg2,
				 int arg3, int arg4) {
	try {
	    anInt1664++;
	    if (arg2 != 102)
		aLong1663 = 14L;
	    if (Class11_Sub5_Sub1.aClass15_1925 != null) {
		if (Class25.anInt470 >= 0) {
		    arg3 -= 20;
		    if (arg3 < 1)
			arg3 = 1;
		    Class4.anInt143 = arg3;
		    if ((Class25.anInt470 ^ 0xffffffff) != -1) {
			int i = Class15.method533(Class25.anInt470, (byte) 85);
			i -= Class11_Sub10_Sub8.anInt2191;
			Class20.anInt395 = (-1 + (Class20.anInt395 + i
						  - -3600)) / Class20.anInt395;
		    } else
			Class20.anInt395 = 0;
		    Class11_Sub10_Sub11.aByteArray2268 = arg1;
		    Buffer.aBoolean1575 = arg0;
		    Class8.anInt178 = arg4;
		} else if ((Class4.anInt143 ^ 0xffffffff) != -1) {
		    Class11_Sub10_Sub11.aByteArray2268 = arg1;
		    Buffer.aBoolean1575 = arg0;
		    Class8.anInt178 = arg4;
		} else
		    Class32.method663(arg0, 0, arg4, arg1);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ja.S(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ',' + arg4 + ')'));
	}
    }
    
    public static void method225(int arg0) {
	try {
	    anIntArray1672 = null;
	    if (arg0 != -5563)
		method226(-51);
	    aClass31_1669 = null;
	    aClass31Array1656 = null;
	    anIntArray1661 = null;
	    anIntArray1657 = null;
	    anIntArray1674 = null;
	    aClass31_1673 = null;
	    anIntArray1667 = null;
	    anIntArray1660 = null;
	    anIntArray1668 = null;
	    aBooleanArray1658 = null;
	    anIntArray1662 = null;
	    anIntArray1670 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ja.Q(" + arg0 + ')');
	}
    }
    
    public static void method226(int arg0) {
	try {
	    anInt1654++;
	    int i
		= Class11_Sub10_Sub4_Sub2.inBuffer.method203(59,
									    8);
	    if (arg0 != -918)
		aClass31_1669 = null;
	    if (Class48.anInt885 > i) {
		for (int i_0_ = i;
		     (i_0_ ^ 0xffffffff) > (Class48.anInt885 ^ 0xffffffff);
		     i_0_++)
		    Class20.anIntArray394[Class64.anInt1340++]
			= Class32.anIntArray597[i_0_];
	    }
	    if ((i ^ 0xffffffff) < (Class48.anInt885 ^ 0xffffffff))
		throw new RuntimeException("gppov1");
	    Class48.anInt885 = 0;
	    for (int i_1_ = 0; i > i_1_; i_1_++) {
		int i_2_ = Class32.anIntArray597[i_1_];
		Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
		    = (Class11_Sub10_Sub7
		       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_2_]);
		int i_3_ = Class11_Sub10_Sub4_Sub2.inBuffer
			       .method203(-78, 1);
		if (i_3_ == 0) {
		    Class32.anIntArray597[Class48.anInt885++] = i_2_;
		    class11_sub10_sub4_sub2_sub1.anInt2505 = Class61.anInt1283;
		} else {
		    int i_4_ = Class11_Sub10_Sub4_Sub2
				   .inBuffer.method203(-74, 2);
		    if ((i_4_ ^ 0xffffffff) == -1) {
			Class32.anIntArray597[Class48.anInt885++] = i_2_;
			class11_sub10_sub4_sub2_sub1.anInt2505
			    = Class61.anInt1283;
			Class54.anIntArray1066[Class11_Sub11.anInt1687++]
			    = i_2_;
		    } else if ((i_4_ ^ 0xffffffff) == -2) {
			Class32.anIntArray597[Class48.anInt885++] = i_2_;
			class11_sub10_sub4_sub2_sub1.anInt2505
			    = Class61.anInt1283;
			int i_5_
			    = Class11_Sub10_Sub4_Sub2
				  .inBuffer.method203(-115, 3);
			class11_sub10_sub4_sub2_sub1.method273(i_5_, (byte) 68,
							       false);
			int i_6_
			    = Class11_Sub10_Sub4_Sub2
				  .inBuffer.method203(-117, 1);
			if ((i_6_ ^ 0xffffffff) == -2)
			    Class54.anIntArray1066[Class11_Sub11.anInt1687++]
				= i_2_;
		    } else if (i_4_ == 2) {
			Class32.anIntArray597[Class48.anInt885++] = i_2_;
			class11_sub10_sub4_sub2_sub1.anInt2505
			    = Class61.anInt1283;
			int i_7_
			    = Class11_Sub10_Sub4_Sub2
				  .inBuffer
				  .method203(arg0 + 970, 3);
			class11_sub10_sub4_sub2_sub1.method273(i_7_, (byte) 68,
							       true);
			int i_8_
			    = Class11_Sub10_Sub4_Sub2
				  .inBuffer.method203(-87, 3);
			class11_sub10_sub4_sub2_sub1.method273(i_8_, (byte) 68,
							       true);
			int i_9_
			    = Class11_Sub10_Sub4_Sub2
				  .inBuffer
				  .method203(arg0 ^ ~0x3ce, 1);
			if (i_9_ == 1)
			    Class54.anIntArray1066[Class11_Sub11.anInt1687++]
				= i_2_;
		    } else if (i_4_ == 3)
			Class20.anIntArray394[Class64.anInt1340++] = i_2_;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ja.T(" + arg0 + ')');
	}
    }
    
    public void method227(int arg0) {
	try {
	    anInt1671++;
	    if (aClass11_Sub10_1675 != null) {
		int i = -20 % ((15 - arg0) / 33);
		aClass11_Sub10_1675.aClass11_Sub10_1659 = aClass11_Sub10_1659;
		aClass11_Sub10_1659.aClass11_Sub10_1675 = aClass11_Sub10_1675;
		aClass11_Sub10_1659 = null;
		aClass11_Sub10_1675 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ja.R(" + arg0 + ')');
	}
    }
    
    static {
	aBoolean1653 = true;
	anInt1655 = 1;
	aClass31_1669
	    = Class64.method992("and choose the (Wcreate account(W", 255);
	aLong1663 = 0L;
	anInt1665 = 50;
	anIntArray1667 = new int[anInt1665];
	anIntArray1672 = new int[anInt1665];
	anIntArray1657 = new int[anInt1665];
	aClass31_1673 = Class64.method992("backright1", 255);
	anIntArray1668 = new int[anInt1665];
	aClass31Array1656 = new Class31[anInt1665];
	anIntArray1670 = new int[anInt1665];
	anIntArray1662 = new int[anInt1665];
	anIntArray1661 = new int[anInt1665];
    }
}
