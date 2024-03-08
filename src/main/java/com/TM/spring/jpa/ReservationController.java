package com.TM.spring.jpa;

import jakarta.validation.*;
import org.springframework.ui.*;
import org.springframework.validation.*;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@Controller
public class ReservationController {
	@Autowired
	private ReservationRepository reservationRepository;
	
	private Optional<Reservation> nullReturnR = Optional.empty();
	
	@RequestMapping("/reservation")
	public String reservation(Model model) {
		model.addAttribute("reservation", new Reservation());
		return "reservation";
	}
	
	@PostMapping("/reservation")
	public String postReservation(@Valid Reservation reservation, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "reservation";
		}
		reservationRepository.save(reservation);
		return "reservationSuccess";	
	}
}