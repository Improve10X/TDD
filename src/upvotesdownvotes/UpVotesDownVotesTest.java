package upvotesdownvotes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UpVotesDownVotesTest {
    private UpVotesDownVotes upVotesDownVotes;

    @BeforeEach
    public void setup() {
        upVotesDownVotes = new UpVotesDownVotes();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenZeroVotes_returnZeroVotes() {
        int votes = upVotesDownVotes.findVoteCount(0, 0);
        assertEquals(0, votes);
    }

    @Test
    public void givenThirteenVotes_returnZeroVotes() {
        int votes = upVotesDownVotes.findVoteCount(13, 0);
        assertEquals(13, votes);
    }

    @Test
    public void givenTwenty_returnTwentyVotes() {
        int votes = upVotesDownVotes.findVoteCount(20, 20);
        assertEquals(0, votes);
    }

    @Test
    public void givenTwentyVotes_returnMinusTenVotes() {
        int votes = upVotesDownVotes.findVoteCount(-20, 10);
        assertEquals(-30, votes);
    }

    @Test
    public void givenOneThirtyTwoVotes_returnOneThirtyTwoVotes() {
        int votes = upVotesDownVotes.findVoteCount(133, 133);
        assertEquals(0, votes);
    }

    @Test
    public void givenOneHundred_returnFiftyVotes() {
        int votes = upVotesDownVotes.findVoteCount(100, 50);
        assertEquals(50, votes);
    }
}
