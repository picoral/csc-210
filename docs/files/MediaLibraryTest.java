import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MediaLibraryTest {

	@Test
	void test() {
		MediaLibrary myMediaLibrary = new MediaLibrary();
		myMediaLibrary.addMedia(new Movie("The Alien", Media.Genre.SCIFI));
		myMediaLibrary.addMedia(new TVShow("The X-Files", Media.Genre.SCIFI));
		myMediaLibrary.addMedia(new TVShow("Seinfield", Media.Genre.COMEDY));
		String output = myMediaLibrary.toString();
		String expected = "Movie title: The Alien\n"
				+ "Show title: The X-Files\n"
				+ "Show title: Seinfield";
		assertEquals(expected, output);
	}

}
