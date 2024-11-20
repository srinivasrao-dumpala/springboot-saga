package com.innutshell.dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderRequestDto {

    private Integer userId;
    private Integer productId;
    private  Integer amount;
    private Integer orderId;
}
