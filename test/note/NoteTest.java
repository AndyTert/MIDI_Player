package note;

import junit.framework.TestCase;

public class NoteTest extends TestCase {

	public void testMidiConversion_c() throws Exception {
		// setup and execute
		Note n = new Note("c-");

		// assert
		assertEquals("Did not convert correctly", 0, n.getMidiNoteValue());

	}

	public void testMidiConversion_d() throws Exception {
		// setup and execute
		Note n = new Note("d-");

		// assert
		assertEquals("Did not convert correctly", 2, n.getMidiNoteValue());

	}

	public void testMidiConversion_e() throws Exception {
		// setup and execute
		Note n = new Note("e-");

		// assert
		assertEquals("Did not convert correctly", 4, n.getMidiNoteValue());

	}

	public void testMidiConversion_f() throws Exception {
		// setup and execute
		Note n = new Note("f-");

		// assert
		assertEquals("Did not convert correctly", 5, n.getMidiNoteValue());

	}

	public void testMidiConversion_g() throws Exception {
		// setup and execute
		Note n = new Note("g-");

		// assert
		assertEquals("Did not convert correctly", 7, n.getMidiNoteValue());

	}

	public void testMidiConversion_a() throws Exception {
		// setup and execute
		Note n = new Note("a-");

		// assert
		assertEquals("Did not convert correctly", 9, n.getMidiNoteValue());

	}

	public void testMidiConversion_b() throws Exception {
		// setup and execute
		Note n = new Note("b-");

		// assert
		assertEquals("Did not convert correctly", 11, n.getMidiNoteValue());

	}
	
	public void testMidiConversion_c9() throws Exception {
		// setup and execute
		Note n = new Note("c9");
		
		// assert
		assertEquals("Did not convert correctly", 120, n.getMidiNoteValue());
		
	}
	
	public void testMidiConversion_d9() throws Exception {
		// setup and execute
		Note n = new Note("d9");
		
		// assert
		assertEquals("Did not convert correctly", 122, n.getMidiNoteValue());
		
	}
	
	public void testMidiConversion_e9() throws Exception {
		// setup and execute
		Note n = new Note("e9");
		
		// assert
		assertEquals("Did not convert correctly", 124, n.getMidiNoteValue());
		
	}
	
	public void testMidiConversion_f9() throws Exception {
		// setup and execute
		Note n = new Note("f9");
		
		// assert
		assertEquals("Did not convert correctly", 125, n.getMidiNoteValue());
		
	}
	
	public void testMidiConversion_g9() throws Exception {
		// setup and execute
		Note n = new Note("g9");
		
		// assert
		assertEquals("Did not convert correctly", 127, n.getMidiNoteValue());
		
	}
	
	public void testMidiConversion_FbMinus() throws Exception {
		// setup and execute
		Note n = new Note("Fb-");
		
		// assert
		assertEquals("Did not convert correctly", 4, n.getMidiNoteValue());
		
	}
	
	public void testMidiConversion_ASharpMinus() throws Exception {
		// setup and execute
		Note n = new Note("A#-");
		
		// assert
		assertEquals("Did not convert correctly", 10, n.getMidiNoteValue());
		
	}
	public void testMidiConversion_BSharpMinus() throws Exception {
		// setup and execute
		Note n = new Note("B#-");
		
		// assert
		assertEquals("Did not convert correctly", 12, n.getMidiNoteValue());
		
	}

	public void testMidiConversion_CFlatZero() throws Exception {
		// setup and execute
		Note n = new Note("Cb0");
		
		// assert
		assertEquals("Did not convert correctly", 11, n.getMidiNoteValue());
		
	}
	public void testMidiConversion_CFlatSix() throws Exception {
		// setup and execute
		Note n = new Note("Cb6");
		
		// assert
		assertEquals("Did not convert correctly", 83, n.getMidiNoteValue());
		
	}
	public void testMidiConversion_BSharpThree() throws Exception {
		// setup and execute
		Note n = new Note("B#3");
		
		// assert
		assertEquals("Did not convert correctly", 60, n.getMidiNoteValue());
		
	}
	public void testMidiConversion_ESharpThree() throws Exception {
		// setup and execute
		Note n = new Note("E#3");
		
		// assert
		assertEquals("Did not convert correctly", 53, n.getMidiNoteValue());
		
	}
	
	
}
