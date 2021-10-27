package streetcatshelter.discatch.domain.cat.dto.responsedto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class CatGalleryResponseDto {

    private Long CatDetailId;
    private String CatImages;


}