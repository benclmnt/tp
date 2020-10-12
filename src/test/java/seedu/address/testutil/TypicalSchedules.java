package seedu.address.testutil;

import static seedu.address.testutil.TypicalClients.ALICE;
import static seedu.address.testutil.TypicalClients.BENSON;
import static seedu.address.testutil.TypicalSessions.GETWELL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.schedule.Schedule;

public class TypicalSchedules {

    // Manually added - Session's details found in {@code SessionCommandTestUtil}
    public static final Schedule ALICE_GETWELL = new ScheduleBuilder()
            .withClient(ALICE)
            .withSession(GETWELL)
            .build();

    public static final Schedule BENSON_GETWELL = new ScheduleBuilder()
            .withClient(BENSON)
            .withSession(GETWELL)
            .build();

    private TypicalSchedules() {
    } // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical Sessions.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Schedule schedule : getTypicalSchedules()) {
            ab.addSchedule(schedule);
        }
        return ab;
    }

    public static List<Schedule> getTypicalSchedules() {
        return new ArrayList<>(Arrays.asList(ALICE_GETWELL, BENSON_GETWELL));
    }
}