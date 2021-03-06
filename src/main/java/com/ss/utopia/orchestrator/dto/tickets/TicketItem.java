package com.ss.utopia.orchestrator.dto.tickets;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketItem {

  @NotBlank
  private String seatClass;
  @NotBlank
  private String seatNumber;
  @NotBlank
  private String passengerName;
}
