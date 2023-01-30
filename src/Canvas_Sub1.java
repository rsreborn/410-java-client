/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.math.BigInteger;

public class Canvas_Sub1 extends Canvas implements WindowListener {
    public static int anInt40;
    public static int anInt41;
    public static int anInt42;
    public Applet anApplet43;
    public static int anInt44;
    public static int anInt45;
    public static int anInt46;
    public static int anInt47;
    public static int anInt48;
    public static int anInt49;
    public static BigInteger rsaKey;
    public static int anInt51;
    public static int anInt52;
    public static int anInt53;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_54;
    public static int anInt55;
    public static Class31 aClass31_56 = Class64.method992("flash2:", 255);
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_57;
    public Frame aFrame58;
    public static int anInt59;
    public static int anInt60;
    public static Class11_Sub10_Sub5[][] aClass11_Sub10_Sub5ArrayArray61;
    public static Class31 aClass31_62;
    public static Class31[] aClass31Array63;
    public static int[] anIntArray64;
    public static Class31 aClass31_65;
    public static volatile int anInt66;
    public static int anInt67;

    public static void method38(int arg0, int arg1, int arg2, Class8 arg3, int arg4, Class49 arg5, byte arg6, int arg7, int arg8, int arg9) {
        try {
            anInt59++;
            int i = Class51.anIntArrayArrayArray1005[arg0][arg9][arg1];
            int i_0_ = Class51.anIntArrayArrayArray1005[arg0][arg9 + 1][arg1];
            int i_1_ = Class51.anIntArrayArrayArray1005[arg0][arg9 - -1][arg1 - -1];
            int i_2_ = Class51.anIntArrayArrayArray1005[arg0][arg9][1 + arg1];
            int i_3_ = i_2_ + i_1_ + i + i_0_ >> 1917571522;
            Class11_Sub10_Sub2 class11_sub10_sub2 = Class51.method853((byte) -107, arg4);
            int i_4_ = (arg7 << 809872198) + arg2;
            int i_5_ = ((arg1 << -890068313) + (arg9 + (arg4 << -540993170)) - -1073741824);
            if (class11_sub10_sub2.anInt1998 == 0) i_5_ += -2147483648;
            if ((class11_sub10_sub2.anInt1955 ^ 0xffffffff) == -2) i_4_ += 256;
            if ((arg2 ^ 0xffffffff) == -23) {
                Class11_Sub10_Sub4 class11_sub10_sub4;
                if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) != 0 || class11_sub10_sub2.anIntArray1980 != null)
                    class11_sub10_sub4 = new Class11_Sub10_Sub4_Sub5(arg4, 22, arg7, i, i_0_, i_1_, i_2_, (class11_sub10_sub2.anInt1987), true);
                else class11_sub10_sub4 = class11_sub10_sub2.method235(arg7, i_0_, i_2_, i, 22, -107, i_1_);
                arg5.method799(arg8, arg9, arg1, i_3_, class11_sub10_sub4, i_5_, i_4_);
                if (class11_sub10_sub2.aBoolean1960 && (class11_sub10_sub2.anInt1998 ^ 0xffffffff) == -2)
                    arg3.method94(arg1, 2097152, arg9);
            } else if (arg2 == 10 || arg2 == 11) {
                Class11_Sub10_Sub4 class11_sub10_sub4;
                if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) != 0 || class11_sub10_sub2.anIntArray1980 != null)
                    class11_sub10_sub4 = new Class11_Sub10_Sub4_Sub5(arg4, 10, arg7, i, i_0_, i_1_, i_2_, (class11_sub10_sub2.anInt1987), true);
                else class11_sub10_sub4 = class11_sub10_sub2.method235(arg7, i_0_, i_2_, i, 10, -112, i_1_);
                if (class11_sub10_sub4 != null) {
                    int i_6_ = 0;
                    if (arg2 == 11) i_6_ += 256;
                    int i_7_;
                    int i_8_;
                    if (arg7 != 1 && (arg7 ^ 0xffffffff) != -4) {
                        i_7_ = class11_sub10_sub2.anInt1967;
                        i_8_ = class11_sub10_sub2.anInt1974;
                    } else {
                        i_7_ = class11_sub10_sub2.anInt1974;
                        i_8_ = class11_sub10_sub2.anInt1967;
                    }
                    arg5.method793(arg8, arg9, arg1, i_3_, i_7_, i_8_, class11_sub10_sub4, i_6_, i_5_, i_4_);
                }
                if (class11_sub10_sub2.aBoolean1960)
                    arg3.method89(class11_sub10_sub2.anInt1974, class11_sub10_sub2.aBoolean1969, arg9, arg7, 19398920, arg1, class11_sub10_sub2.anInt1967);
            } else if ((arg2 ^ 0xffffffff) <= -13) {
                Class11_Sub10_Sub4 class11_sub10_sub4;
                if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) != 0 || class11_sub10_sub2.anIntArray1980 != null)
                    class11_sub10_sub4 = new Class11_Sub10_Sub4_Sub5(arg4, arg2, arg7, i, i_0_, i_1_, i_2_, (class11_sub10_sub2.anInt1987), true);
                else class11_sub10_sub4 = class11_sub10_sub2.method235(arg7, i_0_, i_2_, i, arg2, arg6 ^ ~0x66, i_1_);
                arg5.method793(arg8, arg9, arg1, i_3_, 1, 1, class11_sub10_sub4, 0, i_5_, i_4_);
                if (class11_sub10_sub2.aBoolean1960)
                    arg3.method89(class11_sub10_sub2.anInt1974, class11_sub10_sub2.aBoolean1969, arg9, arg7, 19398920, arg1, class11_sub10_sub2.anInt1967);
            } else if ((arg2 ^ 0xffffffff) == -1) {
                Class11_Sub10_Sub4 class11_sub10_sub4;
                if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) == 0 && class11_sub10_sub2.anIntArray1980 == null)
                    class11_sub10_sub4 = class11_sub10_sub2.method235(arg7, i_0_, i_2_, i, 0, -40, i_1_);
                else
                    class11_sub10_sub4 = new Class11_Sub10_Sub4_Sub5(arg4, 0, arg7, i, i_0_, i_1_, i_2_, (class11_sub10_sub2.anInt1987), true);
                arg5.method823(arg8, arg9, arg1, i_3_, class11_sub10_sub4, null, Class11_Sub10_Sub1.anIntArray1950[arg7], 0, i_5_, i_4_);
                if (class11_sub10_sub2.aBoolean1960)
                    arg3.method86(class11_sub10_sub2.aBoolean1969, true, arg7, arg1, arg9, arg2);
            } else if ((arg2 ^ 0xffffffff) == -2) {
                Class11_Sub10_Sub4 class11_sub10_sub4;
                if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) != 0 || class11_sub10_sub2.anIntArray1980 != null)
                    class11_sub10_sub4 = new Class11_Sub10_Sub4_Sub5(arg4, 1, arg7, i, i_0_, i_1_, i_2_, (class11_sub10_sub2.anInt1987), true);
                else class11_sub10_sub4 = class11_sub10_sub2.method235(arg7, i_0_, i_2_, i, 1, arg6 + -204, i_1_);
                arg5.method823(arg8, arg9, arg1, i_3_, class11_sub10_sub4, null, Class55.anIntArray1103[arg7], 0, i_5_, i_4_);
                if (class11_sub10_sub2.aBoolean1960)
                    arg3.method86(class11_sub10_sub2.aBoolean1969, true, arg7, arg1, arg9, arg2);
            } else if ((arg2 ^ 0xffffffff) == -3) {
                int i_9_ = 0x3 & arg7 + 1;
                Class11_Sub10_Sub4 class11_sub10_sub4;
                Class11_Sub10_Sub4 class11_sub10_sub4_10_;
                if (class11_sub10_sub2.anInt1987 == -1 && class11_sub10_sub2.anIntArray1980 == null) {
                    class11_sub10_sub4 = class11_sub10_sub2.method235(4 - -arg7, i_0_, i_2_, i, 2, arg6 + -203, i_1_);
                    class11_sub10_sub4_10_ = class11_sub10_sub2.method235(i_9_, i_0_, i_2_, i, 2, -111, i_1_);
                } else {
                    class11_sub10_sub4 = new Class11_Sub10_Sub4_Sub5(arg4, 2, 4 + arg7, i, i_0_, i_1_, i_2_, (class11_sub10_sub2.anInt1987), true);
                    class11_sub10_sub4_10_ = new Class11_Sub10_Sub4_Sub5(arg4, 2, i_9_, i, i_0_, i_1_, i_2_, (class11_sub10_sub2.anInt1987), true);
                }
                arg5.method823(arg8, arg9, arg1, i_3_, class11_sub10_sub4, class11_sub10_sub4_10_, Class11_Sub10_Sub1.anIntArray1950[arg7], Class11_Sub10_Sub1.anIntArray1950[i_9_], i_5_, i_4_);
                if (class11_sub10_sub2.aBoolean1960)
                    arg3.method86(class11_sub10_sub2.aBoolean1969, true, arg7, arg1, arg9, arg2);
            } else if ((arg2 ^ 0xffffffff) == -4) {
                Class11_Sub10_Sub4 class11_sub10_sub4;
                if (class11_sub10_sub2.anInt1987 != -1 || class11_sub10_sub2.anIntArray1980 != null)
                    class11_sub10_sub4 = new Class11_Sub10_Sub4_Sub5(arg4, 3, arg7, i, i_0_, i_1_, i_2_, (class11_sub10_sub2.anInt1987), true);
                else class11_sub10_sub4 = class11_sub10_sub2.method235(arg7, i_0_, i_2_, i, 3, -99, i_1_);
                arg5.method823(arg8, arg9, arg1, i_3_, class11_sub10_sub4, null, Class55.anIntArray1103[arg7], 0, i_5_, i_4_);
                if (class11_sub10_sub2.aBoolean1960)
                    arg3.method86(class11_sub10_sub2.aBoolean1969, true, arg7, arg1, arg9, arg2);
            } else if (arg6 == 79) {
                if ((arg2 ^ 0xffffffff) == -10) {
                    Class11_Sub10_Sub4 class11_sub10_sub4;
                    if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) == 0 && class11_sub10_sub2.anIntArray1980 == null)
                        class11_sub10_sub4 = class11_sub10_sub2.method235(arg7, i_0_, i_2_, i, arg2, -81, i_1_);
                    else
                        class11_sub10_sub4 = new Class11_Sub10_Sub4_Sub5(arg4, arg2, arg7, i, i_0_, i_1_, i_2_, (class11_sub10_sub2.anInt1987), true);
                    arg5.method793(arg8, arg9, arg1, i_3_, 1, 1, class11_sub10_sub4, 0, i_5_, i_4_);
                    if (class11_sub10_sub2.aBoolean1960)
                        arg3.method89(class11_sub10_sub2.anInt1974, class11_sub10_sub2.aBoolean1969, arg9, arg7, 19398920, arg1, class11_sub10_sub2.anInt1967);
                } else {
                    if (class11_sub10_sub2.aBoolean2011) {
                        if (arg7 != 1) {
                            if ((arg7 ^ 0xffffffff) != -3) {
                                if ((arg7 ^ 0xffffffff) == -4) {
                                    int i_11_ = i_2_;
                                    i_2_ = i;
                                    i = i_0_;
                                    i_0_ = i_1_;
                                    i_1_ = i_11_;
                                }
                            } else {
                                int i_12_ = i_2_;
                                i_2_ = i_0_;
                                i_0_ = i_12_;
                                i_12_ = i_1_;
                                i_1_ = i;
                                i = i_12_;
                            }
                        } else {
                            int i_13_ = i_2_;
                            i_2_ = i_1_;
                            i_1_ = i_0_;
                            i_0_ = i;
                            i = i_13_;
                        }
                    }
                    if ((arg2 ^ 0xffffffff) == -5) {
                        Class11_Sub10_Sub4 class11_sub10_sub4;
                        if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) != 0 || class11_sub10_sub2.anIntArray1980 != null)
                            class11_sub10_sub4 = (new Class11_Sub10_Sub4_Sub5(arg4, 4, 0, i, i_0_, i_1_, i_2_, class11_sub10_sub2.anInt1987, true));
                        else class11_sub10_sub4 = class11_sub10_sub2.method235(0, i_0_, i_2_, i, 4, -85, i_1_);
                        arg5.method829(arg8, arg9, arg1, i_3_, class11_sub10_sub4, Class11_Sub10_Sub1.anIntArray1950[arg7], arg7 * 512, 0, 0, i_5_, i_4_);
                    } else if ((arg2 ^ 0xffffffff) == -6) {
                        int i_14_ = arg5.method842(arg8, arg9, arg1);
                        int i_15_ = 16;
                        if (i_14_ > 0) i_15_ = (Class51.method853((byte) -107, 0x7fff & i_14_ >> 256453454).anInt1993);
                        Class11_Sub10_Sub4 class11_sub10_sub4;
                        if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) == 0 && class11_sub10_sub2.anIntArray1980 == null)
                            class11_sub10_sub4 = class11_sub10_sub2.method235(0, i_0_, i_2_, i, 4, -81, i_1_);
                        else
                            class11_sub10_sub4 = (new Class11_Sub10_Sub4_Sub5(arg4, 4, 0, i, i_0_, i_1_, i_2_, class11_sub10_sub2.anInt1987, true));
                        arg5.method829(arg8, arg9, arg1, i_3_, class11_sub10_sub4, Class11_Sub10_Sub1.anIntArray1950[arg7], 512 * arg7, Class44.anIntArray797[arg7] * i_15_, i_15_ * (Class11_Sub10_Sub4_Sub1.anIntArray2458[arg7]), i_5_, i_4_);
                    } else if ((arg2 ^ 0xffffffff) == -7) {
                        Class11_Sub10_Sub4 class11_sub10_sub4;
                        if (class11_sub10_sub2.anInt1987 == -1 && class11_sub10_sub2.anIntArray1980 == null)
                            class11_sub10_sub4 = class11_sub10_sub2.method235(0, i_0_, i_2_, i, 4, -128, i_1_);
                        else
                            class11_sub10_sub4 = (new Class11_Sub10_Sub4_Sub5(arg4, 4, 0, i, i_0_, i_1_, i_2_, class11_sub10_sub2.anInt1987, true));
                        arg5.method829(arg8, arg9, arg1, i_3_, class11_sub10_sub4, 256, arg7, 0, 0, i_5_, i_4_);
                    } else if (arg2 == 7) {
                        Class11_Sub10_Sub4 class11_sub10_sub4;
                        if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) == 0 && class11_sub10_sub2.anIntArray1980 == null)
                            class11_sub10_sub4 = class11_sub10_sub2.method235(0, i_0_, i_2_, i, 4, -43, i_1_);
                        else
                            class11_sub10_sub4 = (new Class11_Sub10_Sub4_Sub5(arg4, 4, 0, i, i_0_, i_1_, i_2_, class11_sub10_sub2.anInt1987, true));
                        arg5.method829(arg8, arg9, arg1, i_3_, class11_sub10_sub4, 512, arg7, 0, 0, i_5_, i_4_);
                    } else if ((arg2 ^ 0xffffffff) == -9) {
                        Class11_Sub10_Sub4 class11_sub10_sub4;
                        if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) == 0 && class11_sub10_sub2.anIntArray1980 == null)
                            class11_sub10_sub4 = class11_sub10_sub2.method235(0, i_0_, i_2_, i, 4, arg6 + -186, i_1_);
                        else
                            class11_sub10_sub4 = (new Class11_Sub10_Sub4_Sub5(arg4, 4, 0, i, i_0_, i_1_, i_2_, class11_sub10_sub2.anInt1987, true));
                        arg5.method829(arg8, arg9, arg1, i_3_, class11_sub10_sub4, 768, arg7, 0, 0, i_5_, i_4_);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("k.C(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? "{...}" : "null") + ',' + arg4 + ',' + (arg5 != null ? "{...}" : "null") + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')'));
        }
    }

    public void windowDeiconified(WindowEvent arg0) {
        try {
            anInt60++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("k.windowDeiconified(" + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    public void windowClosing(WindowEvent arg0) {
        try {
            anApplet43.destroy();
            anInt46++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("k.windowClosing(" + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    public void windowIconified(WindowEvent arg0) {
        try {
            anInt45++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("k.windowIconified(" + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void parsePlayerSyncMasks(int arg0, Class11_Sub10_Sub4_Sub2_Sub1 arg1, int arg2, int arg3) {
        if ((0x80 & arg2) != 0) {
            arg1.anInt2568 = Class11_Sub10_Sub4_Sub2.inBuffer.readUShortLE();
            if ((arg1.anInt2568 ^ 0xffffffff) == -65536) arg1.anInt2568 = -1;
        }
        if ((arg2 & 0x40) != 0) {
            int i = Class11_Sub10_Sub4_Sub2.inBuffer.readUByteA();
            byte[] is = new byte[i];
            Buffer buffer = new Buffer(is);
            Class11_Sub10_Sub4_Sub2.inBuffer.method152(is, 118, 0, i);
            Class22.aBufferArray401[arg0] = buffer;
            arg1.syncAppearance(buffer, -10496);
        }
        anInt40++;
        if (arg3 == -31566) {
            if ((0x10 & arg2) != 0) {
                arg1.aClass31_2542 = Class11_Sub10_Sub4_Sub2.inBuffer.method181((byte) 127);
                if ((arg1.aClass31_2542.method628(false, 0) ^ 0xffffffff) != -127) {
                    if (arg1 == Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899)
                        Class11_Sub10_Sub4_Sub3.method288(2, arg1.aClass31_2800, arg1.aClass31_2542, true);
                } else {
                    arg1.aClass31_2542 = arg1.aClass31_2542.method639(28418, 1);
                    Class11_Sub10_Sub4_Sub3.method288(2, arg1.aClass31_2800, arg1.aClass31_2542, true);
                }
                arg1.anInt2541 = 0;
                arg1.anInt2534 = 150;
                arg1.anInt2502 = 0;
            }
            if ((0x8 & arg2) != 0) {
                int i = Class11_Sub10_Sub4_Sub2.inBuffer.readUShortLE();
                int i_16_ = Class11_Sub10_Sub4_Sub2.inBuffer.readUByteA();
                if (i == 65535) i = -1;
                if (i == arg1.anInt2549 && i != -1) {
                    int i_17_ = NotActuallyBuffer.method600(i, 4867).anInt2278;
                    if ((i_17_ ^ 0xffffffff) == -2) {
                        arg1.anInt2540 = 0;
                        arg1.anInt2496 = 0;
                        arg1.anInt2558 = 0;
                        arg1.anInt2555 = i_16_;
                    }
                    if (i_17_ == 2) arg1.anInt2540 = 0;
                } else if (i == -1 || arg1.anInt2549 == -1 || (NotActuallyBuffer.method600(i, 4867).anInt2274 >= (NotActuallyBuffer.method600(arg1.anInt2549, 4867).anInt2274))) {
                    arg1.anInt2496 = 0;
                    arg1.anInt2549 = i;
                    arg1.anInt2558 = 0;
                    arg1.anInt2555 = i_16_;
                    arg1.anInt2514 = arg1.anInt2551;
                    arg1.anInt2540 = 0;
                }
            }
            if ((0x100 & arg2 ^ 0xffffffff) != -1) {
                arg1.anInt2559 = Class11_Sub10_Sub4_Sub2.inBuffer.readUByteA();
                arg1.anInt2564 = Class11_Sub10_Sub4_Sub2.inBuffer.method166(false);
                arg1.anInt2553 = Class11_Sub10_Sub4_Sub2.inBuffer.readUByteA();
                arg1.anInt2519 = Class11_Sub10_Sub4_Sub2.inBuffer.readUByteA();
                arg1.anInt2509 = Class11_Sub10_Sub4_Sub2.inBuffer.readUShortLE() + Class61.anInt1283;
                arg1.anInt2537 = Class11_Sub10_Sub4_Sub2.inBuffer.method141(arg3 + 31632) - -Class61.anInt1283;
                arg1.anInt2556 = Class11_Sub10_Sub4_Sub2.inBuffer.method166(false);
                arg1.method269(-2);
            }
            if ((arg2 & 0x400 ^ 0xffffffff) != -1) {
                arg1.anInt2543 = Class11_Sub10_Sub4_Sub2.inBuffer.method141(arg3 ^ ~0x7b33);
                int i = Class11_Sub10_Sub4_Sub2.inBuffer.readUIntBE();
                arg1.anInt2527 = 0;
                if (arg1.anInt2543 == 65535) arg1.anInt2543 = -1;
                arg1.anInt2563 = Class61.anInt1283 - -(0xffff & i);
                if ((arg1.anInt2563 ^ 0xffffffff) < (Class61.anInt1283 ^ 0xffffffff)) arg1.anInt2527 = -1;
                arg1.anInt2524 = i >> -1927965872;
                arg1.anInt2498 = 0;
            }
            if ((0x1 & arg2) != 0) {
                int i = Class11_Sub10_Sub4_Sub2.inBuffer.readUShortLE();
                int i_18_ = Class11_Sub10_Sub4_Sub2.inBuffer.readUByteA();
                int i_19_ = Class11_Sub10_Sub4_Sub2.inBuffer.readUByteA();
                int i_20_ = (Class11_Sub10_Sub4_Sub2.inBuffer.position);
                if (arg1.aClass31_2800 != null && arg1.aClass24_2810 != null) {
                    boolean bool = false;
                    long l = arg1.aClass31_2800.method633((byte) -127);
                    if (i_18_ <= 1) {
                        for (int i_21_ = 0; Class55.anInt1143 > i_21_; i_21_++) {
                            if (Class46.aLongArray845[i_21_] == l) {
                                bool = true;
                                break;
                            }
                        }
                    }
                    if (!bool && (Class6.anInt161 ^ 0xffffffff) == -1) {
                        Class11_Sub10_Sub4_Sub6.aBuffer_2701.position = 0;
                        Class11_Sub10_Sub4_Sub2.inBuffer.method152((Class11_Sub10_Sub4_Sub6.aBuffer_2701.payload), 114, 0, i_19_);
                        Class11_Sub10_Sub4_Sub6.aBuffer_2701.position = 0;
                        Class31 class31 = Class34.method679(-46, Class11_Sub10_Sub4_Sub6.aBuffer_2701).method620((byte) 29);
                        arg1.aClass31_2542 = class31.method632((byte) 12);
                        arg1.anInt2534 = 150;
                        arg1.anInt2541 = i >> 731335272;
                        arg1.anInt2502 = i & 0xff;
                        if ((i_18_ ^ 0xffffffff) != -3 && i_18_ != 3) {
                            if (i_18_ != 1) Class11_Sub10_Sub4_Sub3.method288(2, arg1.aClass31_2800, class31, true);
                            else
                                Class11_Sub10_Sub4_Sub3.method288(1, Class40.method744(0, (new Class31[]{(Class11_Sub10_Sub2.aClass31_2006), (arg1.aClass31_2800)})), class31, true);
                        } else
                            Class11_Sub10_Sub4_Sub3.method288(1, Class40.method744(0, (new Class31[]{(Class37_Sub1.aClass31_1802), arg1.aClass31_2800})), class31, true);
                    }
                }
                Class11_Sub10_Sub4_Sub2.inBuffer.position = i_20_ + i_19_;
            }
            if ((arg2 & 0x200) != 0) {
                int i = Class11_Sub10_Sub4_Sub2.inBuffer.readUByte();
                int i_22_ = Class11_Sub10_Sub4_Sub2.inBuffer.readUByte();
                arg1.method266(i, 87, Class61.anInt1283, i_22_);
                arg1.anInt2557 = 300 + Class61.anInt1283;
                arg1.anInt2538 = Class11_Sub10_Sub4_Sub2.inBuffer.method166(false);
                arg1.anInt2512 = Class11_Sub10_Sub4_Sub2.inBuffer.readUByteA();
            }
            if ((0x20 & arg2) != 0) {
                int i = Class11_Sub10_Sub4_Sub2.inBuffer.method190();
                int i_23_ = Class11_Sub10_Sub4_Sub2.inBuffer.readUByte();
                arg1.method266(i, 92, Class61.anInt1283, i_23_);
                arg1.anInt2557 = 300 + Class61.anInt1283;
                arg1.anInt2538 = Class11_Sub10_Sub4_Sub2.inBuffer.method166(false);
                arg1.anInt2512 = Class11_Sub10_Sub4_Sub2.inBuffer.method166(false);
            }
            if ((arg2 & 0x2) != 0) {
                arg1.anInt2513 = Class11_Sub10_Sub4_Sub2.inBuffer.readUShortLE();
                arg1.anInt2532 = Class11_Sub10_Sub4_Sub2.inBuffer.method141(-33);
            }
        }
    }

    public void windowActivated(WindowEvent arg0) {
        try {
            anInt42++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("k.windowActivated(" + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    public void windowOpened(WindowEvent arg0) {
        try {
            anInt41++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "k.windowOpened(" + (arg0 != null ? "{...}" : "null") + ')');
        }
    }

    public void windowClosed(WindowEvent arg0) {
        try {
            anInt52++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "k.windowClosed(" + (arg0 != null ? "{...}" : "null") + ')');
        }
    }

    public void update(Graphics arg0) {
        try {
            anApplet43.update(arg0);
            anInt51++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "k.update(" + (arg0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void method40(int arg0) {
        try {
            aClass31_62 = null;
            aClass11_Sub10_Sub13_Sub3_54 = null;
            aClass11_Sub10_Sub13_Sub3_57 = null;
            aClass31Array63 = null;
            anIntArray64 = null;
            rsaKey = null;
            aClass11_Sub10_Sub5ArrayArray61 = null;
            aClass31_56 = null;
            if (arg0 != 1) aClass11_Sub10_Sub13_Sub3_54 = null;
            aClass31_65 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "k.A(" + arg0 + ')');
        }
    }

    public static void method41(int arg0, byte arg1, Class55_Sub1 arg2, Class64 arg3) {
        try {
            anInt48++;
            Class11_Sub11 class11_sub11 = new Class11_Sub11();
            class11_sub11.anInt1686 = 1;
            class11_sub11.aClass55_Sub1_1688 = arg2;
            class11_sub11.aClass64_1689 = arg3;
            class11_sub11.aLong231 = (long) arg0;
            synchronized (Class39_Sub1.aClass36_1822) {
                Class39_Sub1.aClass36_1822.method691((byte) -98, class11_sub11);
            }
            if (arg1 == 55) Class11_Sub10_Sub4_Sub3.method291(-122);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("k.D(" + arg0 + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ',' + (arg3 != null ? "{...}" : "null") + ')'));
        }
    }

    public Canvas_Sub1(Applet arg0, int arg1, int arg2) {
        try {
            anApplet43 = arg0;
            aFrame58 = new Frame();
            aFrame58.setTitle("Jagex");
            aFrame58.setResizable(false);
            this.setSize(arg1, arg2);
            aFrame58.add(this);
            aFrame58.pack();
            aFrame58.addWindowListener(this);
            aFrame58.setVisible(true);
            aFrame58.toFront();
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("k.<init>(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + arg2 + ')'));
        }
    }

    public void windowDeactivated(WindowEvent arg0) {
        try {
            anInt53++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("k.windowDeactivated(" + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    public void paint(Graphics arg0) {
        try {
            anApplet43.paint(arg0);
            anInt47++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "k.paint(" + (arg0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        rsaKey = (new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821"));
        aClass31Array63 = new Class31[200];
        anInt66 = 0;
        aClass31_62 = Class64.method992("l", 255);
        aClass31_65 = Class64.method992("Please remove ", 255);
    }
}
