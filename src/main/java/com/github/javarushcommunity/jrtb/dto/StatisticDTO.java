package com.github.javarushcommunity.jrtb.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * DTO for getting bot statistics.
 */
@Data
@EqualsAndHashCode
public class StatisticDTO {
    private final int activeUserCount;
    private final int inactiveUserCount;
    private final List<GroupStatDTO> groupStatDTOs;
    private final double averageGroupCountByUser;
}
