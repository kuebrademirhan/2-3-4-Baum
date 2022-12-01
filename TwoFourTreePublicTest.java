import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.math.BigInteger;
import java.util.*;
import org.junit.*;

public class TwoFourTreePublicTest {
	// ========== SYSTEM ==========
	protected static final String EX_NAME_cons_put = "cons/put/structure";
	protected static final String EX_NAME_put_size_depth = "put/size/depth";
	protected static final String EX_NAME_put_get = "put/get";
	protected static final String EX_NAME_put_remove = "put/remove/get";
	// --------------------

	// ========== TEST-DATA ==========
	private static final Random RND = new Random(4711_0815_666L);

	// ========== PUBLIC TEST ==========
	@Test(timeout = 666)
	public void pubTest__TwoFourTree__cons__Intestines__IF_THIS_VERY_IMPORTANT_TEST_FAILS_THEN_YOU_WILL_GET_NO_POINTS_AT_ALL() {
		check__Intestines__TwoFourTree();
	}

	@Test(timeout = 666)
	public void pubTest__TwoFourTree__size_depth__Intestines__IF_THIS_VERY_IMPORTANT_TEST_FAILS_THEN_YOU_WILL_GET_NO_POINTS_AT_ALL() {
		check__Intestines__TwoFourTree();
	}

	@Test(timeout = 666)
	public void pubTest__TwoFourTree__get__Intestines__IF_THIS_VERY_IMPORTANT_TEST_FAILS_THEN_YOU_WILL_GET_NO_POINTS_AT_ALL() {
		check__Intestines__TwoFourTree();
	}

	@Test(timeout = 666)
	public void pubTest__TwoFourTree__remove__Intestines__IF_THIS_VERY_IMPORTANT_TEST_FAILS_THEN_YOU_WILL_GET_NO_POINTS_AT_ALL() {
		check__Intestines__TwoFourTree();
	}

	// ---------- cons/structure ----------
	@Test(timeout = 666)
	public void pubTest__TwoFourTree__cons__put__structure() {
		for (int pass = 0; pass < 10; pass++) {
			AbstractTwoFourTree<BigInteger> t_bi = new TwoFourTree<>();
			assertTrue("Empty positions must be null.", t_bi.c1 == null && t_bi.v1 == null && t_bi.c2 == null && t_bi.v2 == null && t_bi.c3 == null && t_bi.v3 == null && t_bi.c4 == null);
			BigInteger exp_bi_1 = BigInteger.valueOf(RND.nextLong());
			t_bi = t_bi.put(exp_bi_1);
			Comparable<BigInteger> act_bi_v1 = t_bi.v1;
			assertSame("First element is wrong.", exp_bi_1, act_bi_v1);
			assertTrue("Empty positions must be null.", t_bi.c1 == null && t_bi.v1 != null && t_bi.c2 == null && t_bi.v2 == null && t_bi.c3 == null && t_bi.v3 == null && t_bi.c4 == null);
			// ----------
			AbstractTwoFourTree<String> t_s = new TwoFourTree<>();
			assertTrue("Empty positions must be null.", t_s.c1 == null && t_s.v1 == null && t_s.c2 == null && t_s.v2 == null && t_s.c3 == null && t_s.v3 == null && t_s.c4 == null);
			String exp_s_v1 = String.format("AuD%1$4d", RND.nextInt(666)), exp_s_v2 = String.format("AuD%1$4d", 666 + RND.nextInt(666));
			Comparable<String> act_s_v1, act_s_v2;
			if (RND.nextBoolean()) {
				t_s = t_s.put(exp_s_v1);
				act_s_v1 = t_s.v1;
				assertSame("First element is wrong.", exp_s_v1, act_s_v1);
				assertTrue("Empty positions must be null.", t_s.c1 == null && t_s.v1 != null && t_s.c2 == null && t_s.v2 == null && t_s.c3 == null && t_s.v3 == null && t_s.c4 == null);
				t_s = t_s.put(exp_s_v2);
			} else {
				t_s = t_s.put(exp_s_v2);
				act_s_v1 = t_s.v1;
				assertSame("First element is wrong.", exp_s_v2, act_s_v1);
				assertTrue("Empty positions must be null.", t_s.c1 == null && t_s.v1 != null && t_s.c2 == null && t_s.v2 == null && t_s.c3 == null && t_s.v3 == null && t_s.c4 == null);
				t_s = t_s.put(exp_s_v1);
			}
			act_s_v1 = t_s.v1;
			act_s_v2 = t_s.v2;
			assertSame("First element is wrongX.", exp_s_v1, act_s_v1);
			assertSame("Second element is wrong.", exp_s_v2, act_s_v2);
			assertTrue("Empty positions must be null.", t_s.c1 == null && t_s.v1 != null && t_s.c2 == null && t_s.v2 != null && t_s.c3 == null && t_s.v3 == null && t_s.c4 == null);
			// ----------
			AbstractTwoFourTree<Long> t_l = new TwoFourTree<>();
			Comparable<Long> t_l_v3 = t_l.v3;
			assertTrue(t_l.c1 == null && t_l.v1 == null && t_l.c2 == null && t_l.v2 == null && t_l.c3 == null && t_l_v3 == null && t_l.c4 == null);
		}
	}

