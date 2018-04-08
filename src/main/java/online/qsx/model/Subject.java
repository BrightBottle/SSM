package online.qsx.model;

import java.io.Serializable;

public class Subject implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.SubjectNo
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    private Integer subjectno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.SubjectName
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    private String subjectname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.ClassHour
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    private Integer classhour;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.GradeID
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    private Integer gradeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table subject
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.SubjectNo
     *
     * @return the value of subject.SubjectNo
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    public Integer getSubjectno() {
        return subjectno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.SubjectNo
     *
     * @param subjectno the value for subject.SubjectNo
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    public void setSubjectno(Integer subjectno) {
        this.subjectno = subjectno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.SubjectName
     *
     * @return the value of subject.SubjectName
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    public String getSubjectname() {
        return subjectname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.SubjectName
     *
     * @param subjectname the value for subject.SubjectName
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname == null ? null : subjectname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.ClassHour
     *
     * @return the value of subject.ClassHour
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    public Integer getClasshour() {
        return classhour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.ClassHour
     *
     * @param classhour the value for subject.ClassHour
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    public void setClasshour(Integer classhour) {
        this.classhour = classhour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.GradeID
     *
     * @return the value of subject.GradeID
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    public Integer getGradeid() {
        return gradeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.GradeID
     *
     * @param gradeid the value for subject.GradeID
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Sat Jan 13 20:16:33 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", subjectno=").append(subjectno);
        sb.append(", subjectname=").append(subjectname);
        sb.append(", classhour=").append(classhour);
        sb.append(", gradeid=").append(gradeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}