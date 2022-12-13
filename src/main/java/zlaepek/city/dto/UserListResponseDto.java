package zlaepek.city.dto;

import zlaepek.city.models.User;

import java.time.LocalDateTime;

public class UserListResponseDto {
    private int id;
    private String owner;
    private double limit;
    private double total_usage;

    private Long userId;
    private String nickName;
    private String profileImg;
    private String eMail;
    private LocalDateTime joinDate;

    public UserListResponseDto(User entity) {
        this.userId = entity.getUserId();
        this.nickName = entity.getNickName();
        this.profileImg = entity.getProfileImg();
        this.eMail = entity.getEMail();
        this.joinDate = entity.getJoinDate();
    }

}
