/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class62
{
    public static int anInt1285;
    public static int anInt1286;
    public int anInt1287;
    public static int anInt1288;
    public int anInt1289;
    public static BigInteger rsaModulus;
    public static int anInt1291;
    public static Class31 aClass31_1292
	= Class64.method992("::errortest", 255);
    public static Class31 aClass31_1293 = Class64.method992("(X", 255);
    public int anInt1294;
    public static int anInt1295;
    public int anInt1296;
    public static int anInt1297;
    public static int[][] anIntArrayArray1298;
    public static int[][] anIntArrayArray1299;
    public static int anInt1300;
    public static Class3 aClass3_1301;
    public static Class31 aClass31_1302;
    public static Class31 aClass31_1303;
    public static Class31 aClass31_1304;
    public static int anInt1305;
    public static Class31 aClass31_1306;
    public static int anInt1307;
    
    public static void method980(boolean arg0, Class11_Sub10_Sub5 arg1) {
	anInt1286++;
	int i = arg1.anInt2116;
	if (i >= 1 && i <= 100 || i >= 701 && (i ^ 0xffffffff) >= -801) {
	    if ((i ^ 0xffffffff) == -2 && Class11_Sub10_Sub2.anInt1972 == 0) {
		arg1.aClass31_2077 = Class52.aClass31_1036;
		arg1.anInt2061 = 0;
	    } else if ((i ^ 0xffffffff) == -2
		       && Class11_Sub10_Sub2.anInt1972 == 1) {
		arg1.anInt2061 = 0;
		arg1.aClass31_2077 = Class11_Sub10_Sub8.aClass31_2181;
	    } else if ((i ^ 0xffffffff) == -3
		       && Class11_Sub10_Sub2.anInt1972 != 2) {
		arg1.anInt2061 = 0;
		arg1.aClass31_2077 = Class20.aClass31_398;
	    } else {
		int i_0_ = Buffer.anInt1573;
		if ((i ^ 0xffffffff) >= -701)
		    i--;
		else
		    i -= 601;
		if (Class11_Sub10_Sub2.anInt1972 != 2)
		    i_0_ = 0;
		if (i >= i_0_) {
		    arg1.aClass31_2077 = Class25.aClass31_461;
		    arg1.anInt2061 = 0;
		} else {
		    arg1.aClass31_2077 = Canvas_Sub1.aClass31Array63[i];
		    arg1.anInt2061 = 1;
		}
	    }
	} else if ((i ^ 0xffffffff) <= -102 && i <= 200
		   || i >= 801 && i <= 900) {
	    if (i > 800)
		i -= 701;
	    else
		i -= 101;
	    int i_1_ = Buffer.anInt1573;
	    if (Class11_Sub10_Sub2.anInt1972 != 2)
		i_1_ = 0;
	    if ((i_1_ ^ 0xffffffff) >= (i ^ 0xffffffff)) {
		arg1.anInt2061 = 0;
		arg1.aClass31_2077 = Class25.aClass31_461;
	    } else {
		if ((NotActuallyBuffer.anIntArray484[i] ^ 0xffffffff) == -1)
		    arg1.aClass31_2077 = Class11_Sub10_Sub1.aClass31_1932;
		else if ((NotActuallyBuffer.anIntArray484[i] ^ 0xffffffff) <= -5001) {
		    if ((Class55_Sub1.anInt1863 ^ 0xffffffff)
			!= (NotActuallyBuffer.anIntArray484[i] ^ 0xffffffff))
			arg1.aClass31_2077
			    = Class40.method744(0, (new Class31[]
						    { Class32.aClass31_578,
						      (Class11_Sub11.method493
						       (-5000 + (NotActuallyBuffer
								 .anIntArray484
								 [i]),
							(byte) -127)) }));
		    else
			arg1.aClass31_2077
			    = (Class40.method744
			       (0,
				(new Class31[]
				 { RuntimeException_Sub1.aClass31_1359,
				   Class11_Sub11.method493(((NotActuallyBuffer
							     .anIntArray484[i])
							    + -5000),
							   (byte) -126) })));
		} else if (Class55_Sub1.anInt1863 == NotActuallyBuffer.anIntArray484[i])
		    arg1.aClass31_2077
			= (Class40.method744
			   (0, (new Class31[]
				{ Class11_Sub10_Sub3.aClass31_2014,
				  Class11_Sub11.method493((NotActuallyBuffer
							   .anIntArray484[i]),
							  (byte) -128) })));
		else
		    arg1.aClass31_2077
			= Class40.method744(0, (new Class31[]
						{ Class39.aClass31_719,
						  (Class11_Sub11.method493
						   (NotActuallyBuffer.anIntArray484[i],
						    (byte) -125)) }));
		arg1.anInt2061 = 1;
	    }
	} else if ((i ^ 0xffffffff) == -204) {
	    int i_2_ = Buffer.anInt1573;
	    if ((Class11_Sub10_Sub2.anInt1972 ^ 0xffffffff) != -3)
		i_2_ = 0;
	    arg1.anInt2101 = 20 + 15 * i_2_;
	    if ((arg1.anInt2115 ^ 0xffffffff) <= (arg1.anInt2101 ^ 0xffffffff))
		arg1.anInt2101 = 1 + arg1.anInt2115;
	} else if (i >= 401 && (i ^ 0xffffffff) >= -501) {
	    i -= 401;
	    if ((i ^ 0xffffffff) == -1 && Class11_Sub10_Sub2.anInt1972 == 0) {
		arg1.aClass31_2077 = Class11_Sub10_Sub15.aClass31_2379;
		arg1.anInt2061 = 0;
	    } else if (i == 1
		       && (Class11_Sub10_Sub2.anInt1972 ^ 0xffffffff) == -1) {
		arg1.anInt2061 = 0;
		arg1.aClass31_2077 = Class20.aClass31_398;
	    } else {
		int i_3_ = Class55.anInt1143;
		if (Class11_Sub10_Sub2.anInt1972 == 0)
		    i_3_ = 0;
		if (i_3_ <= i) {
		    arg1.anInt2061 = 0;
		    arg1.aClass31_2077 = Class25.aClass31_461;
		} else {
		    arg1.aClass31_2077
			= Class15_Sub2.method553
			      (Class46.aLongArray845[i], (byte) -99)
			      .method621(true);
		    arg1.anInt2061 = 1;
		}
	    }
	} else if ((i ^ 0xffffffff) == -504) {
	    arg1.anInt2101 = 15 * Class55.anInt1143 - -20;
	    if ((arg1.anInt2115 ^ 0xffffffff) <= (arg1.anInt2101 ^ 0xffffffff))
		arg1.anInt2101 = arg1.anInt2115 + 1;
	} else if ((i ^ 0xffffffff) == -328) {
	    arg1.anInt2065 = 150;
	    arg1.anInt2120
		= ((int) (256.0 * Math.sin((double) Class61.anInt1283 / 40.0))
		   & 0x7ff);
	    arg1.anInt2109 = 5;
	    arg1.anInt2102 = 0;
	} else if ((i ^ 0xffffffff) == -325) {
	    if ((Class11_Sub4.anInt1487 ^ 0xffffffff) == 0) {
		Class55_Sub1.anInt1862 = arg1.anInt2096;
		Class11_Sub4.anInt1487 = arg1.anInt2078;
	    }
	    if (Class14.aClass24_279.aBoolean459)
		arg1.anInt2078 = Class11_Sub4.anInt1487;
	    else
		arg1.anInt2078 = Class55_Sub1.anInt1862;
	} else if (i == 325) {
	    if (Class11_Sub4.anInt1487 == -1) {
		Class11_Sub4.anInt1487 = arg1.anInt2078;
		Class55_Sub1.anInt1862 = arg1.anInt2096;
	    }
	    if (!Class14.aClass24_279.aBoolean459)
		arg1.anInt2078 = Class11_Sub4.anInt1487;
	    else
		arg1.anInt2078 = Class55_Sub1.anInt1862;
	} else if (arg0 == false) {
	    if ((i ^ 0xffffffff) == -601) {
		arg1.aClass31_2077 = Class25.aClass31_465;
		if ((Class61.anInt1283 % 20 ^ 0xffffffff) > -11)
		    arg1.aClass31_2077
			= arg1.aClass31_2077.method646((byte) -101, 124);
		else
		    arg1.aClass31_2077
			= arg1.aClass31_2077.method646((byte) -37, 32);
	    } else {
		if (i == 620) {
		    if ((Class25.anInt479 ^ 0xffffffff) > -2)
			arg1.aClass31_2077 = Class25.aClass31_461;
		    else if (Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2809) {
			arg1.anInt2075 = 16711680;
			arg1.aClass31_2077 = Class15_Sub1.aClass31_1751;
		    } else {
			arg1.aClass31_2077
			    = Class11_Sub10_Sub4_Sub6.aClass31_2718;
			arg1.anInt2075 = 16777215;
		    }
		}
		if (i == 660) {
		    int i_4_ = (Class11_Sub10_Sub4_Sub5.anInt2688
				+ -Canvas_Sub1.anInt55);
		    Class31 class31;
		    if ((i_4_ ^ 0xffffffff) >= -1)
			class31 = Class32.aClass31_582;
		    else if ((i_4_ ^ 0xffffffff) != -2)
			class31 = (Class40.method744
				   (0, (new Class31[]
					{ Class11_Sub11.method493(i_4_,
								  (byte) -128),
					  Applet_Sub1.aClass31_35 })));
		    else
			class31 = Class11_Sub10_Sub2.aClass31_1989;
		    Class31 class31_5_ = Class25.aClass31_461;
		    if (Class25.aClass41_471 != null) {
			class31_5_
			    = Class12.method505(Class25.aClass41_471.anInt747,
						(byte) -104);
			try {
			    if (Class25.aClass41_471.anObject751 != null) {
				byte[] is = ((String)
					     Class25.aClass41_471.anObject751)
						.getBytes("ISO-8859-1");
				class31_5_ = Class11_Sub12.method500(is.length,
								     is, 0, 0);
			    }
			} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
			    /* empty */
			}
		    }
		    arg1.aClass31_2077
			= Class40.method744(0,
					    (new Class31[]
					     { Class11_Sub8.aClass31_1638,
					       class31, Class24.aClass31_441,
					       class31_5_ }));
		}
		if (i == 661) {
		    if (Class28.anInt525 == 0)
			arg1.aClass31_2077 = Class33.aClass31_614;
		    else if (Class28.anInt525
			     <= Class11_Sub10_Sub4_Sub5.anInt2688)
			arg1.aClass31_2077
			    = (Class40.method744
			       (0, (new Class31[]
				    { Class11_Sub10_Sub11.aClass31_2245,
				      Class1.method44((byte) -56,
						      Class28.anInt525) })));
		    else {
			int i_6_ = 14 + (Class11_Sub10_Sub4_Sub5.anInt2688
					 + -Class28.anInt525);
			Class31 class31;
			if (i_6_ <= 0)
			    class31 = Class32.aClass31_572;
			else if (i_6_ == 1)
			    class31 = Class11_Sub10_Sub14.aClass31_2354;
			else
			    class31
				= (Class40.method744
				   (0, (new Class31[]
					{ Class11_Sub11.method493(i_6_,
								  (byte) -127),
					  Applet_Sub1.aClass31_35 })));
			arg1.aClass31_2077
			    = (Class40.method744
			       (0, (new Class31[]
				    { class31, Class52.aClass31_1030,
				      Class1.method44((byte) -128,
						      Class28.anInt525),
				      Class57.aClass31_1189 })));
		    }
		}
		if ((i ^ 0xffffffff) == -663) {
		    Class31 class31;
		    if (Canvas_Sub1.anInt67 == 0)
			class31 = Class23.aClass31_429;
		    else if (Canvas_Sub1.anInt67 == 1)
			class31 = Class61.aClass31_1268;
		    else
			class31
			    = (Class40.method744
			       (0,
				(new Class31[]
				 { Class11_Sub10_Sub7.aClass31_2155,
				   Class11_Sub11.method493(Canvas_Sub1.anInt67,
							   (byte) -124),
				   Class11_Sub10_Sub2.aClass31_1976 })));
		    arg1.aClass31_2077
			= Class40.method744(0, (new Class31[]
						{ Class11_Sub11.aClass31_1678,
						  class31,
						  Class32.aClass31_571 }));
		}
		if (i == 663) {
		    if (Class11_Sub10_Sub4_Sub3.anInt2586 <= 0
			|| ((10 + Class11_Sub10_Sub4_Sub5.anInt2688
			     ^ 0xffffffff)
			    > (Class11_Sub10_Sub4_Sub3.anInt2586
			       ^ 0xffffffff)))
			arg1.aClass31_2077 = Class11_Sub10_Sub6.aClass31_2142;
		    else
			arg1.aClass31_2077
			    = (Class40.method744
			       (0, (new Class31[]
				    { Class17.aClass31_335,
				      Class1.method44((byte) -65,
						      (Class11_Sub10_Sub4_Sub3
						       .anInt2586)) })));
		}
		if ((i ^ 0xffffffff) == -665) {
		    if (Class11_Sub10_Sub15.anInt2392 == 0)
			arg1.aClass31_2077 = Class29.aClass31_532;
		    if ((Class11_Sub10_Sub15.anInt2392 ^ 0xffffffff) == -2)
			arg1.aClass31_2077
			    = (Class40.method744
			       (0, (new Class31[]
				    { Class11.aClass31_229,
				      Class1.method44((byte) -88,
						      Class44.anInt806) })));
		    if (Class11_Sub10_Sub15.anInt2392 == 2)
			arg1.aClass31_2077 = Class11_Sub5_Sub1.aClass31_1924;
		}
		if (i == 665) {
		    if ((Class11_Sub10_Sub4_Sub2.anInt2503 ^ 0xffffffff) < -3
			&& !Class4.aBoolean146)
			arg1.aClass31_2077 = Class43.aClass31_769;
		    else if (Class11_Sub10_Sub4_Sub2.anInt2503 <= 2) {
			if ((Class11_Sub10_Sub4_Sub2.anInt2503 ^ 0xffffffff)
			    < -1)
			    arg1.aClass31_2077
				= (Class40.method744
				   (0, (new Class31[]
					{ Class11_Sub10_Sub11.aClass31_2266,
					  (Class11_Sub11.method493
					   (Class11_Sub10_Sub4_Sub2.anInt2503,
					    (byte) -128)),
					  (Class11_Sub10_Sub4_Sub3
					   .aClass31_2583) })));
			else
			    arg1.aClass31_2077 = Class37.aClass31_693;
		    } else
			arg1.aClass31_2077
			    = Class40.method744(0,
						(new Class31[]
						 { Class57.aClass31_1201,
						   (Class11_Sub11.method493
						    ((Class11_Sub10_Sub4_Sub2
						      .anInt2503),
						     (byte) -125)),
						   Class3.aClass31_123 }));
		}
		if (i == 667) {
		    if (Class11_Sub10_Sub4_Sub2.anInt2503 <= 2
			|| Class4.aBoolean146) {
			if ((Class11_Sub10_Sub4_Sub2.anInt2503 ^ 0xffffffff)
			    < -1)
			    arg1.aClass31_2077 = Class29.aClass31_536;
			else
			    arg1.aClass31_2077
				= Class11_Sub10_Sub4_Sub1.aClass31_2482;
		    } else
			arg1.aClass31_2077 = Class37_Sub1.aClass31_1800;
		}
		if (i == 668) {
		    if ((Class11_Sub10_Sub4_Sub5.anInt2688 ^ 0xffffffff)
			> (Class28.anInt525 ^ 0xffffffff))
			arg1.aClass31_2077 = Class4.aClass31_139;
		    else
			arg1.aClass31_2077 = Class11_Sub6.aClass31_1583;
		}
	    }
	}
    }
    
    public static int method981(byte arg0) {
	try {
	    anInt1288++;
	    if (arg0 != -61)
		aClass31_1306 = null;
	    return 19;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "bd.B(" + arg0 + ')');
	}
    }
    
    public static void method982(byte arg0) {
	try {
	    anIntArrayArray1298 = null;
	    if (arg0 >= -32)
		anInt1297 = 41;
	    anIntArrayArray1299 = null;
	    aClass31_1302 = null;
	    aClass31_1304 = null;
	    aClass31_1292 = null;
	    aClass31_1293 = null;
	    aClass3_1301 = null;
	    rsaModulus = null;
	    aClass31_1303 = null;
	    aClass31_1306 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "bd.C(" + arg0 + ')');
	}
    }
    
    static {
	rsaModulus
	    = (new BigInteger
	       ("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789"));
	anIntArrayArray1299
	    = (new int[][]
	       { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433,
		   2983, 54193 },
		 { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094,
		   10153, 56621, 4783, 1341, 16578, 35003, 25239 },
		 { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430,
		   24094, 10153, 56621, 4783, 1341, 16578, 35003 },
		 { 4626, 11146, 6439, 12, 4758, 10270 },
		 { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } });
	anInt1300 = 0;
	anInt1305 = 0;
	aClass31_1304 = Class64.method992("Members object", 255);
	aClass31_1303 = aClass31_1304;
	anInt1297 = 0;
	aClass31_1306 = Class64.method992("wave2:", 255);
	aClass31_1302 = Class64.method992("backbase2", 255);
	anInt1307 = 0;
    }
}
