/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class10
{
    public static Class37 aClass37_203;
    public static Class55 aClass55_204;
    public static Class31 aClass31_205 = Class64.method992("backhmid1", 255);
    public static int anInt206 = -1;
    public static Class31 aClass31_207 = Class64.method992("K @whi@(X", 255);
    public static Class31 aClass31_208 = Class64.method992("mod_icons", 255);
    public static Class11_Sub10_Sub13_Sub4[] aClass11_Sub10_Sub13_Sub4Array209;
    public static int anInt210;
    public static int anInt211;
    public static int anInt212;
    public static Class31 aClass31_213 = Class64.method992("invback", 255);
    public static int anInt214;
    public static int anInt215;
    public static int anInt216;
    public static byte[][] aByteArrayArray217 = new byte[250][];
    
    public static void method103(byte arg0) {
	try {
	    aClass37_203 = null;
	    aClass11_Sub10_Sub13_Sub4Array209 = null;
	    aClass55_204 = null;
	    aByteArrayArray217 = null;
	    int i = 70 % ((32 - arg0) / 52);
	    aClass31_205 = null;
	    aClass31_213 = null;
	    aClass31_207 = null;
	    aClass31_208 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "fe.A(" + arg0 + ')');
	}
    }
    
    public static boolean method104(Class45 arg0, boolean arg1, byte arg2) {
	try {
	    anInt215++;
	    Class4.anInt143 = 20;
	    try {
		Class11_Sub5_Sub1.aClass15_1925
		    = ((Class15)
		       Class.forName("Class15_Sub1_Sub2").newInstance());
		return true;
	    } catch (Throwable throwable) {
		Runnable_Impl1 runnable_impl1 = arg0.method776((byte) -118);
		if (runnable_impl1 != null) {
		    Class11_Sub5_Sub1.aClass15_1925
			= new Class15_Sub1_Sub1(arg0, runnable_impl1);
		    return true;
		}
		if (arg2 < 50)
		    method103((byte) -15);
		if (arg1) {
		    Class11_Sub5_Sub1.aClass15_1925 = new Class15_Sub2(arg0);
		    return true;
		}
		return false;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("fe.B("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ')'));
	}
    }
}
