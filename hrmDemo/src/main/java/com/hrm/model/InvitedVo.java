package com.hrm.model;

public class InvitedVo extends Invited{

    private User user;

    private RecruitVo recruitVo;

    private Bio bio;





    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RecruitVo getRecruitVo() {
        return recruitVo;
    }

    public void setRecruitVo(RecruitVo recruitVo) {
        this.recruitVo = recruitVo;
    }

    public Bio getBio() {
        return bio;
    }

    public void setBio(Bio bio) {
        this.bio = bio;
    }



    @Override
    public String toString() {
        String s= "InvitedVo{" +
                ", user=" + user +
                ", recruitVo=" + recruitVo +
                ", bio=" + bio +
                '}';
        s+= this.getiId()+","+this.getiTime()+","+this.getiType();
        return s;
    }
}