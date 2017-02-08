package com.sion.facecartoon.model;

import java.util.List;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class AnalyzeResult {

    private int time_used;
    private String request_id;
    private List<FacesBean> faces;

    public int getTime_used() {
        return time_used;
    }

    public void setTime_used(int time_used) {
        this.time_used = time_used;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public List<FacesBean> getFaces() {
        return faces;
    }

    public void setFaces(List<FacesBean> faces) {
        this.faces = faces;
    }

    public static class FacesBean {

        private LandmarkBean landmark;
        private FaceRectangleBean face_rectangle;
        private String face_token;

        public LandmarkBean getLandmark() {
            return landmark;
        }

        public void setLandmark(LandmarkBean landmark) {
            this.landmark = landmark;
        }

        public FaceRectangleBean getFace_rectangle() {
            return face_rectangle;
        }

        public void setFace_rectangle(FaceRectangleBean face_rectangle) {
            this.face_rectangle = face_rectangle;
        }

        public String getFace_token() {
            return face_token;
        }

        public void setFace_token(String face_token) {
            this.face_token = face_token;
        }

        public static class LandmarkBean {

            private MouthUpperLipLeftContour2Bean mouth_upper_lip_left_contour2;
            private ContourChinBean contour_chin;
            private MouthLowerLipRightContour3Bean mouth_lower_lip_right_contour3;
            private ContourRight9Bean contour_right9;
            private MouthUpperLipLeftContour1Bean mouth_upper_lip_left_contour1;
            private RightEyebrowLowerMiddleBean right_eyebrow_lower_middle;
            private LeftEyebrowLowerMiddleBean left_eyebrow_lower_middle;
            private MouthUpperLipLeftContour3Bean mouth_upper_lip_left_contour3;
            private LeftEyebrowLowerLeftQuarterBean left_eyebrow_lower_left_quarter;
            private RightEyebrowLowerLeftQuarterBean right_eyebrow_lower_left_quarter;
            private RightEyebrowLowerRightQuarterBean right_eyebrow_lower_right_quarter;
            private NoseContourLeft1Bean nose_contour_left1;
            private LeftEyebrowUpperLeftQuarterBean left_eyebrow_upper_left_quarter;
            private LeftEyeBottomBean left_eye_bottom;
            private MouthLowerLipBottomBean mouth_lower_lip_bottom;
            private ContourRight7Bean contour_right7;
            private LeftEyebrowLeftCornerBean left_eyebrow_left_corner;
            private ContourRight6Bean contour_right6;
            private RightEyeLowerRightQuarterBean right_eye_lower_right_quarter;
            private RightEyeBottomBean right_eye_bottom;
            private ContourLeft7Bean contour_left7;
            private ContourLeft6Bean contour_left6;
            private ContourLeft5Bean contour_left5;
            private ContourLeft4Bean contour_left4;
            private ContourLeft3Bean contour_left3;
            private ContourLeft2Bean contour_left2;
            private ContourLeft1Bean contour_left1;
            private LeftEyeLowerLeftQuarterBean left_eye_lower_left_quarter;
            private ContourRight1Bean contour_right1;
            private ContourRight3Bean contour_right3;
            private ContourRight2Bean contour_right2;
            private ContourRight5Bean contour_right5;
            private ContourRight4Bean contour_right4;
            private ContourLeft9Bean contour_left9;
            private ContourLeft8Bean contour_left8;
            private NoseRightBean nose_right;
            private RightEyeUpperRightQuarterBean right_eye_upper_right_quarter;
            private NoseContourRight3Bean nose_contour_right3;
            private NoseContourLowerMiddleBean nose_contour_lower_middle;
            private RightEyeTopBean right_eye_top;
            private RightEyeRightCornerBean right_eye_right_corner;
            private MouthUpperLipRightContour1Bean mouth_upper_lip_right_contour1;
            private MouthUpperLipRightContour2Bean mouth_upper_lip_right_contour2;
            private MouthUpperLipRightContour3Bean mouth_upper_lip_right_contour3;
            private LeftEyeLeftCornerBean left_eye_left_corner;
            private MouthRightCornerBean mouth_right_corner;
            private MouthLowerLipRightContour1Bean mouth_lower_lip_right_contour1;
            private ContourRight8Bean contour_right8;
            private LeftEyebrowRightCornerBean left_eyebrow_right_corner;
            private RightEyeCenterBean right_eye_center;
            private LeftEyeUpperRightQuarterBean left_eye_upper_right_quarter;
            private MouthUpperLipTopBean mouth_upper_lip_top;
            private NoseLeftBean nose_left;
            private LeftEyeUpperLeftQuarterBean left_eye_upper_left_quarter;
            private LeftEyeCenterBean left_eye_center;
            private LeftEyeLowerRightQuarterBean left_eye_lower_right_quarter;
            private RightEyebrowLeftCornerBean right_eyebrow_left_corner;
            private RightEyeLeftCornerBean right_eye_left_corner;
            private MouthLowerLipTopBean mouth_lower_lip_top;
            private RightEyebrowRightCornerBean right_eyebrow_right_corner;
            private MouthLowerLipLeftContour1Bean mouth_lower_lip_left_contour1;
            private LeftEyePupilBean left_eye_pupil;
            private MouthLeftCornerBean mouth_left_corner;
            private RightEyebrowUpperLeftQuarterBean right_eyebrow_upper_left_quarter;
            private RightEyeLowerLeftQuarterBean right_eye_lower_left_quarter;
            private NoseTipBean nose_tip;
            private RightEyeUpperLeftQuarterBean right_eye_upper_left_quarter;
            private LeftEyebrowUpperMiddleBean left_eyebrow_upper_middle;
            private MouthLowerLipRightContour2Bean mouth_lower_lip_right_contour2;
            private MouthLowerLipLeftContour3Bean mouth_lower_lip_left_contour3;
            private NoseContourLeft2Bean nose_contour_left2;
            private NoseContourLeft3Bean nose_contour_left3;
            private NoseContourRight1Bean nose_contour_right1;
            private NoseContourRight2Bean nose_contour_right2;
            private MouthLowerLipLeftContour2Bean mouth_lower_lip_left_contour2;
            private RightEyebrowUpperRightQuarterBean right_eyebrow_upper_right_quarter;
            private RightEyebrowUpperMiddleBean right_eyebrow_upper_middle;
            private LeftEyebrowLowerRightQuarterBean left_eyebrow_lower_right_quarter;
            private LeftEyeTopBean left_eye_top;
            private LeftEyeRightCornerBean left_eye_right_corner;
            private LeftEyebrowUpperRightQuarterBean left_eyebrow_upper_right_quarter;
            private RightEyePupilBean right_eye_pupil;
            private MouthUpperLipBottomBean mouth_upper_lip_bottom;

            public MouthUpperLipLeftContour2Bean getMouth_upper_lip_left_contour2() {
                return mouth_upper_lip_left_contour2;
            }

            public void setMouth_upper_lip_left_contour2(MouthUpperLipLeftContour2Bean mouth_upper_lip_left_contour2) {
                this.mouth_upper_lip_left_contour2 = mouth_upper_lip_left_contour2;
            }

            public ContourChinBean getContour_chin() {
                return contour_chin;
            }

            public void setContour_chin(ContourChinBean contour_chin) {
                this.contour_chin = contour_chin;
            }

            public MouthLowerLipRightContour3Bean getMouth_lower_lip_right_contour3() {
                return mouth_lower_lip_right_contour3;
            }

            public void setMouth_lower_lip_right_contour3(MouthLowerLipRightContour3Bean mouth_lower_lip_right_contour3) {
                this.mouth_lower_lip_right_contour3 = mouth_lower_lip_right_contour3;
            }

            public ContourRight9Bean getContour_right9() {
                return contour_right9;
            }

            public void setContour_right9(ContourRight9Bean contour_right9) {
                this.contour_right9 = contour_right9;
            }

            public MouthUpperLipLeftContour1Bean getMouth_upper_lip_left_contour1() {
                return mouth_upper_lip_left_contour1;
            }

            public void setMouth_upper_lip_left_contour1(MouthUpperLipLeftContour1Bean mouth_upper_lip_left_contour1) {
                this.mouth_upper_lip_left_contour1 = mouth_upper_lip_left_contour1;
            }

            public RightEyebrowLowerMiddleBean getRight_eyebrow_lower_middle() {
                return right_eyebrow_lower_middle;
            }

            public void setRight_eyebrow_lower_middle(RightEyebrowLowerMiddleBean right_eyebrow_lower_middle) {
                this.right_eyebrow_lower_middle = right_eyebrow_lower_middle;
            }

            public LeftEyebrowLowerMiddleBean getLeft_eyebrow_lower_middle() {
                return left_eyebrow_lower_middle;
            }

            public void setLeft_eyebrow_lower_middle(LeftEyebrowLowerMiddleBean left_eyebrow_lower_middle) {
                this.left_eyebrow_lower_middle = left_eyebrow_lower_middle;
            }

            public MouthUpperLipLeftContour3Bean getMouth_upper_lip_left_contour3() {
                return mouth_upper_lip_left_contour3;
            }

            public void setMouth_upper_lip_left_contour3(MouthUpperLipLeftContour3Bean mouth_upper_lip_left_contour3) {
                this.mouth_upper_lip_left_contour3 = mouth_upper_lip_left_contour3;
            }

            public LeftEyebrowLowerLeftQuarterBean getLeft_eyebrow_lower_left_quarter() {
                return left_eyebrow_lower_left_quarter;
            }

            public void setLeft_eyebrow_lower_left_quarter(LeftEyebrowLowerLeftQuarterBean left_eyebrow_lower_left_quarter) {
                this.left_eyebrow_lower_left_quarter = left_eyebrow_lower_left_quarter;
            }

            public RightEyebrowLowerLeftQuarterBean getRight_eyebrow_lower_left_quarter() {
                return right_eyebrow_lower_left_quarter;
            }

            public void setRight_eyebrow_lower_left_quarter(RightEyebrowLowerLeftQuarterBean right_eyebrow_lower_left_quarter) {
                this.right_eyebrow_lower_left_quarter = right_eyebrow_lower_left_quarter;
            }

            public RightEyebrowLowerRightQuarterBean getRight_eyebrow_lower_right_quarter() {
                return right_eyebrow_lower_right_quarter;
            }

            public void setRight_eyebrow_lower_right_quarter(RightEyebrowLowerRightQuarterBean right_eyebrow_lower_right_quarter) {
                this.right_eyebrow_lower_right_quarter = right_eyebrow_lower_right_quarter;
            }

            public NoseContourLeft1Bean getNose_contour_left1() {
                return nose_contour_left1;
            }

            public void setNose_contour_left1(NoseContourLeft1Bean nose_contour_left1) {
                this.nose_contour_left1 = nose_contour_left1;
            }

            public LeftEyebrowUpperLeftQuarterBean getLeft_eyebrow_upper_left_quarter() {
                return left_eyebrow_upper_left_quarter;
            }

            public void setLeft_eyebrow_upper_left_quarter(LeftEyebrowUpperLeftQuarterBean left_eyebrow_upper_left_quarter) {
                this.left_eyebrow_upper_left_quarter = left_eyebrow_upper_left_quarter;
            }

            public LeftEyeBottomBean getLeft_eye_bottom() {
                return left_eye_bottom;
            }

            public void setLeft_eye_bottom(LeftEyeBottomBean left_eye_bottom) {
                this.left_eye_bottom = left_eye_bottom;
            }

            public MouthLowerLipBottomBean getMouth_lower_lip_bottom() {
                return mouth_lower_lip_bottom;
            }

            public void setMouth_lower_lip_bottom(MouthLowerLipBottomBean mouth_lower_lip_bottom) {
                this.mouth_lower_lip_bottom = mouth_lower_lip_bottom;
            }

            public ContourRight7Bean getContour_right7() {
                return contour_right7;
            }

            public void setContour_right7(ContourRight7Bean contour_right7) {
                this.contour_right7 = contour_right7;
            }

            public LeftEyebrowLeftCornerBean getLeft_eyebrow_left_corner() {
                return left_eyebrow_left_corner;
            }

            public void setLeft_eyebrow_left_corner(LeftEyebrowLeftCornerBean left_eyebrow_left_corner) {
                this.left_eyebrow_left_corner = left_eyebrow_left_corner;
            }

            public ContourRight6Bean getContour_right6() {
                return contour_right6;
            }

            public void setContour_right6(ContourRight6Bean contour_right6) {
                this.contour_right6 = contour_right6;
            }

            public RightEyeLowerRightQuarterBean getRight_eye_lower_right_quarter() {
                return right_eye_lower_right_quarter;
            }

            public void setRight_eye_lower_right_quarter(RightEyeLowerRightQuarterBean right_eye_lower_right_quarter) {
                this.right_eye_lower_right_quarter = right_eye_lower_right_quarter;
            }

            public RightEyeBottomBean getRight_eye_bottom() {
                return right_eye_bottom;
            }

            public void setRight_eye_bottom(RightEyeBottomBean right_eye_bottom) {
                this.right_eye_bottom = right_eye_bottom;
            }

            public ContourLeft7Bean getContour_left7() {
                return contour_left7;
            }

            public void setContour_left7(ContourLeft7Bean contour_left7) {
                this.contour_left7 = contour_left7;
            }

            public ContourLeft6Bean getContour_left6() {
                return contour_left6;
            }

            public void setContour_left6(ContourLeft6Bean contour_left6) {
                this.contour_left6 = contour_left6;
            }

            public ContourLeft5Bean getContour_left5() {
                return contour_left5;
            }

            public void setContour_left5(ContourLeft5Bean contour_left5) {
                this.contour_left5 = contour_left5;
            }

            public ContourLeft4Bean getContour_left4() {
                return contour_left4;
            }

            public void setContour_left4(ContourLeft4Bean contour_left4) {
                this.contour_left4 = contour_left4;
            }

            public ContourLeft3Bean getContour_left3() {
                return contour_left3;
            }

            public void setContour_left3(ContourLeft3Bean contour_left3) {
                this.contour_left3 = contour_left3;
            }

            public ContourLeft2Bean getContour_left2() {
                return contour_left2;
            }

            public void setContour_left2(ContourLeft2Bean contour_left2) {
                this.contour_left2 = contour_left2;
            }

            public ContourLeft1Bean getContour_left1() {
                return contour_left1;
            }

            public void setContour_left1(ContourLeft1Bean contour_left1) {
                this.contour_left1 = contour_left1;
            }

            public LeftEyeLowerLeftQuarterBean getLeft_eye_lower_left_quarter() {
                return left_eye_lower_left_quarter;
            }

            public void setLeft_eye_lower_left_quarter(LeftEyeLowerLeftQuarterBean left_eye_lower_left_quarter) {
                this.left_eye_lower_left_quarter = left_eye_lower_left_quarter;
            }

            public ContourRight1Bean getContour_right1() {
                return contour_right1;
            }

            public void setContour_right1(ContourRight1Bean contour_right1) {
                this.contour_right1 = contour_right1;
            }

            public ContourRight3Bean getContour_right3() {
                return contour_right3;
            }

            public void setContour_right3(ContourRight3Bean contour_right3) {
                this.contour_right3 = contour_right3;
            }

            public ContourRight2Bean getContour_right2() {
                return contour_right2;
            }

            public void setContour_right2(ContourRight2Bean contour_right2) {
                this.contour_right2 = contour_right2;
            }

            public ContourRight5Bean getContour_right5() {
                return contour_right5;
            }

            public void setContour_right5(ContourRight5Bean contour_right5) {
                this.contour_right5 = contour_right5;
            }

            public ContourRight4Bean getContour_right4() {
                return contour_right4;
            }

            public void setContour_right4(ContourRight4Bean contour_right4) {
                this.contour_right4 = contour_right4;
            }

            public ContourLeft9Bean getContour_left9() {
                return contour_left9;
            }

            public void setContour_left9(ContourLeft9Bean contour_left9) {
                this.contour_left9 = contour_left9;
            }

            public ContourLeft8Bean getContour_left8() {
                return contour_left8;
            }

            public void setContour_left8(ContourLeft8Bean contour_left8) {
                this.contour_left8 = contour_left8;
            }

            public NoseRightBean getNose_right() {
                return nose_right;
            }

            public void setNose_right(NoseRightBean nose_right) {
                this.nose_right = nose_right;
            }

            public RightEyeUpperRightQuarterBean getRight_eye_upper_right_quarter() {
                return right_eye_upper_right_quarter;
            }

            public void setRight_eye_upper_right_quarter(RightEyeUpperRightQuarterBean right_eye_upper_right_quarter) {
                this.right_eye_upper_right_quarter = right_eye_upper_right_quarter;
            }

            public NoseContourRight3Bean getNose_contour_right3() {
                return nose_contour_right3;
            }

            public void setNose_contour_right3(NoseContourRight3Bean nose_contour_right3) {
                this.nose_contour_right3 = nose_contour_right3;
            }

            public NoseContourLowerMiddleBean getNose_contour_lower_middle() {
                return nose_contour_lower_middle;
            }

            public void setNose_contour_lower_middle(NoseContourLowerMiddleBean nose_contour_lower_middle) {
                this.nose_contour_lower_middle = nose_contour_lower_middle;
            }

            public RightEyeTopBean getRight_eye_top() {
                return right_eye_top;
            }

            public void setRight_eye_top(RightEyeTopBean right_eye_top) {
                this.right_eye_top = right_eye_top;
            }

            public RightEyeRightCornerBean getRight_eye_right_corner() {
                return right_eye_right_corner;
            }

            public void setRight_eye_right_corner(RightEyeRightCornerBean right_eye_right_corner) {
                this.right_eye_right_corner = right_eye_right_corner;
            }

            public MouthUpperLipRightContour1Bean getMouth_upper_lip_right_contour1() {
                return mouth_upper_lip_right_contour1;
            }

            public void setMouth_upper_lip_right_contour1(MouthUpperLipRightContour1Bean mouth_upper_lip_right_contour1) {
                this.mouth_upper_lip_right_contour1 = mouth_upper_lip_right_contour1;
            }

            public MouthUpperLipRightContour2Bean getMouth_upper_lip_right_contour2() {
                return mouth_upper_lip_right_contour2;
            }

            public void setMouth_upper_lip_right_contour2(MouthUpperLipRightContour2Bean mouth_upper_lip_right_contour2) {
                this.mouth_upper_lip_right_contour2 = mouth_upper_lip_right_contour2;
            }

            public MouthUpperLipRightContour3Bean getMouth_upper_lip_right_contour3() {
                return mouth_upper_lip_right_contour3;
            }

            public void setMouth_upper_lip_right_contour3(MouthUpperLipRightContour3Bean mouth_upper_lip_right_contour3) {
                this.mouth_upper_lip_right_contour3 = mouth_upper_lip_right_contour3;
            }

            public LeftEyeLeftCornerBean getLeft_eye_left_corner() {
                return left_eye_left_corner;
            }

            public void setLeft_eye_left_corner(LeftEyeLeftCornerBean left_eye_left_corner) {
                this.left_eye_left_corner = left_eye_left_corner;
            }

            public MouthRightCornerBean getMouth_right_corner() {
                return mouth_right_corner;
            }

            public void setMouth_right_corner(MouthRightCornerBean mouth_right_corner) {
                this.mouth_right_corner = mouth_right_corner;
            }

            public MouthLowerLipRightContour1Bean getMouth_lower_lip_right_contour1() {
                return mouth_lower_lip_right_contour1;
            }

            public void setMouth_lower_lip_right_contour1(MouthLowerLipRightContour1Bean mouth_lower_lip_right_contour1) {
                this.mouth_lower_lip_right_contour1 = mouth_lower_lip_right_contour1;
            }

            public ContourRight8Bean getContour_right8() {
                return contour_right8;
            }

            public void setContour_right8(ContourRight8Bean contour_right8) {
                this.contour_right8 = contour_right8;
            }

            public LeftEyebrowRightCornerBean getLeft_eyebrow_right_corner() {
                return left_eyebrow_right_corner;
            }

            public void setLeft_eyebrow_right_corner(LeftEyebrowRightCornerBean left_eyebrow_right_corner) {
                this.left_eyebrow_right_corner = left_eyebrow_right_corner;
            }

            public RightEyeCenterBean getRight_eye_center() {
                return right_eye_center;
            }

            public void setRight_eye_center(RightEyeCenterBean right_eye_center) {
                this.right_eye_center = right_eye_center;
            }

            public LeftEyeUpperRightQuarterBean getLeft_eye_upper_right_quarter() {
                return left_eye_upper_right_quarter;
            }

            public void setLeft_eye_upper_right_quarter(LeftEyeUpperRightQuarterBean left_eye_upper_right_quarter) {
                this.left_eye_upper_right_quarter = left_eye_upper_right_quarter;
            }

            public MouthUpperLipTopBean getMouth_upper_lip_top() {
                return mouth_upper_lip_top;
            }

            public void setMouth_upper_lip_top(MouthUpperLipTopBean mouth_upper_lip_top) {
                this.mouth_upper_lip_top = mouth_upper_lip_top;
            }

            public NoseLeftBean getNose_left() {
                return nose_left;
            }

            public void setNose_left(NoseLeftBean nose_left) {
                this.nose_left = nose_left;
            }

            public LeftEyeUpperLeftQuarterBean getLeft_eye_upper_left_quarter() {
                return left_eye_upper_left_quarter;
            }

            public void setLeft_eye_upper_left_quarter(LeftEyeUpperLeftQuarterBean left_eye_upper_left_quarter) {
                this.left_eye_upper_left_quarter = left_eye_upper_left_quarter;
            }

            public LeftEyeCenterBean getLeft_eye_center() {
                return left_eye_center;
            }

            public void setLeft_eye_center(LeftEyeCenterBean left_eye_center) {
                this.left_eye_center = left_eye_center;
            }

            public LeftEyeLowerRightQuarterBean getLeft_eye_lower_right_quarter() {
                return left_eye_lower_right_quarter;
            }

            public void setLeft_eye_lower_right_quarter(LeftEyeLowerRightQuarterBean left_eye_lower_right_quarter) {
                this.left_eye_lower_right_quarter = left_eye_lower_right_quarter;
            }

            public RightEyebrowLeftCornerBean getRight_eyebrow_left_corner() {
                return right_eyebrow_left_corner;
            }

            public void setRight_eyebrow_left_corner(RightEyebrowLeftCornerBean right_eyebrow_left_corner) {
                this.right_eyebrow_left_corner = right_eyebrow_left_corner;
            }

            public RightEyeLeftCornerBean getRight_eye_left_corner() {
                return right_eye_left_corner;
            }

            public void setRight_eye_left_corner(RightEyeLeftCornerBean right_eye_left_corner) {
                this.right_eye_left_corner = right_eye_left_corner;
            }

            public MouthLowerLipTopBean getMouth_lower_lip_top() {
                return mouth_lower_lip_top;
            }

            public void setMouth_lower_lip_top(MouthLowerLipTopBean mouth_lower_lip_top) {
                this.mouth_lower_lip_top = mouth_lower_lip_top;
            }

            public RightEyebrowRightCornerBean getRight_eyebrow_right_corner() {
                return right_eyebrow_right_corner;
            }

            public void setRight_eyebrow_right_corner(RightEyebrowRightCornerBean right_eyebrow_right_corner) {
                this.right_eyebrow_right_corner = right_eyebrow_right_corner;
            }

            public MouthLowerLipLeftContour1Bean getMouth_lower_lip_left_contour1() {
                return mouth_lower_lip_left_contour1;
            }

            public void setMouth_lower_lip_left_contour1(MouthLowerLipLeftContour1Bean mouth_lower_lip_left_contour1) {
                this.mouth_lower_lip_left_contour1 = mouth_lower_lip_left_contour1;
            }

            public LeftEyePupilBean getLeft_eye_pupil() {
                return left_eye_pupil;
            }

            public void setLeft_eye_pupil(LeftEyePupilBean left_eye_pupil) {
                this.left_eye_pupil = left_eye_pupil;
            }

            public MouthLeftCornerBean getMouth_left_corner() {
                return mouth_left_corner;
            }

            public void setMouth_left_corner(MouthLeftCornerBean mouth_left_corner) {
                this.mouth_left_corner = mouth_left_corner;
            }

            public RightEyebrowUpperLeftQuarterBean getRight_eyebrow_upper_left_quarter() {
                return right_eyebrow_upper_left_quarter;
            }

            public void setRight_eyebrow_upper_left_quarter(RightEyebrowUpperLeftQuarterBean right_eyebrow_upper_left_quarter) {
                this.right_eyebrow_upper_left_quarter = right_eyebrow_upper_left_quarter;
            }

            public RightEyeLowerLeftQuarterBean getRight_eye_lower_left_quarter() {
                return right_eye_lower_left_quarter;
            }

            public void setRight_eye_lower_left_quarter(RightEyeLowerLeftQuarterBean right_eye_lower_left_quarter) {
                this.right_eye_lower_left_quarter = right_eye_lower_left_quarter;
            }

            public NoseTipBean getNose_tip() {
                return nose_tip;
            }

            public void setNose_tip(NoseTipBean nose_tip) {
                this.nose_tip = nose_tip;
            }

            public RightEyeUpperLeftQuarterBean getRight_eye_upper_left_quarter() {
                return right_eye_upper_left_quarter;
            }

            public void setRight_eye_upper_left_quarter(RightEyeUpperLeftQuarterBean right_eye_upper_left_quarter) {
                this.right_eye_upper_left_quarter = right_eye_upper_left_quarter;
            }

            public LeftEyebrowUpperMiddleBean getLeft_eyebrow_upper_middle() {
                return left_eyebrow_upper_middle;
            }

            public void setLeft_eyebrow_upper_middle(LeftEyebrowUpperMiddleBean left_eyebrow_upper_middle) {
                this.left_eyebrow_upper_middle = left_eyebrow_upper_middle;
            }

            public MouthLowerLipRightContour2Bean getMouth_lower_lip_right_contour2() {
                return mouth_lower_lip_right_contour2;
            }

            public void setMouth_lower_lip_right_contour2(MouthLowerLipRightContour2Bean mouth_lower_lip_right_contour2) {
                this.mouth_lower_lip_right_contour2 = mouth_lower_lip_right_contour2;
            }

            public MouthLowerLipLeftContour3Bean getMouth_lower_lip_left_contour3() {
                return mouth_lower_lip_left_contour3;
            }

            public void setMouth_lower_lip_left_contour3(MouthLowerLipLeftContour3Bean mouth_lower_lip_left_contour3) {
                this.mouth_lower_lip_left_contour3 = mouth_lower_lip_left_contour3;
            }

            public NoseContourLeft2Bean getNose_contour_left2() {
                return nose_contour_left2;
            }

            public void setNose_contour_left2(NoseContourLeft2Bean nose_contour_left2) {
                this.nose_contour_left2 = nose_contour_left2;
            }

            public NoseContourLeft3Bean getNose_contour_left3() {
                return nose_contour_left3;
            }

            public void setNose_contour_left3(NoseContourLeft3Bean nose_contour_left3) {
                this.nose_contour_left3 = nose_contour_left3;
            }

            public NoseContourRight1Bean getNose_contour_right1() {
                return nose_contour_right1;
            }

            public void setNose_contour_right1(NoseContourRight1Bean nose_contour_right1) {
                this.nose_contour_right1 = nose_contour_right1;
            }

            public NoseContourRight2Bean getNose_contour_right2() {
                return nose_contour_right2;
            }

            public void setNose_contour_right2(NoseContourRight2Bean nose_contour_right2) {
                this.nose_contour_right2 = nose_contour_right2;
            }

            public MouthLowerLipLeftContour2Bean getMouth_lower_lip_left_contour2() {
                return mouth_lower_lip_left_contour2;
            }

            public void setMouth_lower_lip_left_contour2(MouthLowerLipLeftContour2Bean mouth_lower_lip_left_contour2) {
                this.mouth_lower_lip_left_contour2 = mouth_lower_lip_left_contour2;
            }

            public RightEyebrowUpperRightQuarterBean getRight_eyebrow_upper_right_quarter() {
                return right_eyebrow_upper_right_quarter;
            }

            public void setRight_eyebrow_upper_right_quarter(RightEyebrowUpperRightQuarterBean right_eyebrow_upper_right_quarter) {
                this.right_eyebrow_upper_right_quarter = right_eyebrow_upper_right_quarter;
            }

            public RightEyebrowUpperMiddleBean getRight_eyebrow_upper_middle() {
                return right_eyebrow_upper_middle;
            }

            public void setRight_eyebrow_upper_middle(RightEyebrowUpperMiddleBean right_eyebrow_upper_middle) {
                this.right_eyebrow_upper_middle = right_eyebrow_upper_middle;
            }

            public LeftEyebrowLowerRightQuarterBean getLeft_eyebrow_lower_right_quarter() {
                return left_eyebrow_lower_right_quarter;
            }

            public void setLeft_eyebrow_lower_right_quarter(LeftEyebrowLowerRightQuarterBean left_eyebrow_lower_right_quarter) {
                this.left_eyebrow_lower_right_quarter = left_eyebrow_lower_right_quarter;
            }

            public LeftEyeTopBean getLeft_eye_top() {
                return left_eye_top;
            }

            public void setLeft_eye_top(LeftEyeTopBean left_eye_top) {
                this.left_eye_top = left_eye_top;
            }

            public LeftEyeRightCornerBean getLeft_eye_right_corner() {
                return left_eye_right_corner;
            }

            public void setLeft_eye_right_corner(LeftEyeRightCornerBean left_eye_right_corner) {
                this.left_eye_right_corner = left_eye_right_corner;
            }

            public LeftEyebrowUpperRightQuarterBean getLeft_eyebrow_upper_right_quarter() {
                return left_eyebrow_upper_right_quarter;
            }

            public void setLeft_eyebrow_upper_right_quarter(LeftEyebrowUpperRightQuarterBean left_eyebrow_upper_right_quarter) {
                this.left_eyebrow_upper_right_quarter = left_eyebrow_upper_right_quarter;
            }

            public RightEyePupilBean getRight_eye_pupil() {
                return right_eye_pupil;
            }

            public void setRight_eye_pupil(RightEyePupilBean right_eye_pupil) {
                this.right_eye_pupil = right_eye_pupil;
            }

            public MouthUpperLipBottomBean getMouth_upper_lip_bottom() {
                return mouth_upper_lip_bottom;
            }

            public void setMouth_upper_lip_bottom(MouthUpperLipBottomBean mouth_upper_lip_bottom) {
                this.mouth_upper_lip_bottom = mouth_upper_lip_bottom;
            }

            public static class MouthUpperLipLeftContour2Bean {
                /**
                 * y : 849
                 * x : 512
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourChinBean {
                /**
                 * y : 1014
                 * x : 570
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipRightContour3Bean {
                /**
                 * y : 878
                 * x : 596
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight9Bean {
                /**
                 * y : 1000
                 * x : 630
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipLeftContour1Bean {
                /**
                 * y : 838
                 * x : 544
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowLowerMiddleBean {
                /**
                 * y : 525
                 * x : 689
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowLowerMiddleBean {
                /**
                 * y : 521
                 * x : 418
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipLeftContour3Bean {
                /**
                 * y : 858
                 * x : 525
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowLowerLeftQuarterBean {
                /**
                 * y : 519
                 * x : 379
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowLowerLeftQuarterBean {
                /**
                 * y : 530
                 * x : 651
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowLowerRightQuarterBean {
                /**
                 * y : 524
                 * x : 725
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourLeft1Bean {
                /**
                 * y : 609
                 * x : 527
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowUpperLeftQuarterBean {
                /**
                 * y : 493
                 * x : 378
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeBottomBean {
                /**
                 * y : 610
                 * x : 441
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipBottomBean {
                /**
                 * y : 884
                 * x : 568
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight7Bean {
                /**
                 * y : 916
                 * x : 710
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowLeftCornerBean {
                /**
                 * y : 522
                 * x : 343
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight6Bean {
                /**
                 * y : 871
                 * x : 743
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeLowerRightQuarterBean {
                /**
                 * y : 596
                 * x : 716
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeBottomBean {
                /**
                 * y : 603
                 * x : 685
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft7Bean {
                /**
                 * y : 919
                 * x : 425
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft6Bean {
                /**
                 * y : 874
                 * x : 392
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft5Bean {
                /**
                 * y : 824
                 * x : 366
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft4Bean {
                /**
                 * y : 771
                 * x : 349
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft3Bean {
                /**
                 * y : 716
                 * x : 336
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft2Bean {
                /**
                 * y : 660
                 * x : 326
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft1Bean {
                /**
                 * y : 601
                 * x : 322
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeLowerLeftQuarterBean {
                /**
                 * y : 602
                 * x : 412
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight1Bean {
                /**
                 * y : 599
                 * x : 813
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight3Bean {
                /**
                 * y : 714
                 * x : 798
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight2Bean {
                /**
                 * y : 658
                 * x : 808
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight5Bean {
                /**
                 * y : 821
                 * x : 768
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight4Bean {
                /**
                 * y : 769
                 * x : 785
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft9Bean {
                /**
                 * y : 1001
                 * x : 507
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft8Bean {
                /**
                 * y : 964
                 * x : 462
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseRightBean {
                /**
                 * y : 756
                 * x : 646
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeUpperRightQuarterBean {
                /**
                 * y : 573
                 * x : 712
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourRight3Bean {
                /**
                 * y : 772
                 * x : 608
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourLowerMiddleBean {
                /**
                 * y : 779
                 * x : 569
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeTopBean {
                /**
                 * y : 570
                 * x : 679
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeRightCornerBean {
                /**
                 * y : 584
                 * x : 734
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipRightContour1Bean {
                /**
                 * y : 837
                 * x : 591
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipRightContour2Bean {
                /**
                 * y : 848
                 * x : 620
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipRightContour3Bean {
                /**
                 * y : 854
                 * x : 607
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeLeftCornerBean {
                /**
                 * y : 591
                 * x : 390
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthRightCornerBean {
                /**
                 * y : 859
                 * x : 651
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipRightContour1Bean {
                /**
                 * y : 858
                 * x : 607
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight8Bean {
                /**
                 * y : 961
                 * x : 674
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowRightCornerBean {
                /**
                 * y : 531
                 * x : 503
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeCenterBean {
                /**
                 * y : 588
                 * x : 683
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeUpperRightQuarterBean {
                /**
                 * y : 584
                 * x : 474
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipTopBean {
                /**
                 * y : 843
                 * x : 567
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseLeftBean {
                /**
                 * y : 758
                 * x : 491
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeUpperLeftQuarterBean {
                /**
                 * y : 579
                 * x : 415
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeCenterBean {
                /**
                 * y : 594
                 * x : 442
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeLowerRightQuarterBean {
                /**
                 * y : 608
                 * x : 469
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowLeftCornerBean {
                /**
                 * y : 533
                 * x : 612
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeLeftCornerBean {
                /**
                 * y : 600
                 * x : 631
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipTopBean {
                /**
                 * y : 863
                 * x : 567
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowRightCornerBean {
                /**
                 * y : 525
                 * x : 760
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipLeftContour1Bean {
                /**
                 * y : 862
                 * x : 525
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyePupilBean {
                /**
                 * y : 590
                 * x : 447
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLeftCornerBean {
                /**
                 * y : 862
                 * x : 478
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowUpperLeftQuarterBean {
                /**
                 * y : 504
                 * x : 646
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeLowerLeftQuarterBean {
                /**
                 * y : 603
                 * x : 657
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseTipBean {
                /**
                 * y : 730
                 * x : 568
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeUpperLeftQuarterBean {
                /**
                 * y : 579
                 * x : 652
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowUpperMiddleBean {
                /**
                 * y : 489
                 * x : 421
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipRightContour2Bean {
                /**
                 * y : 870
                 * x : 623
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipLeftContour3Bean {
                /**
                 * y : 882
                 * x : 537
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourLeft2Bean {
                /**
                 * y : 710
                 * x : 510
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourLeft3Bean {
                /**
                 * y : 773
                 * x : 530
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourRight1Bean {
                /**
                 * y : 603
                 * x : 600
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourRight2Bean {
                /**
                 * y : 709
                 * x : 627
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipLeftContour2Bean {
                /**
                 * y : 875
                 * x : 507
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowUpperRightQuarterBean {
                /**
                 * y : 498
                 * x : 727
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowUpperMiddleBean {
                /**
                 * y : 494
                 * x : 686
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowLowerRightQuarterBean {
                /**
                 * y : 527
                 * x : 459
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeTopBean {
                /**
                 * y : 576
                 * x : 446
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeRightCornerBean {
                /**
                 * y : 605
                 * x : 495
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowUpperRightQuarterBean {
                /**
                 * y : 500
                 * x : 464
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyePupilBean {
                /**
                 * y : 583
                 * x : 686
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipBottomBean {
                /**
                 * y : 857
                 * x : 567
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }
        }

        public static class FaceRectangleBean {
            /**
             * width : 526
             * top : 446
             * left : 299
             * height : 526
             */

            private int width;
            private int top;
            private int left;
            private int height;

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getTop() {
                return top;
            }

            public void setTop(int top) {
                this.top = top;
            }

            public int getLeft() {
                return left;
            }

            public void setLeft(int left) {
                this.left = left;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }
        }
    }
}