	// ---------- size/depth ----------
	@Test(timeout = 2666)
	public void pubTest__TwoFourTree__put__size__random() {
		for (int pass = 0; pass < 10; pass++) {
			AbstractTwoFourTree<String> tRnd = new TwoFourTree<>();
			Set<String> expectedRndSet = new HashSet<>();
			int boundRnd = 555 + RND.nextInt(111);
			for (int i = 0; i < boundRnd; i++) {
				int r = RND.nextInt(4711);
				expectedRndSet.add(String.format("AuD%1$4d", r));
				tRnd = tRnd.put(String.format("AuD%1$4d", r));
				int actualSize = tRnd.size();
				assertEquals("Reported size is wrong.", expectedRndSet.size(), actualSize);
			}
		}
	}

	@Test(timeout = 9666)
	public void pubTest__TwoFourTree__put__depth__random() {
		for (int pass = 0; pass < 10; pass++) {
			AbstractTwoFourTree<String> tRnd = new TwoFourTree<>();
			Set<String> expectedRndSet = new HashSet<>();
			int boundRnd = 4711 + RND.nextInt(666);
			for (int i = 0; i < boundRnd; i++) {
				int r = RND.nextInt(10_000);
				expectedRndSet.add(String.format("AuD%1$4d", r));
				tRnd = tRnd.put(String.format("AuD%1$4d", r));
				final long expectedSize = expectedRndSet.size();
				final long expectedDepthAvg = Math.round(Math.log(expectedSize) / Math.log(3));
				final long expectedDepthMin = expectedSize <= 3 ? 0 : (expectedDepthAvg - 2);
				final long expectedDepthMax = expectedSize <= 3 ? 0 : (expectedDepthAvg + 2);
				int actualDepth = tRnd.height();
				assertTrue("Reported depth is wrong for size " + expectedSize + " - should satisfy: " + expectedDepthMin + " <= DEPTH <= " + expectedDepthMax + ", but was: " + actualDepth + ".", expectedDepthMin <= actualDepth && actualDepth <= expectedDepthMax);
			}
		}
	}

