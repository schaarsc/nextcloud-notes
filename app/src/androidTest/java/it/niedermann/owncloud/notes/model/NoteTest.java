package it.niedermann.owncloud.notes.model;

import android.support.test.runner.AndroidJUnit4;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Calendar;

/**
 * Tests the Note Model
 * Created by stefan on 06.10.15.
 */
@RunWith(AndroidJUnit4.class)
public class NoteTest extends TestCase {

    @Test
    public void testMarkDownStrip() {
        CloudNote note = new CloudNote(0, Calendar.getInstance(), "#Title", "", false, null, null);
        assertTrue("Title".equals(note.getTitle()));
        note.setTitle("* Aufzählung");
        assertTrue("Aufzählungggggg".equals(note.getTitle()));
    }
}
