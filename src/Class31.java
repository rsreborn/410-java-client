/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Class31 implements Interface2
{
    public boolean aBoolean1361 = true;
    public static int anInt1362;
    public static Class31 aClass31_1363;
    public static int anInt1364;
    public static int anInt1365;
    public byte[] aByteArray1366;
    public static int anInt1367;
    public static int anInt1368;
    public static Class31 aClass31_1369;
    public static int anInt1370;
    public static int anInt1371;
    public static int anInt1372;
    public static int anInt1373;
    public static int anInt1374;
    public static int anInt1375;
    public static Class31 aClass31_1376;
    public static boolean aBoolean1377 = false;
    public static int anInt1378;
    public static int anInt1379;
    public static int anInt1380;
    public static int anInt1381;
    public static int anInt1382;
    public static int anInt1383;
    public static int anInt1384;
    public static int anInt1385;
    public static int anInt1386;
    public static int anInt1387;
    public static int anInt1388;
    public static boolean aBoolean1389;
    public static int anInt1390;
    public static int anInt1391;
    public static int[] anIntArray1392;
    public static Class31 aClass31_1393;
    public static int anInt1394;
    public static Class55 aClass55_1395;
    public static int anInt1396;
    public static int anInt1397;
    public static int anInt1398;
    public int anInt1399;
    public static int anInt1400;
    public static Class31 aClass31_1401;
    public static int anInt1402;
    public int anInt1403;
    public static int anInt1404;
    public static int anInt1405;
    public static int anInt1406;
    public static int anInt1407;
    public static int anInt1408;
    public static int anInt1409;
    public static int anInt1410;
    public static int anInt1411;
    public static Class31 aClass31_1412;
    public static int anInt1413;
    public static int anInt1414;
    public static int anInt1415;
    public static int anInt1416;
    public static int anInt1417;
    public static int anInt1418;
    /*synthetic*/ public static Class aClass1419;
    
    public long method618(int arg0) {
	try {
	    anInt1397++;
	    long l = 0L;
	    if (arg0 != 27263)
		return 99L;
	    for (int i = 0; (i ^ 0xffffffff) > (anInt1403 ^ 0xffffffff); i++)
		l = (l << -543278587) - l + (long) (0xff & aByteArray1366[i]);
	    return l;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.P(" + arg0 + ')');
	}
    }
    
    public Class31 method619(int arg0) {
	try {
	    anInt1378++;
	    long l = method618(27263);
	    synchronized (aClass1419 != null ? aClass1419
			  : (aClass1419 = method655("Class31"))) {
		if (arg0 > -42)
		    return null;
		if (Class11_Sub6.aClass34_1594 == null)
		    Class11_Sub6.aClass34_1594 = new Class34(4096);
		else {
		    for (Class11_Sub7 class11_sub7
			     = ((Class11_Sub7)
				Class11_Sub6.aClass34_1594.method677(126, l));
			 class11_sub7 != null;
			 class11_sub7
			     = ((Class11_Sub7)
				Class11_Sub6.aClass34_1594.method669(-1))) {
			if (method638(-10, class11_sub7.aClass31_1611))
			    return class11_sub7.aClass31_1611;
		    }
		}
		Class11_Sub7 class11_sub7 = new Class11_Sub7();
		aBoolean1361 = false;
		class11_sub7.aClass31_1611 = this;
		Class11_Sub6.aClass34_1594.method682(123, class11_sub7, l);
	    }
	    return this;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.J(" + arg0 + ')');
	}
    }
    
    public Class31 method620(byte arg0) {
	try {
	    anInt1387++;
	    if (arg0 != 29)
		aClass31_1412 = null;
	    Class31 class31 = new Class31();
	    boolean bool = true;
	    class31.anInt1403 = anInt1403;
	    class31.aByteArray1366 = new byte[anInt1403];
	    for (int i = 0; anInt1403 > i; i++) {
		byte i_0_ = aByteArray1366[i];
		if ((i_0_ ^ 0xffffffff) <= -98 && (i_0_ ^ 0xffffffff) >= -123
		    || ((i_0_ ^ 0xffffffff) <= 31 && i_0_ <= -2
			&& (i_0_ ^ 0xffffffff) != 8)) {
		    if (bool)
			i_0_ -= 32;
		    bool = false;
		} else if (i_0_ >= 65 && i_0_ <= 90
			   || ((i_0_ ^ 0xffffffff) <= 63
			       && (i_0_ ^ 0xffffffff) >= 33 && i_0_ != -41)) {
		    if (!bool)
			i_0_ += 32;
		    bool = false;
		}
		if ((i_0_ ^ 0xffffffff) == -47 || i_0_ == 33
		    || (i_0_ ^ 0xffffffff) == -64)
		    bool = true;
		class31.aByteArray1366[i] = i_0_;
	    }
	    return class31;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.CA(" + arg0 + ')');
	}
    }
    
    public Class31 method621(boolean arg0) {
	try {
	    anInt1396++;
	    Class31 class31 = new Class31();
	    boolean bool = arg0;
	    class31.anInt1403 = anInt1403;
	    class31.aByteArray1366 = new byte[anInt1403];
	    for (int i = 0; (anInt1403 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		byte i_1_ = aByteArray1366[i];
		if ((i_1_ ^ 0xffffffff) == -96) {
		    bool = true;
		    class31.aByteArray1366[i] = (byte) 32;
		} else if ((i_1_ ^ 0xffffffff) > -98 || i_1_ > 122 || !bool) {
		    bool = false;
		    class31.aByteArray1366[i] = i_1_;
		} else {
		    bool = false;
		    class31.aByteArray1366[i] = (byte) (i_1_ + -32);
		}
	    }
	    return class31;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.V(" + arg0 + ')');
	}
    }
    
    public boolean method622(Class31 arg0, int arg1) {
	try {
	    anInt1367++;
	    if ((anInt1403 ^ 0xffffffff) > (arg0.anInt1403 ^ 0xffffffff))
		return false;
	    if (arg1 <= 48)
		method651((byte) -2);
	    for (int i = 0; i < arg0.anInt1403; i++) {
		if (aByteArray1366[i] != arg0.aByteArray1366[i])
		    return false;
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("o.D(" + (arg0 != null ? "{...}" : "null")
				     + ',' + arg1 + ')'));
	}
    }
    
    public int method623(int arg0) {
	try {
	    int i = 107 / ((arg0 - 83) / 36);
	    anInt1418++;
	    return anInt1403;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.KA(" + arg0 + ')');
	}
    }
    
    public static void method624(int arg0) {
	try {
	    anIntArray1392 = null;
	    aClass31_1401 = null;
	    aClass31_1393 = null;
	    aClass31_1376 = null;
	    if (arg0 < 0)
		method647(-66, 63, 120);
	    aClass31_1412 = null;
	    aClass31_1369 = null;
	    aClass31_1363 = null;
	    aClass55_1395 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.U(" + arg0 + ')');
	}
    }
    
    public boolean method625(int arg0, byte arg1) {
	try {
	    if (arg0 < 1 || (arg0 ^ 0xffffffff) < -37)
		arg0 = 10;
	    anInt1364++;
	    boolean bool = false;
	    if (arg1 >= -11)
		return false;
	    boolean bool_2_ = false;
	    int i = 0;
	    for (int i_3_ = 0; (anInt1403 ^ 0xffffffff) < (i_3_ ^ 0xffffffff);
		 i_3_++) {
		int i_4_ = 0xff & aByteArray1366[i_3_];
		if (i_3_ == 0) {
		    if ((i_4_ ^ 0xffffffff) == -46) {
			bool = true;
			continue;
		    }
		    if ((i_4_ ^ 0xffffffff) == -44)
			continue;
		}
		if ((i_4_ ^ 0xffffffff) <= -49 && (i_4_ ^ 0xffffffff) >= -58)
		    i_4_ -= 48;
		else if ((i_4_ ^ 0xffffffff) <= -66
			 && (i_4_ ^ 0xffffffff) >= -91)
		    i_4_ -= 55;
		else {
		    if ((i_4_ ^ 0xffffffff) > -98 || i_4_ > 122)
			return false;
		    i_4_ -= 87;
		}
		if ((arg0 ^ 0xffffffff) >= (i_4_ ^ 0xffffffff))
		    return false;
		if (bool)
		    i_4_ = -i_4_;
		int i_5_ = i * arg0 + i_4_;
		if ((i_5_ / arg0 ^ 0xffffffff) != (i ^ 0xffffffff))
		    return false;
		i = i_5_;
		bool_2_ = true;
	    }
	    return bool_2_;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "o.T(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static Class31 method626(int arg0, int arg1) {
	try {
	    int i = -92 / ((-6 - arg1) / 51);
	    anInt1374++;
	    if (arg0 < 100000)
		return Class11_Sub11.method493(arg0, (byte) -128);
	    if (arg0 < 10000000)
		return (Class40.method744
			(0,
			 new Class31[] { Class11_Sub11.method493(arg0 / 1000,
								 (byte) -128),
					 Class11_Sub4.aClass31_1486 }));
	    return Class40.method744(0,
				     (new Class31[]
				      { Class11_Sub11.method493(arg0 / 1000000,
								(byte) -124),
					Class11_Sub10_Sub10.aClass31_2223 }));
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "o.AA(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public int method627(int arg0, boolean arg1) {
	try {
	    anInt1414++;
	    if (arg0 < 1 || (arg0 ^ 0xffffffff) < -37)
		arg0 = 10;
	    boolean bool = false;
	    int i = 0;
	    if (arg1 != true)
		method626(27, 84);
	    boolean bool_6_ = false;
	    for (int i_7_ = 0; (anInt1403 ^ 0xffffffff) < (i_7_ ^ 0xffffffff);
		 i_7_++) {
		int i_8_ = 0xff & aByteArray1366[i_7_];
		if ((i_7_ ^ 0xffffffff) == -1) {
		    if ((i_8_ ^ 0xffffffff) == -46) {
			bool = true;
			continue;
		    }
		    if (i_8_ == 43)
			continue;
		}
		if (i_8_ < 48 || i_8_ > 57) {
		    if ((i_8_ ^ 0xffffffff) <= -66 && i_8_ <= 90)
			i_8_ -= 55;
		    else if (i_8_ >= 97 && (i_8_ ^ 0xffffffff) >= -123)
			i_8_ -= 87;
		    else
			throw new NumberFormatException();
		} else
		    i_8_ -= 48;
		if ((i_8_ ^ 0xffffffff) <= (arg0 ^ 0xffffffff))
		    throw new NumberFormatException();
		if (bool)
		    i_8_ = -i_8_;
		int i_9_ = arg0 * i - -i_8_;
		if (i != i_9_ / arg0)
		    throw new NumberFormatException();
		i = i_9_;
		bool_6_ = true;
	    }
	    if (!bool_6_)
		throw new NumberFormatException();
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "o.W(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public int method628(boolean arg0, int arg1) {
	try {
	    anInt1370++;
	    if (arg0 != false)
		return -41;
	    return 0xff & aByteArray1366[arg1];
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "o.G(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public Class31 method629(int arg0) {
	try {
	    anInt1409++;
	    Class31 class31 = new Class31();
	    int i = 0;
	    class31.anInt1403 = 0;
	    class31.aByteArray1366 = new byte[12];
	    if (arg0 <= 110)
		anInt1403 = -31;
	    for (int i_10_ = 0;
		 (i_10_ ^ 0xffffffff) > (anInt1403 ^ 0xffffffff); i_10_++) {
		if (aByteArray1366[i_10_] < 65
		    || (aByteArray1366[i_10_] ^ 0xffffffff) < -91) {
		    if (((aByteArray1366[i_10_] ^ 0xffffffff) <= -98
			 && (aByteArray1366[i_10_] ^ 0xffffffff) >= -123)
			|| ((aByteArray1366[i_10_] ^ 0xffffffff) <= -49
			    && (aByteArray1366[i_10_] ^ 0xffffffff) >= -58)) {
			class31.aByteArray1366[i++] = aByteArray1366[i_10_];
			class31.anInt1403 = i;
		    } else if ((i ^ 0xffffffff) < -1)
			class31.aByteArray1366[i++] = (byte) 95;
		} else {
		    class31.aByteArray1366[i++]
			= (byte) (-65 + (aByteArray1366[i_10_] + 97));
		    class31.anInt1403 = i;
		}
		if (i == 12)
		    break;
	    }
	    return class31;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.DA(" + arg0 + ')');
	}
    }
    
    public boolean method630(int arg0) {
	try {
	    if (arg0 > -71)
		return true;
	    anInt1371++;
	    return method625(10, (byte) -30);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.NA(" + arg0 + ')');
	}
    }
    
    public Class31 method631(int arg0) {
	try {
	    if (arg0 != 63)
		method639(-120, 49);
	    anInt1391++;
	    Class31 class31 = new Class31();
	    class31.anInt1403 = anInt1403;
	    class31.aByteArray1366 = new byte[anInt1403];
	    for (int i = 0; anInt1403 > i; i++)
		class31.aByteArray1366[i] = (byte) 42;
	    return class31;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.E(" + arg0 + ')');
	}
    }
    
    public Class31 method632(byte arg0) {
	try {
	    if (arg0 != 12)
		method618(-81);
	    anInt1382++;
	    int i = anInt1403;
	    int i_11_;
	    for (i_11_ = 0;
		 (i_11_ < anInt1403
		  && (aByteArray1366[i_11_] ^ 0xffffffff) <= -1);
		 i_11_++) {
		if (aByteArray1366[i_11_] > 32)
		    break;
	    }
	    for (/**/; ((i ^ 0xffffffff) < (i_11_ ^ 0xffffffff)
			&& (aByteArray1366[i - 1] ^ 0xffffffff) <= -1
			&& aByteArray1366[i + -1] <= 32); i--) {
		/* empty */
	    }
	    Class31 class31 = new Class31();
	    class31.anInt1403 = -i_11_ + i;
	    class31.aByteArray1366 = new byte[class31.anInt1403];
	    for (int i_12_ = 0;
		 (class31.anInt1403 ^ 0xffffffff) < (i_12_ ^ 0xffffffff);
		 i_12_++)
		class31.aByteArray1366[i_12_] = aByteArray1366[i_11_ + i_12_];
	    return class31;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.H(" + arg0 + ')');
	}
    }
    
    public long method633(byte arg0) {
	try {
	    if (arg0 >= -124)
		aClass31_1401 = null;
	    long l = 0L;
	    for (int i = 0;
		 (anInt1403 ^ 0xffffffff) < (i ^ 0xffffffff) && i < 12; i++) {
		byte i_13_ = aByteArray1366[i];
		l *= 37L;
		if ((i_13_ ^ 0xffffffff) > -66 || i_13_ > 90) {
		    if ((i_13_ ^ 0xffffffff) <= -98
			&& (i_13_ ^ 0xffffffff) >= -123)
			l += (long) (i_13_ + -96);
		    else if ((i_13_ ^ 0xffffffff) <= -49 && i_13_ <= 57)
			l += (long) (27 + (i_13_ + -48));
		} else
		    l += (long) (1 + i_13_ + -65);
	    }
	    anInt1381++;
	    for (/**/; l % 37L == 0L && (l ^ 0xffffffffffffffffL) != -1L;
		 l /= 37L) {
		/* empty */
	    }
	    return l;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.L(" + arg0 + ')');
	}
    }
    
    public Class31 method634(int arg0, int arg1, int arg2) {
	try {
	    anInt1383++;
	    Class31 class31 = new Class31();
	    class31.anInt1403 = -arg2 + arg0;
	    class31.aByteArray1366 = new byte[-arg2 + arg0];
	    Class21.method574(aByteArray1366, arg2, class31.aByteArray1366, 0,
			      class31.anInt1403);
	    if (arg1 != -32)
		method640(-13, 100, null);
	    return class31;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("o.R(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public int hashCode() {
	try {
	    anInt1384++;
	    return method644(115);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.hashCode(" + ')');
	}
    }
    
    public int method635(byte arg0, FontMetrics arg1) {
	try {
	    if (arg0 <= 64)
		return 37;
	    anInt1416++;
	    String string;
	    try {
		string
		    = new String(aByteArray1366, 0, anInt1403, "ISO-8859-1");
	    } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
		string = new String(aByteArray1366, 0, anInt1403);
	    }
	    return arg1.stringWidth(string);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("o.B(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public int method636(int arg0, int arg1) {
	try {
	    int i = -31 / ((68 - arg1) / 33);
	    anInt1405++;
	    return method641(26127, 0, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "o.O(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public Class31 method637(byte arg0) {
	try {
	    anInt1411++;
	    if (!aBoolean1361)
		throw new IllegalArgumentException();
	    anInt1399 = 0;
	    if ((anInt1403 ^ 0xffffffff)
		!= (aByteArray1366.length ^ 0xffffffff)) {
		byte[] is = new byte[anInt1403];
		Class21.method574(aByteArray1366, 0, is, 0, anInt1403);
		aByteArray1366 = is;
	    }
	    if (arg0 <= 88)
		method626(74, -103);
	    return this;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.A(" + arg0 + ')');
	}
    }
    
    public boolean method638(int arg0, Class31 arg1) {
	try {
	    anInt1417++;
	    if (arg1 == null)
		return false;
	    if (arg1.anInt1403 != anInt1403)
		return false;
	    if (!aBoolean1361 || !arg1.aBoolean1361) {
		if (anInt1399 == 0) {
		    anInt1399 = method644(-58);
		    if (anInt1399 == 0)
			anInt1399 = 1;
		}
		if (arg1.anInt1399 == 0) {
		    arg1.anInt1399 = arg1.method644(-101);
		    if (arg1.anInt1399 == 0)
			arg1.anInt1399 = 1;
		}
		if (arg1.anInt1399 != anInt1399)
		    return false;
	    }
	    for (int i = 0; anInt1403 > i; i++) {
		if ((arg1.aByteArray1366[i] ^ 0xffffffff)
		    != (aByteArray1366[i] ^ 0xffffffff))
		    return false;
	    }
	    if (arg0 != -10)
		return true;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("o.MA(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public Class31 method639(int arg0, int arg1) {
	try {
	    if (arg0 != 28418)
		method618(50);
	    anInt1380++;
	    return method634(anInt1403, -32, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "o.FA(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public boolean equals(Object arg0) {
	try {
	    anInt1402++;
	    throw new RuntimeException();
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "o.equals(" + (arg0 != null ? "{...}"
						   : "null") + ')');
	}
    }
    
    public int method640(int arg0, int arg1, Class31 arg2) {
	try {
	    int[] is = new int[arg2.anInt1403];
	    int[] is_14_ = new int[256];
	    anInt1372++;
	    int[] is_15_ = new int[arg2.anInt1403];
	    for (int i = 0; (is_14_.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++)
		is_14_[i] = arg2.anInt1403;
	    for (int i = 1; arg2.anInt1403 >= i; i++) {
		is[-1 + i] = (arg2.anInt1403 << -1095833247) + -i;
		is_14_[Class20.method572(arg2.aByteArray1366[i - 1], 255)]
		    = -i + arg2.anInt1403;
	    }
	    int i = 81 / ((arg1 - -10) / 55);
	    int i_16_ = arg2.anInt1403 + 1;
	    int i_17_ = arg2.anInt1403;
	    while ((i_17_ ^ 0xffffffff) < -1) {
		is_15_[-1 + i_17_] = i_16_;
		for (/**/;
		     (i_16_ <= arg2.anInt1403
		      && (arg2.aByteArray1366[i_16_ + -1]
			  != arg2.aByteArray1366[-1 + i_17_]));
		     i_16_ = is_15_[-1 + i_16_]) {
		    if (-i_17_ + arg2.anInt1403 <= is[-1 + i_16_])
			is[-1 + i_16_] = -i_17_ + arg2.anInt1403;
		}
		i_17_--;
		i_16_--;
	    }
	    int i_18_ = 1;
	    int i_19_ = 0;
	    int i_20_ = i_16_;
	    i_16_ = -i_20_ + (1 + arg2.anInt1403);
	    for (int i_21_ = 1; (i_16_ ^ 0xffffffff) <= (i_21_ ^ 0xffffffff);
		 i_21_++) {
		is_15_[-1 + i_21_] = i_19_;
		for (/**/;
		     i_19_ >= 1 && (arg2.aByteArray1366[-1 + i_21_]
				    != arg2.aByteArray1366[-1 + i_19_]);
		     i_19_ = is_15_[i_19_ + -1]) {
		    /* empty */
		}
		i_19_++;
	    }
	    while (i_20_ < arg2.anInt1403) {
		for (int i_22_ = i_18_;
		     (i_22_ ^ 0xffffffff) >= (i_20_ ^ 0xffffffff); i_22_++) {
		    if (i_20_ + arg2.anInt1403 + -i_22_ <= is[i_22_ + -1])
			is[i_22_ + -1] = -i_22_ + (i_20_ + arg2.anInt1403);
		}
		i_18_ = 1 + i_20_;
		i_20_ = i_16_ + (i_20_ - is_15_[i_16_ + -1]);
		i_16_ = is_15_[-1 + i_16_];
	    }
	    int i_23_;
	    for (int i_24_ = arg2.anInt1403 + arg0 + -1; anInt1403 > i_24_;
		 i_24_ += Math.max(is_14_[aByteArray1366[i_24_] & 0xff],
				   is[i_23_])) {
		for (i_23_ = arg2.anInt1403 + -1;
		     ((i_23_ ^ 0xffffffff) <= -1
		      && arg2.aByteArray1366[i_23_] == aByteArray1366[i_24_]);
		     i_23_--)
		    i_24_--;
		if ((i_23_ ^ 0xffffffff) == 0)
		    return 1 + i_24_;
	    }
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("o.IA(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public int method641(int arg0, int arg1, int arg2) {
	try {
	    anInt1365++;
	    if (arg0 != 26127)
		method645(null, -31, 26, 8, -110);
	    byte i = (byte) arg2;
	    for (int i_25_ = arg1;
		 (i_25_ ^ 0xffffffff) > (anInt1403 ^ 0xffffffff); i_25_++) {
		if ((i ^ 0xffffffff) == (aByteArray1366[i_25_] ^ 0xffffffff))
		    return i_25_;
	    }
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("o.F(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public static Class55_Sub1 method642(boolean arg0, int arg1, byte arg2,
					 boolean arg3, boolean arg4) {
	try {
	    if (arg2 != 99)
		aClass31_1401 = null;
	    anInt1390++;
	    Class64 class64 = null;
	    if (Class28.aClass3_521 != null)
		class64 = new Class64(arg1, Class28.aClass3_521,
				      Class12.aClass3Array245[arg1], 1000000);
	    return new Class55_Sub1(class64, Class33.aClass64_617, arg1, arg0,
				    arg4, arg3);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("o.I(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ')'));
	}
    }
    
    public byte[] method643(boolean arg0) {
	try {
	    anInt1379++;
	    if (arg0 != false)
		anInt1403 = -47;
	    byte[] is = new byte[anInt1403];
	    Class21.method574(aByteArray1366, 0, is, 0, anInt1403);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.EA(" + arg0 + ')');
	}
    }
    
    public int method644(int arg0) {
	try {
	    int i = 126 / ((arg0 - 51) / 43);
	    anInt1385++;
	    int i_26_ = 0;
	    for (int i_27_ = 0; anInt1403 > i_27_; i_27_++)
		i_26_ = ((i_26_ << -1765061787) - i_26_
			 + (0xff & aByteArray1366[i_27_]));
	    return i_26_;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.LA(" + arg0 + ')');
	}
    }
    
    public int method645(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
	try {
	    anInt1373++;
	    if (arg2 != 63)
		aClass31_1376 = null;
	    Class21.method574(aByteArray1366, arg1, arg0, arg4, arg3 - arg1);
	    return -arg1 + arg3;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("o.S(" + (arg0 != null ? "{...}" : "null")
				     + ',' + arg1 + ',' + arg2 + ',' + arg3
				     + ',' + arg4 + ')'));
	}
    }
    
    public Class31 method646(byte arg0, int arg1) {
	try {
	    anInt1388++;
	    if (arg0 >= -35)
		method626(35, -30);
	    Class31 class31 = new Class31();
	    class31.aByteArray1366 = new byte[anInt1403 - -1];
	    class31.anInt1403 = 1 + anInt1403;
	    Class21.method574(aByteArray1366, 0, class31.aByteArray1366, 0,
			      anInt1403);
	    class31.aByteArray1366[anInt1403] = (byte) arg1;
	    return class31;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "o.Q(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static int method647(int arg0, int arg1, int arg2) {
	try {
	    if (arg2 != -22942)
		method647(-97, -25, 70);
	    anInt1375++;
	    if (arg0 == -2)
		return 12345678;
	    if (arg0 == -1) {
		if (arg1 >= 0) {
		    if ((arg1 ^ 0xffffffff) < -128)
			arg1 = 127;
		} else
		    arg1 = 0;
		arg1 = -arg1 + 127;
		return arg1;
	    }
	    arg1 = arg1 * (0x7f & arg0) / 128;
	    if (arg1 < 2)
		arg1 = 2;
	    else if (arg1 > 126)
		arg1 = 126;
	    return arg1 + (0xff80 & arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("o.GA(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public void method648(int arg0, int arg1, Graphics arg2, int arg3) {
	try {
	    String string;
	    try {
		string = new String(aByteArray1366, arg0, anInt1403,
				    "ISO-8859-1");
	    } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
		string = new String(aByteArray1366, 0, anInt1403);
	    }
	    anInt1408++;
	    arg2.drawString(string, arg3, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("o.JA(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ')'));
	}
    }
    
    public boolean method649(Class31 arg0, boolean arg1) {
	try {
	    anInt1400++;
	    if (anInt1403 < arg0.anInt1403)
		return false;
	    int i = -arg0.anInt1403 + anInt1403;
	    for (int i_28_ = 0;
		 (arg0.anInt1403 ^ 0xffffffff) < (i_28_ ^ 0xffffffff);
		 i_28_++) {
		if ((aByteArray1366[i + i_28_] ^ 0xffffffff)
		    != (arg0.aByteArray1366[i_28_] ^ 0xffffffff))
		    return false;
	    }
	    if (arg1 != true)
		aClass31_1412 = null;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("o.M(" + (arg0 != null ? "{...}" : "null")
				     + ',' + arg1 + ')'));
	}
    }
    
    public Class31 method650(int arg0) {
	try {
	    anInt1362++;
	    Class31 class31 = new Class31();
	    class31.anInt1403 = anInt1403;
	    class31.aByteArray1366 = new byte[anInt1403];
	    if (arg0 >= -20)
		anInt1399 = -63;
	    for (int i = 0; (anInt1403 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		byte i_29_ = aByteArray1366[i];
		if (i_29_ >= 65 && i_29_ <= 90
		    || ((i_29_ ^ 0xffffffff) <= 63 && i_29_ <= -34
			&& i_29_ != -41))
		    i_29_ += 32;
		class31.aByteArray1366[i] = i_29_;
	    }
	    return class31;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.C(" + arg0 + ')');
	}
    }
    
    public static void method651(byte arg0) {
	anInt1368++;
	for (int i = -1; (i ^ 0xffffffff) > (Class48.anInt885 ^ 0xffffffff);
	     i++) {
	    int i_30_;
	    if ((i ^ 0xffffffff) != 0)
		i_30_ = Class32.anIntArray597[i];
	    else
		i_30_ = 2047;
	    Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
		= (Class11_Sub10_Sub7.aClass11_Sub10_Sub4_Sub2_Sub1Array2160
		   [i_30_]);
	    if (class11_sub10_sub4_sub2_sub1 != null)
		Class51.method851(class11_sub10_sub4_sub2_sub1, 1, arg0 + 182);
	}
	if (arg0 != -118)
	    method651((byte) -112);
    }
    
    public int method652(byte arg0) {
	try {
	    anInt1410++;
	    int i = 21 / ((-12 - arg0) / 38);
	    return method627(10, true);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.BA(" + arg0 + ')');
	}
    }
    
    public String toString() {
	try {
	    anInt1394++;
	    throw new RuntimeException();
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "o.toString(" + ')');
	}
    }
    
    public boolean method653(Class31 arg0, boolean arg1) {
	try {
	    anInt1404++;
	    if (arg1 != true)
		method654(null, (byte) 41);
	    if (arg0 == null)
		return false;
	    if (arg0.anInt1403 != anInt1403)
		return false;
	    for (int i = 0; i < anInt1403; i++) {
		byte i_31_ = aByteArray1366[i];
		if ((i_31_ ^ 0xffffffff) <= -66 && i_31_ <= 90
		    || ((i_31_ ^ 0xffffffff) <= 63
			&& (i_31_ ^ 0xffffffff) >= 33 && i_31_ != -41))
		    i_31_ += 32;
		byte i_32_ = arg0.aByteArray1366[i];
		if (i_32_ >= 65 && (i_32_ ^ 0xffffffff) >= -91
		    || (i_32_ >= -64 && i_32_ <= -34
			&& (i_32_ ^ 0xffffffff) != 40))
		    i_32_ += 32;
		if ((i_32_ ^ 0xffffffff) != (i_31_ ^ 0xffffffff))
		    return false;
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("o.N(" + (arg0 != null ? "{...}" : "null")
				     + ',' + arg1 + ')'));
	}
    }
    
    public int method654(Class31 arg0, byte arg1) {
	try {
	    if (arg1 != 95)
		aClass31_1401 = null;
	    anInt1406++;
	    return method640(0, -96, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("o.K(" + (arg0 != null ? "{...}" : "null")
				     + ',' + arg1 + ')'));
	}
    }
    
    /*synthetic*/ public static Class method655(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aClass31_1369
	    = Class64.method992(" is already on your ignore list", 255);
	aClass31_1393 = Class64.method992("New User", 255);
	aClass31_1401 = Class64.method992("Close", 255);
	anInt1398 = 2;
	aClass31_1363 = Class64.method992(" has logged in)3", 255);
	aClass31_1412 = Class64.method992("Accept challenge @whi@", 255);
	aClass31_1376 = Class64.method992("Imported music", 255);
	aBoolean1389 = false;
	anInt1413 = 0;
    }
}