	// ---------- put/get ----------
	@Test(timeout = 666)
	public void pubTest__TwoFourTree__put__get__Ia() {
		AbstractTwoFourTree<Integer> t = new TwoFourTree<>();
		TwoFourTreePublicTest.checkNode(t, null, null, null, null, null, null, null);
		t = t.put(2);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, null, null, null, null);
		t = t.put(3);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, 3, null, null, null);
		t = t.put(4);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, 3, null, 4, null);
		for (int pass = 0; pass < 10; pass++) {
			t = t.put(2);
			t = t.put(3);
			t = t.put(4);
			TwoFourTreePublicTest.checkNode(t, null, 2, null, 3, null, 4, null);
		}
		// ----------
		assertNull(t.get(1));
		assertEquals(Integer.valueOf(2), t.get(2));
		assertEquals(Integer.valueOf(3), t.get(3));
		assertEquals(Integer.valueOf(4), t.get(4));
		assertNull(t.get(5));
		TwoFourTreePublicTest.checkNode(t, null, 2, null, 3, null, 4, null);
		// ----------
		t = t.put(1);
		assertEquals(Integer.valueOf(1), t.get(1));
		TwoFourTreePublicTest.checkNode(t, t, 3, t, null, null, null, null);
		TwoFourTreePublicTest.checkNode(t.c1, null, 1, null, 2, null, null, null);
		TwoFourTreePublicTest.checkNode(t.c2, null, 4, null, null, null, null, null);
	}

	@Test(timeout = 2666)
	public void pubTest__TwoFourTree__put__get__ascending_descending_random() {
		AbstractTwoFourTree<String> tAsc = new TwoFourTree<>();
		Set<String> expectedAscSet = new HashSet<>(), notExpectedAscSet = new HashSet<>();
		int boundAsc = 555 + RND.nextInt(111);
		for (int i = 0; i <= boundAsc; i++) {
			expectedAscSet.add(String.format("AuD%1$3d", i));
			tAsc = tAsc.put(String.format("AuD%1$3d", i));
		}
		for (int i = -111; i <= 777; i++) {
			String sAsc = String.format("AuD%1$3d", i);
			if (!expectedAscSet.contains(sAsc)) {
				notExpectedAscSet.add(sAsc);
			}
		}
		checkTree(tAsc, expectedAscSet, notExpectedAscSet);
		// ----------
		AbstractTwoFourTree<String> tDesc = new TwoFourTree<>();
		Set<String> expectedDescSet = new HashSet<>(), notExpectedDescSet = new HashSet<>();
		int boundDesc = 555 + RND.nextInt(111);
		for (int i = boundDesc; i >= 0; i--) {
			expectedDescSet.add(String.format("AuD%1$3d", i));
			tDesc = tDesc.put(String.format("AuD%1$3d", i));
		}
		for (int i = -111; i <= 777; i++) {
			String sDesc = String.format("AuD%1$3d", i);
			if (!expectedDescSet.contains(sDesc)) {
				notExpectedDescSet.add(sDesc);
			}
		}
		checkTree(tDesc, expectedDescSet, notExpectedDescSet);
		// ----------
		for (int pass = 0; pass < 10; pass++) {
			AbstractTwoFourTree<String> tRnd = new TwoFourTree<>();
			Set<String> expectedRndSet = new HashSet<>(), notExpectedRndSet = new HashSet<>();
			int boundRnd = 555 + RND.nextInt(111);
			for (int i = 0; i < boundRnd; i++) {
				int r = RND.nextInt(4711);
				expectedRndSet.add(String.format("AuD%1$4d", r));
				tRnd = tRnd.put(String.format("AuD%1$4d", r));
			}
			for (int i = -42; i <= 4711; i++) {
				String sRnd = String.format("AuD%1$3d", i);
				if (!expectedRndSet.contains(sRnd)) {
					notExpectedRndSet.add(sRnd);
				}
			}
			checkTree(tRnd, expectedRndSet, notExpectedRndSet);
		}
	}

	// ---------- put/remove ----------
	@Test(timeout = 666)
	public void pubTest__TwoFourTree__put__remove__oneNodeOnly() {
		AbstractTwoFourTree<Integer> t = new TwoFourTree<>();
		TwoFourTreePublicTest.checkNode(t, null, null, null, null, null, null, null);
		t = t.put(2);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, null, null, null, null);
		t = t.remove(2);
		TwoFourTreePublicTest.checkNode(t, null, null, null, null, null, null, null);
		t = t.put(2);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, null, null, null, null);
		// ----------
		t = t.put(3);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, 3, null, null, null);
		t = t.remove(3);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, null, null, null, null);
		t = t.put(3);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, 3, null, null, null);
		t = t.remove(2);
		TwoFourTreePublicTest.checkNode(t, null, 3, null, null, null, null, null);
		t = t.put(2);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, 3, null, null, null);
		// ----------
		t = t.put(4);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, 3, null, 4, null);
		t = t.remove(4);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, 3, null, null, null);
		t = t.put(4);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, 3, null, 4, null);
		t = t.remove(2);
		TwoFourTreePublicTest.checkNode(t, null, 3, null, 4, null, null, null);
		t = t.put(2);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, 3, null, 4, null);
		t = t.remove(3);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, 4, null, null, null);
		t = t.put(3);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, 3, null, 4, null);
		t = t.remove(2);
		TwoFourTreePublicTest.checkNode(t, null, 3, null, 4, null, null, null);
		t = t.put(2);
		TwoFourTreePublicTest.checkNode(t, null, 2, null, 3, null, 4, null);
	}

	@Test(timeout = 666)
	public void pubTest__TwoFourTree__put__remove__twoFullLevels_simple() {
		for (int r : new int[]{1, 2, 3, 5, 6, 7, 9, 10, 12, 4, 8, 11}) {
			AbstractTwoFourTree<Integer> t = new TwoFourTree<>();
			for (int i : new int[]{7, 8, 9, 4, 3, 5, 1, 2, 6, 12, 11, 10}) {
				t = t.put(i);
			}
			// ____.__4___.___8___.___11__.___
			// ___/_______|_______|________\__
			// (1,2,3)_(5,6,7)__(9,10)____(12)
			TwoFourTreePublicTest.checkNode(t, t, 4, t, 8, t, 11, t);
			TwoFourTreePublicTest.checkNode(t.c1, null, 1, null, 2, null, 3, null);
			TwoFourTreePublicTest.checkNode(t.c2, null, 5, null, 6, null, 7, null);
			TwoFourTreePublicTest.checkNode(t.c3, null, 9, null, 10, null, null, null);
			TwoFourTreePublicTest.checkNode(t.c4, null, 12, null, null, null, null, null);
			// ----------
			t = t.remove(r);
			switch (r) {
				case 1: // leaf
					TwoFourTreePublicTest.checkNode(t, t, 4, t, 8, t, 11, t);
					TwoFourTreePublicTest.checkNode(t.c1, null, 2, null, 3, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c2, null, 5, null, 6, null, 7, null);
					TwoFourTreePublicTest.checkNode(t.c3, null, 9, null, 10, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c4, null, 12, null, null, null, null, null);
					break;
				case 2: // leaf
					TwoFourTreePublicTest.checkNode(t, t, 4, t, 8, t, 11, t);
					TwoFourTreePublicTest.checkNode(t.c1, null, 1, null, 3, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c2, null, 5, null, 6, null, 7, null);
					TwoFourTreePublicTest.checkNode(t.c3, null, 9, null, 10, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c4, null, 12, null, null, null, null, null);
					break;
				case 3: // leaf
					TwoFourTreePublicTest.checkNode(t, t, 4, t, 8, t, 11, t);
					TwoFourTreePublicTest.checkNode(t.c1, null, 1, null, 2, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c2, null, 5, null, 6, null, 7, null);
					TwoFourTreePublicTest.checkNode(t.c3, null, 9, null, 10, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c4, null, 12, null, null, null, null, null);
					break;
				case 5: // leaf
					TwoFourTreePublicTest.checkNode(t, t, 4, t, 8, t, 11, t);
					TwoFourTreePublicTest.checkNode(t.c1, null, 1, null, 2, null, 3, null);
					TwoFourTreePublicTest.checkNode(t.c2, null, 6, null, 7, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c3, null, 9, null, 10, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c4, null, 12, null, null, null, null, null);
					break;
				case 6: // leaf
					TwoFourTreePublicTest.checkNode(t, t, 4, t, 8, t, 11, t);
					TwoFourTreePublicTest.checkNode(t.c1, null, 1, null, 2, null, 3, null);
					TwoFourTreePublicTest.checkNode(t.c2, null, 5, null, 7, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c3, null, 9, null, 10, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c4, null, 12, null, null, null, null, null);
					break;
				case 7: // leaf
					TwoFourTreePublicTest.checkNode(t, t, 4, t, 8, t, 11, t);
					TwoFourTreePublicTest.checkNode(t.c1, null, 1, null, 2, null, 3, null);
					TwoFourTreePublicTest.checkNode(t.c2, null, 5, null, 6, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c3, null, 9, null, 10, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c4, null, 12, null, null, null, null, null);
					break;
				case 11: // I-C4-1b
					TwoFourTreePublicTest.checkNode(t, t, 4, t, 8, t, 10, t);
					TwoFourTreePublicTest.checkNode(t.c1, null, 1, null, 2, null, 3, null);
					TwoFourTreePublicTest.checkNode(t.c2, null, 5, null, 6, null, 7, null);
					TwoFourTreePublicTest.checkNode(t.c3, null, 9, null, null, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c4, null, 12, null, null, null, null, null);
					break;
				case 9: // leaf
					TwoFourTreePublicTest.checkNode(t, t, 4, t, 8, t, 11, t);
					TwoFourTreePublicTest.checkNode(t.c1, null, 1, null, 2, null, 3, null);
					TwoFourTreePublicTest.checkNode(t.c2, null, 5, null, 6, null, 7, null);
					TwoFourTreePublicTest.checkNode(t.c3, null, 10, null, null, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c4, null, 12, null, null, null, null, null);
					break;
				case 10: // leaf
					TwoFourTreePublicTest.checkNode(t, t, 4, t, 8, t, 11, t);
					TwoFourTreePublicTest.checkNode(t.c1, null, 1, null, 2, null, 3, null);
					TwoFourTreePublicTest.checkNode(t.c2, null, 5, null, 6, null, 7, null);
					TwoFourTreePublicTest.checkNode(t.c3, null, 9, null, null, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c4, null, 12, null, null, null, null, null);
					break;
				case 4: // root
					TwoFourTreePublicTest.checkNode(t, t, 3, t, 8, t, 11, t);
					TwoFourTreePublicTest.checkNode(t.c1, null, 1, null, 2, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c2, null, 5, null, 6, null, 7, null);
					TwoFourTreePublicTest.checkNode(t.c3, null, 9, null, 10, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c4, null, 12, null, null, null, null, null);
					break;
				case 8: // root
					TwoFourTreePublicTest.checkNode(t, t, 4, t, 7, t, 11, t);
					TwoFourTreePublicTest.checkNode(t.c1, null, 1, null, 2, null, 3, null);
					TwoFourTreePublicTest.checkNode(t.c2, null, 5, null, 6, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c3, null, 9, null, 10, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c4, null, 12, null, null, null, null, null);
					break;
				case 12: // root
					TwoFourTreePublicTest.checkNode(t, t, 4, t, 8, t, 10, t);
					TwoFourTreePublicTest.checkNode(t.c1, null, 1, null, 2, null, 3, null);
					TwoFourTreePublicTest.checkNode(t.c2, null, 5, null, 6, null, 7, null);
					TwoFourTreePublicTest.checkNode(t.c3, null, 9, null, null, null, null, null);
					TwoFourTreePublicTest.checkNode(t.c4, null, 11, null, null, null, null, null);
					break;
			}
		}
	}

	// ---------- put/remove ----------
	@Test(timeout = 666)
	public void pubTest__TwoFourTree__put__remove__basics() {
		checkPutRemoveGet(arr(2), arr(1));
		checkPutRemoveGet(arr(2), arr(2));
		checkPutRemoveGet(arr(2), arr(3));
		// -----
		checkPutRemoveGet(arr(2, 4, 6), arr(1));
		checkPutRemoveGet(arr(2, 4, 6), arr(3));
		checkPutRemoveGet(arr(2, 4, 6), arr(5));
		checkPutRemoveGet(arr(2, 4, 6), arr(7));
		// -----
		checkPutRemoveGet(arr(2, 4, 6, 8), arr(2));
		checkPutRemoveGet(arr(2, 4, 6, 8), arr(4));
		checkPutRemoveGet(arr(2, 4, 6, 8), arr(6));
		checkPutRemoveGet(arr(2, 4, 6, 8), arr(8));
		// -----
		checkPutRemoveGet(arr(4, 6, 8, 2), arr(2));
		checkPutRemoveGet(arr(4, 6, 8, 2), arr(4));
		checkPutRemoveGet(arr(4, 6, 8, 2), arr(6));
		checkPutRemoveGet(arr(4, 6, 8, 2), arr(8));
		// -----
		checkPutRemoveGet(arr(2, 3, 4, 7, 8, 6, 1, 5), arr(5, 6, 4, 1, 2));
		checkPutRemoveGet(arr(198, 189, 244, 59, 237, 514, 427, 381, 262), arr(237, 381, 514));
		checkPutRemoveGet(arr(198, 189, 244, 59, 237, 514, 427, 381, 262), arr(59, 381, 262));
		checkPutRemoveGet(arr(181, 381, 172, 262, 198, 187, 232, 189, 244, 420, 266, 237, 514, 427, 548, 439, 93, 219), arr(514, 181, 198, 439, 93, 548, 244, 219, 237, 262));
	}

	@Test(timeout = 16666)
	public void pubTest__TwoFourTree__put__remove__random() {
		String oneFormatFitsAll = "AuD%1$4d";
		for (int pass = 0; pass < 10; pass++) {
			AbstractTwoFourTree<String> tRnd = new TwoFourTree<>();
			Set<String> expectedRndSet = new HashSet<>(), notExpectedRndSet = new HashSet<>();
			int boundRnd = 333 + RND.nextInt(111);
			for (int i = 0; i < boundRnd; i++) {
				int r = 42 + RND.nextInt(666);
				expectedRndSet.add(String.format(oneFormatFitsAll, r));
				tRnd = tRnd.put(String.format(oneFormatFitsAll, r));
			}
			for (int i = 40; i <= 100; i++) {
				String sRnd = String.format(oneFormatFitsAll, i);
				if (!expectedRndSet.contains(sRnd)) {
					notExpectedRndSet.add(sRnd);
				}
			}
			checkTree(tRnd, expectedRndSet, notExpectedRndSet);
			while (!expectedRndSet.isEmpty()) {
				LinkedList<String> expectedRnd = new LinkedList<>(expectedRndSet);
				Collections.shuffle(expectedRnd);
				String sRnd = expectedRnd.get(RND.nextInt(expectedRnd.size()));
				tRnd = tRnd.remove(sRnd);
				expectedRndSet.remove(sRnd);
				notExpectedRndSet.add(sRnd);
				checkTree(tRnd, expectedRndSet, notExpectedRndSet);
			}
		}
	}

	// ========== HELPER ==========
	protected static <T extends Comparable<T>> void checkNode(AbstractTwoFourTree<T> t, AbstractTwoFourTree<T> c1, T v1, AbstractTwoFourTree<T> c2, T v2, AbstractTwoFourTree<T> c3, T v3, AbstractTwoFourTree<T> c4) {
		if (c1 == null) {
			assertNull("t.c1 is wrong (expected null, but was subtree)", t.c1);
		} else {
			assertNotNull("t.c1 is wrong (expected subtree, but was null)", t.c1);
		}
		assertEquals("t.v1 is wrong", v1, t.v1);
		if (c2 == null) {
			assertNull("t.c2 is wrong (expected null, but was subtree)", t.c2);
		} else {
			assertNotNull("t.c2 is wrong (expected subtree, but was null)", t.c2);
		}
		assertEquals("t.v2 is wrong", v2, t.v2);
		if (c3 == null) {
			assertNull("t.c3 is wrong (expected null, but was subtree)", t.c3);
		} else {
			assertNotNull("t.c3 is wrong (expected subtree, but was null)", t.c3);
		}
		assertEquals("t.v3 is wrong", v3, t.v3);
		if (c4 == null) {
			assertNull("t.c4 is wrong (expected null, but was subtree)", t.c4);
		} else {
			assertNotNull("t.c4 is wrong (expected subtree, but was null)", t.c4);
		}
	}

	protected static <T extends Comparable<T>> void collectTree(AbstractTwoFourTree<T> t, LinkedList<T> c) {
		if (t.c1 != null) {
			collectTree(t.c1, c);
		}
		if (t.v1 != null) {
			c.add(t.v1);
		}
		if (t.c2 != null) {
			collectTree(t.c2, c);
		}
		if (t.v2 != null) {
			c.add(t.v2);
		}
		if (t.c3 != null) {
			collectTree(t.c3, c);
		}
		if (t.v3 != null) {
			c.add(t.v3);
		}
		if (t.c4 != null) {
			collectTree(t.c4, c);
		}
	}

	protected static <T extends Comparable<T>> void checkTree(AbstractTwoFourTree<T> t, Set<T> expectedSet, Set<T> notExpectedSet) {
		for (T exp : expectedSet) {
			T act = t.get(exp);
			assertNotNull("get: Expected an element (" + exp + ") but got null.", act);
			assertNotSame(exp, act);
			assertEquals("get: Returned element is not the one expected.", exp, act);
		}
		for (T notExp : notExpectedSet) {
			T act = t.get(notExp);
			assertNull("get: Expected null but got an element (" + act + ").", act);
		}
		LinkedList<T> expected = new LinkedList<>(expectedSet);
		Collections.sort(expected);
		LinkedList<T> actual = new LinkedList<>();
		collectTree(t, actual);
		assertEquals(expected, actual);

	}

	@SafeVarargs
	private static <T> T[] arr(T... e) {
		return e;
	}

	protected static <T extends Comparable<T>> void checkPutRemoveGet(T[] toInsert, T[] toRemove) {
		AbstractTwoFourTree<T> t = new TwoFourTree<>();
		for (T e : toInsert) {
			t = t.put(e);
		}
		for (T exp : toInsert) {
			T act = t.get(exp);
			assertNotNull("get: Expected an element (" + exp + ") but got null.", act);
			assertEquals("get: Returned element is not the one expected.", exp, act);
		}
		for (T e : toRemove) {
			t = t.remove(e);
		}
		for (T e : toRemove) {
			T act = t.get(e);
			assertNull("get: Expected null but got an element (" + act + ").", act);
		}
		Set<T> toRemoveList = new HashSet<>(Arrays.asList(toRemove));
		for (T exp : toInsert) {
			T act = t.get(exp);
			if (toRemoveList.contains(exp)) {
				assertNull("get: Expected null but got an element (" + act + ").", act);
			} else {
				assertNotNull("get: Expected an element (" + exp + ") but got null.", act);
				assertEquals("get: Returned element is not the one expected.", exp, act);
			}
		}
	}

	// ========== HELPER: Intestines ==========
	// @AuD-STUDENT: DO NOT USE REFLECTION IN YOUR OWN SUBMISSION!
	private static Class<?>[] getDeclaredClasses(Class<?> clazz) {
		java.util.List<Class<?>> declaredClasses = new java.util.ArrayList<>();
		for (Class<?> c : clazz.getDeclaredClasses()) {
			if (!c.isSynthetic()) {
				declaredClasses.add(c);
			}
		}
		return declaredClasses.toArray(new Class[0]);
	}

	private static Field[] getDeclaredFields(Class<?> clazz) {
		java.util.List<Field> declaredFields = new java.util.ArrayList<>();
		for (Field f : clazz.getDeclaredFields()) {
			if (!f.isSynthetic()) {
				declaredFields.add(f);
			}
		}
		return declaredFields.toArray(new Field[0]);
	}

	private static Constructor<?>[] getDeclaredConstructors(Class<?> clazz) {
		java.util.List<Constructor<?>> declaredConstructors = new java.util.ArrayList<>();
		for (Constructor<?> c : clazz.getDeclaredConstructors()) {
			if (!c.isSynthetic()) {
				declaredConstructors.add(c);
			}
		}
		return declaredConstructors.toArray(new Constructor[0]);
	}

	private static Method[] getDeclaredMethods(Class<?> clazz) {
		java.util.List<Method> declaredMethods = new java.util.ArrayList<>();
		for (Method m : clazz.getDeclaredMethods()) {
			if (!m.isBridge() && !m.isSynthetic()) {
				declaredMethods.add(m);
			}
		}
		return declaredMethods.toArray(new Method[0]);
	}

	private void check__Intestines__TwoFourTree() {
		Class<?> clazz = TwoFourTree.class;
		assertTrue(clazz + " must be public!", Modifier.isPublic(clazz.getModifiers()));
		assertFalse(clazz + " must not be abstract!", Modifier.isAbstract(clazz.getModifiers()));
		assertFalse(clazz + " must not be an annotation!", clazz.isAnnotation());
		assertFalse(clazz + " must not be an enumeration!", clazz.isEnum());
		assertFalse(clazz + " must not be an interface!", clazz.isInterface());
		assertSame(clazz + " must extend a certain super-class!", AbstractTwoFourTree.class, clazz.getSuperclass());
		assertEquals(clazz + " must implement a certain number of interfaces!", 0, clazz.getInterfaces().length);
		assertEquals(clazz + " must declare a certain number of inner annotations!", 0, clazz.getDeclaredAnnotations().length);
		assertEquals(clazz + " must declare a certain number of inner classes!", 0, getDeclaredClasses(clazz).length);
		Field[] fields = getDeclaredFields(clazz);
		assertEquals(clazz + " must declare a certain number of fields!", 0, fields.length);
		Constructor<?>[] constructors = getDeclaredConstructors(clazz);
		for (Constructor<?> constructor : constructors) {
			if (constructor.getParameterTypes().length == 0) {
				assertTrue(constructor + " - constructor (without parameters) must be public!", Modifier.isPublic(constructor.getModifiers()));
			} else {
				assertTrue(constructor + " - constructor (with parameters) must be private!", Modifier.isPrivate(constructor.getModifiers()));
			}
		}
		Method[] methods = getDeclaredMethods(clazz);
		for (Method method : methods) {
			boolean isExpected = false;
			for (Method abstractMethod : getDeclaredMethods(AbstractTwoFourTree.class)) {
				if (method.getName().equals(abstractMethod.getName()) && method.getParameterTypes().length == abstractMethod.getParameterTypes().length) {
					isExpected |= method.getParameterTypes().length == 0 || method.getParameterTypes().length == 1 && (method.getParameterTypes()[0] == abstractMethod.getParameterTypes()[0] || method.getParameterTypes()[0] == Comparable.class);
				}
			}
			if (isExpected) {
				assertTrue(method + " - method must be public!", Modifier.isPublic(method.getModifiers()));
				assertFalse(method + " - method must not be static!", Modifier.isStatic(method.getModifiers()));
			} else {
				assertTrue(method + " - method must be private!", Modifier.isPrivate(method.getModifiers()));
			}
			assertFalse(method + " - method must not be abstract!", Modifier.isAbstract(method.getModifiers()));
		}
	}
}