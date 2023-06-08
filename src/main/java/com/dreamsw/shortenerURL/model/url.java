package com.dreamsw.shortenerURL.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class url {
    
    private Long id;
    private String url;
    private String test;
}
