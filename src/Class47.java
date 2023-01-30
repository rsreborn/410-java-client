/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class47 implements Runnable
{
    public static int[] anIntArray864;
    public static int anInt865;
    public static int anInt866;
    public static int anInt867;
    public static Class31 aClass31_868;
    public static int anInt869 = 0;
    public static int anInt870;
    public static int anInt871;
    public static int anInt872;
    public static int anInt873;
    public static int anInt874;
    public static Class31 aClass31_875;
    public static Class55_Sub1 aClass55_Sub1_876;
    public static int anInt877;
    public static Class31 aClass31_878;
    public static int anInt879;
    public static Class31 aClass31_880;
    public static int anInt881;
    public static Class55 aClass55_882;
    public static Class31 aClass31_883;
    
    public static void method786(byte arg0) {
	try {
	    aClass31_878 = null;
	    aClass55_882 = null;
	    aClass31_883 = null;
	    anIntArray864 = null;
	    aClass31_875 = null;
	    aClass31_880 = null;
	    if (arg0 != -31)
		aClass31_880 = null;
	    aClass31_868 = null;
	    aClass55_Sub1_876 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "s.A(" + arg0 + ')');
	}
    }
    
    public static void method787(int arg0) {
	try {
	    if (arg0 == 100) {
		Buffer.aClass40_1531.method740(4);
		anInt870++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "s.B(" + arg0 + ')');
	}
    }
    
    public void run() {
	try {
	    anInt865++;
	    try {
		for (;;) {
		    Class11_Sub11 class11_sub11;
		    synchronized (Class39_Sub1.aClass36_1822) {
			class11_sub11
			    = (Class11_Sub11) Class39_Sub1.aClass36_1822
						  .method694((byte) -116);
		    }
		    if (class11_sub11 == null) {
			Class53.method864(true, 100L);
			synchronized (Class55.anObject1111) {
			    if ((Class32.anInt583 ^ 0xffffffff) >= -2) {
				Class32.anInt583 = 0;
				Class55.anObject1111.notifyAll();
				break;
			    }
			    Class32.anInt583--;
			}
		    } else {
			if (class11_sub11.anInt1686 == 0) {
			    class11_sub11.aClass64_1689.method994
				(class11_sub11.aByteArray1682.length,
				 (int) class11_sub11.aLong231,
				 class11_sub11.aByteArray1682, false);
			    synchronized (Class39_Sub1.aClass36_1822) {
				class11_sub11.method107(0);
			    }
			} else if (class11_sub11.anInt1686 == 1) {
			    class11_sub11.aByteArray1682
				= (class11_sub11.aClass64_1689.method996
				   ((int) class11_sub11.aLong231, 86));
			    synchronized (Class39_Sub1.aClass36_1822) {
				Class11_Sub10_Sub1.aClass36_1928
				    .method691((byte) -98, class11_sub11);
			    }
			}
			synchronized (Class55.anObject1111) {
			    if (Class32.anInt583 <= 1) {
				Class32.anInt583 = 0;
				Class55.anObject1111.notifyAll();
				break;
			    }
			    Class32.anInt583 = 600;
			}
		    }
		}
	    } catch (Exception exception) {
		Class14.method517((byte) 44, null, exception);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "s.run(" + ')');
	}
    }
    
    static {
	aClass31_868 = Class64.method992("Importing maps )2 ", 255);
	aClass31_878 = Class64.method992("Error connecting to server)3", 255);
	aClass31_875 = Class64.method992(" @lre@", 255);
	anInt872 = 0;
	aClass31_880 = Class64.method992("Cabbage", 255);
	anInt881 = -1;
	aClass31_883 = Class64.method992("Login attempts exceeded)3", 255);
    }
}
