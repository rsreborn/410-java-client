/* Class11_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub12 extends Class11
{
    public static Class31 aClass31_1690
	= Class64.method992("::clientdrop", 255);
    public static int anInt1691;
    public static int anInt1692;
    public static int[][] anIntArrayArray1693;
    public static int anInt1694;
    public static int anInt1695;
    public static Class31 aClass31_1696;
    public static int anInt1697;
    public static Class31 aClass31_1698 = Class64.method992(" x ", 255);
    public static Class14 aClass14_1699;
    public static int anInt1700;
    public static int anInt1701;
    public static int anInt1702;
    public static int[] anIntArray1703;
    public static int anInt1704;
    public static Class11_Sub10_Sub13_Sub3[] aClass11_Sub10_Sub13_Sub3Array1705;
    public static int anInt1706;
    public int anInt1707;
    public Class11_Sub12 aClass11_Sub12_1708;
    public Class30 aClass30_1709;
    public int anInt1710 = 0;
    public boolean aBoolean1711;
    public Class44 aClass44_1712;
    public int anInt1713;
    public boolean aBoolean1714;
    public boolean aBoolean1715;
    public int anInt1716;
    public Class1 aClass1_1717;
    public int anInt1718;
    public int[] anIntArray1719 = new int[5];
    public int anInt1720;
    public int anInt1721;
    public int anInt1722;
    public Class43 aClass43_1723;
    public int anInt1724;
    public Class54 aClass54_1725;
    public Class28[] aClass28Array1726 = new Class28[5];
    public Class23 aClass23_1727;
    public int anInt1728;
    public int anInt1729;
    
    public static int method494(int arg0, int arg1) {
	try {
	    return arg0 ^ arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "nd.G(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method495(boolean arg0) {
	try {
	    anInt1697++;
	    if (arg0 != false)
		method500(-54, null, 103, 25);
	    for (int i = 0;
		 (i ^ 0xffffffff) > (Class11_Sub11.anInt1687 ^ 0xffffffff);
		 i++) {
		int i_0_ = Class54.anIntArray1066[i];
		Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
		    = Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i_0_];
		int i_1_ = Class11_Sub10_Sub4_Sub2.inBuffer
			       .method168(255);
		if ((i_1_ & 0x20) != 0) {
		    class11_sub10_sub4_sub2_sub2.anInt2568
			= Class11_Sub10_Sub4_Sub2.inBuffer
			      .method164();
		    if (class11_sub10_sub4_sub2_sub2.anInt2568 == 65535)
			class11_sub10_sub4_sub2_sub2.anInt2568 = -1;
		}
		if ((i_1_ & 0x40 ^ 0xffffffff) != -1) {
		    int i_2_ = Class11_Sub10_Sub4_Sub2
				   .inBuffer.method190();
		    int i_3_ = Class11_Sub10_Sub4_Sub2
				   .inBuffer.method166(false);
		    class11_sub10_sub4_sub2_sub2
			.method266(i_2_, 112, Class61.anInt1283, i_3_);
		    class11_sub10_sub4_sub2_sub2.anInt2557
			= Class61.anInt1283 + 300;
		    class11_sub10_sub4_sub2_sub2.anInt2538
			= Class11_Sub10_Sub4_Sub2.inBuffer
			      .readUByteA();
		    class11_sub10_sub4_sub2_sub2.anInt2512
			= Class11_Sub10_Sub4_Sub2.inBuffer
			      .method190();
		}
		if ((i_1_ & 0x8 ^ 0xffffffff) != -1) {
		    int i_4_ = Class11_Sub10_Sub4_Sub2
				   .inBuffer.method141(122);
		    int i_5_ = Class11_Sub10_Sub4_Sub2
				   .inBuffer.method168(255);
		    if (i_4_ == 65535)
			i_4_ = -1;
		    if (i_4_ == class11_sub10_sub4_sub2_sub2.anInt2549
			&& (i_4_ ^ 0xffffffff) != 0) {
			int i_6_ = NotActuallyBuffer.method600(i_4_, 4867).anInt2278;
			if ((i_6_ ^ 0xffffffff) == -2) {
			    class11_sub10_sub4_sub2_sub2.anInt2558 = 0;
			    class11_sub10_sub4_sub2_sub2.anInt2496 = 0;
			    class11_sub10_sub4_sub2_sub2.anInt2555 = i_5_;
			    class11_sub10_sub4_sub2_sub2.anInt2540 = 0;
			}
			if ((i_6_ ^ 0xffffffff) == -3)
			    class11_sub10_sub4_sub2_sub2.anInt2540 = 0;
		    } else if (i_4_ == -1
			       || class11_sub10_sub4_sub2_sub2.anInt2549 == -1
			       || (NotActuallyBuffer.method600(i_4_, 4867).anInt2274
				   >= (NotActuallyBuffer.method600
				       (class11_sub10_sub4_sub2_sub2.anInt2549,
					4867)
				       .anInt2274))) {
			class11_sub10_sub4_sub2_sub2.anInt2558 = 0;
			class11_sub10_sub4_sub2_sub2.anInt2540 = 0;
			class11_sub10_sub4_sub2_sub2.anInt2496 = 0;
			class11_sub10_sub4_sub2_sub2.anInt2549 = i_4_;
			class11_sub10_sub4_sub2_sub2.anInt2514
			    = class11_sub10_sub4_sub2_sub2.anInt2551;
			class11_sub10_sub4_sub2_sub2.anInt2555 = i_5_;
		    }
		}
		if ((i_1_ & 0x1) != 0) {
		    int i_7_ = Class11_Sub10_Sub4_Sub2
				   .inBuffer.method190();
		    int i_8_ = Class11_Sub10_Sub4_Sub2
				   .inBuffer.method166(false);
		    class11_sub10_sub4_sub2_sub2
			.method266(i_7_, 59, Class61.anInt1283, i_8_);
		    class11_sub10_sub4_sub2_sub2.anInt2557
			= 300 + Class61.anInt1283;
		    class11_sub10_sub4_sub2_sub2.anInt2538
			= Class11_Sub10_Sub4_Sub2.inBuffer
			      .method168(255);
		    class11_sub10_sub4_sub2_sub2.anInt2512
			= Class11_Sub10_Sub4_Sub2.inBuffer
			      .method190();
		}
		if ((i_1_ & 0x80) != 0) {
		    class11_sub10_sub4_sub2_sub2.anInt2543
			= Class11_Sub10_Sub4_Sub2.inBuffer
			      .method174(63);
		    int i_9_ = Class11_Sub10_Sub4_Sub2
				   .inBuffer.method170(-72);
		    class11_sub10_sub4_sub2_sub2.anInt2563
			= Class61.anInt1283 - -(i_9_ & 0xffff);
		    class11_sub10_sub4_sub2_sub2.anInt2524
			= i_9_ >> -846377904;
		    class11_sub10_sub4_sub2_sub2.anInt2527 = 0;
		    if (class11_sub10_sub4_sub2_sub2.anInt2563
			> Class61.anInt1283)
			class11_sub10_sub4_sub2_sub2.anInt2527 = -1;
		    if (class11_sub10_sub4_sub2_sub2.anInt2543 == 65535)
			class11_sub10_sub4_sub2_sub2.anInt2543 = -1;
		    class11_sub10_sub4_sub2_sub2.anInt2498 = 0;
		}
		if ((i_1_ & 0x2 ^ 0xffffffff) != -1) {
		    class11_sub10_sub4_sub2_sub2.aClass31_2542
			= Class11_Sub10_Sub4_Sub2.inBuffer
			      .method181((byte) 127);
		    class11_sub10_sub4_sub2_sub2.anInt2534 = 100;
		}
		if ((0x4 & i_1_) != 0) {
		    class11_sub10_sub4_sub2_sub2.aClass11_Sub10_Sub14_2828
			= Class13.method512(89, Class11_Sub10_Sub4_Sub2
						    .inBuffer
						    .method164());
		    class11_sub10_sub4_sub2_sub2.anInt2525
			= (class11_sub10_sub4_sub2_sub2
			   .aClass11_Sub10_Sub14_2828.anInt2320);
		    class11_sub10_sub4_sub2_sub2.anInt2499
			= (class11_sub10_sub4_sub2_sub2
			   .aClass11_Sub10_Sub14_2828.anInt2334);
		    class11_sub10_sub4_sub2_sub2.anInt2546
			= (class11_sub10_sub4_sub2_sub2
			   .aClass11_Sub10_Sub14_2828.anInt2325);
		    class11_sub10_sub4_sub2_sub2.anInt2518
			= (class11_sub10_sub4_sub2_sub2
			   .aClass11_Sub10_Sub14_2828.anInt2323);
		    class11_sub10_sub4_sub2_sub2.anInt2510
			= (class11_sub10_sub4_sub2_sub2
			   .aClass11_Sub10_Sub14_2828.anInt2308);
		    class11_sub10_sub4_sub2_sub2.anInt2566
			= (class11_sub10_sub4_sub2_sub2
			   .aClass11_Sub10_Sub14_2828.anInt2312);
		    class11_sub10_sub4_sub2_sub2.anInt2545
			= (class11_sub10_sub4_sub2_sub2
			   .aClass11_Sub10_Sub14_2828.anInt2316);
		}
		if ((0x10 & i_1_ ^ 0xffffffff) != -1) {
		    class11_sub10_sub4_sub2_sub2.anInt2513
			= Class11_Sub10_Sub4_Sub2.inBuffer
			      .method164();
		    class11_sub10_sub4_sub2_sub2.anInt2532
			= Class11_Sub10_Sub4_Sub2.inBuffer
			      .method165();
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "nd.H(" + arg0 + ')');
	}
    }
    
    public static boolean method496(boolean arg0) {
	try {
	    if (arg0 != true)
		anIntArrayArray1693 = null;
	    anInt1701++;
	    if (Class11_Sub5_Sub1.aClass15_1925 == null)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "nd.C(" + arg0 + ')');
	}
    }
    
    public static void method497(Class45 arg0, int arg1, int arg2,
				 Buffer arg3) {
	try {
	    anInt1706++;
	    if (!Class11_Sub10_Sub4_Sub3.aBoolean2580) {
		Class11_Sub4 class11_sub4 = new Class11_Sub4();
		class11_sub4.anInt1474 = arg3.method168(255);
		class11_sub4.anInt1484 = arg3.method188((byte) 105);
		class11_sub4.aByteArrayArrayArray1489
		    = new byte[class11_sub4.anInt1474][][];
		class11_sub4.aClass41Array1499
		    = new Class41[class11_sub4.anInt1474];
		class11_sub4.anIntArray1497 = new int[class11_sub4.anInt1474];
		class11_sub4.anIntArray1488 = new int[class11_sub4.anInt1474];
		if (arg1 == 6364) {
		    class11_sub4.anIntArray1485
			= new int[class11_sub4.anInt1474];
		    class11_sub4.aClass41Array1481
			= new Class41[class11_sub4.anInt1474];
		    for (int i = 0; (i ^ 0xffffffff) > (class11_sub4.anInt1474
							^ 0xffffffff); i++) {
			try {
			    int i_10_ = arg3.method168(255);
			    if (i_10_ == 0 || i_10_ == 1 || i_10_ == 2) {
				String string
				    = new String(arg3.method181((byte) 127)
						     .method643(false));
				int i_11_ = 0;
				String string_12_
				    = new String(arg3.method181((byte) 127)
						     .method643(false));
				if (i_10_ == 1)
				    i_11_ = arg3.method188((byte) 105);
				class11_sub4.anIntArray1488[i] = i_10_;
				class11_sub4.anIntArray1497[i] = i_11_;
				class11_sub4.aClass41Array1499[i]
				    = (arg0.method775
				       ((byte) 34, string_12_,
					Class11_Sub10_Sub7.method355(29609,
								     string)));
			    } else if ((i_10_ ^ 0xffffffff) == -4
				       || (i_10_ ^ 0xffffffff) == -5) {
				String string
				    = new String(arg3.method181((byte) 127)
						     .method643(false));
				String string_13_
				    = new String(arg3.method181((byte) 127)
						     .method643(false));
				int i_14_ = arg3.method168(arg1 + -6109);
				String[] strings = new String[i_14_];
				for (int i_15_ = 0; i_14_ > i_15_; i_15_++)
				    strings[i_15_]
					= new String(arg3.method181
							 ((byte) 127)
							 .method643(false));
				byte[][] is = new byte[i_14_][];
				if ((i_10_ ^ 0xffffffff) == -4) {
				    for (int i_16_ = 0;
					 ((i_14_ ^ 0xffffffff)
					  < (i_16_ ^ 0xffffffff));
					 i_16_++) {
					int i_17_ = arg3.method188((byte) 105);
					is[i_16_] = new byte[i_17_];
					arg3.method169(0, i_17_, is[i_16_],
						       -41);
				    }
				}
				class11_sub4.anIntArray1488[i] = i_10_;
				Class[] var_classes = new Class[i_14_];
				for (int i_18_ = 0; i_18_ < i_14_; i_18_++)
				    var_classes[i_18_]
					= (Class11_Sub10_Sub7.method355
					   (29609, strings[i_18_]));
				class11_sub4.aClass41Array1481[i]
				    = (arg0.method772
				       (Class11_Sub10_Sub7.method355(29609,
								     string),
					string_13_, var_classes, 9));
				class11_sub4.aByteArrayArrayArray1489[i] = is;
			    }
			} catch (ClassNotFoundException classnotfoundexception) {
			    class11_sub4.anIntArray1485[i] = -1;
			} catch (SecurityException securityexception) {
			    class11_sub4.anIntArray1485[i] = -2;
			} catch (NullPointerException nullpointerexception) {
			    class11_sub4.anIntArray1485[i] = -3;
			} catch (Exception exception) {
			    class11_sub4.anIntArray1485[i] = -4;
			} catch (Throwable throwable) {
			    class11_sub4.anIntArray1485[i] = -5;
			}
		    }
		    Class59.aClass36_1240.method691((byte) -98, class11_sub4);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("nd.F("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ','
				     + (arg3 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method498(byte arg0) {
	try {
	    aClass31_1690 = null;
	    aClass14_1699 = null;
	    aClass11_Sub10_Sub13_Sub3Array1705 = null;
	    aClass31_1698 = null;
	    anIntArrayArray1693 = null;
	    aClass31_1696 = null;
	    if (arg0 == -35)
		anIntArray1703 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "nd.D(" + arg0 + ')');
	}
    }
    
    public static boolean method499(byte arg0, Class55 arg1, int arg2) {
	try {
	    anInt1695++;
	    byte[] is = arg1.method884(0, arg2);
	    if (is == null)
		return false;
	    if (arg0 != -34)
		aClass31_1698 = null;
	    Class11_Sub10_Sub4_Sub5.method325(0, is);
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("nd.A(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ')'));
	}
    }
    
    public static Class31 method500(int arg0, byte[] arg1, int arg2,
				    int arg3) {
	try {
	    anInt1692++;
	    Class31 class31 = new Class31();
	    class31.anInt1403 = arg0;
	    class31.aByteArray1366 = new byte[arg0];
	    if (arg2 != 0)
		method498((byte) 57);
	    Class21.method574(arg1, arg3, class31.aByteArray1366, 0, arg0);
	    return class31;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("nd.B(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ')'));
	}
    }
    
    public static void method501(int arg0, long arg1) {
	try {
	    anInt1691++;
	    if ((arg1 ^ 0xffffffffffffffffL) != -1L) {
		int i = 0;
		if (arg0 <= -17) {
		    for (/**/; (i ^ 0xffffffff) > (Buffer.anInt1573
						   ^ 0xffffffff); i++) {
			if ((arg1 ^ 0xffffffffffffffffL)
			    == (Class7.aLongArray1423[i]
				^ 0xffffffffffffffffL)) {
			    Buffer.anInt1573--;
			    Class11_Sub10_Sub14.aBoolean2352 = true;
			    Class36.anInt663++;
			    for (int i_19_ = i; Buffer.anInt1573 > i_19_;
					 i_19_++) {
				Canvas_Sub1.aClass31Array63[i_19_]
				    = Canvas_Sub1.aClass31Array63[i_19_ + 1];
				NotActuallyBuffer.anIntArray484[i_19_]
				    = NotActuallyBuffer.anIntArray484[1 + i_19_];
				Class7.aLongArray1423[i_19_]
				    = Class7.aLongArray1423[1 + i_19_];
			    }
			    Class40.outBuffer.method196(1, 30);
			    Class40.outBuffer.method140(-24628,
								     arg1);
			    break;
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "nd.E(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public Class11_Sub12(int arg0, int arg1, int arg2) {
	try {
	    anInt1720 = anInt1722 = arg0;
	    anInt1728 = arg2;
	    anInt1713 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("nd.<init>(" + arg0 + ',' + arg1 + ','
				     + arg2 + ')'));
	}
    }
    
    static {
	aClass31_1696 = Class64.method992("(U5", 255);
	anIntArrayArray1693 = new int[104][104];
	anInt1702 = 0;
    }
}
