package br.com.microservices.orchestrated.orderservice.core.document;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "order")
public class Order {

    @Id
    private String id;
    private List<OrderProducts> products;
    private LocalDate createdAt;
    private String transactionId;
    private double totalAmount;
    private int totalItems;

}
