package com.example.fileuploadanddownload.repositories;


import com.example.fileuploadanddownload.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<Image,Long> {


    Optional<Image> findByName(String fileName);
}