package com.gomathy.learningspring.business.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gomathy.learningspring.data.entity.Guest;
import com.gomathy.learningspring.data.repository.GuestRepository;


@Service
public class GuestsViewService {
    private GuestRepository guestRepository;

    @Autowired
    public GuestsViewService(final GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public List<Guest> getAllGuests(){
        Iterable<Guest> guests = guestRepository.findAll();
        List<Guest> guestsView = new ArrayList<>();
        guests.forEach(guest -> {
            Guest gv = new Guest();
            gv.setEmailAddress(guest.getEmailAddress());
            gv.setFirstName(guest.getFirstName());
            gv.setLastName(guest.getLastName());
            gv.setPhoneNumber(guest.getPhoneNumber());
            guestsView.add(gv);
        });
        guestsView.sort(new Comparator<Guest>() {
            @Override
            public int compare(final Guest o1, final Guest o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        return guestsView;
    }
}
