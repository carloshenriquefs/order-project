package br.com.microservices.orchestrated.paymentservice.core.dto;

import br.com.microservices.orchestrated.paymentservice.core.enums.ESagaStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class History {

    private String source;
    private ESagaStatus status;
    private String message;
    private LocalDate createdAt;
}
