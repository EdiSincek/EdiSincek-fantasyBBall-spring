package com.fantasy.stats.springfantasystats.services.UserService;

import com.fantasy.stats.springfantasystats.models.User;
import com.fantasy.stats.springfantasystats.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllUsers() {
        User user = new User();
        user.setId(1);
        User user2 = new User();
        user2.setId(2);
        List<User> allUsers = new ArrayList<>(List.of(user, user2));
        when(userRepository.findAll()).thenReturn(allUsers);
        List<User> users = userService.getAllUsers();

        assertEquals(2, users.size());
        assertEquals(1, users.get(0).getId());
        verify(userRepository, times(1)).findAll();
    }

    @Test
    void testCreateUser() {
        User user = new User();
        user.setId(1);
        when(userRepository.save(user)).thenReturn(user);
        User createdUser = userService.createUser(user);

        assertEquals(1, createdUser.getId());
        verify(userRepository, times(1)).save(user);
    }

}