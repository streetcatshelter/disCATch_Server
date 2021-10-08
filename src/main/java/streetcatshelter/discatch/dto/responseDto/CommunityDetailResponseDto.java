package streetcatshelter.discatch.dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import streetcatshelter.discatch.domain.CommunityImage;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@Setter
public class CommunityDetailResponseDto {
    private boolean isLiked;
    private List<CommentResponseDto> commentList;
    private Long communityId;
    private String category;
    private String username;
    private String title;
    private String contents;
    private String location;
    private int cntComment;
    private int cntLikeit;
    private int cntView;
    @OneToMany(mappedBy = "community", cascade = {CascadeType.REMOVE})
    private List<CommunityImage> communityImageList = new ArrayList<>();
}