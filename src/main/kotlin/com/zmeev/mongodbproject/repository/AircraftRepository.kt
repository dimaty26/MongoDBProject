package com.zmeev.mongodbproject.repository

import com.zmeev.mongodbproject.model.Aircraft
import org.springframework.data.repository.CrudRepository

interface AircraftRepository: CrudRepository<Aircraft, String> {
}