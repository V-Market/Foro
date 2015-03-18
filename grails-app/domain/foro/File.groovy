package foro

public class File {

    private String fileType;
    private Byte[] content;
    private double size;

    public File(fileType,content,size){
        this.fileType=fileType;
        this.content=content;
        this.size=size;
    }

    String getFileType() {
        return fileType
    }

    void setFileType(String fileType) {
        this.fileType = fileType
    }

    Byte[] getContent() {
        return content
    }

    void setContent(Byte[] content) {
        this.content = content
    }

    double getSize() {
        return size
    }

    void setSize(double size) {
        this.size = size
    }

    public download(){

    }

    public share(){

    }
}