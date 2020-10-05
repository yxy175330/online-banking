package com.bms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bms.domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
