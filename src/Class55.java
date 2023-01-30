/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class55 {
    public static int anInt1087;
    public int[] anIntArray1088;
    public static int anInt1089;
    public static int anInt1090;
    public static int anInt1091;
    public static int[][][] anIntArrayArrayArray1092;
    public static int anInt1093;
    public static int anInt1094;
    public static Class31 aClass31_1095;
    public static int anInt1096;
    public int checksum;
    public static int anInt1098;
    public int[][] anIntArrayArray1099;
    public Class25 aClass25_1100;
    public int[] anIntArray1101;
    public byte[][] aByteArrayArray1102;
    public static int[] anIntArray1103;
    public int anInt1104;
    public int[] anIntArray1105;
    public static int anInt1106;
    public static int anInt1107;
    public boolean aBoolean1108;
    public static int anInt1109;
    public static int anInt1110;
    public static Object anObject1111;
    public static int anInt1112;
    public static Class31 aClass31_1113 = Class64.method992("overlay_multiway", 255);
    public static int anInt1114;
    public static int anInt1115;
    public static int anInt1116;
    public static int anInt1117;
    public byte[][][] aByteArrayArrayArray1118;
    public static Class31 aClass31_1119;
    public static int anInt1120;
    public static int anInt1121;
    public static int anInt1122;
    public Class25[] aClass25Array1123;
    public int[] anIntArray1124;
    public static int anInt1125;
    public static Class31 aClass31_1126;
    public static int anInt1127;
    public int[][] anIntArrayArray1128;
    public static volatile int anInt1129;
    public boolean aBoolean1130;
    public static int anInt1131;
    public static int anInt1132;
    public static int anInt1133;
    public static int anInt1134;
    public int[] anIntArray1135;
    public static int anInt1136;
    public static int anInt1137;
    public static int anInt1138;
    public static Class31 aClass31_1139;
    public static Class11_Sub10_Sub13_Sub4[] aClass11_Sub10_Sub13_Sub4Array1140;
    public static Class45 aClass45_1141;
    public static int anInt1142;
    public static int anInt1143;

    public void method875(int arg0, int arg1) {
        anInt1116++;
        if (arg1 != -28304) method879(59, 114, -45);
    }

    public void method876(int arg0) {
        try {
            anInt1106++;
            for (int i = arg0; i < aByteArrayArrayArray1118.length; i++) {
                if (aByteArrayArrayArray1118[i] != null) {
                    for (int i_0_ = 0; aByteArrayArrayArray1118[i].length > i_0_; i_0_++)
                        aByteArrayArrayArray1118[i][i_0_] = null;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ud.EA(" + arg0 + ')');
        }
    }

    public static void constructMapRegion(boolean arg0, int arg1) {
        try {
            anInt1122++;
            Class17.aBoolean338 = arg0;
            if (arg1 != -50) method894(108, null);
            if (!Class17.aBoolean338) {
                int i = Class11_Sub10_Sub4_Sub2.inBuffer.readUShortLE();

                int keyCount = ((Class11_Sub10_Sub14.anInt2348 - (Class11_Sub10_Sub4_Sub2.inBuffer.position)) / 16);
                Class11_Sub10_Sub4_Sub5.xteaKeys = new int[keyCount][4];
                for (int keyIndex = 0; keyIndex < keyCount; keyIndex++) {
                    for (int plane = 0; plane < 4; plane++)
                        Class11_Sub10_Sub4_Sub5.xteaKeys[keyIndex][plane] = Class11_Sub10_Sub4_Sub2.inBuffer.readUIntBE();
                }

                int chunkY = Class11_Sub10_Sub4_Sub2.inBuffer.readUShortLE();
                int i_5_ = Class11_Sub10_Sub4_Sub2.inBuffer.readUShortLE();
                int plane = Class11_Sub10_Sub4_Sub2.inBuffer.readUByte(); // was UByteA
                int chunkX = Class11_Sub10_Sub4_Sub2.inBuffer.readUShortBE();

                System.out.println("X: " + chunkX + " Y: " + chunkY + " i " + i + " i_5_ " + i_5_);

                Class60.aByteArrayArray1259 = new byte[keyCount][];
                Class11_Sub10_Sub4_Sub3.anIntArray2589 = new int[keyCount];

                boolean bool = chunkX / 8 == 48 || chunkX / 8 == 49 && chunkY / 8 == 48;
                if (chunkX / 8 == 48 && chunkY / 8 == 148) bool = true;

                Class11_Sub10_Sub11.aByteArrayArray2257 = new byte[keyCount][];
                Canvas_Sub1.anIntArray64 = new int[keyCount];
                Class11_Sub10_Sub4_Sub1.anIntArray2490 = new int[keyCount];
                keyCount = 0;
                for (int x = (chunkX - 6) / 8; x <= (chunkX + 6) / 8; x++) {
                    for (int y = (chunkY -6) / 8; y <= (chunkY + 6) / 8; y++) {
                        int hash = y + (x << 8);
                        if (!bool || (y != 49 && y != 149 && y != 147 && x != 50 && (x != 49 || y != 47))) {
                            Class11_Sub10_Sub4_Sub3.anIntArray2589[keyCount] = hash;
                            Class11_Sub10_Sub4_Sub1.anIntArray2490[keyCount] = (Class13.mapsArchive.hashFileName((byte) -18, (Class40.method744(Class11_Sub12.method494(arg1, -50), (new Class31[]{Class59.aClass31_1235, Class11_Sub11.method493(x, (byte) -124), Class51.aClass31_1015, (Class11_Sub11.method493(y, (byte) -125))})))));
                            Canvas_Sub1.anIntArray64[keyCount] = (Class13.mapsArchive.hashFileName((byte) -18, (Class40.method744(0, (new Class31[]{Canvas_Sub1.aClass31_62, Class11_Sub11.method493(x, (byte) -127), Class51.aClass31_1015, (Class11_Sub11.method493(y, (byte) -127))})))));
                            keyCount++;
                        }
                    }
                }
                Class43.method753(chunkX, plane, (byte) 109, i, i_5_, chunkY);
            } else {
                int i = Class11_Sub10_Sub4_Sub2.inBuffer.method141(-112);
                Class11_Sub10_Sub4_Sub2.inBuffer.method197(false);
                for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -5; i_11_++) {
                    for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -14; i_12_++) {
                        for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -14; i_13_++) {
                            int i_14_ = Class11_Sub10_Sub4_Sub2.inBuffer.readBits(1);
                            if (i_14_ == 1)
                                anIntArrayArrayArray1092[i_11_][i_12_][i_13_] = Class11_Sub10_Sub4_Sub2.inBuffer.readBits(26);
                            else anIntArrayArrayArray1092[i_11_][i_12_][i_13_] = -1;
                        }
                    }
                }
                Class11_Sub10_Sub4_Sub2.inBuffer.method199((byte) 43);
                int i_15_ = ((-(Class11_Sub10_Sub4_Sub2.inBuffer.position) + Class11_Sub10_Sub14.anInt2348) / 16);
                Class11_Sub10_Sub4_Sub5.xteaKeys = new int[i_15_][4];
                for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_16_++) {
                    for (int i_17_ = 0; i_17_ < 4; i_17_++)
                        Class11_Sub10_Sub4_Sub5.xteaKeys[i_16_][i_17_] = Class11_Sub10_Sub4_Sub2.inBuffer.method192(93);
                }
                int i_18_ = Class11_Sub10_Sub4_Sub2.inBuffer.readUByteA();
                int i_19_ = Class11_Sub10_Sub4_Sub2.inBuffer.method174(33);
                int i_20_ = Class11_Sub10_Sub4_Sub2.inBuffer.method141(-84);
                int i_21_ = Class11_Sub10_Sub4_Sub2.inBuffer.method174(28);
                Class11_Sub10_Sub4_Sub1.anIntArray2490 = new int[i_15_];
                Canvas_Sub1.anIntArray64 = new int[i_15_];
                Class60.aByteArrayArray1259 = new byte[i_15_][];
                Class11_Sub10_Sub4_Sub3.anIntArray2589 = new int[i_15_];
                Class11_Sub10_Sub11.aByteArrayArray2257 = new byte[i_15_][];
                i_15_ = 0;
                for (int i_22_ = 0; i_22_ < 4; i_22_++) {
                    for (int i_23_ = 0; i_23_ < 13; i_23_++) {
                        for (int i_24_ = 0; i_24_ < 13; i_24_++) {
                            int i_25_ = (anIntArrayArrayArray1092[i_22_][i_23_][i_24_]);
                            if (i_25_ != -1) {
                                int i_26_ = 0x3ff & i_25_ >> 429733134;
                                int i_27_ = (i_25_ & 0x3ffc) >> -2054250109;
                                int i_28_ = (i_26_ / 8 << -917639992) + i_27_ / 8;
                                for (int i_29_ = 0; ((i_15_ ^ 0xffffffff) < (i_29_ ^ 0xffffffff)); i_29_++) {
                                    if (i_28_ == (Class11_Sub10_Sub4_Sub3.anIntArray2589[i_29_])) {
                                        i_28_ = -1;
                                        break;
                                    }
                                }
                                if (i_28_ != -1) {
                                    Class11_Sub10_Sub4_Sub3.anIntArray2589[i_15_] = i_28_;
                                    int i_30_ = (0xffc4 & i_28_) >> -1025223800;
                                    int i_31_ = 0xff & i_28_;
                                    Class11_Sub10_Sub4_Sub1.anIntArray2490[i_15_] = (Class13.mapsArchive.hashFileName((byte) -18, (Class40.method744(0, (new Class31[]{Class59.aClass31_1235, (Class11_Sub11.method493(i_30_, (byte) -126)), Class51.aClass31_1015, (Class11_Sub11.method493(i_31_, (byte) -125))})))));
                                    Canvas_Sub1.anIntArray64[i_15_] = (Class13.mapsArchive.hashFileName((byte) -18, (Class40.method744(0, (new Class31[]{Canvas_Sub1.aClass31_62, (Class11_Sub11.method493(i_30_, (byte) -128)), Class51.aClass31_1015, (Class11_Sub11.method493(i_31_, (byte) -124))})))));
                                    i_15_++;
                                }
                            }
                        }
                    }
                }
                Class43.method753(i_20_, i_18_, (byte) 93, i, i_19_, i_21_);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ud.Q(" + arg0 + ',' + arg1 + ')');
        }
    }

    public boolean method878(int arg0, int arg1) {
        try {
            anInt1114++;
            if (aByteArrayArray1102[arg0] != null) return true;
            method881((byte) 2, arg0);
            int i = -35 % ((31 - arg1) / 53);
            if (aByteArrayArray1102[arg0] != null) return true;
            return false;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ud.IA(" + arg0 + ',' + arg1 + ')');
        }
    }

    public byte[] method879(int arg0, int arg1, int arg2) {
        try {
            anInt1090++;
            if ((arg0 ^ 0xffffffff) > arg2 || ((aByteArrayArrayArray1118.length ^ 0xffffffff) >= (arg0 ^ 0xffffffff)) || aByteArrayArrayArray1118[arg0] == null || arg1 < 0 || ((arg1 ^ 0xffffffff) <= (aByteArrayArrayArray1118[arg0].length ^ 0xffffffff)))
                return null;
            if (aByteArrayArrayArray1118[arg0][arg1] == null) {
                boolean bool = method893(arg0, 32364, null);
                if (!bool) {
                    method881((byte) 2, arg0);
                    bool = method893(arg0, 32364, null);
                    if (!bool) return null;
                }
            }
            byte[] is = aByteArrayArrayArray1118[arg0][arg1];
            return is;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ud.LA(" + arg0 + ',' + arg1 + ',' + arg2 + ')'));
        }
    }

    public byte[] method880(int arg0, int arg1) {
        try {
            anInt1138++;
            if (arg0 >= -111) return null;
            if (aByteArrayArrayArray1118.length == 1) return method879(0, arg1, -1);
            if ((aByteArrayArrayArray1118[arg1].length ^ 0xffffffff) == -2) return method879(arg1, 0, -1);
            throw new RuntimeException();
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ud.FA(" + arg0 + ',' + arg1 + ')');
        }
    }

    public void method881(byte arg0, int arg1) {
        anInt1094++;
        if (arg0 != 2) method897(false);
    }

    public void method882(boolean arg0, Class31 arg1) {
        try {
            anInt1137++;
            arg1 = arg1.method650(-62);
            int i = aClass25_1100.method596(-35, arg1.method644(4));
            if (arg0 == true && i >= 0) method875(i, -28304);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ud.DA(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
        }
    }

    public boolean method883(int arg0, int arg1, int arg2) {
        try {
            anInt1117++;
            if (arg2 < 0 || aByteArrayArrayArray1118.length <= arg2 || aByteArrayArrayArray1118[arg2] == null || (arg1 ^ 0xffffffff) > -1 || aByteArrayArrayArray1118[arg2].length <= arg1)
                return false;
            if (arg0 != 50) aClass31_1139 = null;
            if (aByteArrayArrayArray1118[arg2][arg1] != null) return true;
            if (aByteArrayArray1102[arg2] != null) return true;
            method881((byte) 2, arg2);
            if (aByteArrayArray1102[arg2] != null) return true;
            return false;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ud.PA(" + arg0 + ',' + arg1 + ',' + arg2 + ')'));
        }
    }

    public byte[] method884(int arg0, int arg1) {
        try {
            anInt1110++;
            if ((aByteArrayArrayArray1118.length ^ 0xffffffff) == -2) return method887((byte) -123, arg1, 0);
            if (arg0 != 0) anInt1098 = 1;
            if (aByteArrayArrayArray1118[arg1].length == 1) return method887((byte) -124, 0, arg1);
            throw new RuntimeException();
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ud.HA(" + arg0 + ',' + arg1 + ')');
        }
    }

    public void method885(byte[] arg0, int arg1) {
        checksum = Buffer.method186(arg0.length, arg0, true);
        anInt1115++;
        Buffer buffer = new Buffer(Class46.method782((byte) 103, arg0));
        int i = buffer.readUByte();
        if ((i ^ 0xffffffff) == -6) {
            int i_32_ = -1;
            int i_33_ = 0;
            int i_34_ = buffer.readUByte();
            anInt1104 = buffer.readUShortBE();
            anIntArray1105 = new int[anInt1104];
            for (int i_35_ = 0; anInt1104 > i_35_; i_35_++) {
                anIntArray1105[i_35_] = i_33_ += buffer.readUShortBE();
                if (i_32_ < anIntArray1105[i_35_]) i_32_ = anIntArray1105[i_35_];
            }
            anIntArray1088 = new int[1 + i_32_];
            aByteArrayArrayArray1118 = new byte[i_32_ + 1][][];
            aByteArrayArray1102 = new byte[1 + i_32_][];
            anIntArrayArray1099 = new int[1 + i_32_][];
            anIntArray1135 = new int[1 + i_32_];
            anIntArray1124 = new int[1 + i_32_];
            if (i_34_ != 0) {
                anIntArray1101 = new int[i_32_ + 1];
                for (int i_36_ = 0; anInt1104 > i_36_; i_36_++)
                    anIntArray1101[anIntArray1105[i_36_]] = buffer.readUIntBE();
                aClass25_1100 = new Class25(anIntArray1101);
            }
            for (int i_37_ = arg1; i_37_ < anInt1104; i_37_++)
                anIntArray1135[anIntArray1105[i_37_]] = buffer.readUIntBE();
            for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > (anInt1104 ^ 0xffffffff); i_38_++)
                anIntArray1088[anIntArray1105[i_38_]] = buffer.readUIntBE();
            for (int i_39_ = 0; anInt1104 > i_39_; i_39_++)
                anIntArray1124[anIntArray1105[i_39_]] = buffer.readUShortBE();
            for (int i_40_ = 0; i_40_ < anInt1104; i_40_++) {
                i_33_ = 0;
                int i_41_ = anIntArray1105[i_40_];
                int i_42_ = -1;
                int i_43_ = anIntArray1124[i_41_];
                anIntArrayArray1099[i_41_] = new int[i_43_];
                for (int i_44_ = 0; i_43_ > i_44_; i_44_++) {
                    int i_45_ = (anIntArrayArray1099[i_41_][i_44_] = i_33_ += (buffer.readUShortBE()));
                    if (i_45_ > i_42_) i_42_ = i_45_;
                }
                aByteArrayArrayArray1118[i_41_] = new byte[i_42_ + 1][];
            }
            if (i_34_ != 0) {
                anIntArrayArray1128 = new int[i_32_ - -1][];
                aClass25Array1123 = new Class25[1 + i_32_];
                for (int i_46_ = 0; (anInt1104 ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++) {
                    int i_47_ = anIntArray1105[i_46_];
                    int i_48_ = anIntArray1124[i_47_];
                    anIntArrayArray1128[i_47_] = new int[aByteArrayArrayArray1118[i_47_].length];
                    for (int i_49_ = 0; i_48_ > i_49_; i_49_++)
                        anIntArrayArray1128[i_47_][(anIntArrayArray1099[i_47_][i_49_])] = buffer.readUIntBE();
                    aClass25Array1123[i_47_] = new Class25(anIntArrayArray1128[i_47_]);
                }
            }
        }
    }

    public void method886(int arg0, int arg1) {
        try {
            anInt1109++;
            for (int i = arg1; i < aByteArrayArrayArray1118[arg0].length; i++)
                aByteArrayArrayArray1118[arg0][i] = null;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ud.R(" + arg0 + ',' + arg1 + ')');
        }
    }

    public byte[] method887(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 >= -115) method883(-122, 49, -126);
            anInt1120++;
            return method901(arg1, arg2, null, 115);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ud.OA(" + arg0 + ',' + arg1 + ',' + arg2 + ')'));
        }
    }

    public byte[] method888(Class31 arg0, byte arg1, Class31 arg2) {
        try {
            anInt1121++;
            arg0 = arg0.method650(-120);
            arg2 = arg2.method650(-66);
            if (arg1 <= 76) method884(125, 40);
            int i = aClass25_1100.method596(-73, arg0.method644(-22));
            int i_50_ = aClass25Array1123[i].method596(-74, arg2.method644(107));
            return method887((byte) -124, i_50_, i);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ud.W(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method889(byte arg0) {
        try {
            aClass31_1126 = null;
            aClass31_1113 = null;
            aClass31_1119 = null;
            anObject1111 = null;
            anIntArray1103 = null;
            aClass31_1095 = null;
            aClass45_1141 = null;
            anIntArrayArrayArray1092 = null;
            if (arg0 != -84) anInt1129 = -101;
            aClass31_1139 = null;
            aClass11_Sub10_Sub13_Sub4Array1140 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ud.BA(" + arg0 + ')');
        }
    }

    public int method890(byte arg0) {
        try {
            anInt1093++;
            int i = 32 % ((arg0 - -62) / 40);
            return aByteArrayArrayArray1118.length;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ud.V(" + arg0 + ')');
        }
    }

    public int method891(boolean arg0, Class31 arg1, int arg2) {
        try {
            anInt1107++;
            if (arg0 != false) aClass45_1141 = null;
            arg1 = arg1.method650(-85);
            return aClass25Array1123[arg2].method596(-100, arg1.method644(-105));
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ud.U(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
        }
    }

    public boolean method892(Class31 arg0, int arg1, Class31 arg2) {
        try {
            anInt1112++;
            arg2 = arg2.method650(-102);
            arg0 = arg0.method650(arg1 + -23);
            if (arg1 != 0) anInt1142 = -11;
            int i = aClass25_1100.method596(-78, arg2.method644(-27));
            int i_51_ = aClass25Array1123[i].method596(-62, arg0.method644(-119));
            return method883(arg1 ^ 0x32, i_51_, i);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ud.NA(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')'));
        }
    }

    public boolean method893(int arg0, int arg1, int[] arg2) {
        try {
            anInt1132++;
            if (aByteArrayArray1102[arg0] == null) return false;
            if (arg1 != 32364) return false;
            boolean bool = true;
            int[] is = anIntArrayArray1099[arg0];
            byte[][] is_52_ = aByteArrayArrayArray1118[arg0];
            int i = anIntArray1124[arg0];
            for (int i_53_ = 0; i > i_53_; i_53_++) {
                if (is_52_[is[i_53_]] == null) {
                    bool = false;
                    break;
                }
            }
            if (bool) return true;
            byte[] is_54_;
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || (arg2[2] ^ 0xffffffff) != -1 || (arg2[3] ^ 0xffffffff) != -1)) {
                is_54_ = new byte[aByteArrayArray1102[arg0].length];
                Class21.method574(aByteArrayArray1102[arg0], 0, is_54_, 0, is_54_.length);
                Buffer buffer = new Buffer(is_54_);
                buffer.method144(buffer.payload.length, 8, arg2, 5);
            } else is_54_ = aByteArrayArray1102[arg0];
            byte[] is_55_;
            try {
                is_55_ = Class46.method782((byte) 95, is_54_);
            } catch (RuntimeException runtimeexception) {
                throw Class58.method939(runtimeexception, ("T3 - " + (arg2 != null) + "," + arg0 + "," + is_54_.length + "," + Buffer.method186(is_54_.length, is_54_, true) + "," + Buffer.method186(is_54_.length + -2, is_54_, true) + "," + anIntArray1135[arg0] + "," + checksum));
            }
            if (aBoolean1130) aByteArrayArray1102[arg0] = null;
            if ((i ^ 0xffffffff) >= -2) is_52_[is[0]] = is_55_;
            else {
                int i_56_ = is_55_.length;
                int i_57_ = 0xff & is_55_[--i_56_];
                i_56_ -= 4 * (i_57_ * i);
                Buffer buffer = new Buffer(is_55_);
                buffer.position = i_56_;
                int[] is_58_ = new int[i];
                for (int i_59_ = 0; i_59_ < i_57_; i_59_++) {
                    int i_60_ = 0;
                    for (int i_61_ = 0; (i ^ 0xffffffff) < (i_61_ ^ 0xffffffff); i_61_++) {
                        i_60_ += buffer.readUIntBE();
                        is_58_[i_61_] += i_60_;
                    }
                }
                for (int i_62_ = 0; (i ^ 0xffffffff) < (i_62_ ^ 0xffffffff); i_62_++) {
                    if (is_52_[is[i_62_]] == null) is_52_[is[i_62_]] = new byte[is_58_[i_62_]];
                    is_58_[i_62_] = 0;
                }
                buffer.position = i_56_;
                int i_63_ = 0;
                for (int i_64_ = 0; i_57_ > i_64_; i_64_++) {
                    int i_65_ = 0;
                    for (int i_66_ = 0; (i ^ 0xffffffff) < (i_66_ ^ 0xffffffff); i_66_++) {
                        i_65_ += buffer.readUIntBE();
                        Class21.method574(is_55_, i_63_, is_52_[is[i_66_]], is_58_[i_66_], i_65_);
                        is_58_[i_66_] += i_65_;
                        i_63_ += i_65_;
                    }
                }
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ud.CA(" + arg0 + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method894(int arg0, Class55 arg1) {
        try {
            anInt1087++;
            if (arg0 != 27537) aClass45_1141 = null;
            Class10.aClass55_204 = arg1;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ud.MA(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
        }
    }

    public int method895(int arg0, byte arg1) {
        try {
            if (arg1 != 120) aClass11_Sub10_Sub13_Sub4Array1140 = null;
            anInt1125++;
            return aByteArrayArrayArray1118[arg0].length;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ud.KA(" + arg0 + ',' + arg1 + ')');
        }
    }

    public static Class11_Sub10_Sub13_Sub3 method896(Class55 arg0, boolean arg1, Class31 arg2, Class31 arg3) {
        try {
            if (arg1 != true) return null;
            anInt1131++;
            int i = arg0.hashFileName((byte) -18, arg3);
            int i_67_ = arg0.method891(false, arg2, i);
            return Class48.method790(0, i, arg0, i_67_);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ud.T(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ',' + (arg3 != null ? "{...}" : "null") + ')'));
        }
    }

    public boolean method897(boolean arg0) {
        try {
            anInt1096++;
            boolean bool = arg0;
            for (int i = 0; anIntArray1105.length > i; i++) {
                int i_68_ = anIntArray1105[i];
                if (aByteArrayArray1102[i_68_] == null) {
                    method881((byte) 2, i_68_);
                    if (aByteArrayArray1102[i_68_] == null) bool = false;
                }
            }
            return bool;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ud.RA(" + arg0 + ')');
        }
    }

    public static Class11_Sub10_Sub13_Sub4[] method898(Class55 arg0, int arg1, int arg2, int arg3) {
        try {
            anInt1136++;
            if (!Class37_Sub1.method714(arg1, -29446, arg0, arg3)) return null;
            if (arg2 != 0) constructMapRegion(false, -103);
            return Class11_Sub10_Sub15.method478((byte) 22);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ud.AA(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
        }
    }

    public int hashFileName(byte arg0, Class31 arg1) {
        try {
            anInt1127++;
            if (arg0 != -18) method886(-16, 107);
            arg1 = arg1.method650(-104);
            return aClass25_1100.method596(-60, arg1.method644(-45));
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ud.S(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
        }
    }

    public int[] method900(byte arg0, int arg1) {
        try {
            if (arg0 >= -50) aBoolean1108 = true;
            anInt1133++;
            return anIntArrayArray1099[arg1];
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ud.JA(" + arg0 + ',' + arg1 + ')');
        }
    }

    public byte[] method901(int arg0, int arg1, int[] arg2, int arg3) {
        try {
            if (arg3 <= 86) anIntArray1135 = null;
            anInt1134++;
            if (arg1 < 0 || aByteArrayArrayArray1118.length <= arg1 || aByteArrayArrayArray1118[arg1] == null || arg0 < 0 || ((aByteArrayArrayArray1118[arg1].length ^ 0xffffffff) >= (arg0 ^ 0xffffffff)))
                return null;
            if (aByteArrayArrayArray1118[arg1][arg0] == null) {
                boolean bool = method893(arg1, 32364, arg2);
                if (!bool) {
                    method881((byte) 2, arg1);
                    bool = method893(arg1, 32364, arg2);
                    if (!bool) return null;
                }
            }
            byte[] is = aByteArrayArrayArray1118[arg1][arg0];
            if (aBoolean1108) aByteArrayArrayArray1118[arg1][arg0] = null;
            return is;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ud.GA(" + arg0 + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
        }
    }

    public Class55(boolean arg0, boolean arg1) {
        try {
            aBoolean1130 = arg0;
            aBoolean1108 = arg1;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ud.<init>(" + arg0 + ',' + arg1 + ')');
        }
    }

    static {
        anIntArray1103 = new int[]{16, 32, 64, 128};
        anInt1091 = 0;
        anIntArrayArrayArray1092 = new int[4][13][13];
        aClass31_1095 = Class64.method992("Aug", 255);
        anInt1129 = -1;
        aClass31_1126 = Class64.method992("Cancel", 255);
        aClass31_1119 = Class64.method992("hitmarks", 255);
        anObject1111 = new Object();
        aClass31_1139 = Class64.method992("Accept trade @whi@", 255);
        anInt1143 = 0;
    }
}
