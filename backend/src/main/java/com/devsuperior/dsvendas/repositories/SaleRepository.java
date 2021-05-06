/**
 * 
 */
package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Sale;

/**
 * @author Jose Eustaquio Muniz
 *
 */
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
