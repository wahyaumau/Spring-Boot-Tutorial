package com.nti.nbi.springwebjpa.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
@NoArgsConstructor
public class BaseEntity {
    @Column(name = "created_at", updatable = false, nullable = false)
    @JsonIgnore
    private LocalDateTime createdAt;
    @Column(name = "updated_at", nullable = false)
    @JsonIgnore
    private LocalDateTime updatedAt;
    @Column(name = "created_by")
    @Getter(onMethod = @__( @JsonIgnore ))
    @Setter(onMethod = @__( @JsonProperty("created_by")) )
    private String createdBy = "administrator";

    @PrePersist
    private void onCreate(){
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    private void onUpdate(){
        updatedAt = LocalDateTime.now();
    }
}
