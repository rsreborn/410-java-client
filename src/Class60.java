/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class60
{
    public static Class31 aClass31_1244;
    public static int anInt1245;
    public static Class3 aClass3_1246;
    public static Class31 aClass31_1247 = Class64.method992("p12_full", 255);
    public static Class34 aClass34_1248;
    public static volatile int anInt1249 = 0;
    public static int anInt1250;
    public static int anInt1251;
    public static int anInt1252;
    public static Class31 aClass31_1253;
    public static int anInt1254;
    public static int anInt1255;
    public static int anInt1256;
    public static Class31 aClass31_1257 = Class64.method992(":tradereq:", 255);
    public static Class31 aClass31_1258;
    public static byte[][] aByteArrayArray1259;
    public static Canvas_Sub1 aCanvas_Sub1_1260;
    
    public static int method949(boolean arg0, boolean arg1, int arg2) {
	try {
	    anInt1250++;
	    int i = arg2;
	    if (arg1)
		i += Class11_Sub10_Sub4_Sub2_Sub2.anInt2822 + Class12.anInt238;
	    if (arg0)
		i += Class11_Sub10_Sub3.anInt2016 + Class52.anInt1032;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("wb.A(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public static Class11_Sub10_Sub15 method950(int arg0, int arg1) {
	try {
	    int i = 83 % ((arg0 - 10) / 40);
	    anInt1245++;
	    Class11_Sub10_Sub15 class11_sub10_sub15
		= ((Class11_Sub10_Sub15)
		   Class42.aClass40_758.method735((long) arg1, (byte) -101));
	    if (class11_sub10_sub15 != null)
		return class11_sub10_sub15;
	    byte[] is
		= Class11_Sub10_Sub16.aClass55_2436.method887((byte) -126,
							      arg1, 10);
	    class11_sub10_sub15 = new Class11_Sub10_Sub15();
	    class11_sub10_sub15.anInt2409 = arg1;
	    if (is != null)
		class11_sub10_sub15.method487(0, new Buffer(is));
	    class11_sub10_sub15.method479(13225);
	    if ((class11_sub10_sub15.anInt2380 ^ 0xffffffff) != 0)
		class11_sub10_sub15.method484
		    (127, method950(-122, class11_sub10_sub15.anInt2412),
		     method950(98, class11_sub10_sub15.anInt2380));
	    if (!Class15.aBoolean317 && class11_sub10_sub15.aBoolean2369) {
		class11_sub10_sub15.aClass31Array2374 = null;
		class11_sub10_sub15.aClass31Array2389 = null;
		class11_sub10_sub15.aClass31_2406 = Class62.aClass31_1303;
		class11_sub10_sub15.aClass31_2388
		    = Class11_Sub10_Sub11.aClass31_2264;
		class11_sub10_sub15.anInt2402 = 0;
	    }
	    Class42.aClass40_758.method742(-124, (long) arg1,
					   class11_sub10_sub15);
	    return class11_sub10_sub15;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "wb.D(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method951(int arg0) {
	try {
	    aCanvas_Sub1_1260 = null;
	    if (arg0 == 0) {
		aClass31_1247 = null;
		aClass34_1248 = null;
		aClass31_1257 = null;
		aClass31_1244 = null;
		aClass31_1253 = null;
		aClass31_1258 = null;
		aByteArrayArray1259 = null;
		aClass3_1246 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "wb.E(" + arg0 + ')');
	}
    }
    
    public static void method952(byte arg0) {
	try {
	    Class11_Sub10_Sub9.aBoolean2200 = true;
	    Class11_Sub10_Sub1.aLong1929 = 0L;
	    anInt1252++;
	    Class11_Sub10_Sub5.anInt2118 = 0;
	    Class11_Sub4.aBoolean1475 = true;
	    Class11_Sub7.anInt1596 = 0;
	    Class40.anInt736 = 0;
	    Class11_Sub10_Sub5.anInt2127 = 0;
	    Class20.anInt399 = 0;
	    Class50.anInt989 = 0;
	    Class3.anInt125 = 0;
	    Buffer.anInt1517 = 0;
	    client.anInt1463 = 0;
	    Class12.anInt242 = 0;
	    Class54.anInt1074 = 0;
	    Class61.anInt1264 = 0;
	    Class15_Sub2.anInt1774 = 0;
	    Class8.anInt169 = 0;
	    Class31.anInt1385 = 0;
	    Class11.anInt230 = 0;
	    Buffer.anInt1551 = 0;
	    Class64.anInt1339 = 0;
	    Class59.anInt1234 = 0;
	    Class6.anInt158 = 0;
	    Class58.anInt1211 = 0;
	    Class44.anInt802 = 0;
	    Class31.anInt1391 = 0;
	    Class13.anInt261 = 0;
	    Class11_Sub10_Sub12.anInt2297 = 0;
	    Class55.anInt1121 = 0;
	    Class50.anInt996 = 0;
	    Class11_Sub10_Sub9.anInt2204 = 0;
	    Buffer.anInt1527 = 0;
	    Class34.anInt621 = 0;
	    Class11_Sub11.anInt1685 = 0;
	    Class61.anInt1281 = 0;
	    Class42.anInt755 = 0;
	    Class34.anInt646 = 0;
	    Class6.anInt154 = 0;
	    Class54.anInt1077 = 0;
	    Class37.anInt697 = 0;
	    Class11_Sub10_Sub14.anInt2311 = 0;
	    Class11_Sub6.anInt1589 = 0;
	    Class11_Sub10_Sub8.anInt2180 = 0;
	    Buffer.anInt1546 = 0;
	    Class39.anInt705 = 0;
	    Class31.anInt1374 = 0;
	    Class55.anInt1115 = 0;
	    Buffer.anInt1568 = 0;
	    Class39_Sub1.anInt1810 = 0;
	    Class14.anInt283 = 0;
	    Canvas_Sub1.anInt53 = 0;
	    Buffer.anInt1511 = 0;
	    Class11_Sub10_Sub9.anInt2202 = 0;
	    Class1.anInt78 = 0;
	    Canvas_Sub1.anInt60 = 0;
	    Class8.anInt189 = 0;
	    Class33.anInt599 = 0;
	    Class11_Sub10_Sub11.anInt2254 = 0;
	    Buffer.anInt1570 = 0;
	    Class44.anInt812 = 0;
	    Class47.anInt870 = 0;
	    Class61.anInt1280 = 0;
	    Class11_Sub10_Sub15.anInt2361 = 0;
	    Class11_Sub5_Sub1.anInt1908 = 0;
	    Class11.anInt225 = 0;
	    Class24.anInt451 = 0;
	    Canvas_Sub1.anInt44 = 0;
	    Class11_Sub10_Sub14.anInt2332 = 0;
	    Class11_Sub10_Sub14.anInt2347 = 0;
	    Class11_Sub12.anInt1694 = 0;
	    Class11_Sub5_Sub1.anInt1914 = 0;
	    Class51.anInt1010 = 0;
	    Class11_Sub10_Sub4.anInt2044 = 0;
	    Class36.anInt672 = 0;
	    Buffer.anInt1506 = 0;
	    Class11_Sub10_Sub10.anInt2212 = 0;
	    Class42.anInt756 = 0;
	    Class11_Sub8.anInt1624 = 0;
	    Class55.anInt1112 = 0;
	    Class15_Sub1.anInt1742 = 0;
	    Canvas_Sub1.anInt59 = 0;
	    Class11_Sub10_Sub14.anInt2356 = 0;
	    Applet_Sub1.anInt36 = 0;
	    Class53.anInt1049 = 0;
	    Applet_Sub1.anInt4 = 0;
	    Class11_Sub10_Sub6.anInt2136 = 0;
	    Buffer.anInt1536 = 0;
	    Class11_Sub10_Sub6.anInt2129 = 0;
	    Class62.anInt1291 = 0;
	    Class11_Sub10_Sub4_Sub2.anInt2548 = 0;
	    Class11_Sub10_Sub1.anInt1940 = 0;
	    Class11_Sub10_Sub6.anInt2139 = 0;
	    Class58.anInt1207 = 0;
	    Class29.anInt533 = 0;
	    Class11_Sub12.anInt1691 = 0;
	    Class11_Sub10_Sub2.anInt1954 = 0;
	    Class3.anInt117 = 0;
	    Class43.anInt774 = 0;
	    client.anInt1459 = 0;
	    Class32.anInt585 = 0;
	    Class11_Sub10_Sub15.anInt2367 = 0;
	    Class20.anInt384 = 0;
	    Class64.anInt1345 = 0;
	    Applet_Sub1.anInt34 = 0;
	    Class61.anInt1278 = 0;
	    Class32.anInt579 = 0;
	    Class8.anInt170 = 0;
	    Class52.anInt1018 = 0;
	    Class11_Sub10_Sub12.anInt2298 = 0;
	    Class11_Sub4.anInt1483 = 0;
	    Class55.anInt1109 = 0;
	    Class24.anInt444 = 0;
	    Class36.anInt669 = 0;
	    Class8.anInt186 = 0;
	    RuntimeException_Sub1.anInt1354 = 0;
	    Buffer.anInt1545 = 0;
	    Class11_Sub10_Sub4_Sub3.anInt2574 = 0;
	    Class31.anInt1406 = 0;
	    client.anInt1467 = 0;
	    Class11_Sub10_Sub4_Sub1.anInt2469 = 0;
	    Class11_Sub10_Sub16.anInt2427 = 0;
	    Buffer.anInt1553 = 0;
	    Class11_Sub10_Sub9.anInt2208 = 0;
	    Class40.anInt737 = 0;
	    Class55.anInt1117 = 0;
	    Class11_Sub5_Sub1.anInt1919 = 0;
	    anInt1251 = 0;
	    Class57.anInt1190 = 0;
	    Class11_Sub10_Sub5.anInt2113 = 0;
	    Class11_Sub10_Sub4.anInt2036 = 0;
	    Class63.anInt1314 = 0;
	    Class29.anInt540 = 0;
	    Class37_Sub1.anInt1787 = 0;
	    Class11_Sub10_Sub2.anInt1966 = 0;
	    Class55.anInt1137 = 0;
	    Class11_Sub10_Sub2.anInt1961 = 0;
	    Class7.anInt1430 = 0;
	    Class44.anInt807 = 0;
	    Class11_Sub12.anInt1697 = 0;
	    Class31.anInt1394 = 0;
	    Buffer.anInt1507 = 0;
	    Class11_Sub10_Sub1.anInt1937 = 0;
	    Class11_Sub10_Sub7.anInt2162 = 0;
	    Class53.anInt1044 = 0;
	    Class11_Sub10_Sub7.anInt2157 = 0;
	    Class11_Sub6.anInt1577 = 0;
	    Class31.anInt1400 = 0;
	    Class14.anInt290 = 0;
	    Class10.anInt210 = 0;
	    Class23.anInt424 = 0;
	    Class15_Sub2.anInt1762 = 0;
	    client.anInt1462 = 0;
	    Class11_Sub10_Sub7.anInt2156 = 0;
	    Class15_Sub1.anInt1749 = 0;
	    Buffer.anInt1554 = 0;
	    Class31.anInt1365 = 0;
	    Class31.anInt1372 = 0;
	    Class11_Sub12.anInt1692 = 0;
	    Class11_Sub10_Sub4_Sub6.anInt2702 = 0;
	    Class11_Sub10_Sub7.anInt2159 = 0;
	    Class51.anInt1012 = 0;
	    Class9.anInt201 = 0;
	    Class59.anInt1237 = 0;
	    Class55_Sub1.anInt1855 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub2.anInt2821 = 0;
	    Class48.anInt892 = 0;
	    Class47.anInt866 = 0;
	    Class15_Sub2.anInt1755 = 0;
	    Class20.anInt385 = 0;
	    Buffer.anInt1544 = 0;
	    Class34.anInt643 = 0;
	    Class11_Sub10_Sub1.anInt1942 = 0;
	    Class46.anInt847 = 0;
	    Class11_Sub10_Sub7.anInt2165 = 0;
	    Class11_Sub7.anInt1601 = 0;
	    Class53.anInt1039 = 0;
	    Class51.anInt1008 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub2.anInt2829 = 0;
	    Class47.anInt871 = 0;
	    Class11_Sub10_Sub15.anInt2377 = 0;
	    Class40.anInt724 = 0;
	    Class34.anInt639 = 0;
	    Class59.anInt1238 = 0;
	    Class36.anInt662 = 0;
	    Class11_Sub10_Sub5.anInt2095 = 0;
	    Class3.anInt110 = 0;
	    Applet_Sub1.anInt23 = 0;
	    Buffer.anInt1512 = 0;
	    Class11.anInt224 = 0;
	    Class1.anInt87 = 0;
	    Class22.anInt405 = 0;
	    client.anInt1465 = 0;
	    Class55.anInt1094 = 0;
	    Class55.anInt1087 = 0;
	    Class55_Sub1.anInt1864 = 0;
	    anInt1255 = 0;
	    Buffer.anInt1548 = 0;
	    Buffer.anInt1525 = 0;
	    Class11_Sub4.anInt1478 = 0;
	    Class11_Sub10_Sub6.anInt2132 = 0;
	    Class23.anInt428 = 0;
	    Class3.anInt116 = 0;
	    Class12.anInt239 = 0;
	    Class46.anInt859 = 0;
	    Class4.anInt140 = 0;
	    Class11_Sub10_Sub15.anInt2424 = 0;
	    Class6.anInt164 = 0;
	    Class64.anInt1329 = 0;
	    Class11_Sub12.anInt1706 = 0;
	    Class31.anInt1384 = 0;
	    Class11_Sub10_Sub4_Sub2.anInt2522 = 0;
	    Class32.anInt594 = 0;
	    Class11_Sub10_Sub15.anInt2396 = 0;
	    Class43.anInt784 = 0;
	    Class58.anInt1220 = 0;
	    Class1.anInt92 = 0;
	    Class13.anInt253 = 0;
	    Class37_Sub1.anInt1789 = 0;
	    Class47.anInt867 = 0;
	    Canvas_Sub1.anInt52 = 0;
	    Buffer.anInt1541 = 0;
	    Class11_Sub10_Sub11.anInt2249 = 0;
	    Class15.anInt305 = 0;
	    Class32.anInt588 = 0;
	    Class11_Sub10_Sub4.anInt2045 = 0;
	    Class58.anInt1217 = 0;
	    Class29.anInt543 = 0;
	    Applet_Sub1.anInt9 = 0;
	    Class11_Sub10_Sub15.anInt2376 = 0;
	    Class25.anInt474 = 0;
	    Class11_Sub10_Sub14.anInt2343 = 0;
	    Class37_Sub1.anInt1795 = 0;
	    Class15.anInt306 = 0;
	    Class11_Sub10_Sub11.anInt2246 = 0;
	    Class11_Sub10_Sub15.anInt2401 = 0;
	    Class15_Sub2.anInt1773 = 0;
	    Class64.anInt1335 = 0;
	    Class11_Sub10_Sub4_Sub5.anInt2690 = 0;
	    Class61.anInt1275 = 0;
	    Class40.anInt727 = 0;
	    Class8.anInt171 = 0;
	    Class50.anInt983 = 0;
	    Class32.anInt590 = 0;
	    Class36.anInt663 = 0;
	    Buffer.anInt1555 = 0;
	    Class11_Sub10_Sub15.anInt2415 = 0;
	    Class11_Sub10_Sub10.anInt2235 = 0;
	    Class11_Sub10_Sub5.anInt2058 = 0;
	    Class36.anInt653 = 0;
	    Class37_Sub1.anInt1786 = 0;
	    Class8.anInt176 = 0;
	    Class24.anInt450 = 0;
	    Class55_Sub1.anInt1854 = 0;
	    Class39.anInt712 = 0;
	    Class36.anInt679 = 0;
	    Class11_Sub5_Sub1.anInt1909 = 0;
	    Class64.anInt1336 = 0;
	    Class6.anInt155 = 0;
	    Buffer.anInt1561 = 0;
	    Class24.anInt440 = 0;
	    Class3.anInt129 = 0;
	    Class58.anInt1215 = 0;
	    Class11_Sub10_Sub7.anInt2150 = 0;
	    Class37.anInt698 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub1.anInt2811 = 0;
	    Class11_Sub10_Sub9.anInt2205 = 0;
	    Class58.anInt1210 = 0;
	    client.anInt1460 = 0;
	    Class24.anInt446 = 0;
	    Class11_Sub10_Sub12.anInt2290 = 0;
	    Class11_Sub10_Sub4_Sub5.anInt2672 = 0;
	    Class3.anInt115 = 0;
	    Class8.anInt181 = 0;
	    Class11_Sub10_Sub4_Sub3.anInt2579 = 0;
	    Buffer.anInt1547 = 0;
	    Class22.anInt400 = 0;
	    Class31.anInt1397 = 0;
	    Applet_Sub1.anInt11 = 0;
	    Class11_Sub10_Sub4_Sub2.anInt2550 = 0;
	    Class33.anInt611 = 0;
	    Class40.anInt740 = 0;
	    Class31.anInt1364 = 0;
	    Class36.anInt677 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub1.anInt2785 = 0;
	    Class1.anInt81 = 0;
	    Class14.anInt299 = 0;
	    Class11_Sub10_Sub4_Sub3.anInt2581 = 0;
	    Class44.anInt804 = 0;
	    Class31.anInt1380 = 0;
	    Class34.anInt623 = 0;
	    Class58.anInt1219 = 0;
	    Class11_Sub10_Sub10.anInt2218 = 0;
	    Class11_Sub10_Sub1.anInt1931 = 0;
	    Class8.anInt185 = 0;
	    Class15_Sub1.anInt1743 = 0;
	    Class39_Sub1.anInt1816 = 0;
	    Canvas_Sub1.anInt47 = 0;
	    Buffer.anInt1542 = 0;
	    Class11_Sub6.anInt1584 = 0;
	    anInt1250 = 0;
	    Class8.anInt184 = 0;
	    Class32.anInt576 = 0;
	    Class11_Sub10_Sub6.anInt2128 = 0;
	    Class11_Sub6.anInt1576 = 0;
	    Class32.anInt593 = 0;
	    Class31.anInt1362 = 0;
	    Class37_Sub1.anInt1791 = 0;
	    Class7.anInt1450 = 0;
	    Class11_Sub10_Sub15.anInt2411 = 0;
	    Class11_Sub10_Sub4_Sub5.anInt2683 = 0;
	    Class34.anInt626 = 0;
	    Class11_Sub10_Sub6.anInt2143 = 0;
	    Class52.anInt1017 = 0;
	    Class15.anInt313 = 0;
	    Class4.anInt138 = 0;
	    Class37_Sub1.anInt1803 = 0;
	    Class24.anInt447 = 0;
	    Class11_Sub10_Sub7.anInt2152 = 0;
	    Class31.anInt1408 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub2.anInt2827 = 0;
	    Class46.anInt851 = 0;
	    Buffer.anInt1537 = 0;
	    anInt1245 = 0;
	    Canvas_Sub1.anInt49 = 0;
	    Class24.anInt445 = 0;
	    Class11_Sub5_Sub1.anInt1923 = 0;
	    Applet_Sub1.anInt17 = 0;
	    Class55_Sub1.anInt1849 = 0;
	    Class11_Sub10_Sub4_Sub6.anInt2711 = 0;
	    Buffer.anInt1510 = 0;
	    Class11_Sub10_Sub5.anInt2084 = 0;
	    Class55.anInt1132 = 0;
	    Class15_Sub2.anInt1765 = 0;
	    Class37.anInt688 = 0;
	    Canvas_Sub1.anInt51 = 0;
	    Class11_Sub10_Sub5.anInt2069 = 0;
	    Buffer.anInt1516 = 0;
	    Applet_Sub1.anInt16 = 0;
	    Class11_Sub10.anInt1671 = 0;
	    Applet_Sub1.anInt30 = 0;
	    Class11_Sub5_Sub1.anInt1920 = 0;
	    Buffer.anInt1514 = 0;
	    Class11_Sub10_Sub12.anInt2271 = 0;
	    Class36.anInt660 = 0;
	    Class11_Sub10_Sub14.anInt2324 = 0;
	    Class7.anInt1428 = 0;
	    Class11_Sub10_Sub14.anInt2327 = 0;
	    Class55.anInt1110 = 0;
	    Class36.anInt674 = 0;
	    Buffer.anInt1520 = 0;
	    Class39_Sub1.anInt1835 = 0;
	    Class11_Sub10_Sub4_Sub1.anInt2494 = 0;
	    Class44.anInt796 = 0;
	    Class48.anInt898 = 0;
	    Class11_Sub6.anInt1595 = 0;
	    Class36.anInt657 = 0;
	    Class11_Sub10_Sub7.anInt2158 = 0;
	    Class34.anInt627 = 0;
	    Class11_Sub10_Sub4_Sub2.anInt2567 = 0;
	    Class11_Sub5_Sub1.anInt1911 = 0;
	    Class7.anInt1433 = 0;
	    Class24.anInt437 = 0;
	    Class11_Sub10_Sub10.anInt2217 = 0;
	    Class55.anInt1096 = 0;
	    Class23.anInt418 = 0;
	    Class55.anInt1106 = 0;
	    Class39_Sub1.anInt1814 = 0;
	    Class11_Sub10_Sub11.anInt2250 = 0;
	    Class11_Sub10_Sub15.anInt2394 = 0;
	    Class31.anInt1379 = 0;
	    Applet_Sub1.anInt14 = 0;
	    Class11_Sub10_Sub2.anInt1975 = 0;
	    Class11_Sub5_Sub1.anInt1912 = 0;
	    Class53.anInt1056 = 0;
	    Class31.anInt1390 = 0;
	    Class11_Sub10_Sub2.anInt1986 = 0;
	    Class54.anInt1075 = 0;
	    Class15_Sub2.anInt1756 = 0;
	    Class11_Sub10_Sub2.anInt1997 = 0;
	    Buffer.anInt1567 = 0;
	    Class11_Sub10_Sub16.anInt2426 = 0;
	    Buffer.anInt1556 = 0;
	    Class11_Sub10_Sub4.anInt2037 = 0;
	    Class20.anInt388 = 0;
	    int i = 117 / ((arg0 - -41) / 60);
	    Class11_Sub10_Sub15.anInt2382 = 0;
	    Class55.anInt1093 = 0;
	    Class55_Sub1.anInt1845 = 0;
	    Buffer.anInt1523 = 0;
	    Buffer.anInt1526 = 0;
	    Class39.anInt710 = 0;
	    Class11_Sub5_Sub1.anInt1921 = 0;
	    Class39_Sub1.anInt1831 = 0;
	    Class57.anInt1186 = 0;
	    Class37.anInt681 = 0;
	    Class25.anInt468 = 0;
	    Class53.anInt1040 = 0;
	    Class53.anInt1042 = 0;
	    Class7.anInt1422 = 0;
	    Class32.anInt587 = 0;
	    Class55.anInt1122 = 0;
	    Class34.anInt642 = 0;
	    Class28.anInt518 = 0;
	    Class14.anInt291 = 0;
	    Class11_Sub10_Sub4_Sub1.anInt2468 = 0;
	    Applet_Sub1.anInt24 = 0;
	    Class61.anInt1267 = 0;
	    Class11_Sub10_Sub9.anInt2198 = 0;
	    Class55.anInt1138 = 0;
	    Class31.anInt1382 = 0;
	    Class23.anInt416 = 0;
	    Class43.anInt788 = 0;
	    Class8.anInt173 = 0;
	    Canvas_Sub1.anInt40 = 0;
	    Class62.anInt1295 = 0;
	    Class20.anInt396 = 0;
	    Class1.anInt88 = 0;
	    Class53.anInt1053 = 0;
	    Class11_Sub10_Sub14.anInt2346 = 0;
	    Class63.anInt1311 = 0;
	    Class31.anInt1407 = 0;
	    Class11_Sub10_Sub10.anInt2238 = 0;
	    Class22.anInt407 = 0;
	    Class17.anInt331 = 0;
	    Class55.anInt1131 = 0;
	    Class29.anInt538 = 0;
	    Class11_Sub10_Sub4_Sub2.anInt2501 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub1.anInt2786 = 0;
	    Class50.anInt985 = 0;
	    Applet_Sub1.anInt31 = 0;
	    Class11_Sub10_Sub4.anInt2035 = 0;
	    Class31.anInt1404 = 0;
	    Class34.anInt625 = 0;
	    Class11_Sub10_Sub5.anInt2091 = 0;
	    Class11_Sub4.anInt1490 = 0;
	    Class48.anInt905 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub1.anInt2781 = 0;
	    Class14.anInt293 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub2.anInt2820 = 0;
	    Class64.anInt1338 = 0;
	    Class11_Sub10_Sub3.anInt2028 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub2.anInt2825 = 0;
	    Class11_Sub8.anInt1639 = 0;
	    Class15_Sub1.anInt1731 = 0;
	    Class20.anInt383 = 0;
	    Class15.anInt316 = 0;
	    Class11_Sub10_Sub15.anInt2385 = 0;
	    Applet_Sub1.anInt18 = 0;
	    Applet_Sub1.anInt20 = 0;
	    Class61.anInt1279 = 0;
	    Class33.anInt606 = 0;
	    Class11_Sub10_Sub8.anInt2184 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub1.anInt2805 = 0;
	    Buffer.anInt1539 = 0;
	    Class11_Sub10_Sub8.anInt2173 = 0;
	    Class13.anInt262 = 0;
	    Class20.anInt393 = 0;
	    Class43.anInt787 = 0;
	    Class31.anInt1411 = 0;
	    Class51.anInt1009 = 0;
	    Class7.anInt1447 = 0;
	    Class11_Sub10_Sub12.anInt2275 = 0;
	    Class11_Sub10_Sub8.anInt2174 = 0;
	    Class59.anInt1232 = 0;
	    Buffer.anInt1571 = 0;
	    Class57.anInt1164 = 0;
	    Class63.anInt1321 = 0;
	    Class10.anInt215 = 0;
	    Class11_Sub10_Sub6.anInt2134 = 0;
	    Class55_Sub1.anInt1848 = 0;
	    Class8.anInt177 = 0;
	    Class44.anInt821 = 0;
	    Applet_Sub1.anInt8 = 0;
	    client.anInt1457 = 0;
	    Class15_Sub1.anInt1738 = 0;
	    Class55.anInt1089 = 0;
	    Class15_Sub2.anInt1778 = 0;
	    Buffer.anInt1543 = 0;
	    client.anInt1455 = 0;
	    Buffer.anInt1522 = 0;
	    anInt1252 = 0;
	    Class31.anInt1414 = 0;
	    Class11_Sub10_Sub14.anInt2330 = 0;
	    Class11_Sub10_Sub12.anInt2273 = 0;
	    Class11_Sub10_Sub4.anInt2040 = 0;
	    Class11_Sub10_Sub5.anInt2051 = 0;
	    Class50.anInt988 = 0;
	    Class11_Sub10_Sub15.anInt2373 = 0;
	    Class31.anInt1409 = 0;
	    Class29.anInt544 = 0;
	    client.anInt1458 = 0;
	    Class11_Sub10_Sub4_Sub6.anInt2695 = 0;
	    Class58.anInt1213 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub2.anInt2826 = 0;
	    Class14.anInt272 = 0;
	    Canvas_Sub1.anInt46 = 0;
	    Class11_Sub10_Sub12.anInt2272 = 0;
	    Class11_Sub10_Sub4_Sub3.anInt2577 = 0;
	    Applet_Sub1.anInt15 = 0;
	    Class11_Sub10_Sub5.anInt2060 = 0;
	    Class7.anInt1434 = 0;
	    Class64.anInt1326 = 0;
	    Class4.anInt135 = 0;
	    Class11_Sub10_Sub6.anInt2130 = 0;
	    Class39.anInt714 = 0;
	    Class29.anInt546 = 0;
	    Class11_Sub10_Sub8.anInt2183 = 0;
	    Class61.anInt1269 = 0;
	    Class42.anInt753 = 0;
	    Class14.anInt286 = 0;
	    Class50.anInt982 = 0;
	    Class11.anInt218 = 0;
	    Buffer.anInt1549 = 0;
	    Class11_Sub12.anInt1701 = 0;
	    Canvas_Sub1.anInt42 = 0;
	    Class47.anInt873 = 0;
	    Buffer.anInt1513 = 0;
	    Class3.anInt122 = 0;
	    Class4.anInt144 = 0;
	    Buffer.anInt1530 = 0;
	    Class11_Sub10_Sub6.anInt2131 = 0;
	    Class28.anInt520 = 0;
	    Class40.anInt734 = 0;
	    Class3.anInt118 = 0;
	    Class7.anInt1446 = 0;
	    Class44.anInt816 = 0;
	    Class37_Sub1.anInt1798 = 0;
	    Class31.anInt1415 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub1.anInt2801 = 0;
	    Class31.anInt1378 = 0;
	    Class31.anInt1416 = 0;
	    Class37_Sub1.anInt1779 = 0;
	    Class36.anInt654 = 0;
	    Applet_Sub1.anInt29 = 0;
	    Class11_Sub10_Sub4_Sub6.anInt2716 = 0;
	    Class11_Sub10_Sub4.anInt2042 = 0;
	    Class31.anInt1396 = 0;
	    Class36.anInt656 = 0;
	    Class57.anInt1167 = 0;
	    Class11_Sub10_Sub2.anInt1971 = 0;
	    Buffer.anInt1540 = 0;
	    Class11_Sub10_Sub4_Sub6.anInt2699 = 0;
	    Buffer.anInt1529 = 0;
	    Buffer.anInt1560 = 0;
	    Class53.anInt1041 = 0;
	    Class7.anInt1438 = 0;
	    anInt1254 = 0;
	    Class42.anInt757 = 0;
	    Class11_Sub10_Sub4_Sub2.anInt2495 = 0;
	    client.anInt1461 = 0;
	    Class12.anInt246 = 0;
	    Class34.anInt640 = 0;
	    Class58.anInt1208 = 0;
	    Class11_Sub10_Sub2.anInt1953 = 0;
	    Class53.anInt1057 = 0;
	    Class11_Sub10_Sub1.anInt1936 = 0;
	    Class58.anInt1209 = 0;
	    Class55_Sub1.anInt1844 = 0;
	    Class23.anInt421 = 0;
	    Class11_Sub10_Sub5.anInt2103 = 0;
	    Class55_Sub1.anInt1841 = 0;
	    Class11_Sub10_Sub4_Sub2.anInt2520 = 0;
	    Class62.anInt1288 = 0;
	    Class11_Sub10_Sub1.anInt1938 = 0;
	    Class44.anInt817 = 0;
	    Class11_Sub10_Sub4_Sub5.anInt2689 = 0;
	    Class58.anInt1204 = 0;
	    Class11_Sub10_Sub4_Sub2.anInt2554 = 0;
	    Class11_Sub11.anInt1683 = 0;
	    Class11_Sub10_Sub10.anInt2232 = 0;
	    Class11_Sub4.anInt1498 = 0;
	    Class11_Sub10.anInt1654 = 0;
	    Class31.anInt1373 = 0;
	    Class61.anInt1261 = 0;
	    Class11_Sub10_Sub14.anInt2342 = 0;
	    Class39_Sub1.anInt1826 = 0;
	    Class37_Sub1.anInt1782 = 0;
	    Class11_Sub10_Sub3.anInt2025 = 0;
	    Buffer.anInt1524 = 0;
	    Class61.anInt1271 = 0;
	    Class36.anInt676 = 0;
	    Class11_Sub10_Sub1.anInt1935 = 0;
	    Class36.anInt666 = 0;
	    Class7.anInt1448 = 0;
	    Class61.anInt1277 = 0;
	    Applet_Sub1.anInt3 = 0;
	    Class39_Sub1.anInt1815 = 0;
	    Class12.anInt241 = 0;
	    Canvas_Sub1.anInt45 = 0;
	    Class53.anInt1051 = 0;
	    Class11_Sub10_Sub5.anInt2099 = 0;
	    Class11.anInt228 = 0;
	    Class11_Sub10_Sub7.anInt2154 = 0;
	    Buffer.anInt1572 = 0;
	    Class15_Sub2.anInt1770 = 0;
	    Class33.anInt600 = 0;
	    Class31.anInt1388 = 0;
	    Class24.anInt436 = 0;
	    Applet_Sub1.anInt32 = 0;
	    Class7.anInt1429 = 0;
	    Class11_Sub10_Sub2.anInt2007 = 0;
	    Class31.anInt1381 = 0;
	    Class55.anInt1127 = 0;
	    Class34.anInt631 = 0;
	    Class31.anInt1367 = 0;
	    Class13.anInt264 = 0;
	    Class58.anInt1205 = 0;
	    Class31.anInt1383 = 0;
	    Class11_Sub10_Sub6.anInt2141 = 0;
	    Class31.anInt1387 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub1.anInt2789 = 0;
	    Class14.anInt289 = 0;
	    Canvas_Sub1.anInt48 = 0;
	    Class7.anInt1424 = 0;
	    Class11_Sub10_Sub15.anInt2399 = 0;
	    Class55.anInt1134 = 0;
	    Class43.anInt779 = 0;
	    Applet_Sub1.anInt13 = 0;
	    Class15_Sub1.anInt1730 = 0;
	    Class58.anInt1216 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub2.anInt2817 = 0;
	    Class11_Sub8.anInt1637 = 0;
	    Class55_Sub1.anInt1852 = 0;
	    Class11_Sub10_Sub9.anInt2197 = 0;
	    Class64.anInt1344 = 0;
	    Class8.anInt167 = 0;
	    Class43.anInt773 = 0;
	    Class55_Sub1.anInt1843 = 0;
	    Class55.anInt1136 = 0;
	    Class31.anInt1417 = 0;
	    Class53.anInt1046 = 0;
	    Class55.anInt1116 = 0;
	    Class44.anInt808 = 0;
	    Class25.anInt467 = 0;
	    Class23.anInt414 = 0;
	    Class39_Sub1.anInt1821 = 0;
	    Class42.anInt759 = 0;
	    Class37_Sub1.anInt1793 = 0;
	    Class11_Sub10_Sub11.anInt2259 = 0;
	    Class15_Sub1.anInt1739 = 0;
	    Buffer.anInt1528 = 0;
	    Class9.anInt198 = 0;
	    Class55.anInt1133 = 0;
	    Applet_Sub1.anInt7 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub2.anInt2833 = 0;
	    Class34.anInt634 = 0;
	    Class64.anInt1334 = 0;
	    Class15_Sub2.anInt1759 = 0;
	    Class42.anInt754 = 0;
	    Class55_Sub1.anInt1865 = 0;
	    Class11_Sub10_Sub4_Sub2.anInt2561 = 0;
	    Buffer.anInt1521 = 0;
	    Class11_Sub7.anInt1608 = 0;
	    Class20.anInt397 = 0;
	    Class12.anInt249 = 0;
	    Class55_Sub1.anInt1868 = 0;
	    Class11_Sub7.anInt1602 = 0;
	    Class37_Sub1.anInt1780 = 0;
	    Class40.anInt723 = 0;
	    Class31.anInt1368 = 0;
	    Class31.anInt1370 = 0;
	    Class11_Sub10_Sub4_Sub1.anInt2474 = 0;
	    Class11_Sub10.anInt1664 = 0;
	    Class11_Sub10_Sub11.anInt2258 = 0;
	    RuntimeException_Sub1.anInt1360 = 0;
	    Class4.anInt137 = 0;
	    Class24.anInt455 = 0;
	    Class8.anInt182 = 0;
	    Class15.anInt308 = 0;
	    Class11_Sub10_Sub12.anInt2299 = 0;
	    Buffer.anInt1509 = 0;
	    NotActuallyBuffer.anInt486 = 0;
	    Class47.anInt865 = 0;
	    Class55_Sub1.anInt1858 = 0;
	    Class53.anInt1045 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub2.anInt2819 = 0;
	    Class1.anInt89 = 0;
	    Class63.anInt1315 = 0;
	    Class39_Sub1.anInt1828 = 0;
	    Class11_Sub10_Sub12.anInt2282 = 0;
	    Class11_Sub10_Sub2.anInt1984 = 0;
	    Class3.anInt105 = 0;
	    Class55.anInt1120 = 0;
	    Class37_Sub1.anInt1784 = 0;
	    Class13.anInt259 = 0;
	    Class24.anInt449 = 0;
	    Class11_Sub10_Sub14.anInt2333 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub2.anInt2832 = 0;
	    Class11_Sub7.anInt1603 = 0;
	    Class11_Sub10_Sub4_Sub5.anInt2679 = 0;
	    Applet_Sub1.anInt33 = 0;
	    Class14.anInt300 = 0;
	    Class3.anInt124 = 0;
	    Buffer.anInt1508 = 0;
	    Class11_Sub10_Sub4_Sub6.anInt2698 = 0;
	    Class11_Sub10_Sub6.anInt2144 = 0;
	    Class11_Sub6.anInt1588 = 0;
	    Class15.anInt314 = 0;
	    Class34.anInt630 = 0;
	    Class11_Sub10_Sub14.anInt2336 = 0;
	    Class11_Sub10_Sub4.anInt2033 = 0;
	    Class64.anInt1341 = 0;
	    Class9.anInt197 = 0;
	    Buffer.anInt1552 = 0;
	    Class15.anInt310 = 0;
	    Class11_Sub10_Sub3.anInt2017 = 0;
	    Applet_Sub1.anInt1 = 0;
	    Class39.anInt716 = 0;
	    Class7.anInt1420 = 0;
	    Class55_Sub1.anInt1860 = 0;
	    Class14.anInt276 = 0;
	    Class14.anInt273 = 0;
	    Canvas_Sub1.anInt41 = 0;
	    Class11_Sub10_Sub16.anInt2433 = 0;
	    Class31.anInt1405 = 0;
	    Class24.anInt435 = 0;
	    Class31.anInt1371 = 0;
	    Class37.anInt689 = 0;
	    Class31.anInt1402 = 0;
	    Class46.anInt857 = 0;
	    Class33.anInt608 = 0;
	    Class58.anInt1206 = 0;
	    Class11_Sub10_Sub5.anInt2092 = 0;
	    Class31.anInt1410 = 0;
	    Buffer.anInt1550 = 0;
	    Class52.anInt1025 = 0;
	    Class13.anInt252 = 0;
	    Class55.anInt1114 = 0;
	    Class11_Sub10_Sub5.anInt2108 = 0;
	    Class58.anInt1212 = 0;
	    Buffer.anInt1519 = 0;
	    Class17.anInt330 = 0;
	    Class31.anInt1418 = 0;
	    Buffer.anInt1534 = 0;
	    Buffer.anInt1533 = 0;
	    Class11.anInt232 = 0;
	    Class55.anInt1125 = 0;
	    Class34.anInt645 = 0;
	    Class62.anInt1285 = 0;
	    Class55_Sub1.anInt1861 = 0;
	    Class12.anInt234 = 0;
	    Class46.anInt852 = 0;
	    Class3.anInt102 = 0;
	    Class15_Sub2.anInt1760 = 0;
	    Class37_Sub1.anInt1805 = 0;
	    Class52.anInt1033 = 0;
	    Buffer.anInt1515 = 0;
	    Class36.anInt680 = 0;
	    Class31.anInt1375 = 0;
	    Class36.anInt658 = 0;
	    Class57.anInt1197 = 0;
	    Class51.anInt1014 = 0;
	    Class11_Sub12.anInt1700 = 0;
	    Class11_Sub5_Sub1.anInt1916 = 0;
	    Applet_Sub1.anInt12 = 0;
	    Class28.anInt509 = 0;
	    Class11_Sub10_Sub10.anInt2224 = 0;
	    Class47.anInt879 = 0;
	    Class8.anInt183 = 0;
	    Class36.anInt665 = 0;
	    Class22.anInt406 = 0;
	    Class15_Sub1.anInt1753 = 0;
	    Class11_Sub12.anInt1695 = 0;
	    Class11_Sub10_Sub2.anInt1985 = 0;
	    Class31.anInt1386 = 0;
	    Class58.anInt1203 = 0;
	    Class40.anInt739 = 0;
	    Class63.anInt1317 = 0;
	    Class11_Sub10_Sub4_Sub1.anInt2484 = 0;
	    Class11_Sub10_Sub2.anInt1999 = 0;
	    Class14.anInt295 = 0;
	    Class11_Sub7.anInt1604 = 0;
	    Buffer.anInt1535 = 0;
	    Class11_Sub10_Sub2.anInt1992 = 0;
	    Class11_Sub10_Sub4_Sub5.anInt2685 = 0;
	    Class51.anInt1003 = 0;
	    Class62.anInt1286 = 0;
	    Class11_Sub10_Sub4_Sub1.anInt2457 = 0;
	    Class44.anInt801 = 0;
	    Class52.anInt1021 = 0;
	    Class55.anInt1107 = 0;
	    Class14.anInt298 = 0;
	    Class55.anInt1090 = 0;
	    client.anInt1468 = 0;
	    Class37_Sub1.anInt1790 = 0;
	    Class13.anInt254 = 0;
	    Buffer.anInt1532 = 0;
	    Class11_Sub10_Sub15.anInt2408 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub1.anInt2813 = 0;
	    Class11_Sub10_Sub4_Sub2.anInt2533 = 0;
	    Class22.anInt402 = 0;
	    client.anInt1456 = 0;
	    Class11_Sub5_Sub1.anInt1918 = 0;
	    Class4.anInt142 = 0;
	    Class40.anInt730 = 0;
	    client.anInt1464 = 0;
	    Class11_Sub10_Sub12.anInt2277 = 0;
	    RuntimeException_Sub1.anInt1358 = 0;
	    Class11_Sub10_Sub8.anInt2185 = 0;
	    Class11_Sub10_Sub3.aClass46_2020.anInt860 = 0;
	    Class11_Sub10_Sub7.method356(-13559);
	    Class34.anInt622 = 0;
	    Class47.anInt869 = -1;
	    Class40.outBuffer.position = 0;
	    Class48.anInt906 = -1;
	    Class11_Sub10_Sub4_Sub2.inBuffer.position = 0;
	    Class11_Sub4.aBoolean1491 = false;
	    Class11_Sub4.anInt1479 = -1;
	    Class46.anInt848 = 0;
	    Class29.anInt541 = 0;
	    Class11_Sub7.anInt1597 = 0;
	    Class11_Sub10_Sub14.anInt2357 = -1;
	    Class51.anInt1006 = 0;
	    Class11_Sub10_Sub15.method485(0, (byte) 80);
	    for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -101; i_0_++)
		Class11_Sub10_Sub5.aClass31Array2089[i_0_] = null;
	    Buffer.anInt1569 = -1;
	    Class59.anInt1242 = -50 + (int) (Math.random() * 100.0);
	    Class32.anInt581 = 0;
	    Class11_Sub10_Sub4_Sub2_Sub2.anInt2816 = 0;
	    Class14.anInt302 = 0;
	    Class40.anInt735 = 0;
	    Class62.anInt1300 = (int) (Math.random() * 80.0) + -40;
	    Class29.anInt535 = (int) (20.0 * Math.random()) + -10 & 0x7ff;
	    Class15_Sub1.anInt1737 = -20 + (int) (Math.random() * 30.0);
	    Class39.anInt721 = 0;
	    Class55_Sub1.anInt1853 = 0;
	    Class48.anInt885 = 0;
	    Class11_Sub10_Sub11.anInt2269 = 0;
	    Class54.anInt1082 = (int) (110.0 * Math.random()) - 55;
	    Class46.anInt855 = (int) (Math.random() * 120.0) - 60;
	    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -2049; i_1_++) {
		Class11_Sub10_Sub7.aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_1_]
		    = null;
		Class22.aBufferArray401[i_1_] = null;
	    }
	    for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -16385; i_2_++)
		Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i_2_] = null;
	    Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
		= Class11_Sub10_Sub7.aClass11_Sub10_Sub4_Sub2_Sub1Array2160
		      [2047]
		= new Class11_Sub10_Sub4_Sub2_Sub1();
	    Class11_Sub10_Sub11.aClass36_2263.method692(-9707);
	    Class11_Sub10_Sub4_Sub2_Sub2.aClass36_2818.method692(-9707);
	    for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -5; i_3_++) {
		for (int i_4_ = 0; i_4_ < 104; i_4_++) {
		    for (int i_5_ = 0; i_5_ < 104; i_5_++)
			Class51.aClass36ArrayArrayArray1007[i_3_][i_4_][i_5_]
			    = null;
		}
	    }
	    Class37_Sub1.aClass36_1794 = new Class36();
	    Buffer.anInt1573 = 0;
	    Class11_Sub10_Sub2.anInt1972 = 0;
	    Class44.method760(256, Class14.anInt294);
	    Class14.anInt294 = -1;
	    Class44.method760(256, Class47.anInt881);
	    Class47.anInt881 = -1;
	    Class44.method760(256, Buffer.anInt1564);
	    Buffer.anInt1564 = -1;
	    Class44.method760(256, Class46.anInt844);
	    Class46.anInt844 = -1;
	    Class44.method760(256, Class52.anInt1019);
	    Class52.anInt1019 = -1;
	    Class44.method760(256, Class28.anInt512);
	    Class28.anInt512 = -1;
	    Class44.method760(256, Class23.anInt426);
	    NotActuallyBuffer.anInt483 = 3;
	    Class57.anInt1154 = 0;
	    Class39_Sub1.aBoolean1839 = false;
	    Class58.anInt1225 = -1;
	    Class61.anInt1276 = 0;
	    Class33.aBoolean609 = false;
	    Class3.aClass31_99 = null;
	    Class11_Sub4.aBoolean1491 = false;
	    Class23.anInt426 = -1;
	    Class14.aClass24_279.method587(false, new int[5], -1, null,
					   (byte) 86);
	    for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -6; i_6_++) {
		Class64.aClass31Array1349[i_6_] = null;
		Class11_Sub10.aBooleanArray1658[i_6_] = false;
	    }
	    Class36.aBoolean670 = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "wb.F(" + arg0 + ')');
	}
    }
    
    public static void method953(long arg0, int arg1) {
	try {
	    anInt1251++;
	    try {
		if (arg1 != 0)
		    aCanvas_Sub1_1260 = null;
		Thread.sleep(arg0);
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "wb.B(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method954(int arg0) {
	try {
	    anInt1255++;
	    if (Class11_Sub10_Sub6.anInt2138 > 0) {
		for (int i = 0; i < 256; i++) {
		    if ((Class11_Sub10_Sub6.anInt2138 ^ 0xffffffff) < -769)
			Class37_Sub1.anIntArray1806[i]
			    = (Class11_Sub10_Sub4.method256
			       (Class11_Sub10_Sub15.anIntArray2410[i],
				-Class11_Sub10_Sub6.anInt2138 + 1024,
				arg0 + 3223, Class11_Sub12.anIntArray1703[i]));
		    else if (Class11_Sub10_Sub6.anInt2138 <= 256)
			Class37_Sub1.anIntArray1806[i]
			    = (Class11_Sub10_Sub4.method256
			       (Class11_Sub12.anIntArray1703[i],
				-Class11_Sub10_Sub6.anInt2138 + 256, 98,
				Class11_Sub10_Sub15.anIntArray2410[i]));
		    else
			Class37_Sub1.anIntArray1806[i]
			    = Class11_Sub12.anIntArray1703[i];
		}
	    } else if (Class11_Sub10_Sub4.anInt2032 <= 0) {
		for (int i = 0; (i ^ 0xffffffff) > -257; i++)
		    Class37_Sub1.anIntArray1806[i]
			= Class11_Sub10_Sub15.anIntArray2410[i];
	    } else {
		for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
		    if ((Class11_Sub10_Sub4.anInt2032 ^ 0xffffffff) >= -769) {
			if (Class11_Sub10_Sub4.anInt2032 > 256)
			    Class37_Sub1.anIntArray1806[i]
				= Class31.anIntArray1392[i];
			else
			    Class37_Sub1.anIntArray1806[i]
				= (Class11_Sub10_Sub4.method256
				   (Class31.anIntArray1392[i],
				    -Class11_Sub10_Sub4.anInt2032 + 256, 127,
				    Class11_Sub10_Sub15.anIntArray2410[i]));
		    } else
			Class37_Sub1.anIntArray1806[i]
			    = (Class11_Sub10_Sub4.method256
			       (Class11_Sub10_Sub15.anIntArray2410[i],
				1024 - Class11_Sub10_Sub4.anInt2032, 105,
				Class31.anIntArray1392[i]));
		}
	    }
	    int i = 256;
	    for (int i_7_ = 0; i_7_ < 33920; i_7_++)
		Class25.aClass37_482.anIntArray692[i_7_]
		    = (Class63.aClass11_Sub10_Sub13_Sub4_1324.anIntArray2776
		       [i_7_]);
	    int i_8_ = 0;
	    int i_9_ = 1152;
	    for (int i_10_ = 1; (i + -1 ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
		 i_10_++) {
		int i_11_ = ((-i_10_ + i)
			     * Class11_Sub10_Sub14.anIntArray2309[i_10_] / i);
		int i_12_ = i_11_ + 22;
		if ((i_12_ ^ 0xffffffff) > -1)
		    i_12_ = 0;
		i_8_ += i_12_;
		for (int i_13_ = i_12_; (i_13_ ^ 0xffffffff) > -129; i_13_++) {
		    int i_14_ = Class58.anIntArray1227[i_8_++];
		    if ((i_14_ ^ 0xffffffff) == -1)
			i_9_++;
		    else {
			int i_15_ = i_14_;
			int i_16_ = 256 - i_14_;
			i_14_ = Class37_Sub1.anIntArray1806[i_14_];
			int i_17_ = Class25.aClass37_482.anIntArray692[i_9_];
			Class25.aClass37_482.anIntArray692[i_9_++]
			    = (((Class20.method572
				 (-16711936,
				  (i_15_ * Class20.method572(i_14_, 16711935)
				   + (Class20.method572(16711935, i_17_)
				      * i_16_))))
				- -(Class20.method572
				    (16711680,
				     (Class20.method572(65280, i_17_) * i_16_
				      + i_15_ * Class20.method572(i_14_,
								  65280)))))
			       >> 2050858184);
		    }
		}
		i_9_ += i_12_;
	    }
	    if (arg0 != -3112)
		aClass31_1258 = null;
	    i_9_ = 1176;
	    for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -33921; i_18_++)
		Class54.aClass37_1081.anIntArray692[i_18_]
		    = (Class11_Sub10_Sub4_Sub2_Sub2
		       .aClass11_Sub10_Sub13_Sub4_2823.anIntArray2776[i_18_]);
	    i_8_ = 0;
	    for (int i_19_ = 1; (i_19_ ^ 0xffffffff) > (-1 + i ^ 0xffffffff);
		 i_19_++) {
		int i_20_ = ((i + -i_19_)
			     * Class11_Sub10_Sub14.anIntArray2309[i_19_] / i);
		i_9_ += i_20_;
		int i_21_ = 103 - i_20_;
		for (int i_22_ = 0;
		     (i_22_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff); i_22_++) {
		    int i_23_ = Class58.anIntArray1227[i_8_++];
		    if ((i_23_ ^ 0xffffffff) == -1)
			i_9_++;
		    else {
			int i_24_ = i_23_;
			int i_25_ = -i_23_ + 256;
			i_23_ = Class37_Sub1.anIntArray1806[i_23_];
			int i_26_ = Class54.aClass37_1081.anIntArray692[i_9_];
			Class54.aClass37_1081.anIntArray692[i_9_++]
			    = ((Class20.method572
				(16711680,
				 (i_24_ * Class20.method572(65280, i_23_)
				  + i_25_ * Class20.method572(i_26_, 65280))))
			       + (Class20.method572
				  (-16711936,
				   (i_24_ * Class20.method572(i_23_, 16711935)
				    - -(Class20.method572(16711935, i_26_)
					* i_25_))))) >> 1544470696;
		    }
		}
		i_8_ += 128 + -i_21_;
		i_9_ += -i_20_ + (-i_21_ + 128);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "wb.G(" + arg0 + ')');
	}
    }
    
    public static void method955(int arg0, int arg1, byte arg2, int arg3,
				 int arg4, int arg5) {
	int i = Class52.aClass49_1024.method842(arg0, arg5, arg4);
	if (i != 0) {
	    int i_27_ = arg1;
	    if ((i ^ 0xffffffff) < -1)
		i_27_ = arg3;
	    int i_28_ = 4 * (-arg4 + 103) * 512 + 4 * arg5 + 24624;
	    int i_29_ = Class52.aClass49_1024.method832(arg0, arg5, arg4, i);
	    int i_30_ = (i_29_ & 0xc7) >> 1298982438;
	    int[] is = Class52.aClass11_Sub10_Sub13_Sub4_1029.anIntArray2776;
	    int i_31_ = i_29_ & 0x1f;
	    int i_32_ = 0x7fff & i >> -1159208722;
	    Class11_Sub10_Sub2 class11_sub10_sub2
		= Class51.method853((byte) -116, i_32_);
	    if ((class11_sub10_sub2.anInt1973 ^ 0xffffffff) != 0) {
		Class11_Sub10_Sub13_Sub3 class11_sub10_sub13_sub3
		    = (Class11_Sub10_Sub4_Sub2
		       .aClass11_Sub10_Sub13_Sub3Array2572
		       [class11_sub10_sub2.anInt1973]);
		if (class11_sub10_sub13_sub3 != null) {
		    int i_33_ = ((class11_sub10_sub2.anInt1967 * 4
				  - class11_sub10_sub13_sub3.anInt2766)
				 / 2);
		    int i_34_ = ((4 * class11_sub10_sub2.anInt1974
				  - class11_sub10_sub13_sub3.anInt2772)
				 / 2);
		    class11_sub10_sub13_sub3.method443
			(i_33_ + (arg5 * 4 + 48),
			 (i_34_
			  + ((-class11_sub10_sub2.anInt1974 + -arg4 + 104) * 4
			     + 48)));
		}
	    } else {
		if (i_31_ == 0 || i_31_ == 2) {
		    if (i_30_ == 0) {
			is[i_28_] = i_27_;
			is[512 + i_28_] = i_27_;
			is[1024 + i_28_] = i_27_;
			is[1536 + i_28_] = i_27_;
		    } else if (i_30_ != 1) {
			if (i_30_ == 2) {
			    is[3 + i_28_] = i_27_;
			    is[i_28_ - -515] = i_27_;
			    is[1027 + i_28_] = i_27_;
			    is[3 + (i_28_ - -1536)] = i_27_;
			} else if (i_30_ == 3) {
			    is[i_28_ + 1536] = i_27_;
			    is[1536 + (i_28_ - -1)] = i_27_;
			    is[2 + (i_28_ + 1536)] = i_27_;
			    is[1536 + (i_28_ - -3)] = i_27_;
			}
		    } else {
			is[i_28_] = i_27_;
			is[1 + i_28_] = i_27_;
			is[2 + i_28_] = i_27_;
			is[i_28_ + 3] = i_27_;
		    }
		}
		if (i_31_ == 3) {
		    if ((i_30_ ^ 0xffffffff) == -1)
			is[i_28_] = i_27_;
		    else if ((i_30_ ^ 0xffffffff) == -2)
			is[i_28_ + 3] = i_27_;
		    else if (i_30_ == 2)
			is[3 + i_28_ + 1536] = i_27_;
		    else if (i_30_ == 3)
			is[i_28_ + 1536] = i_27_;
		}
		if ((i_31_ ^ 0xffffffff) == -3) {
		    if (i_30_ == 3) {
			is[i_28_] = i_27_;
			is[512 + i_28_] = i_27_;
			is[1024 + i_28_] = i_27_;
			is[1536 + i_28_] = i_27_;
		    } else if ((i_30_ ^ 0xffffffff) == -1) {
			is[i_28_] = i_27_;
			is[1 + i_28_] = i_27_;
			is[2 + i_28_] = i_27_;
			is[i_28_ - -3] = i_27_;
		    } else if ((i_30_ ^ 0xffffffff) == -2) {
			is[i_28_ + 3] = i_27_;
			is[i_28_ + 515] = i_27_;
			is[1024 + (3 + i_28_)] = i_27_;
			is[1536 + i_28_ - -3] = i_27_;
		    } else if (i_30_ == 2) {
			is[1536 + i_28_] = i_27_;
			is[i_28_ + 1536 + 1] = i_27_;
			is[1538 + i_28_] = i_27_;
			is[1536 + i_28_ - -3] = i_27_;
		    }
		}
	    }
	}
	i = Class52.aClass49_1024.method812(arg0, arg5, arg4);
	anInt1254++;
	if (i != 0) {
	    int i_35_ = Class52.aClass49_1024.method832(arg0, arg5, arg4, i);
	    int i_36_ = i_35_ & 0x1f;
	    int i_37_ = i_35_ >> -1756361498 & 0x3;
	    int i_38_ = 0x7fff & i >> 1366086094;
	    Class11_Sub10_Sub2 class11_sub10_sub2
		= Class51.method853((byte) -108, i_38_);
	    if ((class11_sub10_sub2.anInt1973 ^ 0xffffffff) == 0) {
		if (i_36_ == 9) {
		    int i_39_ = 15658734;
		    if ((i ^ 0xffffffff) < -1)
			i_39_ = 15597568;
		    int[] is = (Class52.aClass11_Sub10_Sub13_Sub4_1029
				.anIntArray2776);
		    int i_40_ = 4 * arg5 + 24624 + 512 * ((-arg4 + 103) * 4);
		    if ((i_37_ ^ 0xffffffff) == -1
			|| (i_37_ ^ 0xffffffff) == -3) {
			is[1536 + i_40_] = i_39_;
			is[1024 + (i_40_ + 1)] = i_39_;
			is[2 + i_40_ - -512] = i_39_;
			is[i_40_ + 3] = i_39_;
		    } else {
			is[i_40_] = i_39_;
			is[i_40_ - -513] = i_39_;
			is[1024 + i_40_ - -2] = i_39_;
			is[3 + i_40_ - -1536] = i_39_;
		    }
		}
	    } else {
		Class11_Sub10_Sub13_Sub3 class11_sub10_sub13_sub3
		    = (Class11_Sub10_Sub4_Sub2
		       .aClass11_Sub10_Sub13_Sub3Array2572
		       [class11_sub10_sub2.anInt1973]);
		if (class11_sub10_sub13_sub3 != null) {
		    int i_41_ = ((-class11_sub10_sub13_sub3.anInt2766
				  + 4 * class11_sub10_sub2.anInt1967)
				 / 2);
		    int i_42_ = ((-class11_sub10_sub13_sub3.anInt2772
				  + 4 * class11_sub10_sub2.anInt1974)
				 / 2);
		    class11_sub10_sub13_sub3.method443
			(4 * arg5 + 48 + i_41_,
			 i_42_ + 4 * (104 - arg4
				      - class11_sub10_sub2.anInt1974) + 48);
		}
	    }
	}
	if (arg2 != -82)
	    anInt1256 = 4;
	i = Class52.aClass49_1024.method841(arg0, arg5, arg4);
	if (i != 0) {
	    int i_43_ = i >> 934263566 & 0x7fff;
	    Class11_Sub10_Sub2 class11_sub10_sub2
		= Class51.method853((byte) -122, i_43_);
	    if (class11_sub10_sub2.anInt1973 != -1) {
		Class11_Sub10_Sub13_Sub3 class11_sub10_sub13_sub3
		    = (Class11_Sub10_Sub4_Sub2
		       .aClass11_Sub10_Sub13_Sub3Array2572
		       [class11_sub10_sub2.anInt1973]);
		if (class11_sub10_sub13_sub3 != null) {
		    int i_44_ = ((4 * class11_sub10_sub2.anInt1967
				  - class11_sub10_sub13_sub3.anInt2766)
				 / 2);
		    int i_45_ = ((-class11_sub10_sub13_sub3.anInt2772
				  + 4 * class11_sub10_sub2.anInt1974)
				 / 2);
		    class11_sub10_sub13_sub3.method443
			(i_44_ + (48 + 4 * arg5),
			 (i_45_
			  + ((-class11_sub10_sub2.anInt1974 + 104 - arg4) * 4
			     + 48)));
		}
	    }
	}
    }
    
    static {
	aClass31_1253 = Class64.method992("mapdots", 255);
	aClass31_1244 = Class64.method992("backleft1", 255);
	aClass31_1258 = Class64.method992("attack", 255);
	aClass34_1248 = new Class34(4096);
    }
}
