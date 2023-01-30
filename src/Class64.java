/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class64
{
    public static int anInt1326;
    public static int[] anIntArray1327;
    public static int[] anIntArray1328 = new int[99];
    public static int anInt1329;
    public Class3 aClass3_1330;
    public static Class31 aClass31_1331;
    public Class3 aClass3_1332;
    public int anInt1333;
    public static int anInt1334;
    public static int anInt1335;
    public static int anInt1336;
    public int anInt1337 = 65000;
    public static int anInt1338;
    public static int anInt1339;
    public static int anInt1340;
    public static int anInt1341;
    public static Class11_Sub10_Sub13_Sub4[] aClass11_Sub10_Sub13_Sub4Array1342;
    public static Class31 aClass31_1343;
    public static int anInt1344;
    public static int anInt1345;
    public static int anInt1346;
    public static int anInt1347;
    public static Class11_Sub10_Sub13_Sub4 aClass11_Sub10_Sub13_Sub4_1348;
    public static Class31[] aClass31Array1349;
    
    public String toString() {
	try {
	    anInt1329++;
	    return "Cache:" + anInt1333;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "cb.toString(" + ')');
	}
    }
    
    public static void method989(int arg0) {
	try {
	    aClass31_1331 = null;
	    anIntArray1328 = null;
	    if (arg0 == 6) {
		anIntArray1327 = null;
		aClass31Array1349 = null;
		aClass11_Sub10_Sub13_Sub4Array1342 = null;
		aClass31_1343 = null;
		aClass11_Sub10_Sub13_Sub4_1348 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "cb.H(" + arg0 + ')');
	}
    }
    
    public static void method990(int arg0) {
	try {
	    anInt1334++;
	    int i = -50 / ((arg0 - 54) / 40);
	    for (Class11_Sub8 class11_sub8
		     = ((Class11_Sub8)
			Class37_Sub1.aClass36_1794.method694((byte) -112));
		 class11_sub8 != null;
		 class11_sub8 = ((Class11_Sub8)
				 Class37_Sub1.aClass36_1794.method701(0))) {
		if ((class11_sub8.anInt1632 ^ 0xffffffff) != 0)
		    class11_sub8.method107(0);
		else {
		    class11_sub8.anInt1633 = 0;
		    Class55_Sub1.method905(class11_sub8, 1196625736);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "cb.B(" + arg0 + ')');
	}
    }
    
    public static void method991(int arg0, Component arg1, Class45 arg2) {
	try {
	    anInt1326++;
	    try {
		Class61_Sub1 class61_sub1
		    = ((Class61_Sub1)
		       Class.forName("Class61_Sub1_Sub1").newInstance());
		class61_sub1.method974(arg2, 2048);
		Class40.aClass61_729 = class61_sub1;
		if (arg0 > -5)
		    anInt1347 = -16;
	    } catch (Throwable throwable) {
		try {
		    Class40.aClass61_729 = new Class61_Sub1_Sub2(arg2, arg1);
		} catch (Throwable throwable_0_) {
		    if ((Class45.aString832.toLowerCase().indexOf("microsoft")
			 ^ 0xffffffff)
			<= -1) {
			try {
			    Class40.aClass61_729 = new Class61_Sub2();
			    return;
			} catch (Throwable throwable_1_) {
			    /* empty */
			}
		    }
		    Class40.aClass61_729 = new Class61(8000);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("cb.C(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + (arg2 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static Class31 method992(String arg0, int arg1) {
	try {
	    byte[] is = arg0.getBytes();
	    anInt1341++;
	    int i = is.length;
	    Class31 class31 = new Class31();
	    class31.aByteArray1366 = new byte[i];
	    int i_2_ = 0;
	    while ((i_2_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
		int i_3_ = 0xff & is[i_2_++];
		if ((i_3_ ^ 0xffffffff) < -46 || i_3_ < 40)
		    class31.aByteArray1366[class31.anInt1403++] = (byte) i_3_;
		else {
		    if (i <= i_2_)
			break;
		    int i_4_ = is[i_2_++] & 0xff;
		    class31.aByteArray1366[class31.anInt1403++]
			= (byte) (43 * (-40 + i_3_) - 48 + i_4_);
		}
	    }
	    if (arg1 != 255)
		anIntArray1327 = null;
	    class31.method637((byte) 113);
	    return class31.method619(-54);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "cb.G(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public boolean method993(int arg0, boolean arg1, byte[] arg2, int arg3,
			     int arg4) {
	try {
	    anInt1344++;
	    synchronized (aClass3_1332) {
		try {
		    if (arg3 != 22054)
			method989(103);
		    int i;
		    if (!arg1) {
			i = (int) ((aClass3_1332.method56(98) - -519L) / 520L);
			if ((i ^ 0xffffffff) == -1)
			    i = 1;
		    } else {
			if (aClass3_1330.method56(52) < (long) (arg4 * 6 + 6))
			    return false;
			aClass3_1330.method51((long) (arg4 * 6), -22121);
			aClass3_1330.method55(27487, 0, 6,
					      (Class11_Sub10_Sub4_Sub5
					       .aByteArray2674));
			i = ((0xff & Class11_Sub10_Sub4_Sub5.aByteArray2674[5])
			     + (((0xff
				  & Class11_Sub10_Sub4_Sub5.aByteArray2674[3])
				 << -1164795024)
				- -(0xff00
				    & (Class11_Sub10_Sub4_Sub5.aByteArray2674
				       [4]) << 1152982376)));
			if (i <= 0
			    || (aClass3_1332.method56(arg3 + -21996) / 520L
				< (long) i))
			    return false;
		    }
		    Class11_Sub10_Sub4_Sub5.aByteArray2674[0]
			= (byte) (arg0 >> -1905738128);
		    int i_5_ = 0;
		    int i_6_ = 0;
		    Class11_Sub10_Sub4_Sub5.aByteArray2674[1]
			= (byte) (arg0 >> -53466968);
		    Class11_Sub10_Sub4_Sub5.aByteArray2674[2] = (byte) arg0;
		    Class11_Sub10_Sub4_Sub5.aByteArray2674[3]
			= (byte) (i >> -1002177008);
		    Class11_Sub10_Sub4_Sub5.aByteArray2674[4]
			= (byte) (i >> -430472248);
		    Class11_Sub10_Sub4_Sub5.aByteArray2674[5] = (byte) i;
		    aClass3_1330.method51((long) (6 * arg4), arg3 ^ ~0x4e);
		    aClass3_1330.method53((Class11_Sub10_Sub4_Sub5
					   .aByteArray2674),
					  6, 0, 102);
		    int i_7_;
		    for (/**/; i_5_ < arg0; i_5_ += i_7_) {
			int i_8_ = 0;
			if (arg1) {
			    aClass3_1332.method51((long) (i * 520), -22121);
			    try {
				aClass3_1332.method55(27487, 0, 8,
						      (Class11_Sub10_Sub4_Sub5
						       .aByteArray2674));
			    } catch (java.io.EOFException eofexception) {
				break;
			    }
			    i_8_ = ((0xff & (Class11_Sub10_Sub4_Sub5
					     .aByteArray2674[6]))
				    + (0xff0000
				       & (Class11_Sub10_Sub4_Sub5
					  .aByteArray2674[4]) << -132063536)
				    - -(((Class11_Sub10_Sub4_Sub5
					  .aByteArray2674[5])
					 & 0xff)
					<< -558205016));
			    i_7_ = ((0xff & (Class11_Sub10_Sub4_Sub5
					     .aByteArray2674[1]))
				    + ((0xff & (Class11_Sub10_Sub4_Sub5
						.aByteArray2674[0]))
				       << -501572568));
			    int i_9_ = 0xff & (Class11_Sub10_Sub4_Sub5
					       .aByteArray2674[7]);
			    int i_10_ = (((0xff & (Class11_Sub10_Sub4_Sub5
						   .aByteArray2674[2]))
					  << 1160324264)
					 + (0xff & (Class11_Sub10_Sub4_Sub5
						    .aByteArray2674[3])));
			    if ((i_7_ ^ 0xffffffff) != (arg4 ^ 0xffffffff)
				|| i_10_ != i_6_
				|| (i_9_ ^ 0xffffffff) != (anInt1333
							   ^ 0xffffffff))
				return false;
			    if ((i_8_ ^ 0xffffffff) > -1
				|| ((aClass3_1332.method56(118) / 520L
				     ^ 0xffffffffffffffffL)
				    > ((long) i_8_ ^ 0xffffffffffffffffL)))
				return false;
			}
			if ((i_8_ ^ 0xffffffff) == -1) {
			    arg1 = false;
			    i_8_ = (int) ((519L + aClass3_1332.method56(100))
					  / 520L);
			    if (i_8_ == 0)
				i_8_++;
			    if (i == i_8_)
				i_8_++;
			}
			Class11_Sub10_Sub4_Sub5.aByteArray2674[0]
			    = (byte) (arg4 >> -1050728280);
			Class11_Sub10_Sub4_Sub5.aByteArray2674[1]
			    = (byte) arg4;
			Class11_Sub10_Sub4_Sub5.aByteArray2674[2]
			    = (byte) (i_6_ >> -1506262776);
			Class11_Sub10_Sub4_Sub5.aByteArray2674[3]
			    = (byte) i_6_;
			i_6_++;
			if ((-i_5_ + arg0 ^ 0xffffffff) >= -513)
			    i_8_ = 0;
			i_7_ = arg0 - i_5_;
			Class11_Sub10_Sub4_Sub5.aByteArray2674[4]
			    = (byte) (i_8_ >> 1336141264);
			Class11_Sub10_Sub4_Sub5.aByteArray2674[5]
			    = (byte) (i_8_ >> 288999880);
			if ((i_7_ ^ 0xffffffff) < -513)
			    i_7_ = 512;
			Class11_Sub10_Sub4_Sub5.aByteArray2674[6]
			    = (byte) i_8_;
			Class11_Sub10_Sub4_Sub5.aByteArray2674[7]
			    = (byte) anInt1333;
			aClass3_1332.method51((long) (520 * i), -22121);
			i = i_8_;
			aClass3_1332.method53((Class11_Sub10_Sub4_Sub5
					       .aByteArray2674),
					      8, 0, 105);
			aClass3_1332.method53(arg2, i_7_, i_5_, 23);
		    }
		    return true;
		} catch (java.io.IOException ioexception) {
		    return false;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("cb.F(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ',' + arg4 + ')'));
	}
    }
    
    public boolean method994(int arg0, int arg1, byte[] arg2, boolean arg3) {
	try {
	    anInt1338++;
	    synchronized (aClass3_1332) {
		if (arg3 != false)
		    return false;
		if ((arg0 ^ 0xffffffff) > -1
		    || (anInt1337 ^ 0xffffffff) > (arg0 ^ 0xffffffff))
		    throw new IllegalArgumentException();
		boolean bool = method993(arg0, true, arg2, 22054, arg1);
		if (!bool)
		    bool = method993(arg0, false, arg2, 22054, arg1);
		return bool;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("cb.E(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ')'));
	}
    }
    
    public static Class11_Sub10_Sub13_Sub2 method995(int arg0, Class55 arg1,
						     int arg2, byte arg3) {
	try {
	    anInt1339++;
	    int i = 16 / ((arg3 - -49) / 57);
	    if (!Class37_Sub1.method714(arg2, -29446, arg1, arg0))
		return null;
	    return Class7.method84(121);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("cb.A(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ')'));
	}
    }
    
    public Class64(int arg0, Class3 arg1, Class3 arg2, int arg3) {
	aClass3_1330 = null;
	aClass3_1332 = null;
	try {
	    anInt1337 = arg3;
	    aClass3_1330 = arg2;
	    anInt1333 = arg0;
	    aClass3_1332 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("cb.<init>(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ')'));
	}
    }
    
    public byte[] method996(int arg0, int arg1) {
	try {
	    anInt1335++;
	    synchronized (aClass3_1332) {
		try {
		    if ((long) (6 + arg0 * 6) > aClass3_1330.method56(122))
			return null;
		    aClass3_1330.method51((long) (arg0 * 6), -22121);
		    if (arg1 <= 72)
			aClass11_Sub10_Sub13_Sub4_1348 = null;
		    aClass3_1330.method55(27487, 0, 6, (Class11_Sub10_Sub4_Sub5
							.aByteArray2674));
		    int i
			= (((Class11_Sub10_Sub4_Sub5.aByteArray2674[0] & 0xff)
			    << 671605360)
			   - (-((0xff
				 & Class11_Sub10_Sub4_Sub5.aByteArray2674[1])
				<< 1401080616)
			      + -(0xff & (Class11_Sub10_Sub4_Sub5
					  .aByteArray2674[2]))));
		    int i_11_
			= (((Class11_Sub10_Sub4_Sub5.aByteArray2674[4]
			     << 126225608)
			    & 0xff00)
			   + ((0xff0000
			       & (Class11_Sub10_Sub4_Sub5.aByteArray2674[3]
				  << -432241936))
			      + (0xff & (Class11_Sub10_Sub4_Sub5.aByteArray2674
					 [5]))));
		    if (i < 0 || (i ^ 0xffffffff) < (anInt1337 ^ 0xffffffff))
			return null;
		    if (i_11_ <= 0 || ((aClass3_1332.method56(89) / 520L
					^ 0xffffffffffffffffL)
				       > ((long) i_11_ ^ 0xffffffffffffffffL)))
			return null;
		    byte[] is = new byte[i];
		    int i_12_ = 0;
		    int i_13_ = 0;
		    while (i > i_13_) {
			if (i_11_ == 0)
			    return null;
			int i_14_ = i - i_13_;
			aClass3_1332.method51((long) (520 * i_11_), -22121);
			if ((i_14_ ^ 0xffffffff) < -513)
			    i_14_ = 512;
			aClass3_1332.method55(27487, 0, i_14_ + 8,
					      (Class11_Sub10_Sub4_Sub5
					       .aByteArray2674));
			int i_15_
			    = ((Class11_Sub10_Sub4_Sub5.aByteArray2674[6]
				& 0xff)
			       + ((Class11_Sub10_Sub4_Sub5.aByteArray2674[4]
				   << -997152656)
				  & 0xff0000)
			       - -((Class11_Sub10_Sub4_Sub5.aByteArray2674[5]
				    & 0xff)
				   << 1483996360));
			int i_16_
			    = ((Class11_Sub10_Sub4_Sub5.aByteArray2674[3]
				& 0xff)
			       + ((Class11_Sub10_Sub4_Sub5.aByteArray2674[2]
				   & 0xff)
				  << -1945363160));
			int i_17_
			    = 0xff & Class11_Sub10_Sub4_Sub5.aByteArray2674[7];
			int i_18_
			    = (((0xff
				 & Class11_Sub10_Sub4_Sub5.aByteArray2674[0])
				<< -2046005400)
			       - -(Class11_Sub10_Sub4_Sub5.aByteArray2674[1]
				   & 0xff));
			if (arg0 != i_18_
			    || (i_12_ ^ 0xffffffff) != (i_16_ ^ 0xffffffff)
			    || (anInt1333 ^ 0xffffffff) != (i_17_
							    ^ 0xffffffff))
			    return null;
			if (i_15_ < 0
			    || ((aClass3_1332.method56(63) / 520L
				 ^ 0xffffffffffffffffL)
				> ((long) i_15_ ^ 0xffffffffffffffffL)))
			    return null;
			i_12_++;
			i_11_ = i_15_;
			for (int i_19_ = 0; i_14_ > i_19_; i_19_++)
			    is[i_13_++] = (Class11_Sub10_Sub4_Sub5
					   .aByteArray2674[i_19_ + 8]);
		    }
		    return is;
		} catch (java.io.IOException ioexception) {
		    return null;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "cb.D(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    static {
	anIntArray1327 = new int[50];
	aClass31_1331
	    = method992("Enter name of player to delete from list", 255);
	anInt1340 = 0;
	aClass31_1343 = method992(" @yel@", 255);
	int i = 0;
	for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > -100; i_20_++) {
	    int i_21_ = 1 + i_20_;
	    int i_22_ = (int) ((double) i_21_
			       + Math.pow(2.0, (double) i_21_ / 7.0) * 300.0);
	    i += i_22_;
	    anIntArray1328[i_20_] = i / 4;
	}
	anInt1346 = 0;
	anInt1347 = 0;
	aClass31Array1349 = new Class31[5];
    }
}
