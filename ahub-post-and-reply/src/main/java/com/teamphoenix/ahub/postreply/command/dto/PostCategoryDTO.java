package com.teamphoenix.ahub.postreply.command.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString        // 양방향 관계면 순환 참조 일어남 주의!!
public class PostCategoryDTO {

    private int categoryId;
    private String categoryName;

}
