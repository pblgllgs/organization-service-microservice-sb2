package com.pblgllgs.organizationservice.exception;

import java.time.LocalDateTime;

public record ErrorDetails(
        String path,
        String message,
        int status,
        LocalDateTime localDateTime) {
}
