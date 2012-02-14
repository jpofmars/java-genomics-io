package edu.genomics;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.unc.genomics.BedEntry;

public class BedEntryTest {
	
	private final String TEST_BED_ENTRY = "chrIV\t0\t10\tSpot8\t1.0\t-";
	private BedEntry test;

	@Before
	public void setUp() throws Exception {
		test = BedEntry.parse(TEST_BED_ENTRY);
	}

	@Test
	public void testParse() {
		assertEquals("chrIV", test.getChr());
		assertEquals(10, test.getStart());
		assertEquals(1, test.getStop());
		assertEquals("Spot8", test.getId());
		assertEquals(1.0, test.getValue().doubleValue(), 1e-15);
		assertEquals("-", test.strand());
	}

}