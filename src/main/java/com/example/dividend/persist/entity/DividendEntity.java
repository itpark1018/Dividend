package com.example.dividend.persist.entity;

import com.example.dividend.model.Dividend;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "DIVIDEND")
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"companyId", "date"})) // 복합 컬럼을 유니크 키로 지정
public class DividendEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long companyId;

    private LocalDateTime date;

    private String dividend;

    public DividendEntity(Long companyId, Dividend dividend) {
        this.companyId = companyId;
        this.date = dividend.getDate();
        this.dividend = dividend.getDividend();
    }
}