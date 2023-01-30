/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Class58 implements MouseListener, MouseMotionListener
{
    public static int anInt1203;
    public static int anInt1204;
    public static int anInt1205;
    public static int anInt1206;
    public static int anInt1207;
    public static int anInt1208;
    public static int anInt1209;
    public static int anInt1210;
    public static int anInt1211;
    public static int anInt1212;
    public static int anInt1213;
    public static Class40 aClass40_1214 = new Class40(64);
    public static int anInt1215;
    public static int anInt1216;
    public static int anInt1217;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_1218;
    public static int anInt1219;
    public static int anInt1220;
    public static Class55 aClass55_1221;
    public static int anInt1222;
    public static Class31 aClass31_1223;
    public static Class31 aClass31_1224 = Class64.method992("On", 255);
    public static int anInt1225;
    public static int anInt1226;
    public static int[] anIntArray1227;
    public static Class11_Sub10_Sub13_Sub2 aClass11_Sub10_Sub13_Sub2_1228;
    public static volatile int anInt1229;
    public static int anInt1230;
    
    public synchronized void mouseMoved(MouseEvent arg0) {
	try {
	    if (Class42.aClass58_762 != null) {
		Class11_Sub10_Sub4_Sub3.anInt2591 = 0;
		Class55.anInt1129 = arg0.getX();
		Class28.anInt524 = arg0.getY();
	    }
	    anInt1216++;
	} catch (RuntimeException runtimeexception) {
	    throw method939(runtimeexception,
			    ("vd.mouseMoved("
			     + (arg0 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public synchronized void mouseEntered(MouseEvent arg0) {
	anInt1208++;
	if (Class42.aClass58_762 != null) {
	    Class11_Sub10_Sub4_Sub3.anInt2591 = 0;
	    Class55.anInt1129 = arg0.getX();
	    Class28.anInt524 = arg0.getY();
	}
    }
    
    public static Class11_Sub10_Sub13_Sub4 method938
	(Class31 arg0, Class31 arg1, int arg2, Class55 arg3) {
	try {
	    anInt1203++;
	    int i = arg3.hashFileName((byte) -18, arg0);
	    int i_0_ = arg3.method891(false, arg1, i);
	    if (arg2 > -47)
		return null;
	    return Class14.method522((byte) -127, arg3, i, i_0_);
	} catch (RuntimeException runtimeexception) {
	    throw method939(runtimeexception,
			    ("vd.B(" + (arg0 != null ? "{...}" : "null") + ','
			     + (arg1 != null ? "{...}" : "null") + ',' + arg2
			     + ',' + (arg3 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static RuntimeException_Sub1 method939(Throwable arg0,
						  String arg1) {
	try {
	    anInt1205++;
	    RuntimeException_Sub1 runtimeexception_sub1;
	    if (!(arg0 instanceof RuntimeException_Sub1))
		runtimeexception_sub1 = new RuntimeException_Sub1(arg0, arg1);
	    else {
		runtimeexception_sub1 = (RuntimeException_Sub1) arg0;
		runtimeexception_sub1.aString1353 += ' ' + (String) arg1;
	    }
	    return runtimeexception_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public synchronized void mouseExited(MouseEvent arg0) {
	anInt1212++;
	if (Class42.aClass58_762 != null) {
	    Class11_Sub10_Sub4_Sub3.anInt2591 = 0;
	    Class55.anInt1129 = -1;
	    Class28.anInt524 = -1;
	}
    }
    
    public synchronized void mouseReleased(MouseEvent arg0) {
	try {
	    if (Class42.aClass58_762 != null) {
		Class11_Sub10_Sub4_Sub3.anInt2591 = 0;
		Class14.anInt274 = 0;
	    }
	    if (arg0.isPopupTrigger())
		arg0.consume();
	    anInt1217++;
	} catch (RuntimeException runtimeexception) {
	    throw method939(runtimeexception,
			    ("vd.mouseReleased("
			     + (arg0 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method940(int arg0, Class11_Sub10_Sub13_Sub4 arg1,
				 int arg2, int arg3) {
	anInt1210++;
	int i = arg2 * arg2 + arg3 * arg3;
	if ((i ^ 0xffffffff) >= -4226 || i >= 90000)
	    Class50.method844(arg3, -21346, arg1, arg2);
	else {
	    int i_1_ = 0x7ff & Class46.anInt855 + Class29.anInt535;
	    int i_2_ = Class11_Sub10_Sub4_Sub4.anIntArray2632[i_1_];
	    i_2_ = 256 * i_2_ / (Class15_Sub1.anInt1737 + 256);
	    int i_3_ = Class11_Sub10_Sub4_Sub4.anIntArray2654[i_1_];
	    i_3_ = i_3_ * 256 / (256 + Class15_Sub1.anInt1737);
	    int i_4_ = i_2_ * arg2 - -(arg3 * i_3_) >> -751273168;
	    int i_5_ = -(arg3 * i_2_) + i_3_ * arg2 >> -2114985776;
	    double d = Math.atan2((double) i_4_, (double) i_5_);
	    int i_6_ = (int) (Math.sin(d) * 63.0);
	    int i_7_ = (int) (57.0 * Math.cos(d));
	    Class59.aClass11_Sub10_Sub13_Sub4_1241.method455((94 - -i_6_ - -4
							      + -10),
							     -20 + (83
								    + -i_7_),
							     20, 20, 15, 15, d,
							     256);
	}
	if (arg0 != 256)
	    method938(null, null, -55, null);
    }
    
    public static void method941(byte arg0) {
	anInt1204++;
	if (Class15.anInt312 == 0) {
	    Class52.aClass49_1024
		= new Class49(4, 104, 104, Class51.anIntArrayArrayArray1005);
	    for (int i = 0; i < 4; i++)
		Class39.aClass8Array707[i] = new Class8(104, 104);
	    Class52.aClass11_Sub10_Sub13_Sub4_1029
		= new Class11_Sub10_Sub13_Sub4(512, 512);
	    Class54.aClass31_1085 = Class25.aClass31_462;
	    Class15.anInt312 = 20;
	    Class53.anInt1055 = 5;
	} else if ((Class15.anInt312 ^ 0xffffffff) == -21) {
	    int[] is = new int[9];
	    for (int i = 0; i < 9; i++) {
		int i_8_ = 32 * i + 143;
		int i_9_ = Class11_Sub10_Sub13_Sub1.anIntArray2725[i_8_];
		int i_10_ = i_8_ * 3 + 600;
		is[i] = i_10_ * i_9_ >> 247338928;
	    }
	    Class49.method805(is, 500, 800, 512, 334);
	    Class15.anInt312 = 25;
	    Class54.aClass31_1085 = Class61.aClass31_1274;
	    Class53.anInt1055 = 10;
	} else {
	    try {
		if (Class15.anInt312 == 25) {
		    if (Class62.aClass3_1301 == null
			|| Class28.aClass3_521 == null
			|| (Class28.aClass3_521.method56(102)
			    ^ 0xffffffffffffffffL) <= -60001L) {
			Class53.anInt1055 = 15;
			Class15.anInt312 = 30;
			Class54.aClass31_1085 = Class7.aClass31_1440;
		    } else {
			Class11_Sub6.aClass64Array1578 = new Class64[5];
			for (int i = 0; (i ^ 0xffffffff) > -6; i++)
			    Class11_Sub6.aClass64Array1578[i]
				= new Class64(1 + i, Class62.aClass3_1301,
					      Class11_Sub7.aClass3Array1609[i],
					      500000);
			Class4.aClass64Array145 = new Class64[12];
			for (int i = 0; (i ^ 0xffffffff) > -13; i++)
			    Class4.aClass64Array145[i]
				= new Class64(i, Class28.aClass3_521,
					      Class12.aClass3Array245[i],
					      500000);
			Class11_Sub10_Sub7.anInt2164 = 0;
			Class54.aClass31_1085 = Buffer.aClass31_1562;
			Class53.anInt1055 = 15;
			Class15.anInt312 = 26;
			return;
		    }
		    return;
		}
		if (Class15.anInt312 == 26) {
		    while ((Class11_Sub10_Sub7.anInt2164 ^ 0xffffffff)
			   > -65536) {
			Class8.method98(Class11_Sub6.aClass64Array1578[1],
					Class4.aClass64Array145[7], (byte) -28,
					Class11_Sub10_Sub7.anInt2164++);
			if ((0xff & Class11_Sub10_Sub7.anInt2164 ^ 0xffffffff)
			    == -1) {
			    Class54.aClass31_1085
				= (Class40.method744
				   (0, (new Class31[]
					{ Class11_Sub5_Sub1.aClass31_1917,
					  (Class11_Sub11.method493
					   ((100 * Class11_Sub10_Sub7.anInt2164
					     / 65536),
					    (byte) -124)),
					  Class22.aClass31_411 })));
			    Class53.anInt1055 = 15;
			    return;
			}
		    }
		    Class53.anInt1055 = 15;
		    Class15.anInt312 = 27;
		    Class11_Sub10_Sub7.anInt2164 = 0;
		    Class54.aClass31_1085 = Class7.aClass31_1437;
		    return;
		}
		if ((Class15.anInt312 ^ 0xffffffff) == -28) {
		    while (Class11_Sub10_Sub7.anInt2164 < 65535) {
			Class8.method98(Class11_Sub6.aClass64Array1578[3],
					Class4.aClass64Array145[6], (byte) -43,
					Class11_Sub10_Sub7.anInt2164++);
			if ((Class11_Sub10_Sub7.anInt2164 & 0xff) == 0) {
			    Class54.aClass31_1085
				= Class40.method744(0,
						    (new Class31[]
						     { Class48.aClass31_903,
						       (Class11_Sub11.method493
							((100
							  * (Class11_Sub10_Sub7
							     .anInt2164)
							  / 65536),
							 (byte) -124)),
						       (Class22
							.aClass31_411) }));
			    Class53.anInt1055 = 15;
			    return;
			}
		    }
		    Class54.aClass31_1085 = Class31.aClass31_1376;
		    Class53.anInt1055 = 15;
		    Class15.anInt312 = 28;
		    Class11_Sub10_Sub7.anInt2164 = 0;
		    return;
		}
		if ((Class15.anInt312 ^ 0xffffffff) == -29) {
		    while (Class11_Sub10_Sub7.anInt2164 < 65535) {
			Class8.method98(Class11_Sub6.aClass64Array1578[4],
					Class4.aClass64Array145[5], (byte) -79,
					Class11_Sub10_Sub7.anInt2164++);
			if ((Class11_Sub10_Sub7.anInt2164 & 0xff) == 0) {
			    Class54.aClass31_1085
				= Class40.method744(0,
						    (new Class31[]
						     { Class47.aClass31_868,
						       (Class11_Sub11.method493
							(((Class11_Sub10_Sub7
							   .anInt2164)
							  * 100 / 65536),
							 (byte) -124)),
						       (Class22
							.aClass31_411) }));
			    Class53.anInt1055 = 15;
			    return;
			}
		    }
		    Class15.anInt312 = 30;
		    Class54.aClass31_1085 = Applet_Sub1.aClass31_21;
		    Class53.anInt1055 = 15;
		    return;
		}
	    } catch (Exception exception) {
		if ((Class15.anInt312 ^ 0xffffffff) > -31)
		    Class15.anInt312 = 30;
	    }
	    if ((Class15.anInt312 ^ 0xffffffff) == -31) {
		Class15.aClass55_Sub1_307
		    = Class31.method642(false, 0, (byte) 99, true, true);
		Class11_Sub10_Sub6.aClass55_Sub1_2135
		    = Class31.method642(false, 1, (byte) 99, true, true);
		Class11_Sub10_Sub1.aClass55_Sub1_1939
		    = Class31.method642(true, 2, (byte) 99, true, false);
		Class8.aClass55_Sub1_166
		    = Class31.method642(false, 3, (byte) 99, true, true);
		Class11_Sub8.aClass55_Sub1_1623
		    = Class31.method642(false, 4, (byte) 99, true, true);
		Class13.mapsArchive
		    = Class31.method642(true, 5, (byte) 99, true, true);
		Class47.aClass55_Sub1_876
		    = Class31.method642(true, 6, (byte) 99, false, true);
		Class11_Sub10_Sub12.aClass55_Sub1_2270
		    = Class31.method642(false, 7, (byte) 99, true, true);
		Class43.aClass55_Sub1_780
		    = Class31.method642(false, 8, (byte) 99, true, true);
		Class11_Sub8.aClass55_Sub1_1620
		    = Class31.method642(false, 9, (byte) 99, true, true);
		Class42.aClass55_Sub1_766
		    = Class31.method642(false, 10, (byte) 99, true, true);
		Class33.aClass55_Sub1_618
		    = Class31.method642(false, 11, (byte) 99, true, true);
		Class54.aClass31_1085 = Class11_Sub10_Sub7.aClass31_2168;
		Class53.anInt1055 = 20;
		Class15.anInt312 = 40;
	    } else if ((Class15.anInt312 ^ 0xffffffff) == -41) {
		int i = 0;
		i += Class15.aClass55_Sub1_307.method908((byte) 107) * 5 / 100;
		i += Class11_Sub10_Sub6.aClass55_Sub1_2135
			 .method908((byte) 117) * 5 / 100;
		i += Class11_Sub10_Sub1.aClass55_Sub1_1939
			 .method908((byte) 87) * 5 / 100;
		i += Class8.aClass55_Sub1_166.method908((byte) 62) * 5 / 100;
		i += (Class11_Sub8.aClass55_Sub1_1623.method908((byte) 96) * 5
		      / 100);
		i += 5 * Class13.mapsArchive.method908((byte) 127) / 100;
		i += 5 * Class47.aClass55_Sub1_876.method908((byte) 68) / 100;
		i += 45 * Class11_Sub10_Sub12.aClass55_Sub1_2270
			      .method908((byte) 41) / 100;
		i += Class43.aClass55_Sub1_780.method908((byte) 54) * 5 / 100;
		i += (5 * Class11_Sub8.aClass55_Sub1_1620.method908((byte) 125)
		      / 100);
		i += 5 * Class42.aClass55_Sub1_766.method908((byte) 83) / 100;
		i += 5 * Class33.aClass55_Sub1_618.method908((byte) 120) / 100;
		if ((i ^ 0xffffffff) != -101) {
		    if (i != 0)
			Class54.aClass31_1085
			    = (Class40.method744
			       (0, (new Class31[]
				    { Class42.aClass31_764,
				      Class11_Sub11.method493(i, (byte) -125),
				      Class22.aClass31_411 })));
		    Class53.anInt1055 = 30;
		} else {
		    Class53.anInt1055 = 30;
		    Class15.anInt312 = 45;
		    Class54.aClass31_1085
			= Class11_Sub10_Sub4_Sub5.aClass31_2661;
		}
	    } else if ((Class15.anInt312 ^ 0xffffffff) == -46) {
		Class11_Sub10_Sub6.method346(true, 0, Class55.aClass45_1141,
					     !Class1.aBoolean94);
		Class48.aClass11_Sub2_Sub2_912
		    = Class11_Sub10_Sub15.method480(false,
						    Class55.aClass45_1141,
						    Class34.method672(-94));
		Class63.aClass50_1320
		    = new Class50(22050, Class11_Sub10_Sub9.anInt2203);
		Class53.anInt1055 = 35;
		Class15.anInt312 = 50;
		Class54.aClass31_1085 = Class52.aClass31_1035;
	    } else if ((Class15.anInt312 ^ 0xffffffff) == -51) {
		int i = 0;
		if (Class37.aClass11_Sub10_Sub13_Sub2_699 != null)
		    i++;
		else
		    Class37.aClass11_Sub10_Sub13_Sub2_699
			= (Class11_Sub10_Sub4_Sub1.method262
			   (Class43.aClass55_Sub1_780, Class25.aClass31_461,
			    Class37_Sub1.aClass31_1799, true));
		if (aClass11_Sub10_Sub13_Sub2_1228 == null)
		    aClass11_Sub10_Sub13_Sub2_1228
			= (Class11_Sub10_Sub4_Sub1.method262
			   (Class43.aClass55_Sub1_780, Class25.aClass31_461,
			    Class60.aClass31_1247, true));
		else
		    i++;
		if (RuntimeException_Sub1.aClass11_Sub10_Sub13_Sub2_1357
		    != null)
		    i++;
		else
		    RuntimeException_Sub1.aClass11_Sub10_Sub13_Sub2_1357
			= (Class11_Sub10_Sub4_Sub1.method262
			   (Class43.aClass55_Sub1_780, Class25.aClass31_461,
			    Class63.aClass31_1313, true));
		if (Class11_Sub10_Sub2.aClass11_Sub10_Sub13_Sub2_1959 != null)
		    i++;
		else
		    Class11_Sub10_Sub2.aClass11_Sub10_Sub13_Sub2_1959
			= (Class11_Sub10_Sub4_Sub1.method262
			   (Class43.aClass55_Sub1_780, Class25.aClass31_461,
			    Class39.aClass31_709, true));
		if (i < 4) {
		    Class54.aClass31_1085
			= (Class40.method744
			   (0, (new Class31[]
				{ Class11_Sub10_Sub1.aClass31_1948,
				  Class11_Sub11.method493(100 * i / 4,
							  (byte) -126),
				  Class22.aClass31_411 })));
		    Class53.anInt1055 = 40;
		} else {
		    Class15.anInt312 = 60;
		    Class53.anInt1055 = 40;
		    Class11_Sub10_Sub4.aClass11_Sub10_Sub13_Sub2Array2034
			= (new Class11_Sub10_Sub13_Sub2[]
			   { Class37.aClass11_Sub10_Sub13_Sub2_699,
			     aClass11_Sub10_Sub13_Sub2_1228,
			     (RuntimeException_Sub1
			      .aClass11_Sub10_Sub13_Sub2_1357),
			     (Class11_Sub10_Sub2
			      .aClass11_Sub10_Sub13_Sub2_1959) });
		    Class54.aClass31_1085 = Class11_Sub10_Sub8.aClass31_2189;
		}
	    } else if (Class15.anInt312 == 60) {
		int i = Class57.method936(0, Class43.aClass55_Sub1_780,
					  Class42.aClass55_Sub1_766);
		int i_11_ = Class11_Sub10_Sub1.method233(31);
		if (i < i_11_) {
		    Class54.aClass31_1085
			= (Class40.method744
			   (0, (new Class31[]
				{ Class24.aClass31_457,
				  Class11_Sub11.method493(i * 100 / i_11_,
							  (byte) -128),
				  Class22.aClass31_411 })));
		    Class53.anInt1055 = 50;
		} else {
		    Class54.aClass31_1085 = Class32.aClass31_586;
		    Class53.anInt1055 = 50;
		    Class34.method674(5, false);
		    Class15.anInt312 = 70;
		}
	    } else if (Class15.anInt312 == 70) {
		if (!Class11_Sub10_Sub1.aClass55_Sub1_1939.method897(true)) {
		    Class54.aClass31_1085
			= Class40.method744(0, (new Class31[]
						{ Class37.aClass31_701,
						  (Class11_Sub11.method493
						   (Class11_Sub10_Sub1
							.aClass55_Sub1_1939
							.method906((byte) 126),
						    (byte) -124)),
						  Class22.aClass31_411 }));
		    Class53.anInt1055 = 60;
		} else {
		    Class55.method894(arg0 + 27552,
				      Class11_Sub10_Sub1.aClass55_Sub1_1939);
		    Class11_Sub10_Sub1.method230((Class11_Sub10_Sub1
						  .aClass55_Sub1_1939),
						 (byte) -70);
		    Class11_Sub6.method205((Class11_Sub10_Sub12
					    .aClass55_Sub1_2270),
					   3,
					   (Class11_Sub10_Sub1
					    .aClass55_Sub1_1939));
		    Class11_Sub10_Sub4_Sub6.method328(true, Class1.aBoolean94,
						      (Class11_Sub10_Sub12
						       .aClass55_Sub1_2270),
						      (Class11_Sub10_Sub1
						       .aClass55_Sub1_1939));
		    method945(Class11_Sub10_Sub1.aClass55_Sub1_1939,
			      (byte) -94,
			      Class11_Sub10_Sub12.aClass55_Sub1_2270);
		    Class11_Sub5_Sub1.method201((Class11_Sub10_Sub12
						 .aClass55_Sub1_2270),
						(Class11_Sub10_Sub1
						 .aClass55_Sub1_1939),
						(byte) -123,
						Class4.aBoolean146);
		    Class11_Sub10_Sub4_Sub2_Sub2.method283
			(Class11_Sub10_Sub6.aClass55_Sub1_2135, arg0 + 15,
			 Class15.aClass55_Sub1_307,
			 Class11_Sub10_Sub1.aClass55_Sub1_1939);
		    Class40.method739(Class11_Sub10_Sub1.aClass55_Sub1_1939,
				      Class11_Sub10_Sub12.aClass55_Sub1_2270,
				      -24414);
		    client.method33(Class11_Sub10_Sub1.aClass55_Sub1_1939, 4);
		    Class37_Sub1.method713((Class11_Sub10_Sub1
					    .aClass55_Sub1_1939),
					   false);
		    Class51.method854(Class43.aClass55_Sub1_780,
				      Class8.aClass55_Sub1_166, (byte) -127,
				      Class11_Sub10_Sub12.aClass55_Sub1_2270);
		    Class54.aClass31_1085 = Class11_Sub10_Sub5.aClass31_2100;
		    Class15.anInt312 = 80;
		    Class53.anInt1055 = 60;
		}
	    } else if ((Class15.anInt312 ^ 0xffffffff) == -81) {
		int i = 0;
		if (Class64.aClass11_Sub10_Sub13_Sub4_1348 != null)
		    i++;
		else
		    Class64.aClass11_Sub10_Sub13_Sub4_1348
			= method938(Class11_Sub10_Sub16.aClass31_2438,
				    Class25.aClass31_461, -72,
				    Class43.aClass55_Sub1_780);
		if (Class59.aClass11_Sub10_Sub13_Sub4_1241 == null)
		    Class59.aClass11_Sub10_Sub13_Sub4_1241
			= method938(Class11_Sub10_Sub4_Sub6.aClass31_2719,
				    Class25.aClass31_461, -88,
				    Class43.aClass55_Sub1_780);
		else
		    i++;
		if (Class11_Sub10_Sub4_Sub2.aClass11_Sub10_Sub13_Sub3Array2572
		    != null)
		    i++;
		else
		    Class11_Sub10_Sub4_Sub2.aClass11_Sub10_Sub13_Sub3Array2572
			= Class55_Sub1.method904(Class43.aClass55_Sub1_780,
						 Class32.aClass31_596,
						 (byte) -58,
						 Class25.aClass31_461);
		if (Class55.aClass11_Sub10_Sub13_Sub4Array1140 == null)
		    Class55.aClass11_Sub10_Sub13_Sub4Array1140
			= Class13.method510(0, Class43.aClass55_Sub1_780,
					    (Class11_Sub10_Sub4_Sub2_Sub2
					     .aClass31_2835),
					    Class25.aClass31_461);
		else
		    i++;
		if (Class9.aClass11_Sub10_Sub13_Sub4Array202 == null)
		    Class9.aClass11_Sub10_Sub13_Sub4Array202
			= Class13.method510(0, Class43.aClass55_Sub1_780,
					    Class55.aClass31_1119,
					    Class25.aClass31_461);
		else
		    i++;
		if (Class11_Sub10_Sub3.aClass11_Sub10_Sub13_Sub4Array2027
		    == null)
		    Class11_Sub10_Sub3.aClass11_Sub10_Sub13_Sub4Array2027
			= Class13.method510(0, Class43.aClass55_Sub1_780,
					    Class48.aClass31_916,
					    Class25.aClass31_461);
		else
		    i++;
		if (Class11_Sub10_Sub4_Sub3.aClass11_Sub10_Sub13_Sub4Array2584
		    == null)
		    Class11_Sub10_Sub4_Sub3.aClass11_Sub10_Sub13_Sub4Array2584
			= Class13.method510(0, Class43.aClass55_Sub1_780,
					    Class24.aClass31_456,
					    Class25.aClass31_461);
		else
		    i++;
		if (Class57.aClass11_Sub10_Sub13_Sub4Array1161 == null)
		    Class57.aClass11_Sub10_Sub13_Sub4Array1161
			= Class13.method510(0, Class43.aClass55_Sub1_780,
					    Class11_Sub4.aClass31_1495,
					    Class25.aClass31_461);
		else
		    i++;
		if (Class15.aClass11_Sub10_Sub13_Sub4_315 != null)
		    i++;
		else
		    Class15.aClass11_Sub10_Sub13_Sub4_315
			= method938(Class55.aClass31_1113,
				    Class25.aClass31_461, -72,
				    Class43.aClass55_Sub1_780);
		if (Class64.aClass11_Sub10_Sub13_Sub4Array1342 == null)
		    Class64.aClass11_Sub10_Sub13_Sub4Array1342
			= Class13.method510(0, Class43.aClass55_Sub1_780,
					    Applet_Sub1.aClass31_2,
					    Class25.aClass31_461);
		else
		    i++;
		if ((Class11_Sub10_Sub4_Sub2_Sub1
		     .aClass11_Sub10_Sub13_Sub4Array2804)
		    == null)
		    Class11_Sub10_Sub4_Sub2_Sub1
			.aClass11_Sub10_Sub13_Sub4Array2804
			= Class13.method510(0, Class43.aClass55_Sub1_780,
					    Class11_Sub10_Sub3.aClass31_2021,
					    Class25.aClass31_461);
		else
		    i++;
		if (Class10.aClass11_Sub10_Sub13_Sub4Array209 == null)
		    Class10.aClass11_Sub10_Sub13_Sub4Array209
			= Class13.method510(0, Class43.aClass55_Sub1_780,
					    Class60.aClass31_1253,
					    Class25.aClass31_461);
		else
		    i++;
		if (Class52.aClass11_Sub10_Sub13_Sub3Array1034 != null)
		    i++;
		else
		    Class52.aClass11_Sub10_Sub13_Sub3Array1034
			= Class55_Sub1.method904(Class43.aClass55_Sub1_780,
						 (Class11_Sub10_Sub4_Sub6
						  .aClass31_2703),
						 (byte) -58,
						 Class25.aClass31_461);
		if (Class11_Sub12.aClass11_Sub10_Sub13_Sub3Array1705 == null)
		    Class11_Sub12.aClass11_Sub10_Sub13_Sub3Array1705
			= Class55_Sub1.method904(Class43.aClass55_Sub1_780,
						 Class10.aClass31_208,
						 (byte) -58,
						 Class25.aClass31_461);
		else
		    i++;
		if ((i ^ 0xffffffff) > -15) {
		    Class54.aClass31_1085
			= (Class40.method744
			   (0, (new Class31[]
				{ Class15_Sub1.aClass31_1752,
				  Class11_Sub11.method493(100 * i / 14,
							  (byte) -126),
				  Class22.aClass31_411 })));
		    Class53.anInt1055 = 70;
		} else {
		    Class59.aClass11_Sub10_Sub13_Sub4_1241.method452();
		    int i_12_ = -10 + (int) (Math.random() * 21.0);
		    int i_13_ = (int) (21.0 * Math.random()) - 10;
		    int i_14_ = (int) (Math.random() * 41.0) + -20;
		    int i_15_ = -10 + (int) (21.0 * Math.random());
		    for (int i_16_ = 0;
			 (Class55.aClass11_Sub10_Sub13_Sub4Array1140.length
			  > i_16_);
			 i_16_++)
			Class55.aClass11_Sub10_Sub13_Sub4Array1140[i_16_]
			    .method453
			    (i_12_ + i_14_, i_13_ + i_14_, i_14_ + i_15_);
		    Class11_Sub10_Sub4_Sub2
			.aClass11_Sub10_Sub13_Sub3Array2572[0].method444
			(i_14_ + i_12_, i_13_ + i_14_, i_15_ - -i_14_);
		    Class54.aClass31_1085 = Class11_Sub10_Sub5.aClass31_2072;
		    Class15.anInt312 = 85;
		    Class53.anInt1055 = 70;
		}
	    } else if ((Class15.anInt312 ^ 0xffffffff) == -86) {
		int i = Class4.method62(Class43.aClass55_Sub1_780, (byte) -79);
		int i_17_ = Class62.method981((byte) -61);
		if (i_17_ > i) {
		    Class54.aClass31_1085
			= (Class40.method744
			   (0, (new Class31[]
				{ Class63.aClass31_1309,
				  Class11_Sub11.method493(i * 100 / i_17_,
							  (byte) -128),
				  Class22.aClass31_411 })));
		    Class53.anInt1055 = 80;
		} else {
		    Class53.anInt1055 = 80;
		    Class15.anInt312 = 90;
		    Class54.aClass31_1085 = Class3.aClass31_107;
		}
	    } else if ((Class15.anInt312 ^ 0xffffffff) == -91) {
		if (!Class11_Sub8.aClass55_Sub1_1620.method897(true)) {
		    Class54.aClass31_1085
			= Class40.method744(0, (new Class31[]
						{ Class36.aClass31_659,
						  (Class11_Sub11.method493
						   (Class11_Sub8
							.aClass55_Sub1_1620
							.method906((byte) 82),
						    (byte) -124)),
						  Class22.aClass31_411 }));
		    Class53.anInt1055 = 90;
		} else {
		    Class7 class7
			= new Class7(Class11_Sub8.aClass55_Sub1_1620,
				     Class43.aClass55_Sub1_780, 20, 0.8,
				     Class1.aBoolean94 ? 64 : 128);
		    Class11_Sub10_Sub13_Sub1.method415(class7);
		    Class11_Sub10_Sub13_Sub1.method410(0.8);
		    Class53.anInt1055 = 90;
		    Class15.anInt312 = 110;
		    Class54.aClass31_1085 = Class32.aClass31_574;
		}
	    } else if (Class15.anInt312 == 110) {
		Class11_Sub10_Sub3.aClass46_2020 = new Class46();
		Class55.aClass45_1141.method778(10,
						(Class11_Sub10_Sub3
						 .aClass46_2020),
						(byte) 31);
		Class53.anInt1055 = 94;
		Class15.anInt312 = 120;
		Class54.aClass31_1085 = Buffer.aClass31_1563;
	    } else if ((Class15.anInt312 ^ 0xffffffff) == -121) {
		if (!Class42.aClass55_Sub1_766.method892(Class25.aClass31_461,
							 0,
							 (Class39_Sub1
							  .aClass31_1818))) {
		    Class53.anInt1055 = 96;
		    Class54.aClass31_1085 = Class11_Sub10_Sub11.aClass31_2253;
		} else {
		    Class33 class33
			= new Class33(Class42.aClass55_Sub1_766.method888
				      (Class39_Sub1.aClass31_1818, (byte) 112,
				       Class25.aClass31_461));
		    Class11_Sub10_Sub6.method343(class33, -123);
		    Class15.anInt312 = 130;
		    Class54.aClass31_1085 = Class11_Sub10_Sub5.aClass31_2111;
		    Class53.anInt1055 = 96;
		}
	    } else if (Class15.anInt312 == 130) {
		if (!Class8.aClass55_Sub1_166.method897(true)) {
		    Class54.aClass31_1085
			= Class40.method744(0, (new Class31[]
						{ Class37_Sub1.aClass31_1797,
						  (Class11_Sub11.method493
						   (Class8
							.aClass55_Sub1_166
							.method906((byte) 86),
						    (byte) -128)),
						  Class22.aClass31_411 }));
		    Class53.anInt1055 = 100;
		} else {
		    Class53.anInt1055 = 100;
		    Class15.anInt312 = 140;
		    Class54.aClass31_1085 = Class32.aClass31_591;
		}
	    } else if ((Class15.anInt312 ^ 0xffffffff) == -141)
		Class34.method674(10, false);
	    else if (arg0 != -15)
		aClass40_1214 = null;
	}
    }
    
    public synchronized void mouseDragged(MouseEvent arg0) {
	try {
	    if (Class42.aClass58_762 != null) {
		Class11_Sub10_Sub4_Sub3.anInt2591 = 0;
		Class55.anInt1129 = arg0.getX();
		Class28.anInt524 = arg0.getY();
	    }
	    anInt1219++;
	} catch (RuntimeException runtimeexception) {
	    throw method939(runtimeexception,
			    ("vd.mouseDragged("
			     + (arg0 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method942(int arg0, int arg1) {
	try {
	    anInt1207++;
	    if (Class61.method968(arg0, -20142)) {
		if (arg1 >= -18)
		    method944(1, -61, -60, 107, -100, 41, 47);
		Class11_Sub10_Sub5[] class11_sub10_sub5s
		    = Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[arg0];
		for (int i = 0; class11_sub10_sub5s.length > i; i++) {
		    Class11_Sub10_Sub5 class11_sub10_sub5
			= class11_sub10_sub5s[i];
		    if (class11_sub10_sub5 != null) {
			class11_sub10_sub5.anInt2088 = 0;
			class11_sub10_sub5.anInt2048 = 0;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw method939(runtimeexception,
			    "vd.G(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method943(int arg0, int arg1,
				 Class11_Sub10_Sub4_Sub2 arg2) {
	try {
	    anInt1209++;
	    if (arg1 >= 31)
		Class59.method948(arg0, arg2.anInt2506, arg2.anInt2517, -1);
	} catch (RuntimeException runtimeexception) {
	    throw method939(runtimeexception,
			    ("vd.A(" + arg0 + ',' + arg1 + ','
			     + (arg2 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public synchronized void mousePressed(MouseEvent arg0) {
	if (Class42.aClass58_762 != null) {
	    Class11_Sub10_Sub4_Sub3.anInt2591 = 0;
	    Canvas_Sub1.anInt66 = arg0.getX();
	    anInt1229 = arg0.getY();
	    Class11_Sub10.aLong1663 = System.currentTimeMillis();
	    if (arg0.isMetaDown()) {
		Class60.anInt1249 = 2;
		Class14.anInt274 = 2;
	    } else {
		Class60.anInt1249 = 1;
		Class14.anInt274 = 1;
	    }
	}
	anInt1213++;
	if (arg0.isPopupTrigger())
	    arg0.consume();
    }
    
    public static int method944(int arg0, int arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6) {
	try {
	    if ((0x1 & arg6 ^ 0xffffffff) == -2) {
		int i = arg5;
		arg5 = arg1;
		arg1 = i;
	    }
	    arg3 &= 0x3;
	    anInt1220++;
	    if ((arg3 ^ 0xffffffff) == -1)
		return arg0;
	    if ((arg3 ^ 0xffffffff) == -2)
		return arg2;
	    if ((arg3 ^ 0xffffffff) == -3)
		return -arg5 - (-8 - -arg0);
	    if (arg4 != -2091)
		method942(-50, 0);
	    return 7 + -arg2 + (1 + -arg1);
	} catch (RuntimeException runtimeexception) {
	    throw method939(runtimeexception,
			    ("vd.D(" + arg0 + ',' + arg1 + ',' + arg2 + ','
			     + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6
			     + ')'));
	}
    }
    
    public static void method945(Class55 arg0, byte arg1, Class55 arg2) {
	try {
	    anInt1206++;
	    if (arg1 != -94)
		aClass55_1221 = null;
	    aClass55_1221 = arg2;
	    Class11_Sub7.aClass55_1605 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw method939(runtimeexception,
			    ("vd.F(" + (arg0 != null ? "{...}" : "null") + ','
			     + arg1 + ',' + (arg2 != null ? "{...}" : "null")
			     + ')'));
	}
    }
    
    public void mouseClicked(MouseEvent arg0) {
	anInt1211++;
	if (arg0.isPopupTrigger())
	    arg0.consume();
    }
    
    public static void method946(byte arg0) {
	try {
	    aClass40_1214 = null;
	    aClass11_Sub10_Sub13_Sub2_1228 = null;
	    aClass31_1223 = null;
	    aClass31_1224 = null;
	    aClass11_Sub10_Sub13_Sub3_1218 = null;
	    aClass55_1221 = null;
	    if (arg0 > -43)
		anInt1229 = 111;
	    anIntArray1227 = null;
	} catch (RuntimeException runtimeexception) {
	    throw method939(runtimeexception, "vd.H(" + arg0 + ')');
	}
    }
    
    static {
	anInt1222 = 0;
	anInt1225 = -1;
	aClass31_1223 = Class64.method992("Connection lost", 255);
	anInt1229 = 0;
    }
}
