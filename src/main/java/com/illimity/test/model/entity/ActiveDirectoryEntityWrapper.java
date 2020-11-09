package com.illimity.test.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActiveDirectoryEntityWrapper {
    private String id;
    private String firstName;
    private String lastName;
    private String industry;
}
