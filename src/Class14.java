/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;

public class Class14 implements Runnable
{
    public static int anInt272;
    public static int anInt273;
    public static volatile int anInt274 = 0;
    public OutputStream anOutputStream275;
    public static int anInt276;
    public Socket aSocket277;
    public static int anInt278;
    public static Class24 aClass24_279;
    public boolean aBoolean280;
    public boolean aBoolean281;
    public static Class31 aClass31_282 = Class64.method992("May", 255);
    public static int anInt283;
    public int anInt284 = 0;
    public Class41 aClass41_285;
    public static int anInt286;
    public int anInt287;
    public byte[] aByteArray288;
    public static int anInt289;
    public static int anInt290;
    public static int anInt291;
    public InputStream anInputStream292;
    public static int anInt293;
    public static int anInt294;
    public static int anInt295;
    public Class45 aClass45_296;
    public static int anInt297 = -1;
    public static int anInt298;
    public static int anInt299;
    public static int anInt300;
    public static Class31 aClass31_301;
    public static int anInt302;
    public static Class31 aClass31_303;
    public static Class31 aClass31_304;
    
    public void method515(int arg0, int arg1, byte arg2, byte[] arg3)
	throws IOException {
	try {
	    if (arg2 < 57)
		aClass31_301 = null;
	    anInt300++;
	    if (!aBoolean280) {
		while ((arg1 ^ 0xffffffff) < -1) {
		    int i = anInputStream292.read(arg3, arg0, arg1);
		    if ((i ^ 0xffffffff) >= -1)
			throw new EOFException();
		    arg1 -= i;
		    arg0 += i;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("hc.H(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + (arg3 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public int method516(int arg0) throws IOException {
	try {
	    anInt299++;
	    if (aBoolean280)
		return 0;
	    if (arg0 != 0)
		return -73;
	    return anInputStream292.read();
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "hc.B(" + arg0 + ')');
	}
    }
    
    public void finalize() {
	try {
	    method520(-9098);
	    anInt290++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "hc.finalize(" + ')');
	}
    }
    
    public static void method517(byte arg0, String arg1, Throwable arg2) {
	try {
	    if (arg0 < 21)
		method523(true);
	    try {
		String string = "";
		if (arg2 != null)
		    string = Class11_Sub10_Sub5.method337(arg2, (byte) -51);
		if (arg1 != null) {
		    if (arg2 != null)
			string += " | ";
		    string += (String) arg1;
		}
		System.out.println("Error: " + string);
		string = string.replace(':', '.');
		string = string.replace('@', '_');
		string = string.replace('&', '_');
		string = string.replace('#', '_');
		Class41 class41
		    = (Class11_Sub10_Sub16.aClass45_2439.method780
		       ((byte) -52,
			new URL(Class11_Sub10_Sub16.aClass45_2439
				    .anApplet836.getCodeBase(),
				("clienterror.ws?c=" + Class15.anInt311 + "&u="
				 + Class11_Sub10_Sub8.aLong2195 + "&v1="
				 + Class45.aString832 + "&v2="
				 + Class45.aString824 + "&e=" + string))));
		while ((class41.anInt749 ^ 0xffffffff) == -1)
		    Class53.method864(true, 1L);
		if (class41.anInt749 == 1) {
		    DataInputStream datainputstream
			= (DataInputStream) class41.anObject751;
		    datainputstream.read();
		    datainputstream.close();
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    anInt283++;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public int method518(int arg0) throws IOException {
	try {
	    anInt298++;
	    if (arg0 != 0)
		anInt297 = 42;
	    if (aBoolean280)
		return 0;
	    return anInputStream292.available();
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "hc.I(" + arg0 + ')');
	}
    }
    
    public static boolean method519(Class31 arg0, int arg1) {
	try {
	    if (arg1 != -20281)
		method519(null, -69);
	    anInt293++;
	    if (arg0 == null)
		return false;
	    for (int i = 0;
		 (Buffer.anInt1573 ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		if (arg0.method653(Canvas_Sub1.aClass31Array63[i], true))
		    return true;
	    }
	    if (arg0.method653((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				.aClass31_2800),
			       true))
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "hc.D(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public void method520(int arg0) {
	try {
	    anInt289++;
	    if (!aBoolean280) {
		synchronized (this) {
		    aBoolean280 = true;
		    this.notifyAll();
		}
		if (arg0 == -9098) {
		    if (aClass41_285 != null) {
			while (aClass41_285.anInt749 == 0)
			    Class53.method864(true, 1L);
			if ((aClass41_285.anInt749 ^ 0xffffffff) == -2) {
			    try {
				((Thread) aClass41_285.anObject751).join();
			    } catch (InterruptedException interruptedexception) {
				/* empty */
			    }
			}
		    }
		    aClass41_285 = null;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "hc.A(" + arg0 + ')');
	}
    }
    
    public void run() {
	try {
	    try {
		for (;;) {
		    int i;
		    int i_0_;
		    synchronized (this) {
			if (anInt287 == anInt284) {
			    if (aBoolean280)
				break;
			    try {
				this.wait();
			    } catch (InterruptedException interruptedexception) {
				/* empty */
			    }
			}
			if ((anInt287 ^ 0xffffffff) > (anInt284 ^ 0xffffffff))
			    i = -anInt284 + 5000;
			else
			    i = -anInt284 + anInt287;
			i_0_ = anInt284;
		    }
		    if ((i ^ 0xffffffff) < -1) {
			try {
			    anOutputStream275.write(aByteArray288, i_0_, i);
			} catch (IOException ioexception) {
			    aBoolean281 = true;
			}
			anInt284 = (i + anInt284) % 5000;
			try {
			    if (anInt284 == anInt287)
				anOutputStream275.flush();
			} catch (IOException ioexception) {
			    aBoolean281 = true;
			}
		    }
		}
		try {
		    if (anInputStream292 != null)
			anInputStream292.close();
		    if (anOutputStream275 != null)
			anOutputStream275.close();
		    if (aSocket277 != null)
			aSocket277.close();
		} catch (IOException ioexception) {
		    /* empty */
		}
		aByteArray288 = null;
	    } catch (Exception exception) {
		method517((byte) 96, null, exception);
	    }
	    anInt295++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "hc.run(" + ')');
	}
    }
    
    public void method521(byte[] arg0, int arg1, int arg2, boolean arg3)
	throws IOException {
	try {
	    anInt273++;
	    if (arg3 == true && !aBoolean280) {
		if (aBoolean281) {
		    aBoolean281 = false;
		    throw new IOException();
		}
		if (aByteArray288 == null)
		    aByteArray288 = new byte[5000];
		synchronized (this) {
		    for (int i = 0; (i ^ 0xffffffff) > (arg1 ^ 0xffffffff);
			 i++) {
			aByteArray288[anInt287] = arg0[i + arg2];
			anInt287 = (1 + anInt287) % 5000;
			if ((4900 + anInt284) % 5000 == anInt287)
			    throw new IOException();
		    }
		    if (aClass41_285 == null)
			aClass41_285
			    = aClass45_296.method778(3, this, (byte) 31);
		    this.notifyAll();
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("hc.G("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ',' + arg3 + ')'));
	}
    }
    
    public static Class11_Sub10_Sub13_Sub4 method522(byte arg0, Class55 arg1,
						     int arg2, int arg3) {
	try {
	    anInt272++;
	    if (!Class37_Sub1.method714(arg3, -29446, arg1, arg2))
		return null;
	    if (arg0 >= -126)
		aClass24_279 = null;
	    return Class46.method784((byte) -57);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("hc.C(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ')'));
	}
    }
    
    public Class14(Socket arg0, Class45 arg1) throws IOException {
	aBoolean280 = false;
	aBoolean281 = false;
	anInt287 = 0;
	try {
	    aSocket277 = arg0;
	    aClass45_296 = arg1;
	    aSocket277.setSoTimeout(30000);
	    aSocket277.setTcpNoDelay(true);
	    anInputStream292 = aSocket277.getInputStream();
	    anOutputStream275 = aSocket277.getOutputStream();
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("hc.<init>("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method523(boolean arg0) {
	try {
	    aClass31_282 = null;
	    if (arg0 == true) {
		aClass31_304 = null;
		aClass31_303 = null;
		aClass31_301 = null;
		aClass24_279 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "hc.E(" + arg0 + ')');
	}
    }
    
    static {
	anInt294 = -1;
	aClass24_279 = new Class24();
	aClass31_301 = Class64.method992(" @gre@", 255);
	anInt302 = 0;
	aClass31_304 = Class64.method992("Create a free account", 255);
	aClass31_303 = Class64.method992("@red@", 255);
    }
}
