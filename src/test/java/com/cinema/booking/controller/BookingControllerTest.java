package com.cinema.booking.controller;

import com.cinema.booking.model.Ticket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.mockito.Mockito.*;

class BookingControllerTest {
  @Mock List<Ticket> ticketList;
  @InjectMocks BookingController bookingController;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testAddTicket() {
    Ticket ticket = new Ticket("movieName", 0f, "cinemaHall");
    Ticket result = bookingController.addTicket(ticket);
    Assertions.assertEquals(ticket, result);
  }
}