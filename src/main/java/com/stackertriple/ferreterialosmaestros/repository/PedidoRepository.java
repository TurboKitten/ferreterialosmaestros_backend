package com.stackertriple.ferreterialosmaestros.repository;

import com.stackertriple.ferreterialosmaestros.model.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
