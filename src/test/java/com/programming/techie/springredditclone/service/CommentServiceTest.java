package com.programming.techie.springredditclone.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentServiceTest {

    @Test
    @DisplayName("Test Should Pass When Comment do not Contains Swear Words")
    void containsSwearWords() {
        CommentService commentService = new CommentService(null,null,null,null,null,null,null);
        Assertions.assertFalse(commentService.containsSwearWords("This is a clean comment"));
    }
}