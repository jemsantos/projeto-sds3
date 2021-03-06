/**
 * 
 */
package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Seller;

/**
 * @author Jose Eustaquio Muniz
 *
 */
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
