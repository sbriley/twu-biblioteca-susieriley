package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SessionTest {


    @Test
    public void testLoginUser() {
        Session session = new Session();
        User testUser = new User(1234567);
        session.loginUser(testUser);
        assertEquals(session.user,testUser);
    }

    @Test
    public void testHandleListMedia() {
        Session session = new Session();
        assertEquals(session.responseToInput(Session.UserOption.MEDIA_LIST),session.lib.mediaList());
    }

}
