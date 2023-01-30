/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NotActuallyBuffer {
    public static int anInt483;
    public static int[] anIntArray484;
    public static int anInt485;
    public static int anInt486;
    public static Class31 aClass31_487 = Class64.method992(" x", 255);
    public static Class11_Sub10_Sub5 aClass11_Sub10_Sub5_488;
    public static Class11_Sub5_Sub1 loginBuffer;
    public static int anInt490;
    public static Class31 aClass31_491;

    public static Class11_Sub10_Sub12 method600(int arg0, int arg1) {
        try {
            anInt486++;
            Class11_Sub10_Sub12 class11_sub10_sub12 = ((Class11_Sub10_Sub12) Class11_Sub10_Sub4_Sub1.aClass40_2489.method735((long) arg0, (byte) -89));
            if (class11_sub10_sub12 != null) return class11_sub10_sub12;
            byte[] is = Class33.aClass55_601.method887((byte) -125, arg0, 12);
            class11_sub10_sub12 = new Class11_Sub10_Sub12();
            if (arg1 != 4867) return null;
            if (is != null) class11_sub10_sub12.method391(-1, new Buffer(is));
            class11_sub10_sub12.method390(false);
            Class11_Sub10_Sub4_Sub1.aClass40_2489.method742(-125, (long) arg0, class11_sub10_sub12);
            return class11_sub10_sub12;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "mb.B(" + arg0 + ',' + arg1 + ')');
        }
    }

    public static void method601(byte arg0) {
        try {
            aClass11_Sub10_Sub5_488 = null;
            anIntArray484 = null;
            loginBuffer = null;
            int i = 6 % ((arg0 - 68) / 55);
            aClass31_487 = null;
            aClass31_491 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "mb.A(" + arg0 + ')');
        }
    }

    static {
        anInt485 = 1;
        anIntArray484 = new int[200];
        anInt483 = 3;
        aClass11_Sub10_Sub5_488 = new Class11_Sub10_Sub5();
        loginBuffer = new Class11_Sub5_Sub1(5000);
        anInt490 = 0;
        aClass31_491 = Class64.method992(" more options", 255);
    }
}
