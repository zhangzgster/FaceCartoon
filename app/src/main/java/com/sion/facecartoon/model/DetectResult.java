package com.sion.facecartoon.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class DetectResult implements Serializable {

    /**
     * image_id : 2r99z4tj6pwk6FUOIEZXrA==
     * request_id : 1486528022,62b14260-35c1-4695-babe-f59bf8839bf7
     * time_used : 835
     * faces : [{"face_rectangle":{"width":526,"top":446,"left":299,"height":526},"face_token":"b08a82398fa8547cf34c4c55af0e8690"}]
     */

    private String image_id;
    private String request_id;
    private int time_used;
    private List<FacesBean> faces;

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public int getTime_used() {
        return time_used;
    }

    public void setTime_used(int time_used) {
        this.time_used = time_used;
    }

    public List<FacesBean> getFaces() {
        return faces;
    }

    public void setFaces(List<FacesBean> faces) {
        this.faces = faces;
    }

    public static class FacesBean implements Serializable{
        /**
         * face_rectangle : {"width":526,"top":446,"left":299,"height":526}
         * face_token : b08a82398fa8547cf34c4c55af0e8690
         */

        private FaceRectangleBean face_rectangle;
        private String face_token;

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

        public static class FaceRectangleBean implements Serializable{
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
