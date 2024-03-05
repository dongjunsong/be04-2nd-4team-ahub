package com.teamphoenix.ahub.fair.command.aggregate;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name = "fair")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Fair {

    @Id
    @Column(name = "fair_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fairId;

    @Column(name = "fair_title")
    private String fairTitle;

    @Column(name = "fair_content")
    private String fairContent;

    @Column(name = "fair_writedate")
    @Temporal(TemporalType.TIMESTAMP)
    private java.time.LocalDateTime fairWritedate;

    @Column(name = "use_acceptance")
    private int useAcceptance;

    @Column(name = "member_code")
    private int memberCode;

    public void setFairTitle(String fairTitle) {
        this.fairTitle = fairTitle;
    }

    public void setFairContent(String fairContent) {
        this.fairContent = fairContent;
    }

    public void setFairWritedate(LocalDateTime fairWritedate) {
        this.fairWritedate = fairWritedate;
    }

    public void setUseAcceptance(int useAcceptance) {
        this.useAcceptance = useAcceptance;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }


}
