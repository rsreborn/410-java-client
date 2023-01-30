/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet
    implements Runnable, FocusListener
{
    public static int anInt1;
    public static Class31 aClass31_2;
    public static int anInt3;
    public static int anInt4;
    public static int anInt5;
    public static Class31 aClass31_6 = Class64.method992("(U3", 255);
    public static int anInt7;
    public static int anInt8;
    public static int anInt9;
    public static Class31 aClass31_10
	= Class64.method992("Existing User", 255);
    public static int anInt11;
    public static int anInt12;
    public static int anInt13;
    public static int anInt14;
    public static int anInt15;
    public static int anInt16;
    public static int anInt17;
    public static int anInt18;
    public static Class31 aClass31_19;
    public static int anInt20;
    public static Class31 aClass31_21;
    public static Class31 aClass31_22 = Class64.method992("Friends", 255);
    public static int anInt23;
    public static int anInt24;
    public static Class55 aClass55_25;
    public static Class55 aClass55_26;
    public static Class37 aClass37_27;
    public static int anInt28;
    public static int anInt29;
    public static int anInt30;
    public static int anInt31;
    public static int anInt32;
    public static int anInt33;
    public static int anInt34;
    public static Class31 aClass31_35;
    public static int anInt36;
    public static Class31 aClass31_37;
    public static int anInt38;
    public static boolean aBoolean39;
    
    public AppletContext getAppletContext() {
	try {
	    anInt14++;
	    if (Class60.aCanvas_Sub1_1260 != null)
		return null;
	    if (Class55.aClass45_1141 != null
		&& this != Class55.aClass45_1141.anApplet836)
		return Class55.aClass45_1141.anApplet836.getAppletContext();
	    return super.getAppletContext();
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "nb.getAppletContext(" + ')');
	}
    }
    
    public synchronized void method16(int arg0) {
	try {
	    anInt4++;
	    if (arg0 != -14367)
		aClass55_25 = null;
	    if (!Class11_Sub10_Sub4_Sub3.aBoolean2587) {
		Class11_Sub10_Sub4_Sub3.aBoolean2587 = true;
		try {
		    Class34.method672(-125).removeFocusListener(this);
		} catch (Exception exception) {
		    /* empty */
		}
		try {
		    method27((byte) -81);
		} catch (Exception exception) {
		    /* empty */
		}
		if (Class60.aCanvas_Sub1_1260 != null) {
		    try {
			System.exit(0);
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
		if (Class55.aClass45_1141 != null) {
		    try {
			Class55.aClass45_1141.method774(0);
		    } catch (Exception exception) {
			/* empty */
		    }
		}
		method25(-4700);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "nb.E(" + arg0 + ')');
	}
    }
    
    public static void method17(Class45 arg0) {
	try {
	    anInt15++;
	    Class11_Sub10_Sub16.aClass45_2439 = Class55.aClass45_1141 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("nb.providesignlink("
				     + (arg0 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method18(boolean arg0) {
	try {
	    aClass37_27 = null;
	    aClass31_10 = null;
	    aClass31_2 = null;
	    aClass55_25 = null;
	    aClass31_35 = null;
	    aClass31_21 = null;
	    aClass31_19 = null;
	    if (arg0 != true)
		aClass55_25 = null;
	    aClass31_22 = null;
	    aClass31_6 = null;
	    aClass55_26 = null;
	    aClass31_37 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "nb.N(" + arg0 + ')');
	}
    }
    
    public String getParameter(String arg0) {
	try {
	    anInt16++;
	    if (Class60.aCanvas_Sub1_1260 != null)
		return null;
	    if (Class55.aClass45_1141 != null
		&& this != Class55.aClass45_1141.anApplet836)
		return Class55.aClass45_1141.anApplet836.getParameter(arg0);
	    return super.getParameter(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("nb.getParameter("
				     + (arg0 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public void focusGained(FocusEvent arg0) {
	try {
	    Class11_Sub10.aBoolean1653 = true;
	    Class1.aBoolean76 = true;
	    anInt11++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "nb.focusGained(" + (arg0 != null ? "{...}"
							 : "null") + ')');
	}
    }
    
    public void method19(int arg0, int arg1, int arg2, int arg3, int arg4) {
	try {
	    anInt31++;
	    try {
		if (Class54.anApplet_Sub1_1061 != null)
		    method26(arg4 ^ 0x5903, "alreadyloaded");
		else {
		    Class47.anInt874 = arg2;
		    Class15.anInt311 = arg3;
		    if (arg4 != 22895)
			aClass31_37 = null;
		    Class37.anInt695 = arg1;
		    Class54.anApplet_Sub1_1061 = this;
		    if (Class55.aClass45_1141 == null)
			Class11_Sub10_Sub16.aClass45_2439
			    = Class55.aClass45_1141
			    = (new Class45
			       (false, this,
				InetAddress.getByName(getCodeBase().getHost()),
				arg0, null, 0));
		    Class55.aClass45_1141.method778(1, this, (byte) 31);
		}
	    } catch (Exception exception) {
		Class14.method517((byte) 82, null, exception);
		method26(110, "crash");
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("nb.H(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ')'));
	}
    }
    
    public void paint(Graphics arg0) {
	try {
	    anInt36++;
	    if (Class54.anApplet_Sub1_1061 == this
		&& !Class11_Sub10_Sub4_Sub3.aBoolean2587)
		Class1.aBoolean76 = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "nb.paint(" + (arg0 != null ? "{...}"
						   : "null") + ')');
	}
    }
    
    public void run() {
	try {
	    anInt32++;
	    try {
		if (Class45.aString832 != null) {
		    String string = Class45.aString832.toLowerCase();
		    if (string.indexOf("sun") != -1
			|| string.indexOf("apple") != -1) {
			String string_0_ = Class45.aString824;
			if (string_0_.equals("1.1")
			    || string_0_.startsWith("1.1.")
			    || string_0_.equals("1.2")
			    || string_0_.startsWith("1.2.")) {
			    method26(107, "wrongjava");
			    return;
			}
			NotActuallyBuffer.anInt485 = 5;
		    } else if (string.indexOf("ibm") != -1
			       && (Class45.aString824 == null
				   || Class45.aString824.equals("1.4.2"))) {
			method26(124, "wrongjava");
			return;
		    }
		}
		for (;;) {
		    Class11_Sub10_Sub11.aGraphics2261
			= Class34.method672(-112).getGraphics();
		    if (Class11_Sub10_Sub11.aGraphics2261 != null)
			break;
		    try {
			Class34.method672(-128).repaint();
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class53.method864(true, 100L);
		}
		Class9.aClass37_196
		    = Class44.method761(Class47.anInt874,
					Class34.method672(-104), -8,
					Class37.anInt695);
		Class34.method672(-106).addFocusListener(this);
		Class34.method672(-121).requestFocus();
		method20(-12527);
		Class11_Sub10_Sub6.aClass39_2137
		    = Class11_Sub10_Sub4_Sub2.method265(61);
		Class11_Sub10_Sub6.aClass39_2137.method730(7971);
		while ((Class11_Sub10_Sub4_Sub6.aLong2707
			^ 0xffffffffffffffffL) == -1L
		       || (System.currentTimeMillis()
			   < Class11_Sub10_Sub4_Sub6.aLong2707)) {
		    Class11_Sub10_Sub10.anInt2228
			= (Class11_Sub10_Sub6.aClass39_2137.method724
			   ((byte) 120, Class28.anInt519, NotActuallyBuffer.anInt485));
		    for (int i = 0; i < Class11_Sub10_Sub10.anInt2228; i++)
			method21(-1);
		    method29(24682);
		}
	    } catch (Exception exception) {
		Class14.method517((byte) 87, null, exception);
		method26(115, "crash");
	    }
	    method16(-14367);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "nb.run(" + ')');
	}
    }
    
    public void start() {
	try {
	    anInt17++;
	    if (this == Class54.anApplet_Sub1_1061
		&& !Class11_Sub10_Sub4_Sub3.aBoolean2587)
		Class11_Sub10_Sub4_Sub6.aLong2707 = 0L;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "nb.start(" + ')');
	}
    }
    
    public void destroy() {
	try {
	    anInt34++;
	    if (Class54.anApplet_Sub1_1061 == this
		&& !Class11_Sub10_Sub4_Sub3.aBoolean2587) {
		Class11_Sub10_Sub4_Sub6.aLong2707 = System.currentTimeMillis();
		Class53.method864(true, 5000L);
		Class11_Sub10_Sub16.aClass45_2439 = null;
		method16(-14367);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "nb.destroy(" + ')');
	}
    }
    
    public abstract void method20(int i);
    
    public void stop() {
	try {
	    anInt20++;
	    if (this == Class54.anApplet_Sub1_1061
		&& !Class11_Sub10_Sub4_Sub3.aBoolean2587)
		Class11_Sub10_Sub4_Sub6.aLong2707
		    = 4000L + System.currentTimeMillis();
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "nb.stop(" + ')');
	}
    }
    
    public URL getCodeBase() {
	try {
	    anInt7++;
	    if (Class60.aCanvas_Sub1_1260 != null)
		return null;
	    if (Class55.aClass45_1141 != null
		&& this != Class55.aClass45_1141.anApplet836)
		return Class55.aClass45_1141.anApplet836.getCodeBase();
	    return super.getCodeBase();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void update(Graphics arg0) {
	try {
	    paint(arg0);
	    anInt12++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "nb.update(" + (arg0 != null ? "{...}"
						    : "null") + ')');
	}
    }
    
    public void method21(int arg0) {
	try {
	    anInt3++;
	    long l = System.currentTimeMillis();
	    long l_1_ = Class11_Sub4.aLongArray1482[Class10.anInt211];
	    Class11_Sub4.aLongArray1482[Class10.anInt211] = l;
	    if (l_1_ != 0L && l_1_ < l) {
		/* empty */
	    }
	    Class10.anInt211 = Class10.anInt211 - arg0 & 0x1f;
	    synchronized (this) {
		Class11_Sub4.aBoolean1475 = Class11_Sub10.aBoolean1653;
	    }
	    method22(true);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "nb.C(" + arg0 + ')');
	}
    }
    
    public abstract void method22(boolean bool);
    
    public abstract void method23(int i);
    
    public boolean method24(int arg0) {
	try {
	    if (arg0 != -1)
		return false;
	    anInt1++;
	    String string = getDocumentBase().getHost().toLowerCase();
	    if (string.endsWith("jagex.com"))
		return true;
	    if (string.endsWith("runescape.com"))
		return true;
	    if (string.endsWith("127.0.0.1"))
		return true;
	    for (/**/;
		 (string.length() > 0
		  && string.charAt(string.length() - 1) >= '0'
		  && ((string.charAt(string.length() + -1) ^ 0xffffffff)
		      >= -58));
		 string = string.substring(0, -1 + string.length())) {
		/* empty */
	    }
	    if (string.endsWith("192.168.1."))
		return true;
	    method26(127, "invalidhost");
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "nb.K(" + arg0 + ')');
	}
    }
    
    public abstract void init();
    
    public abstract void method25(int i);
    
    public void method26(int arg0, String arg1) {
	try {
	    if (arg0 < 103)
		aClass31_22 = null;
	    anInt18++;
	    System.out.println("error_game_" + arg1);
	    try {
		getAppletContext().showDocument(new URL(getCodeBase(),
							("error_game_" + arg1
							 + ".ws")));
	    } catch (Exception exception) {
		/* empty */
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("nb.D(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public void focusLost(FocusEvent arg0) {
	try {
	    anInt33++;
	    Class11_Sub10.aBoolean1653 = false;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "nb.focusLost(" + (arg0 != null ? "{...}"
						       : "null") + ')');
	}
    }
    
    public abstract void method27(byte i);
    
    public static void method28(boolean arg0, byte arg1, byte[] arg2, int arg3,
				int arg4) {
	try {
	    anInt24++;
	    if (arg1 >= -60)
		method18(true);
	    if (Class11_Sub5_Sub1.aClass15_1925 != null) {
		if (Class25.anInt470 < 0) {
		    if ((Class4.anInt143 ^ 0xffffffff) == -1)
			Class32.method663(arg0, 0, arg3, arg2);
		    else {
			Class11_Sub10_Sub11.aByteArray2268 = arg2;
			Class8.anInt178 = arg3;
			Buffer.aBoolean1575 = arg0;
		    }
		} else {
		    Class20.anInt395 = arg4;
		    if (Class25.anInt470 == 0)
			Class4.anInt143 = 1;
		    else {
			int i
			    = Class15.method533(Class25.anInt470, (byte) 108);
			i -= Class11_Sub10_Sub8.anInt2191;
			Class4.anInt143 = (3600 + i) / arg4;
			if ((Class4.anInt143 ^ 0xffffffff) > -2)
			    Class4.anInt143 = 1;
		    }
		    Class11_Sub10_Sub11.aByteArray2268 = arg2;
		    Buffer.aBoolean1575 = arg0;
		    Class8.anInt178 = arg3;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("nb.M(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ',' + arg4 + ')'));
	}
    }
    
    public void method29(int arg0) {
	try {
	    long l = Class48.aLongArray910[Class61.anInt1263];
	    if (arg0 == 24682) {
		anInt23++;
		long l_2_ = System.currentTimeMillis();
		Class48.aLongArray910[Class61.anInt1263] = l_2_;
		if ((l ^ 0xffffffffffffffffL) != -1L && l_2_ > l) {
		    int i = (int) (l_2_ + -l);
		    Class11_Sub12.anInt1702 = (32000 + (i >> 302435681)) / i;
		}
		Class61.anInt1263 = 0x1f & 1 + Class61.anInt1263;
		method23(-110);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "nb.P(" + arg0 + ')');
	}
    }
    
    public static void method30(Class11_Sub5_Sub1 arg0, byte arg1, int arg2) {
	try {
	    anInt29++;
	    if (arg1 != 31)
		method31(-98);
	    for (;;) {
		Class11_Sub4 class11_sub4
		    = ((Class11_Sub4)
		       Class59.aClass36_1240.method694((byte) -120));
		if (class11_sub4 == null)
		    break;
		boolean bool = false;
		for (int i = 0; class11_sub4.anInt1474 > i; i++) {
		    if (class11_sub4.aClass41Array1499[i] != null) {
			if (class11_sub4.aClass41Array1499[i].anInt749 == 2)
			    class11_sub4.anIntArray1485[i] = -5;
			if (class11_sub4.aClass41Array1499[i].anInt749 == 0)
			    bool = true;
		    }
		    if (class11_sub4.aClass41Array1481[i] != null) {
			if (class11_sub4.aClass41Array1481[i].anInt749 == 2)
			    class11_sub4.anIntArray1485[i] = -6;
			if ((class11_sub4.aClass41Array1481[i].anInt749
			     ^ 0xffffffff)
			    == -1)
			    bool = true;
		    }
		}
		if (bool)
		    break;
		arg0.method196(1, arg2);
		arg0.writeByte(0);
		int i = arg0.position;
		arg0.writeIntBE(class11_sub4.anInt1484);
		for (int i_3_ = 0; ((class11_sub4.anInt1474 ^ 0xffffffff)
				    < (i_3_ ^ 0xffffffff)); i_3_++) {
		    if (class11_sub4.anIntArray1485[i_3_] != 0)
			arg0.writeByte(
					class11_sub4.anIntArray1485[i_3_]);
		    else {
			try {
			    int i_4_ = class11_sub4.anIntArray1488[i_3_];
			    if (i_4_ != 0) {
				if ((i_4_ ^ 0xffffffff) == -2) {
				    Field field = (Field) (class11_sub4
							   .aClass41Array1499
							   [i_3_].anObject751);
				    field.setInt(null,
						 (class11_sub4.anIntArray1497
						  [i_3_]));
				    arg0.writeByte(0);
				} else if (i_4_ == 2) {
				    Field field = (Field) (class11_sub4
							   .aClass41Array1499
							   [i_3_].anObject751);
				    int i_5_ = field.getModifiers();
				    arg0.writeByte(0);
				    arg0.writeIntBE(i_5_);
				}
			    } else {
				Field field
				    = (Field) (class11_sub4.aClass41Array1499
					       [i_3_].anObject751);
				int i_6_ = field.getInt(null);
				arg0.writeByte(0);
				arg0.writeIntBE(i_6_);
			    }
			    if (i_4_ != 3) {
				if (i_4_ == 4) {
				    Method method
					= ((Method)
					   (class11_sub4.aClass41Array1481
					    [i_3_].anObject751));
				    int i_7_ = method.getModifiers();
				    arg0.writeByte(0);
				    arg0.writeIntBE(i_7_);
				}
			    } else {
				Method method
				    = (Method) (class11_sub4.aClass41Array1481
						[i_3_].anObject751);
				byte[][] is
				    = (class11_sub4.aByteArrayArrayArray1489
				       [i_3_]);
				Object[] objects = new Object[is.length];
				for (int i_8_ = 0;
				     ((i_8_ ^ 0xffffffff)
				      > (is.length ^ 0xffffffff));
				     i_8_++) {
				    ObjectInputStream objectinputstream
					= (new ObjectInputStream
					   (new ByteArrayInputStream(is
								     [i_8_])));
				    objects[i_8_]
					= objectinputstream.readObject();
				}
				Object object = method.invoke(null, objects);
				if (object != null) {
				    if (!(object instanceof Number)) {
					if (!(object instanceof Class31))
					    arg0.writeByte(4);
					else {
					    arg0.writeByte(2);
					    arg0.method143((Class31) object,
							   (byte) -63);
					}
				    } else {
					arg0.writeByte(1);
					arg0.method140(-24628,
						       ((Number) object)
							   .longValue());
				    }
				} else
				    arg0.writeByte(0);
			    }
			} catch (ClassNotFoundException classnotfoundexception) {
			    arg0.writeByte(-10);
			} catch (java.io.InvalidClassException invalidclassexception) {
			    arg0.writeByte(-11);
			} catch (java.io.StreamCorruptedException streamcorruptedexception) {
			    arg0.writeByte(-12);
			} catch (java.io.OptionalDataException optionaldataexception) {
			    arg0.writeByte(-13);
			} catch (IllegalAccessException illegalaccessexception) {
			    arg0.writeByte(-14);
			} catch (IllegalArgumentException illegalargumentexception) {
			    arg0.writeByte(-15);
			} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
			    arg0.writeByte(-16);
			} catch (SecurityException securityexception) {
			    arg0.writeByte(-17);
			} catch (java.io.IOException ioexception) {
			    arg0.writeByte(-18);
			} catch (NullPointerException nullpointerexception) {
			    arg0.writeByte(-19);
			} catch (Exception exception) {
			    arg0.writeByte(-20);
			} catch (Throwable throwable) {
			    arg0.writeByte(-21);
			}
		    }
		}
		arg0.method147(3166, i);
		arg0.method191(-i + arg0.position);
		class11_sub4.method107(0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("nb.F("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ')'));
	}
    }
    
    public static Class11_Sub10_Sub13_Sub3 method31(int arg0) {
	try {
	    Class11_Sub10_Sub13_Sub3 class11_sub10_sub13_sub3
		= new Class11_Sub10_Sub13_Sub3();
	    anInt30++;
	    class11_sub10_sub13_sub3.anInt2771 = Class11_Sub10_Sub3.anInt2023;
	    class11_sub10_sub13_sub3.anInt2770 = Class59.anInt1233;
	    class11_sub10_sub13_sub3.anInt2769 = Class44.anIntArray814[0];
	    class11_sub10_sub13_sub3.anInt2767
		= Class11_Sub4.anIntArray1505[0];
	    class11_sub10_sub13_sub3.anInt2766 = Class28.anIntArray523[0];
	    class11_sub10_sub13_sub3.anInt2772 = Class6.anIntArray153[0];
	    if (arg0 < 27)
		method18(false);
	    class11_sub10_sub13_sub3.anIntArray2773
		= Class39_Sub1.anIntArray1833;
	    class11_sub10_sub13_sub3.aByteArray2768
		= Class51.aByteArrayArray1013[0];
	    Class52.method855(-104);
	    return class11_sub10_sub13_sub3;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "nb.J(" + arg0 + ')');
	}
    }
    
    public void method32(int arg0, String arg1, int arg2, InetAddress arg3,
			 byte arg4, int arg5, int arg6, int arg7) {
	try {
	    anInt8++;
	    if (arg4 != 54)
		init();
	    try {
		Class37.anInt695 = arg6;
		Class15.anInt311 = arg0;
		Class47.anInt874 = arg7;
		Class54.anApplet_Sub1_1061 = this;
		Class60.aCanvas_Sub1_1260
		    = new Canvas_Sub1(this, Class47.anInt874,
				      Class37.anInt695);
		Class11_Sub10_Sub16.aClass45_2439 = Class55.aClass45_1141
		    = new Class45(true, null, arg3, arg2, arg1, arg5);
		Class55.aClass45_1141.method778(1, this, (byte) 31);
	    } catch (Exception exception) {
		Class14.method517((byte) 120, null, exception);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("nb.O(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ','
				     + (arg3 != null ? "{...}" : "null") + ','
				     + arg4 + ',' + arg5 + ',' + arg6 + ','
				     + arg7 + ')'));
	}
    }
    
    public URL getDocumentBase() {
	try {
	    anInt9++;
	    if (Class60.aCanvas_Sub1_1260 != null)
		return null;
	    if (Class55.aClass45_1141 != null
		&& this != Class55.aClass45_1141.anApplet836)
		return Class55.aClass45_1141.anApplet836.getDocumentBase();
	    return super.getDocumentBase();
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "nb.getDocumentBase(" + ')');
	}
    }
    
    static {
	aClass31_19
	    = Class64.method992("This computers address has been blocked",
				255);
	anInt5 = 0;
	anInt28 = 0;
	aClass31_21 = Class64.method992("Imported maps", 255);
	aClass31_35 = Class64.method992(" days ago", 255);
	aClass31_2 = Class64.method992("mapmarker", 255);
	aClass31_37 = Class64.method992("Message @whi@", 255);
    }
}
